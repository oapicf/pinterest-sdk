package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.LabelCreateRequest;
import org.openapitools.vertxweb.server.model.LabelUpdateRequest;
import org.openapitools.vertxweb.server.model.LabelsList200Response;
import org.openapitools.vertxweb.server.model.LabelsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface LabelsApi  {
    Future<ApiResponse<LabelsResponse>> labelsCreate(String adAccountId, LabelCreateRequest labelCreateRequest);
    Future<ApiResponse<LabelsList200Response>> labelsList(String adAccountId, List<String> campaignIds, List<String> labelIds, List<String> entityStatuses, List<String> labelTypes, Integer pageSize, String bookmark);
    Future<ApiResponse<LabelsResponse>> labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest);
}
