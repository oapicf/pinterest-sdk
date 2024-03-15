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

import java.util.List;
import java.util.Map;

public interface AudiencesApi  {
    Future<ApiResponse<Audience>> audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest);
    Future<ApiResponse<Audience>> audiencesCreateCustom(String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest);
    Future<ApiResponse<Audience>> audiencesGet(String adAccountId, String audienceId);
    Future<ApiResponse<AudiencesList200Response>> audiencesList(String adAccountId, String bookmark, String order, Integer pageSize, String ownershipType);
    Future<ApiResponse<Audience>> audiencesUpdate(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest);
}
