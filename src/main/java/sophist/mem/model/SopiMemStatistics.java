package sophist.mem.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 사용자 통계
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SopiMemStatistics implements Serializable {

	// 통계코드
	@Id
	private String statisticsCd;

	// 모듈 이름
	@Column(name = "module_name", length = 10)
	private String moduleName;

	// 세부 모듈
	@Column(name = "module_detail_name", length = 10)
	private String moduleDetailName;

	// 모듈 설명
	@Column(name = "module_desc", length = 200)
	private String moduleDesc;

	@Column
	private int Count;

	// 생성 일자
	@CreationTimestamp
	private Timestamp createDate;
}