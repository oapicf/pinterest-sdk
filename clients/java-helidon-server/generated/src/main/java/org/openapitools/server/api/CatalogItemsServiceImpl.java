package org.openapitools.server.api;

import org.openapitools.server.model.CatalogsItemsBatch;
import org.openapitools.server.model.CatalogsItemsBatchPostRequest;
import org.openapitools.server.model.CatalogsItemsRequest;
import java.util.HexFormat;
import org.openapitools.server.model.ItemsPost200Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class CatalogItemsServiceImpl implements CatalogItemsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void itemsBatchGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void itemsBatchPost(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void itemsPost(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service CatalogItemsService is down. Goodbye!");
    }

}
