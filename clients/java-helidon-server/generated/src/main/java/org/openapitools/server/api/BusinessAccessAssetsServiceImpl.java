package org.openapitools.server.api;

import org.openapitools.server.model.AssetGroupDeletion;
import org.openapitools.server.model.AssetGroupDeletionDelete;
import org.openapitools.server.model.AssetGroupInput;
import org.openapitools.server.model.AssetGroupInputCreate;
import org.openapitools.server.model.AssetGroupModification;
import org.openapitools.server.model.AssetGroupModificationReadOrUpdate;
import org.openapitools.server.model.AssetPermissionType;
import org.openapitools.server.model.AssetSearchBy;
import org.openapitools.server.model.AssetSortBy;
import org.openapitools.server.model.BusinessAssetMembersGet200Response;
import org.openapitools.server.model.BusinessAssetsGet200Response;
import org.openapitools.server.model.BusinessMemberAssetsGetResponse;
import org.openapitools.server.model.BusinessMembersAssetAccessDeleteBody;
import org.openapitools.server.model.BusinessPartnerAssetAccessGet200Response;
import java.util.stream.Collectors;
import org.openapitools.server.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.server.model.DeletePartnerAssetAccessBody;
import org.openapitools.server.model.DeletePartnerAssetAccessResultsResponseArray;
import java.util.HexFormat;
import java.util.List;
import org.openapitools.server.model.NonDraftEntityStatus;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PermissionsWithOwner;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateMemberAssetAccessBody;
import org.openapitools.server.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.server.model.UpdatePartnerAssetAccessBody;
import org.openapitools.server.model.UpdatePartnerAssetsResultsResponseArray;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class BusinessAccessAssetsServiceImpl implements BusinessAccessAssetsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void assetGroupCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void assetGroupDelete(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void assetGroupUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void businessAssetMembersGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void businessAssetPartnersGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void businessAssetsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void businessMemberAssetsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void businessMembersAssetAccessDelete(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void businessMembersAssetAccessUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void businessPartnerAssetAccessGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deletePartnerAssetAccessHandlerImpl(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updatePartnerAssetAccessHandlerImpl(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service BusinessAccessAssetsService is down. Goodbye!");
    }

}
