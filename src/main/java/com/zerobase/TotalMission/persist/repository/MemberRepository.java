package com.zerobase.TotalMission.persist.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zerobase.TotalMission.persist.entity.MemberEntity;



@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>{

	// 사용자 id(username) 를 기준으로 회원 정보를 찾기 위한 메소드
	Optional<MemberEntity> findByUsername (String username);
	
	// 회원가입을 할 때, 이미 존재하는 아이디인지 확인하는 메소드
	boolean existsByUsername(String username);
	
}
