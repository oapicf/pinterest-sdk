package org.openapitools.api.factories;

import org.openapitools.api.AdvancedAuctionApiService;
import org.openapitools.api.impl.AdvancedAuctionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvancedAuctionApiServiceFactory {
    private static final AdvancedAuctionApiService service = new AdvancedAuctionApiServiceImpl();

    public static AdvancedAuctionApiService getAdvancedAuctionApi() {
        return service;
    }
}
