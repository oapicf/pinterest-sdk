package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdvancedAuctionItems;
import org.openapitools.server.api.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.server.api.model.AdvancedAuctionProcessedItems;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AdvancedAuctionApi  {
    //advanced_auction_items_get/post
    void advancedAuctionItemsGetPost(AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, String adAccountId, Handler<AsyncResult<AdvancedAuctionItems>> handler);

    //advanced_auction_items_submit/post
    void advancedAuctionItemsSubmitPost(AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, String adAccountId, Handler<AsyncResult<AdvancedAuctionProcessedItems>> handler);

}
