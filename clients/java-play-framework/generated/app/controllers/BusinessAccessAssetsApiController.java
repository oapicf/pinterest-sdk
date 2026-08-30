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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessAccessAssetsApiController extends Controller {
    private final BusinessAccessAssetsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BusinessAccessAssetsApiController(Config configuration, BusinessAccessAssetsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result assetGroupCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodeassetGroupInputCreate = request.body().asJson();
        AssetGroupInputCreate assetGroupInputCreate;
        if (nodeassetGroupInputCreate != null) {
            assetGroupInputCreate = mapper.readValue(nodeassetGroupInputCreate.toString(), AssetGroupInputCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(assetGroupInputCreate);
            }
        } else {
            throw new IllegalArgumentException("'AssetGroupInputCreate' parameter is required");
        }
        return imp.assetGroupCreateHttp(request, businessId, assetGroupInputCreate);
    }

    @ApiAction
    public Result assetGroupDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodeassetGroupDeletionDelete = request.body().asJson();
        AssetGroupDeletionDelete assetGroupDeletionDelete;
        if (nodeassetGroupDeletionDelete != null) {
            assetGroupDeletionDelete = mapper.readValue(nodeassetGroupDeletionDelete.toString(), AssetGroupDeletionDelete.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(assetGroupDeletionDelete);
            }
        } else {
            throw new IllegalArgumentException("'AssetGroupDeletionDelete' parameter is required");
        }
        return imp.assetGroupDeleteHttp(request, businessId, assetGroupDeletionDelete);
    }

    @ApiAction
    public Result assetGroupUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodeassetGroupModificationReadOrUpdate = request.body().asJson();
        AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate;
        if (nodeassetGroupModificationReadOrUpdate != null) {
            assetGroupModificationReadOrUpdate = mapper.readValue(nodeassetGroupModificationReadOrUpdate.toString(), AssetGroupModificationReadOrUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(assetGroupModificationReadOrUpdate);
            }
        } else {
            throw new IllegalArgumentException("'AssetGroupModificationReadOrUpdate' parameter is required");
        }
        return imp.assetGroupUpdateHttp(request, businessId, assetGroupModificationReadOrUpdate);
    }

    @ApiAction
    public Result businessAssetMembersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId) throws Exception {
        String valuestartIndex = request.getQueryString("start_index");
        Integer startIndex;
        if (valuestartIndex != null) {
            startIndex = Integer.parseInt(valuestartIndex);
        } else {
            startIndex = 0;
        }
        String valuefetchSystemUsers = request.getQueryString("fetch_system_users");
        Boolean fetchSystemUsers;
        if (valuefetchSystemUsers != null) {
            fetchSystemUsers = Boolean.valueOf(valuefetchSystemUsers);
        } else {
            fetchSystemUsers = false;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.businessAssetMembersGetHttp(request, businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize);
    }

    @ApiAction
    public Result businessAssetPartnersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId) throws Exception {
        String valuestartIndex = request.getQueryString("start_index");
        Integer startIndex;
        if (valuestartIndex != null) {
            startIndex = Integer.parseInt(valuestartIndex);
        } else {
            startIndex = 0;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.businessAssetPartnersGetHttp(request, businessId, assetId, startIndex, bookmark, pageSize);
    }

    @ApiAction
    public Result businessAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        String[] permissionsArray = request.queryString().get("permissions");
        List<String> permissionsList = OpenAPIUtils.parametersToList("multi", permissionsArray);
        List<PermissionsWithOwner> permissions = new ArrayList<>();
        for (String curParam : permissionsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                permissions.add(curParam);
            }
        }
        String valuechildAssetId = request.getQueryString("child_asset_id");
        String childAssetId;
        if (valuechildAssetId != null) {
            childAssetId = valuechildAssetId;
        } else {
            childAssetId = null;
        }
        String valueassetGroupId = request.getQueryString("asset_group_id");
        String assetGroupId;
        if (valueassetGroupId != null) {
            assetGroupId = valueassetGroupId;
        } else {
            assetGroupId = null;
        }
        String valueassetType = request.getQueryString("asset_type");
        String assetType;
        if (valueassetType != null) {
            assetType = valueassetType;
        } else {
            assetType = "AD_ACCOUNT";
        }
        String valuestartIndex = request.getQueryString("start_index");
        Integer startIndex;
        if (valuestartIndex != null) {
            startIndex = Integer.parseInt(valuestartIndex);
        } else {
            startIndex = 0;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.businessAssetsGetHttp(request, businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);
    }

    @ApiAction
    public Result businessMemberAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String memberId) throws Exception {
        String valueassetType = request.getQueryString("asset_type");
        String assetType;
        if (valueassetType != null) {
            assetType = valueassetType;
        } else {
            assetType = "AD_ACCOUNT";
        }
        String valuestartIndex = request.getQueryString("start_index");
        Integer startIndex;
        if (valuestartIndex != null) {
            startIndex = Integer.parseInt(valuestartIndex);
        } else {
            startIndex = 0;
        }
        String valuesortBy = request.getQueryString("sort_by");
        AssetSortBy sortBy;
        if (valuesortBy != null) {
            sortBy = valuesortBy;
        } else {
            sortBy = null;
        }
        String valuesortAscending = request.getQueryString("sort_ascending");
        Boolean sortAscending;
        if (valuesortAscending != null) {
            sortAscending = Boolean.valueOf(valuesortAscending);
        } else {
            sortAscending = true;
        }
        String valuesearchBy = request.getQueryString("search_by");
        AssetSearchBy searchBy;
        if (valuesearchBy != null) {
            searchBy = valuesearchBy;
        } else {
            searchBy = null;
        }
        String valuesearchValue = request.getQueryString("search_value");
        String searchValue;
        if (valuesearchValue != null) {
            searchValue = valuesearchValue;
        } else {
            searchValue = null;
        }
        String valueassetPermissionType = request.getQueryString("asset_permission_type");
        AssetPermissionType assetPermissionType;
        if (valueassetPermissionType != null) {
            assetPermissionType = valueassetPermissionType;
        } else {
            assetPermissionType = null;
        }
        String[] adAccountStatusesArray = request.queryString().get("ad_account_statuses");
        List<String> adAccountStatusesList = OpenAPIUtils.parametersToList("multi", adAccountStatusesArray);
        List<NonDraftEntityStatus> adAccountStatuses = new ArrayList<>();
        for (String curParam : adAccountStatusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                adAccountStatuses.add(curParam);
            }
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.businessMemberAssetsGetHttp(request, businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize);
    }

    @ApiAction
    public Result businessMembersAssetAccessDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodebusinessMembersAssetAccessDeleteBody = request.body().asJson();
        BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody;
        if (nodebusinessMembersAssetAccessDeleteBody != null) {
            businessMembersAssetAccessDeleteBody = mapper.readValue(nodebusinessMembersAssetAccessDeleteBody.toString(), BusinessMembersAssetAccessDeleteBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(businessMembersAssetAccessDeleteBody);
            }
        } else {
            throw new IllegalArgumentException("'BusinessMembersAssetAccessDeleteBody' parameter is required");
        }
        return imp.businessMembersAssetAccessDeleteHttp(request, businessId, businessMembersAssetAccessDeleteBody);
    }

    @ApiAction
    public Result businessMembersAssetAccessUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodeupdateMemberAssetAccessBody = request.body().asJson();
        UpdateMemberAssetAccessBody updateMemberAssetAccessBody;
        if (nodeupdateMemberAssetAccessBody != null) {
            updateMemberAssetAccessBody = mapper.readValue(nodeupdateMemberAssetAccessBody.toString(), UpdateMemberAssetAccessBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateMemberAssetAccessBody);
            }
        } else {
            throw new IllegalArgumentException("'UpdateMemberAssetAccessBody' parameter is required");
        }
        return imp.businessMembersAssetAccessUpdateHttp(request, businessId, updateMemberAssetAccessBody);
    }

    @ApiAction
    public Result businessPartnerAssetAccessGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String partnerId) throws Exception {
        String valuepartnerType = request.getQueryString("partner_type");
        String partnerType;
        if (valuepartnerType != null) {
            partnerType = valuepartnerType;
        } else {
            partnerType = "INTERNAL";
        }
        String valueassetType = request.getQueryString("asset_type");
        String assetType;
        if (valueassetType != null) {
            assetType = valueassetType;
        } else {
            assetType = "AD_ACCOUNT";
        }
        String valuestartIndex = request.getQueryString("start_index");
        Integer startIndex;
        if (valuestartIndex != null) {
            startIndex = Integer.parseInt(valuestartIndex);
        } else {
            startIndex = 0;
        }
        String valuesortBy = request.getQueryString("sort_by");
        AssetSortBy sortBy;
        if (valuesortBy != null) {
            sortBy = valuesortBy;
        } else {
            sortBy = null;
        }
        String valuesortAscending = request.getQueryString("sort_ascending");
        Boolean sortAscending;
        if (valuesortAscending != null) {
            sortAscending = Boolean.valueOf(valuesortAscending);
        } else {
            sortAscending = true;
        }
        String valuesearchBy = request.getQueryString("search_by");
        AssetSearchBy searchBy;
        if (valuesearchBy != null) {
            searchBy = valuesearchBy;
        } else {
            searchBy = null;
        }
        String valuesearchValue = request.getQueryString("search_value");
        String searchValue;
        if (valuesearchValue != null) {
            searchValue = valuesearchValue;
        } else {
            searchValue = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.businessPartnerAssetAccessGetHttp(request, businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize);
    }

    @ApiAction
    public Result deletePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodedeletePartnerAssetAccessBody = request.body().asJson();
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody;
        if (nodedeletePartnerAssetAccessBody != null) {
            deletePartnerAssetAccessBody = mapper.readValue(nodedeletePartnerAssetAccessBody.toString(), DeletePartnerAssetAccessBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deletePartnerAssetAccessBody);
            }
        } else {
            throw new IllegalArgumentException("'DeletePartnerAssetAccessBody' parameter is required");
        }
        return imp.deletePartnerAssetAccessHandlerImplHttp(request, businessId, deletePartnerAssetAccessBody);
    }

    @ApiAction
    public Result updatePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodeupdatePartnerAssetAccessBody = request.body().asJson();
        UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody;
        if (nodeupdatePartnerAssetAccessBody != null) {
            updatePartnerAssetAccessBody = mapper.readValue(nodeupdatePartnerAssetAccessBody.toString(), UpdatePartnerAssetAccessBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updatePartnerAssetAccessBody);
            }
        } else {
            throw new IllegalArgumentException("'UpdatePartnerAssetAccessBody' parameter is required");
        }
        return imp.updatePartnerAssetAccessHandlerImplHttp(request, businessId, updatePartnerAssetAccessBody);
    }

}
