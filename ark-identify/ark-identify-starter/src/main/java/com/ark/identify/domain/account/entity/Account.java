package com.ark.identify.domain.account.entity;

import com.ark.domain.base.ArkEntity;
import com.ark.common.exception.api.Assert;
import com.ark.identify.domain.account.entity.valueobject.AccountStatus;
import com.ark.identify.domain.account.entity.valueobject.AccountTenant;
import com.ark.identify.domain.account.entity.valueobject.Password;
import com.ark.identify.domain.account.entity.valueobject.UserName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 账户，基类
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account extends ArkEntity<Account> {
    private Long accountId;
    private AccountStatus accountStatus;
    private Password password;
    private UserName username;

    private List<AccountTenant> tenantList;

    /**
     * 账户禁用
     */
    public void disable() {
        Assert.serviceInvaild(AccountStatus.DISABLE.equals(accountStatus), "账户已经在禁用用状态");
        this.accountStatus = AccountStatus.DISABLE;
    }

    /**
     * 账户启用
     */
    public void enable() {
        Assert.serviceInvaild(AccountStatus.ENABLE.equals(accountStatus), "账户已经在启用状态");
        this.accountStatus = AccountStatus.ENABLE;
    }
}
