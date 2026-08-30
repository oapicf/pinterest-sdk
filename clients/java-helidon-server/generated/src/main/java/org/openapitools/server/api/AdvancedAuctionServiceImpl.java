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
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class AdvancedAuctionServiceImpl implements AdvancedAuctionService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void advancedAuctionItemsGetPost(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void advancedAuctionItemsSubmitPost(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AdvancedAuctionService is down. Goodbye!");
    }

}
