package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdvancedAuctionItems;
import org.openapitools.vertxweb.server.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.vertxweb.server.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.vertxweb.server.model.AdvancedAuctionProcessedItems;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AdvancedAuctionApiImpl implements AdvancedAuctionApi {
    public Future<ApiResponse<AdvancedAuctionItems>> advancedAuctionItemsGetPost(AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdvancedAuctionProcessedItems>> advancedAuctionItemsSubmitPost(AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
