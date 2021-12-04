package sophist.mem.repository;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SopiMemInfo implements Serializable {
	
	// 사용자 아이디
	@Id // Primary Key
	@Column(nullable = false, length = 20, unique = true)  
	private String memId;
	// nullable = false ->  null이 될수 없다
	// length = 20 -> 길이
	// unique = true -> 중복 안 되게
	
	// 사용자 비밀번호
	@Column(nullable = false, length = 100)
	private String memPw;
	
	// 사용자 닉네임
	@Column(nullable = false, length = 20)
	private String memNickname;
	
	// 생성 일자
	@CreationTimestamp 
	private Timestamp createDate;
	
	// 수정 일자
	@CreationTimestamp 
	private Timestamp updateDate;
	
	// 성별
	@Column(nullable = false, length = 1)
	private String memGender;
	
	// 사용자 상태
	@Column(nullable = false, length = 1)
	private String memState;
	
	// 사용자 내용 // 사용자 내용이 뭔가용?
	@Column(nullable = false, length = 5000)
	private String memContents;
	
	// 사용자 SNS 확인
	@Column(nullable = false, length = 20) 
	private String snsConfirm;
	

}
