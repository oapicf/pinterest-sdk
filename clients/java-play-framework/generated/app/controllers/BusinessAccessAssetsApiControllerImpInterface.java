package controllers;

import apimodels.AssetGroupDeletion;
import apimodels.AssetGroupDeletionDelete;
import apimodels.AssetGroupInput;
import apimodels.AssetGroupInputCreate;
import apimodels.AssetGroupModification;
import apimodels.AssetGroupModificationReadOrUpdate;
import apimodels.AssetPermissionType;
import apimodels.AssetSearchBy;
import apimodels.AssetSortBy;
import apimodels.BusinessAssetMembersGet200Response;
import apimodels.BusinessAssetsGet200Response;
import apimodels.BusinessMemberAssetsGetResponse;
import apimodels.BusinessMembersAssetAccessDeleteBody;
import apimodels.BusinessPartnerAssetAccessGet200Response;
import apimodels.DeleteMemberAccessResultsResponseArray;
import apimodels.DeletePartnerAssetAccessBody;
import apimodels.DeletePartnerAssetAccessResultsResponseArray;
import apimodels.NonDraftEntityStatus;
import apimodels.PermissionsWithOwner;
import apimodels.PinterestLibError;
import apimodels.UpdateMemberAssetAccessBody;
import apimodels.UpdateMemberAssetsResultsResponseArray;
import apimodels.UpdatePartnerAssetAccessBody;
import apimodels.UpdatePartnerAssetsResultsResponseArray;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class BusinessAccessAssetsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result assetGroupCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupInputCreate assetGroupInputCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AssetGroupInput obj = assetGroupCreate(request, businessId, assetGroupInputCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssetGroupInput assetGroupCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupInputCreate assetGroupInputCreate) throws Exception;

    public Result assetGroupDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AssetGroupDeletion obj = assetGroupDelete(request, businessId, assetGroupDeletionDelete);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssetGroupDeletion assetGroupDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete) throws Exception;

    public Result assetGroupUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AssetGroupModification obj = assetGroupUpdate(request, businessId, assetGroupModificationReadOrUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssetGroupModification assetGroupUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate) throws Exception;

    public Result businessAssetMembersGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, Boolean fetchSystemUsers, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessAssetMembersGet200Response obj = businessAssetMembersGet(request, businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessAssetMembersGet200Response businessAssetMembersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, Boolean fetchSystemUsers, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result businessAssetPartnersGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessAssetMembersGet200Response obj = businessAssetPartnersGet(request, businessId, assetId, startIndex, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessAssetMembersGet200Response businessAssetPartnersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result businessAssetsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<PermissionsWithOwner> permissions,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String childAssetId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetGroupId, String assetType,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessAssetsGet200Response obj = businessAssetsGet(request, businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessAssetsGet200Response businessAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<PermissionsWithOwner> permissions,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String childAssetId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetGroupId, String assetType,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result businessMemberAssetsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String memberId, String assetType,  @Min(0)Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessMemberAssetsGetResponse obj = businessMemberAssetsGet(request, businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessMemberAssetsGetResponse businessMemberAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String memberId, String assetType,  @Min(0)Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result businessMembersAssetAccessDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeleteMemberAccessResultsResponseArray obj = businessMembersAssetAccessDelete(request, businessId, businessMembersAssetAccessDeleteBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody) throws Exception;

    public Result businessMembersAssetAccessUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UpdateMemberAssetsResultsResponseArray obj = businessMembersAssetAccessUpdate(request, businessId, updateMemberAssetAccessBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) throws Exception;

    public Result businessPartnerAssetAccessGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String partnerId, String partnerType, String assetType,  @Min(0)Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessPartnerAssetAccessGet200Response obj = businessPartnerAssetAccessGet(request, businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String partnerId, String partnerType, String assetType,  @Min(0)Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result deletePartnerAssetAccessHandlerImplHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeletePartnerAssetAccessResultsResponseArray obj = deletePartnerAssetAccessHandlerImpl(request, businessId, deletePartnerAssetAccessBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) throws Exception;

    public Result updatePartnerAssetAccessHandlerImplHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UpdatePartnerAssetsResultsResponseArray obj = updatePartnerAssetAccessHandlerImpl(request, businessId, updatePartnerAssetAccessBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) throws Exception;

}
