package com.ark.identify.infrastucture.persistence.unique_user.model;

import com.ark.base.object.BaseDO;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 唯一用户表，表明账户和租户的关系
 * </p>
 *
 * @author lihang
 * @since 2022-05-10
 */
@Getter
@Setter
@TableName("ark_identify_unique_user")
public class UniqueUserPO extends BaseDO {

    private static final long serialVersionUID = 1L;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 账户id
     */
    private Long accountId;

    /**
     * 创建人
     */
    private Long creater;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private Long modifier;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;


}
