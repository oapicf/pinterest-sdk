package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.TargetingTemplateCreate;
import org.openapitools.vertxweb.server.model.TargetingTemplateGetResponseData;
import org.openapitools.vertxweb.server.model.TargetingTemplateList200Response;
import org.openapitools.vertxweb.server.model.TargetingTemplateUpdateRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface TargetingTemplateApi  {
    Future<ApiResponse<TargetingTemplateGetResponseData>> targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate);
    Future<ApiResponse<TargetingTemplateList200Response>> targetingTemplateList(String adAccountId, String order, Boolean includeSizing, String searchQuery, Integer pageSize, String bookmark);
    Future<ApiResponse<Void>> targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest);
}
