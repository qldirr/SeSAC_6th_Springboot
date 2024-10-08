package codingon.spring_boot_default.dto_vo.dto;


//DTO
// -> 단순히 데이터를 전송하기 위한 목적으로 사용되니 getter, setter 정도만 가짐(비즈니스 로직 미포함)
// 사용자 정보를 전송하기 위한 DTO 클래스
// 주로 클라이언트-서버 간 데이터 전송에 사용

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private int age;

    // 기본 생성자
//    public UserDto(){}
//
//    // 모든 필드를 갖는 생성자
//    public UserDto(String username, Long id, String email, int age) {
//        this.username = username;
//        this.id = id;
//        this.email = email;
//        this.age = age;
//    }
//
//    // Getter & Setter
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    // toString() 오버라이딩
//    @Override
//    public String toString() {
//        return "UserDto{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
