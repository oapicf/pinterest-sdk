package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountToAdAccountSharedAudience;
import org.openapitools.vertxweb.server.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.AdAccountToBusinessSharedAudience;
import org.openapitools.vertxweb.server.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.vertxweb.server.model.AudienceAccountType;
import org.openapitools.vertxweb.server.model.BusinessToAdAccountSharedAudience;
import org.openapitools.vertxweb.server.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.BusinessToBusinessSharedAudience;
import org.openapitools.vertxweb.server.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.Order;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.SharedAudiencesForBusinessList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AudienceSharingApi  {
    Future<ApiResponse<AdAccountsAudiencesSharedAccountsList200Response>> adAccountsAudiencesSharedAccountsList(String audienceId, AudienceAccountType accountType, String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<AdAccountsAudiencesSharedAccountsList200Response>> businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, String bookmark, Integer pageSize);
    Future<ApiResponse<SharedAudiencesForBusinessList200Response>> sharedAudiencesForBusinessList(String businessId, Order order, String bookmark, Integer pageSize);
    Future<ApiResponse<AdAccountToAdAccountSharedAudience>> updateAdAccountToAdAccountSharedAudience(String adAccountId, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody);
    Future<ApiResponse<AdAccountToBusinessSharedAudience>> updateAdAccountToBusinessSharedAudience(String adAccountId, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody);
    Future<ApiResponse<BusinessToAdAccountSharedAudience>> updateBusinessToAdAccountSharedAudience(String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody);
    Future<ApiResponse<BusinessToBusinessSharedAudience>> updateBusinessToBusinessSharedAudience(String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody);
}
