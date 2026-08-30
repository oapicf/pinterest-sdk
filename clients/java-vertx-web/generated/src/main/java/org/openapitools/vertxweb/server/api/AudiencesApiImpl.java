package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsAudience;
import org.openapitools.vertxweb.server.model.AdAccountsAudienceCreate;
import org.openapitools.vertxweb.server.model.AdAccountsAudienceUpdate;
import org.openapitools.vertxweb.server.model.AudienceOwnershipType;
import org.openapitools.vertxweb.server.model.AudiencesList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AudiencesApiImpl implements AudiencesApi {
    public Future<ApiResponse<AdAccountsAudience>> audiencesCreate(String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountsAudience>> audiencesGet(String audienceId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AudiencesList200Response>> audiencesList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, AudienceOwnershipType ownershipType, Boolean excludeNca) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountsAudience>> audiencesUpdate(String audienceId, String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate) {
        return Future.failedFuture(new HttpException(501));
    }

}
