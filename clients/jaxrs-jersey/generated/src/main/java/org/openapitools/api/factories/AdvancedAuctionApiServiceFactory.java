package org.openapitools.api.factories;

import org.openapitools.api.AdvancedAuctionApiService;
import org.openapitools.api.impl.AdvancedAuctionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionApiServiceFactory {
    private static final AdvancedAuctionApiService service = new AdvancedAuctionApiServiceImpl();

    public static AdvancedAuctionApiService getAdvancedAuctionApi() {
        return service;
    }
}
