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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AudienceSharingApiImpl implements AudienceSharingApi {
    public Future<ApiResponse<AdAccountsAudiencesSharedAccountsList200Response>> adAccountsAudiencesSharedAccountsList(String audienceId, AudienceAccountType accountType, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountsAudiencesSharedAccountsList200Response>> businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SharedAudiencesForBusinessList200Response>> sharedAudiencesForBusinessList(String businessId, Order order, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountToAdAccountSharedAudience>> updateAdAccountToAdAccountSharedAudience(String adAccountId, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountToBusinessSharedAudience>> updateAdAccountToBusinessSharedAudience(String adAccountId, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessToAdAccountSharedAudience>> updateBusinessToAdAccountSharedAudience(String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessToBusinessSharedAudience>> updateBusinessToBusinessSharedAudience(String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
