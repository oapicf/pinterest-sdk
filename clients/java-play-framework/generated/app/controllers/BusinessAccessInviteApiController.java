package controllers;

import apimodels.AuthRespondInvitesBody;
import apimodels.CancelInvitesBody;
import apimodels.CreateAssetAccessRequestBody;
import apimodels.CreateAssetAccessRequestResponse;
import apimodels.CreateAssetInvitesRequest;
import apimodels.CreateInvitesResultsResponseArray;
import apimodels.CreateMembershipOrPartnershipInvitesBody;
import apimodels.DeleteInvitesResultsResponseArray;
import apimodels.Error;
import apimodels.GetInvites200Response;
import apimodels.InviteType;
import apimodels.RespondToInvitesResponseArray;
import apimodels.UpdateInvitesResultsResponseArray;

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
public class BusinessAccessInviteApiController extends Controller {
    private final BusinessAccessInviteApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BusinessAccessInviteApiController(Config configuration, BusinessAccessInviteApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result assetAccessRequestsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodecreateAssetAccessRequestBody = request.body().asJson();
        CreateAssetAccessRequestBody createAssetAccessRequestBody;
        if (nodecreateAssetAccessRequestBody != null) {
            createAssetAccessRequestBody = mapper.readValue(nodecreateAssetAccessRequestBody.toString(), CreateAssetAccessRequestBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createAssetAccessRequestBody);
            }
        } else {
            throw new IllegalArgumentException("'CreateAssetAccessRequestBody' parameter is required");
        }
        return imp.assetAccessRequestsCreateHttp(request, businessId, createAssetAccessRequestBody);
    }

    @ApiAction
    public Result cancelInvitesOrRequests(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodecancelInvitesBody = request.body().asJson();
        CancelInvitesBody cancelInvitesBody;
        if (nodecancelInvitesBody != null) {
            cancelInvitesBody = mapper.readValue(nodecancelInvitesBody.toString(), CancelInvitesBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(cancelInvitesBody);
            }
        } else {
            throw new IllegalArgumentException("'CancelInvitesBody' parameter is required");
        }
        return imp.cancelInvitesOrRequestsHttp(request, businessId, cancelInvitesBody);
    }

    @ApiAction
    public Result createAssetInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodecreateAssetInvitesRequest = request.body().asJson();
        CreateAssetInvitesRequest createAssetInvitesRequest;
        if (nodecreateAssetInvitesRequest != null) {
            createAssetInvitesRequest = mapper.readValue(nodecreateAssetInvitesRequest.toString(), CreateAssetInvitesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createAssetInvitesRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateAssetInvitesRequest' parameter is required");
        }
        return imp.createAssetInvitesHttp(request, businessId, createAssetInvitesRequest);
    }

    @ApiAction
    public Result createMembershipOrPartnershipInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodecreateMembershipOrPartnershipInvitesBody = request.body().asJson();
        CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody;
        if (nodecreateMembershipOrPartnershipInvitesBody != null) {
            createMembershipOrPartnershipInvitesBody = mapper.readValue(nodecreateMembershipOrPartnershipInvitesBody.toString(), CreateMembershipOrPartnershipInvitesBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createMembershipOrPartnershipInvitesBody);
            }
        } else {
            throw new IllegalArgumentException("'CreateMembershipOrPartnershipInvitesBody' parameter is required");
        }
        return imp.createMembershipOrPartnershipInvitesHttp(request, businessId, createMembershipOrPartnershipInvitesBody);
    }

    @ApiAction
    public Result getInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        String valueisMember = request.getQueryString("is_member");
        Boolean isMember;
        if (valueisMember != null) {
            isMember = Boolean.valueOf(valueisMember);
        } else {
            isMember = true;
        }
        String[] inviteStatusArray = request.queryString().get("invite_status");
        List<String> inviteStatusList = OpenAPIUtils.parametersToList("multi", inviteStatusArray);
        List<String> inviteStatus = new ArrayList<>();
        for (String curParam : inviteStatusList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                inviteStatus.add(curParam);
            }
        }
        String valueinviteType = request.getQueryString("invite_type");
        InviteType inviteType;
        if (valueinviteType != null) {
            inviteType = valueinviteType;
        } else {
            inviteType = null;
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
        return imp.getInvitesHttp(request, businessId, isMember, inviteStatus, inviteType, bookmark, pageSize);
    }

    @ApiAction
    public Result respondBusinessAccessInvites(Http.Request request) throws Exception {
        JsonNode nodeauthRespondInvitesBody = request.body().asJson();
        AuthRespondInvitesBody authRespondInvitesBody;
        if (nodeauthRespondInvitesBody != null) {
            authRespondInvitesBody = mapper.readValue(nodeauthRespondInvitesBody.toString(), AuthRespondInvitesBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(authRespondInvitesBody);
            }
        } else {
            throw new IllegalArgumentException("'AuthRespondInvitesBody' parameter is required");
        }
        return imp.respondBusinessAccessInvitesHttp(request, authRespondInvitesBody);
    }

}
