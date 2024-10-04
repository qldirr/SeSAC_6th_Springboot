package codingon.spring_boot_default.dto_vo;

import codingon.spring_boot_default.dto_vo.dto.UserDto;

public class UserExample {
    public static void main(String[] args) {
        // userDTO 객체 생성
        UserDto u1 = new UserDto();
        u1.setId(1L);
        u1.setUsername("John Doe");
        u1.setEmail("codingon@example.com");
        u1.setAge(30);

        System.out.println("u1 = " + u1);

        // UserDTO 객체 생성(모든 필드를 갖는 생성자)
        UserDto u2 = new UserDto(2L, "Jake", "ex2@google.com",20);
        System.out.println("u2 = "+u2);

        // getter 를 이용해 특정 정보 접근
        System.out.println(u2.getUsername());
        System.out.println(u2.getEmail());

        // setter 를 이용해 정보 수정
        u2.setAge(25);
        System.out.println("u2 = "+u2);

    }
}
