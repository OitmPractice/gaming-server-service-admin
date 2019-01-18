package com.ooqiu.gaming.service.admin.api.impl;

import com.ooqiu.gaming.server.domain.Channel;
import com.ooqiu.gaming.server.mapper.ChannelMapper;
import com.ooqiu.gaming.service.admin.api.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelMapper channelMapper;

    public List<Channel> selectAll() {
        return channelMapper.selectAll();
    }

}
