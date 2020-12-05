package com.xhp.hrms.core.shrio;

import com.xhp.hrms.entity.User;

public interface IShiro {
	
	/**
	 * 获取用户行
	 * @return
	 */
	public User getUser(String userName);

}
