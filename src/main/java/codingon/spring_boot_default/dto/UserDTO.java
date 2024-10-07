package codingon.spring_boot_default.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private int age;
    private String name;
}

// 클라이언트 요청시 전달된 값을 담는데 사용할 객체
