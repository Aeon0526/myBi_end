package com.yupi.springbootinit.service;

import com.yupi.springbootinit.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.User;

/**
 * 帖子点赞服务
 *
 * @author 孙浩
 * @from <a href="https://www.feishu.cn/invitation/page/add_contact/?token=9b5q5de2-0908-42bb-bf3a-edbee391f251&amp;unique_id=6LfmwvcntYx52feb1lGHBg==">添加我的飞书</a>
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
