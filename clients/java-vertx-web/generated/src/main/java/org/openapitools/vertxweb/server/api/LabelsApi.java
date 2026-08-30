package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LabelCreateRequest;
import org.openapitools.vertxweb.server.model.LabelUpdateRequest;
import org.openapitools.vertxweb.server.model.LabeledEntities;
import org.openapitools.vertxweb.server.model.LabeledEntitiesCreate;
import org.openapitools.vertxweb.server.model.LabelsList200Response;
import org.openapitools.vertxweb.server.model.LabelsResponse;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.QueryLabelEntityStatusesItems;
import org.openapitools.vertxweb.server.model.QueryLabelTypesItems;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface LabelsApi  {
    Future<ApiResponse<LabeledEntities>> labelsApply(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate);
    Future<ApiResponse<LabelsResponse>> labelsCreate(String adAccountId, LabelCreateRequest labelCreateRequest);
    Future<ApiResponse<LabelsList200Response>> labelsList(String adAccountId, List<String> campaignIds, List<String> labelIds, List<QueryLabelEntityStatusesItems> entityStatuses, List<QueryLabelTypesItems> labelTypes, String bookmark, Integer pageSize);
    Future<ApiResponse<LabeledEntities>> labelsRemove(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate);
    Future<ApiResponse<LabelsResponse>> labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest);
}
