package org.openapitools.server.api;

import org.openapitools.server.model.BrandAccount;
import org.openapitools.server.model.BrandAccountCreate;
import org.openapitools.server.model.BrandAccountUpdate;
import org.openapitools.server.model.BusinessMembershipMember;
import java.util.stream.Collectors;
import org.openapitools.server.model.DeleteBusinessMembership200Response;
import org.openapitools.server.model.DeleteBusinessMembershipBody;
import org.openapitools.server.model.DeleteBusinessPartners;
import org.openapitools.server.model.DeleteBusinessPartnersDelete;
import org.openapitools.server.model.GenericTypes;
import org.openapitools.server.model.GetBusinessEmployers200Response;
import java.util.HexFormat;
import java.util.List;
import org.openapitools.server.model.MemberBusinessRole;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PartnerType;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import org.openapitools.server.model.SystemUserUpdateWithRequiredBody;
import org.openapitools.server.model.UpdateBusinessMembershipsResponse;
import jakarta.validation.Valid;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class BusinessAccessRelationshipsServiceImpl implements BusinessAccessRelationshipsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void brandAccountsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void brandAccountsUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteBusinessMembership(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteBusinessPartners(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getBusinessEmployers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getBusinessMembers(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getBusinessPartners(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void systemUserUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateBusinessMemberships(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service BusinessAccessRelationshipsService is down. Goodbye!");
    }

}
