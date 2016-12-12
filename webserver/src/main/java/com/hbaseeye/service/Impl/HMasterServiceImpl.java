package com.hbaseeye.service.Impl;

import com.hbaseeye.model.ClusterInfo;
import com.hbaseeye.model.MasterInfo;
import com.hbaseeye.service.HMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuanxiaobin on 16/12/8.
 */
@Service
public class HMasterServiceImpl implements HMasterService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List getMasterInfo() {
        List <MasterInfo> hMasterInfoList = null;
        hMasterInfoList = mongoTemplate.findAll(MasterInfo.class);

        return hMasterInfoList;
    }
}
