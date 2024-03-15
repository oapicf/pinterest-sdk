package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ConversionApiResponse;
import org.openapitools.server.api.model.ConversionEvents;
import org.openapitools.server.api.model.DetailedError;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ConversionEventsApi  {
    //events/create
    void eventsCreate(String adAccountId, ConversionEvents conversionEvents, Boolean test, Handler<AsyncResult<ConversionApiResponse>> handler);

}
