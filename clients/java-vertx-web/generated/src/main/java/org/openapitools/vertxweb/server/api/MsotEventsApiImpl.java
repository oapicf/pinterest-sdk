package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionMSOTEventsCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class MsotEventsApiImpl implements MsotEventsApi {
    public Future<ApiResponse<Void>> msotEventsCreate(String adAccountId, ConversionMSOTEventsCreate conversionMSOTEventsCreate) {
        return Future.failedFuture(new HttpException(501));
    }

}
