package org.openapitools.server.api;

import org.openapitools.server.model.CatalogsListProductsByFilterRequest;
import org.openapitools.server.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.server.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.server.model.CatalogsProductGroupsCreateManyRequestItems;
import org.openapitools.server.model.CatalogsProductGroupsCreateRequestSchema;
import org.openapitools.server.model.CatalogsProductGroupsList200Response;
import org.openapitools.server.model.CatalogsProductGroupsUpdateRequestSchema;
import org.openapitools.server.model.CatalogsVerticalProductGroup;
import java.util.stream.Collectors;
import org.openapitools.server.model.GenericTypes;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class CatalogProductGroupsServiceImpl implements CatalogProductGroupsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void catalogsProductGroupPinsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void catalogsProductGroupsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void catalogsProductGroupsCreateMany(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void catalogsProductGroupsDelete(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void catalogsProductGroupsDeleteMany(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void catalogsProductGroupsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void catalogsProductGroupsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void catalogsProductGroupsProductCountsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void catalogsProductGroupsUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void productsByProductGroupFilterList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service CatalogProductGroupsService is down. Goodbye!");
    }

}
