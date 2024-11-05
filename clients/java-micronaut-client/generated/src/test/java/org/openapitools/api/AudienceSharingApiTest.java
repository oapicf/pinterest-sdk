package org.openapitools.api;

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BusinessSharedAudience;
import org.openapitools.model.BusinessSharedAudienceResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SharedAudience;
import org.openapitools.model.SharedAudienceResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for AudienceSharingApi
 */
@MicronautTest
public class AudienceSharingApiTest {

    @Inject
    AudienceSharingApi api;

    
    /**
     * List accounts with access to an audience owned by an ad account
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsAudiencesSharedAccountsListTest() {
        // given
        String adAccountId = "example";
        String audienceId = "example";
        AudienceAccountType accountType = AudienceAccountType.fromValue("AD_ACCOUNT");
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        AdAccountsAudiencesSharedAccountsList200Response body = api.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark).block();

        // then
        // TODO implement the adAccountsAudiencesSharedAccountsListTest()
    }

    
    /**
     * List accounts with access to an audience owned by a business
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     */
    @Test
    @Disabled("Not Implemented")
    public void businessAccountAudiencesSharedAccountsListTest() {
        // given
        String businessId = "729090764583391194";
        String audienceId = "example";
        AudienceAccountType accountType = AudienceAccountType.fromValue("AD_ACCOUNT");
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        AdAccountsAudiencesSharedAccountsList200Response body = api.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark).block();

        // then
        // TODO implement the businessAccountAudiencesSharedAccountsListTest()
    }

    
    /**
     * List received audiences for a business
     *
     * Get a list of received audiences for the given business.
     */
    @Test
    @Disabled("Not Implemented")
    public void sharedAudiencesForBusinessListTest() {
        // given
        String businessId = "729090764583391194";
        String bookmark = "example";
        String order = "ASCENDING";
        Integer pageSize = 25;

        // when
        AudiencesList200Response body = api.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize).block();

        // then
        // TODO implement the sharedAudiencesForBusinessListTest()
    }

    
    /**
     * Update audience sharing between ad accounts
     *
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void updateAdAccountToAdAccountSharedAudienceTest() {
        // given
        String adAccountId = "example";
        SharedAudience sharedAudience = new SharedAudience();

        // when
        SharedAudienceResponse body = api.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience).block();

        // then
        // TODO implement the updateAdAccountToAdAccountSharedAudienceTest()
    }

    
    /**
     * Update audience sharing from an ad account to businesses
     *
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void updateAdAccountToBusinessSharedAudienceTest() {
        // given
        String adAccountId = "example";
        BusinessSharedAudience businessSharedAudience = new BusinessSharedAudience();

        // when
        BusinessSharedAudienceResponse body = api.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience).block();

        // then
        // TODO implement the updateAdAccountToBusinessSharedAudienceTest()
    }

    
    /**
     * Update audience sharing from a business to ad accounts
     *
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void updateBusinessToAdAccountSharedAudienceTest() {
        // given
        String businessId = "729090764583391194";
        SharedAudience sharedAudience = new SharedAudience();

        // when
        SharedAudienceResponse body = api.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience).block();

        // then
        // TODO implement the updateBusinessToAdAccountSharedAudienceTest()
    }

    
    /**
     * Update audience sharing between businesses
     *
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void updateBusinessToBusinessSharedAudienceTest() {
        // given
        String businessId = "729090764583391194";
        BusinessSharedAudience businessSharedAudience = new BusinessSharedAudience();

        // when
        BusinessSharedAudienceResponse body = api.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience).block();

        // then
        // TODO implement the updateBusinessToBusinessSharedAudienceTest()
    }

    
}
