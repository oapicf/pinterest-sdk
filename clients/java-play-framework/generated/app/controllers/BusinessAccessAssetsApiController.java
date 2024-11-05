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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
        JsonNode nodecreateAssetGroupBody = request.body().asJson();
        CreateAssetGroupBody createAssetGroupBody;
        if (nodecreateAssetGroupBody != null) {
            createAssetGroupBody = mapper.readValue(nodecreateAssetGroupBody.toString(), CreateAssetGroupBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createAssetGroupBody);
            }
        } else {
            throw new IllegalArgumentException("'CreateAssetGroupBody' parameter is required");
        }
        return imp.assetGroupCreateHttp(request, businessId, createAssetGroupBody);
    }

    @ApiAction
    public Result assetGroupDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodedeleteAssetGroupBody = request.body().asJson();
        DeleteAssetGroupBody deleteAssetGroupBody;
        if (nodedeleteAssetGroupBody != null) {
            deleteAssetGroupBody = mapper.readValue(nodedeleteAssetGroupBody.toString(), DeleteAssetGroupBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteAssetGroupBody);
            }
        } else {
            throw new IllegalArgumentException("'DeleteAssetGroupBody' parameter is required");
        }
        return imp.assetGroupDeleteHttp(request, businessId, deleteAssetGroupBody);
    }

    @ApiAction
    public Result assetGroupUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodeupdateAssetGroupBody = request.body().asJson();
        UpdateAssetGroupBody updateAssetGroupBody;
        if (nodeupdateAssetGroupBody != null) {
            updateAssetGroupBody = mapper.readValue(nodeupdateAssetGroupBody.toString(), UpdateAssetGroupBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateAssetGroupBody);
            }
        } else {
            throw new IllegalArgumentException("'UpdateAssetGroupBody' parameter is required");
        }
        return imp.assetGroupUpdateHttp(request, businessId, updateAssetGroupBody);
    }

    @ApiAction
    public Result businessAssetMembersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId) throws Exception {
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
        String valuestartIndex = request.getQueryString("start_index");
        Integer startIndex;
        if (valuestartIndex != null) {
            startIndex = Integer.parseInt(valuestartIndex);
        } else {
            startIndex = 0;
        }
        return imp.businessAssetMembersGetHttp(request, businessId, assetId, bookmark, pageSize, startIndex);
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
        return imp.businessMemberAssetsGetHttp(request, businessId, memberId, assetType, startIndex, bookmark, pageSize);
    }

    @ApiAction
    public Result businessMembersAssetAccessDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodebusinessMembersAssetAccessDeleteRequest = request.body().asJson();
        BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest;
        if (nodebusinessMembersAssetAccessDeleteRequest != null) {
            businessMembersAssetAccessDeleteRequest = mapper.readValue(nodebusinessMembersAssetAccessDeleteRequest.toString(), BusinessMembersAssetAccessDeleteRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(businessMembersAssetAccessDeleteRequest);
            }
        } else {
            throw new IllegalArgumentException("'BusinessMembersAssetAccessDeleteRequest' parameter is required");
        }
        return imp.businessMembersAssetAccessDeleteHttp(request, businessId, businessMembersAssetAccessDeleteRequest);
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
        PartnerType partnerType;
        if (valuepartnerType != null) {
            partnerType = valuepartnerType;
        } else {
            partnerType = null;
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
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        return imp.businessPartnerAssetAccessGetHttp(request, businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark);
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
