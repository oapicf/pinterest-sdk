package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.server.api.model.AudienceAccountType;
import org.openapitools.server.api.model.AudiencesList200Response;
import org.openapitools.server.api.model.BusinessSharedAudience;
import org.openapitools.server.api.model.BusinessSharedAudienceResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SharedAudience;
import org.openapitools.server.api.model.SharedAudienceResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AudienceSharingApi  {
    //ad_accounts_audiences_shared_accounts/list
    void adAccountsAudiencesSharedAccountsList(String adAccountId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark, Handler<AsyncResult<AdAccountsAudiencesSharedAccountsList200Response>> handler);

    //business_account_audiences_shared_accounts/list
    void businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark, Handler<AsyncResult<AdAccountsAudiencesSharedAccountsList200Response>> handler);

    //shared_audiences_for_business/list
    void sharedAudiencesForBusinessList(String businessId, String bookmark, String order, Integer pageSize, Handler<AsyncResult<AudiencesList200Response>> handler);

    //update_ad_account_to_ad_account_shared_audience
    void updateAdAccountToAdAccountSharedAudience(String adAccountId, SharedAudience sharedAudience, Handler<AsyncResult<SharedAudienceResponse>> handler);

    //update_ad_account_to_business_shared_audience
    void updateAdAccountToBusinessSharedAudience(String adAccountId, BusinessSharedAudience businessSharedAudience, Handler<AsyncResult<BusinessSharedAudienceResponse>> handler);

    //update_business_to_ad_account_shared_audience
    void updateBusinessToAdAccountSharedAudience(String businessId, SharedAudience sharedAudience, Handler<AsyncResult<SharedAudienceResponse>> handler);

    //update_business_to_business_shared_audience
    void updateBusinessToBusinessSharedAudience(String businessId, BusinessSharedAudience businessSharedAudience, Handler<AsyncResult<BusinessSharedAudienceResponse>> handler);

}
