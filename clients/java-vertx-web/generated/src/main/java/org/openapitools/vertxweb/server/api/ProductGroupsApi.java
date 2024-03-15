package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ProductGroupsApi  {
    Future<ApiResponse<AdAccountsCatalogsProductGroupsList200Response>> adAccountsCatalogsProductGroupsList(String adAccountId, String feedProfileId);
}
