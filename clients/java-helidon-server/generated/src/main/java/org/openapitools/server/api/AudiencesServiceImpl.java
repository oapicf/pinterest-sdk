package org.openapitools.server.api;

import org.openapitools.server.model.AdAccountsAudience;
import org.openapitools.server.model.AdAccountsAudienceCreate;
import org.openapitools.server.model.AdAccountsAudienceUpdate;
import org.openapitools.server.model.AudienceOwnershipType;
import org.openapitools.server.model.AudiencesList200Response;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibPaginationOrder;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class AudiencesServiceImpl implements AudiencesService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void audiencesCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void audiencesGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void audiencesList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void audiencesUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AudiencesService is down. Goodbye!");
    }

}
