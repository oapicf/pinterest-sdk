package org.openapitools.server.api;

import org.openapitools.server.model.AdvancedAuctionItems;
import org.openapitools.server.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.server.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.server.model.AdvancedAuctionProcessedItems;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'AdvancedAuction'",
                             version = "7.24.0")
public interface AdvancedAuctionService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/get", this::advancedAuctionItemsGetPost);
        rules.post("/submit", this::advancedAuctionItemsSubmitPost);
    }


    /**
     * POST /advanced_auction/items/get : Get item bid options (POST).
     *
     * @param request the server request
     * @param response the server response
     */
    void advancedAuctionItemsGetPost(ServerRequest request, ServerResponse response);
    /**
     * POST /advanced_auction/items/submit : Operate on item level bid options.
     *
     * @param request the server request
     * @param response the server response
     */
    void advancedAuctionItemsSubmitPost(ServerRequest request, ServerResponse response);
}
