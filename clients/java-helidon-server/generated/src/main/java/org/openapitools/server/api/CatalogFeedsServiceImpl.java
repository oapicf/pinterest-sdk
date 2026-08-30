package org.openapitools.server.api;

import org.openapitools.server.model.CatalogsFeed;
import org.openapitools.server.model.CatalogsFeedCreateRequestSchema;
import org.openapitools.server.model.CatalogsFeedIngestion;
import org.openapitools.server.model.CatalogsFeedUpdateRequestSchema;
import org.openapitools.server.model.CatalogsItemValidationIssue;
import java.util.stream.Collectors;
import org.openapitools.server.model.FeedProcessingResultsList200Response;
import org.openapitools.server.model.FeedsList200Response;
import java.util.HexFormat;
import org.openapitools.server.model.ItemsIssuesList200Response;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class CatalogFeedsServiceImpl implements CatalogFeedsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void feedProcessingResultsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void feedsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void feedsDelete(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void feedsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void feedsIngest(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void feedsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void feedsUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void itemsIssuesList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service CatalogFeedsService is down. Goodbye!");
    }

}
