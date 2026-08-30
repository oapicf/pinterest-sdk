package org.openapitools.server.api;

import org.openapitools.server.model.AdAccountToAdAccountSharedAudience;
import org.openapitools.server.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.server.model.AdAccountToBusinessSharedAudience;
import org.openapitools.server.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.server.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.server.model.AudienceAccountType;
import org.openapitools.server.model.BusinessToAdAccountSharedAudience;
import org.openapitools.server.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.server.model.BusinessToBusinessSharedAudience;
import org.openapitools.server.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.Order;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.SharedAudiencesForBusinessList200Response;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class AudienceSharingServiceImpl implements AudienceSharingService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void adAccountsAudiencesSharedAccountsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void businessAccountAudiencesSharedAccountsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void sharedAudiencesForBusinessList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateAdAccountToAdAccountSharedAudience(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateAdAccountToBusinessSharedAudience(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateBusinessToAdAccountSharedAudience(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateBusinessToBusinessSharedAudience(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AudienceSharingService is down. Goodbye!");
    }

}
