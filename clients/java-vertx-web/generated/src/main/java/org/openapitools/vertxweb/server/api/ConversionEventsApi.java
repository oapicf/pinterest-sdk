package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionEvents;
import org.openapitools.vertxweb.server.model.ConversionEventsCreate;
import org.openapitools.vertxweb.server.model.DetailedError;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ConversionEventsApi  {
    Future<ApiResponse<ConversionEvents>> eventsCreate(String adAccountId, ConversionEventsCreate conversionEventsCreate, Boolean test);
}
