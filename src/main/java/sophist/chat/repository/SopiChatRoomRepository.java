package sophist.chat.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import sophist.chat.model.SopiChatRoomModel;

@EnableJpaRepositories
public interface SopiChatRoomRepository extends JpaRepository<SopiChatRoomModel,String>{
	
	@Query("SELECT sgm "
			+ " FROM SopiGroupMaster sgm "
			+ " inner join SopiFileMaster sfm on sgm.fileCd=sfm.fileCd"
			+ " inner join SopiFileDetail sfd on sfm.fileCd=sfd.fileCd"
			+ " inner join SopiChatRoomMapping scrm on sgm.groupCd=scrm.groupCd"
			+ " inner join SopiChatRoom scr on scrm.roomMappingCd=scr.roomMappingCd"
			+ " inner join SopiGroupMemMapping sgmm on sgm.groupCd = sgmm.groupCd"
			+ " inner join SopiCategory sctg on sgmm.mappingCd =sctg.mappingCd"
			+ " inner join SopiGroupDetail sgd on sgmm.mappingCd = sgd.mappingCd"
			+ " where sctg.categoryState ='Y'"
			+ " and sgm.groupState='Y' "
			)
	public List<SopiChatRoomModel> findAllWithChatRoomByMemId();
	
}
