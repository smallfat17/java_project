package cn.wolfcode.crud.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	 private Long id;
	 private String name;
	 private String password;
	 private String email;
	 private Integer age;
	 
	 
	 
}
