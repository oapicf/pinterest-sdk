package org.openapitools.api;

import org.openapitools.model.AdAccountToAdAccountSharedAudience;
import org.openapitools.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.AdAccountToBusinessSharedAudience;
import org.openapitools.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.BusinessToAdAccountSharedAudience;
import org.openapitools.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.BusinessToBusinessSharedAudience;
import org.openapitools.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.Order;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SharedAudiencesForBusinessList200Response;
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
        String audienceId = "example";
        AudienceAccountType accountType = AudienceAccountType.fromValue("AD_ACCOUNT");
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        AdAccountsAudiencesSharedAccountsList200Response body = api.adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize).block();

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
        String businessId = "example";
        String audienceId = "example";
        AudienceAccountType accountType = AudienceAccountType.fromValue("AD_ACCOUNT");
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        AdAccountsAudiencesSharedAccountsList200Response body = api.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize).block();

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
        String businessId = "example";
        Order order = Order.fromValue("ASCENDING");
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        SharedAudiencesForBusinessList200Response body = api.sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize).block();

        // then
        // TODO implement the sharedAudiencesForBusinessListTest()
    }

    
    /**
     * Update audience sharing between ad accounts
     *
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     */
    @Test
    @Disabled("Not Implemented")
    public void updateAdAccountToAdAccountSharedAudienceTest() {
        // given
        String adAccountId = "example";
        AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody = new AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody("2542621871096", org.openapitools.model.OperationType.fromValue("SHARE"), Arrays.asList("example"));

        // when
        AdAccountToAdAccountSharedAudience body = api.updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody).block();

        // then
        // TODO implement the updateAdAccountToAdAccountSharedAudienceTest()
    }

    
    /**
     * Update audience sharing from an ad account to businesses
     *
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     */
    @Test
    @Disabled("Not Implemented")
    public void updateAdAccountToBusinessSharedAudienceTest() {
        // given
        String adAccountId = "example";
        AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody = new AdAccountToBusinessSharedAudienceUpdateWithRequiredBody("2542621871096", org.openapitools.model.OperationType.fromValue("SHARE"), Arrays.asList("example"));

        // when
        AdAccountToBusinessSharedAudience body = api.updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody).block();

        // then
        // TODO implement the updateAdAccountToBusinessSharedAudienceTest()
    }

    
    /**
     * Update audience sharing from a business to ad accounts
     *
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     */
    @Test
    @Disabled("Not Implemented")
    public void updateBusinessToAdAccountSharedAudienceTest() {
        // given
        String businessId = "example";
        BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody = new BusinessToAdAccountSharedAudienceUpdateWithRequiredBody("2542621871096", org.openapitools.model.OperationType.fromValue("SHARE"), Arrays.asList("example"));

        // when
        BusinessToAdAccountSharedAudience body = api.updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody).block();

        // then
        // TODO implement the updateBusinessToAdAccountSharedAudienceTest()
    }

    
    /**
     * Update audience sharing between businesses
     *
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     */
    @Test
    @Disabled("Not Implemented")
    public void updateBusinessToBusinessSharedAudienceTest() {
        // given
        String businessId = "example";
        BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody = new BusinessToBusinessSharedAudienceUpdateWithRequiredBody("2542621871096", org.openapitools.model.OperationType.fromValue("SHARE"), Arrays.asList("example"));

        // when
        BusinessToBusinessSharedAudience body = api.updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody).block();

        // then
        // TODO implement the updateBusinessToBusinessSharedAudienceTest()
    }

    
}
