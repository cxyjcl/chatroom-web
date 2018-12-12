package com.chat.web.dao;

import com.chat.web.entity.MessageStatus;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageStatusMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(MessageStatus record);

    int insertSelective(MessageStatus record);

    MessageStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageStatus record);

    int updateByPrimaryKey(MessageStatus record);
}