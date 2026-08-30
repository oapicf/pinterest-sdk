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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class LabelsApiImpl implements LabelsApi {
    public Future<ApiResponse<LabeledEntities>> labelsApply(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LabelsResponse>> labelsCreate(String adAccountId, LabelCreateRequest labelCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LabelsList200Response>> labelsList(String adAccountId, List<String> campaignIds, List<String> labelIds, List<QueryLabelEntityStatusesItems> entityStatuses, List<QueryLabelTypesItems> labelTypes, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LabeledEntities>> labelsRemove(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LabelsResponse>> labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
