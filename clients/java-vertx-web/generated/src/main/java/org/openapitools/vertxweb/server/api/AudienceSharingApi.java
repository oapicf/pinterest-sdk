package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.vertxweb.server.model.AudienceAccountType;
import org.openapitools.vertxweb.server.model.AudiencesList200Response;
import org.openapitools.vertxweb.server.model.BusinessSharedAudience;
import org.openapitools.vertxweb.server.model.BusinessSharedAudienceResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.SharedAudience;
import org.openapitools.vertxweb.server.model.SharedAudienceResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AudienceSharingApi  {
    Future<ApiResponse<AdAccountsAudiencesSharedAccountsList200Response>> adAccountsAudiencesSharedAccountsList(String adAccountId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark);
    Future<ApiResponse<AdAccountsAudiencesSharedAccountsList200Response>> businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark);
    Future<ApiResponse<AudiencesList200Response>> sharedAudiencesForBusinessList(String businessId, String bookmark, String order, Integer pageSize);
    Future<ApiResponse<SharedAudienceResponse>> updateAdAccountToAdAccountSharedAudience(String adAccountId, SharedAudience sharedAudience);
    Future<ApiResponse<BusinessSharedAudienceResponse>> updateAdAccountToBusinessSharedAudience(String adAccountId, BusinessSharedAudience businessSharedAudience);
    Future<ApiResponse<SharedAudienceResponse>> updateBusinessToAdAccountSharedAudience(String businessId, SharedAudience sharedAudience);
    Future<ApiResponse<BusinessSharedAudienceResponse>> updateBusinessToBusinessSharedAudience(String businessId, BusinessSharedAudience businessSharedAudience);
}
