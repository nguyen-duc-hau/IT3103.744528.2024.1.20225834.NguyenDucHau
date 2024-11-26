.data
array:  .space 400            # Khởi tạo mảng có thể chứa 100 số nguyên (4 byte/số * 100 số)
size:   .word 0               # Số lượng phần tử hiện tại trong mảng
msg1:   .asciiz "Enter the location to insert: "
msg2:   .asciiz "Enter the value to insert: "
msg3:   .asciiz "Enter the location to delete: "
msg_error: .asciiz "Invalid location.\n"
msg_array: .asciiz "\nArray:\n"
menu:   .asciiz "1. Insert\n2. Delete\n3. Print Array\nChoose an option: "
space_char: .asciiz " "
newline_char: .asciiz "\n"

.text
.globl main

# Hàm để chèn một phần tử
insert:
    # In thông báo nhập vị trí
    li $v0, 4
    la $a0, msg1
    syscall

    # Đọc vị trí từ người dùng
    li $v0, 5
    syscall
    move $a1, $v0

    # Đọc kích thước hiện tại của mảng
    lw $t1, size

    # Kiểm tra nếu vị trí hợp lệ để chèn (0 <= p <= n)
    bgt $a1, $t1, error      # nếu p > n, không hợp lệ
    blt $a1, $zero, error    # nếu p < 0, không hợp lệ

    # In thông báo nhập giá trị
    li $v0, 4
    la $a0, msg2
    syscall

    # Đọc giá trị từ người dùng
    li $v0, 5
    syscall
    move $a0, $v0

    # Thực hiện chèn
    addi $t0, $t1, -1

    insert_loop:
        blt $t0, $a1, insert_done
        sll $t2, $t0, 2
        lw $t3, array($t2)
        addi $t2, $t2, 4
        sw $t3, array($t2)
        addi $t0, $t0, -1
        j insert_loop

    insert_done:
        sll $t2, $a1, 2
        sw $a0, array($t2)
        addi $t1, $t1, 1
        sw $t1, size
        j loop

# Hàm để xóa một phần tử
delete:
    # In thông báo nhập vị trí
    li $v0, 4
    la $a0, msg3
    syscall

    # Đọc vị trí từ người dùng
    li $v0, 5
    syscall
    move $a1, $v0

    # Đọc kích thước hiện tại của mảng
    lw $t1, size

    # Kiểm tra nếu vị trí hợp lệ để xóa (0 <= p < n)
    bge $a1, $t1, error      # nếu p >= n, không hợp lệ
    blt $a1, $zero, error    # nếu p < 0, không hợp lệ

    # Thực hiện xóa
    addi $t0, $a1, 1

    delete_loop:
        bge $t0, $t1, delete_done
        sll $t2, $t0, 2
        lw $t3, array($t2)
        addi $t2, $t2, -4
        sw $t3, array($t2)
        addi $t0, $t0, 1
        j delete_loop

    delete_done:
        addi $t1, $t1, -1
        sw $t1, size
        j loop

# Hàm để in mảng
print_array:
    # In thông báo mảng
    li $v0, 4
    la $a0, msg_array
    syscall

    # Đọc kích thước hiện tại của mảng
    lw $t1, size
    move $t0, $zero

    print_loop:
        bge $t0, $t1, print_done
        sll $t2, $t0, 2
        lw $t3, array($t2)
        li $v0, 1
        move $a0, $t3
        syscall

        # In khoảng trắng
        li $v0, 4
        la $a0, space_char
        syscall

        addi $t0, $t0, 1
        j print_loop

    print_done:
        # In xuống dòng
        li $v0, 4
        la $a0, newline_char
        syscall
        j loop

# Xử lý lỗi
error:
    li $v0, 4
    la $a0, msg_error
    syscall
    j loop

main:
    loop:
        # In menu
        li $v0, 4
        la $a0, menu
        syscall

        # Đọc lựa chọn từ người dùng
        li $v0, 5
        syscall
        move $t0, $v0

        # Xử lý lựa chọn
        beq $t0, 1, insert
        beq $t0, 2, delete
        beq $t0, 3, print_array
        j loop
