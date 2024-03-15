package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionApiResponse;
import org.openapitools.vertxweb.server.model.ConversionEvents;
import org.openapitools.vertxweb.server.model.DetailedError;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ConversionEventsApiImpl implements ConversionEventsApi {
    public Future<ApiResponse<ConversionApiResponse>> eventsCreate(String adAccountId, ConversionEvents conversionEvents, Boolean test) {
        return Future.failedFuture(new HttpException(501));
    }

}
