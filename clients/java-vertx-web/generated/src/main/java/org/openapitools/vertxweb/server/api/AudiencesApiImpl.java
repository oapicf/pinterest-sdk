package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Audience;
import org.openapitools.vertxweb.server.model.AudienceCreateCustomRequest;
import org.openapitools.vertxweb.server.model.AudienceCreateRequest;
import org.openapitools.vertxweb.server.model.AudienceUpdateRequest;
import org.openapitools.vertxweb.server.model.AudiencesList200Response;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AudiencesApiImpl implements AudiencesApi {
    public Future<ApiResponse<Audience>> audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Audience>> audiencesCreateCustom(String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Audience>> audiencesGet(String adAccountId, String audienceId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AudiencesList200Response>> audiencesList(String adAccountId, String bookmark, String order, Integer pageSize, String ownershipType) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Audience>> audiencesUpdate(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
