package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdvancedAuctionItems;
import org.openapitools.server.api.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.server.api.model.AdvancedAuctionProcessedItems;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class AdvancedAuctionApiException extends MainApiException {
    public AdvancedAuctionApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsGetPost_200_Exception = new AdvancedAuctionApiException(200, "Response containing the bid option values for the requested retail catalog items. Items that don't exist or do not have bid options set won't be present in the response.");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsGetPost_400_Exception = new AdvancedAuctionApiException(400, "Invalid request parameters.");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsGetPost_401_Exception = new AdvancedAuctionApiException(401, "Not authenticated to get item bid options");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsGetPost_403_Exception = new AdvancedAuctionApiException(403, "Not authorized to get item bid options");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsGetPost_500_Exception = new AdvancedAuctionApiException(500, "Internal error");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsSubmitPost_200_Exception = new AdvancedAuctionApiException(200, "Response containing the results of the item bid options operations");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsSubmitPost_400_Exception = new AdvancedAuctionApiException(400, "Invalid request parameters.");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsSubmitPost_401_Exception = new AdvancedAuctionApiException(401, "Not authenticated to post item bid options");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsSubmitPost_403_Exception = new AdvancedAuctionApiException(403, "Not authorized to post item bid options");
    public static final AdvancedAuctionApiException AdvancedAuction_advancedAuctionItemsSubmitPost_500_Exception = new AdvancedAuctionApiException(500, "Internal error");
    

}