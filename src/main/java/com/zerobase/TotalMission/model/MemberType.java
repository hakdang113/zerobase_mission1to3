package com.zerobase.TotalMission.model;

import com.zerobase.TotalMission.persist.entity.MemberEntity;

import lombok.Data;

public class MemberType {
	
	@Data
	public static class SignIn {
		private String username;
		private String password;
		private String memberType;
	}
	
	
	@Data
	public static class SignUp {
		private String username;
		private String password;
		private String memberType;
		
		
		public MemberEntity toEntity() {
			return MemberEntity.builder()
					.username(this.username)
					.password(this.password)
					.memberType(this.memberType)
					.build();
		}
	}

}
