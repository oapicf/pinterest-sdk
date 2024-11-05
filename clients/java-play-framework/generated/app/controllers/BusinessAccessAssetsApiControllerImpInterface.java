package controllers;

import apimodels.BusinessAssetMembersGet200Response;
import apimodels.BusinessAssetPartnersGet200Response;
import apimodels.BusinessAssetsGet200Response;
import apimodels.BusinessMemberAssetsGet200Response;
import apimodels.BusinessMembersAssetAccessDeleteRequest;
import apimodels.BusinessPartnerAssetAccessGet200Response;
import apimodels.CreateAssetGroupBody;
import apimodels.CreateAssetGroupResponse;
import apimodels.DeleteAssetGroupBody;
import apimodels.DeleteAssetGroupResponse;
import apimodels.DeleteMemberAccessResultsResponseArray;
import apimodels.DeletePartnerAssetAccessBody;
import apimodels.DeletePartnerAssetsResultsResponseArray;
import apimodels.Error;
import apimodels.PartnerType;
import apimodels.PermissionsWithOwner;
import apimodels.UpdateAssetGroupBody;
import apimodels.UpdateAssetGroupResponse;
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

    public Result assetGroupCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetGroupBody createAssetGroupBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CreateAssetGroupResponse obj = assetGroupCreate(request, businessId, createAssetGroupBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateAssetGroupResponse assetGroupCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetGroupBody createAssetGroupBody) throws Exception;

    public Result assetGroupDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteAssetGroupBody deleteAssetGroupBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeleteAssetGroupResponse obj = assetGroupDelete(request, businessId, deleteAssetGroupBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteAssetGroupResponse assetGroupDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteAssetGroupBody deleteAssetGroupBody) throws Exception;

    public Result assetGroupUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdateAssetGroupBody updateAssetGroupBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UpdateAssetGroupResponse obj = assetGroupUpdate(request, businessId, updateAssetGroupBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateAssetGroupResponse assetGroupUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdateAssetGroupBody updateAssetGroupBody) throws Exception;

    public Result businessAssetMembersGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Min(0)Integer startIndex) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessAssetMembersGet200Response obj = businessAssetMembersGet(request, businessId, assetId, bookmark, pageSize, startIndex);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessAssetMembersGet200Response businessAssetMembersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Min(0)Integer startIndex) throws Exception;

    public Result businessAssetPartnersGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessAssetPartnersGet200Response obj = businessAssetPartnersGet(request, businessId, assetId, startIndex, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessAssetPartnersGet200Response businessAssetPartnersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

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

    public Result businessMemberAssetsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String memberId, String assetType,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessMemberAssetsGet200Response obj = businessMemberAssetsGet(request, businessId, memberId, assetType, startIndex, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessMemberAssetsGet200Response businessMemberAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String memberId, String assetType,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result businessMembersAssetAccessDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeleteMemberAccessResultsResponseArray obj = businessMembersAssetAccessDelete(request, businessId, businessMembersAssetAccessDeleteRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest) throws Exception;

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

    public Result businessPartnerAssetAccessGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String partnerId, PartnerType partnerType, String assetType,  @Min(0)Integer startIndex,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BusinessPartnerAssetAccessGet200Response obj = businessPartnerAssetAccessGet(request, businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String partnerId, PartnerType partnerType, String assetType,  @Min(0)Integer startIndex,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception;

    public Result deletePartnerAssetAccessHandlerImplHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeletePartnerAssetsResultsResponseArray obj = deletePartnerAssetAccessHandlerImpl(request, businessId, deletePartnerAssetAccessBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) throws Exception;

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
