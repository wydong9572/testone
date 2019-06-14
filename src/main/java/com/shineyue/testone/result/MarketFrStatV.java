package com.shineyue.testone.result;
/**
 * 响应实体类
 * @author HUAWEI
 *
 */
public class MarketFrStatV {
	Integer id;
	String name;
	Integer age;
	String birth;
	
	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MarketFrStatV [id=" + id + ", name=" + name + ", age=" + age + ", birth=" + birth + "]";
	}
	
}
