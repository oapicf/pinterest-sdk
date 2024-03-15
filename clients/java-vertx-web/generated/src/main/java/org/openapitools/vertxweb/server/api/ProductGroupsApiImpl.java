package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ProductGroupsApiImpl implements ProductGroupsApi {
    public Future<ApiResponse<AdAccountsCatalogsProductGroupsList200Response>> adAccountsCatalogsProductGroupsList(String adAccountId, String feedProfileId) {
        return Future.failedFuture(new HttpException(501));
    }

}
