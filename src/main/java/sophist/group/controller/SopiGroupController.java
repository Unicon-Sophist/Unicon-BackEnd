package sophist.group.controller;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sophist.group.model.SopiGroupMaster;
import sophist.group.service.GroupInfoService;


@RestController
public class SopiGroupController {
	
	@Resource
	private GroupInfoService groupInfoService;
	
	@GetMapping(value="/bestGroupList")
	public Page<SopiGroupMaster> findAllGroupListByStarPoint(@PageableDefault(size = 3,sort = "sgd.groupStarPoint",direction = Direction.DESC)Pageable pageable) throws Throwable{
		return groupInfoService.findAllGroupListByStarPoint(pageable);
	}
	
	@GetMapping(value="/currentGroupList")
	public Page<SopiGroupMaster> findAllGroupListByCurrent(@PageableDefault(size = 3,sort = "sgd.groupCreateDate",direction = Direction.DESC)Pageable pageable) throws Throwable{
		return groupInfoService.findAllGroupListByCurrent(pageable); 
	}
}
