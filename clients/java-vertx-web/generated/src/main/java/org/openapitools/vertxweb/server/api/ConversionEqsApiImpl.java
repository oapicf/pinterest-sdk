package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.EventQualityScore;
import org.openapitools.vertxweb.server.model.IngestionSourceOptions;
import org.openapitools.vertxweb.server.model.LookbackPeriodOptions;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.SourcePlatformOptions;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ConversionEqsApiImpl implements ConversionEqsApi {
    public Future<ApiResponse<List<EventQualityScore>>> conversionEqsList(LookbackPeriodOptions lookbackPeriod, String adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource) {
        return Future.failedFuture(new HttpException(501));
    }

}
