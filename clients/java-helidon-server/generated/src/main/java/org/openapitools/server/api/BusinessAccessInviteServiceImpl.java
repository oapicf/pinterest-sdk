package org.openapitools.server.api;

import org.openapitools.server.model.AuthRespondInvitesBody;
import org.openapitools.server.model.CancelInvitesRequest;
import org.openapitools.server.model.CancelInvitesResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.CreateAssetAccessRequestBody;
import org.openapitools.server.model.CreateAssetAccessRequestResponse;
import org.openapitools.server.model.CreateAssetInvitesRequest;
import org.openapitools.server.model.CreateInvitesResultsResponseArray;
import org.openapitools.server.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.server.model.GetInvites200Response;
import java.util.HexFormat;
import org.openapitools.server.model.InviteFilterStatus;
import org.openapitools.server.model.InviteType;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.RespondToInvitesResponseArray;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateInvitesResultsResponseArray;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class BusinessAccessInviteServiceImpl implements BusinessAccessInviteService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void assetAccessRequestsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void cancelInvitesOrRequests(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void createAssetInvites(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void createMembershipOrPartnershipInvites(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getInvites(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void respondBusinessAccessInvites(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service BusinessAccessInviteService is down. Goodbye!");
    }

}
