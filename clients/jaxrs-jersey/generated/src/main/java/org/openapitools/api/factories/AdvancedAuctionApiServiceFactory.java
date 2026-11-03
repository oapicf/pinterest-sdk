package org.openapitools.api.factories;

import org.openapitools.api.AdvancedAuctionApiService;
import org.openapitools.api.impl.AdvancedAuctionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:15:21.978491780Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class AdvancedAuctionApiServiceFactory {
    private static final AdvancedAuctionApiService service = new AdvancedAuctionApiServiceImpl();

    public static AdvancedAuctionApiService getAdvancedAuctionApi() {
        return service;
    }
}
