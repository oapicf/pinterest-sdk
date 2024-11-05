package org.openapitools.api.factories;

import org.openapitools.api.AdvancedAuctionApiService;
import org.openapitools.api.impl.AdvancedAuctionApiServiceImpl;

public class AdvancedAuctionApiServiceFactory {
    private static final AdvancedAuctionApiService service = new AdvancedAuctionApiServiceImpl();

    public static AdvancedAuctionApiService getAdvancedAuctionApi() {
        return service;
    }
}
