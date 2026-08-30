package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.TargetingTemplate;
import org.openapitools.vertxweb.server.model.TargetingTemplateCreate;
import org.openapitools.vertxweb.server.model.TargetingTemplateList200Response;
import org.openapitools.vertxweb.server.model.TargetingTemplateUpdateRequestReadOrUpdate;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface TargetingTemplateApi  {
    Future<ApiResponse<TargetingTemplate>> targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate);
    Future<ApiResponse<TargetingTemplateList200Response>> targetingTemplateList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery);
    Future<ApiResponse<Void>> targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate);
}
