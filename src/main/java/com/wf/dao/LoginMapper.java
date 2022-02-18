package com.wf.dao;

import com.wf.pojo.Login;

/**
 * @author wf
 * @create 2022-02-15 21:14
 */
public interface LoginMapper {
    Login selectBy(String username);
}
