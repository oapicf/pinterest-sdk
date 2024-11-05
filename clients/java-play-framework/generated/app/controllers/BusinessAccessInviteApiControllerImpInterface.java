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
public abstract class BusinessAccessInviteApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result assetAccessRequestsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CreateAssetAccessRequestResponse obj = assetAccessRequestsCreate(request, businessId, createAssetAccessRequestBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateAssetAccessRequestResponse assetAccessRequestsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody) throws Exception;

    public Result cancelInvitesOrRequestsHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CancelInvitesBody cancelInvitesBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeleteInvitesResultsResponseArray obj = cancelInvitesOrRequests(request, businessId, cancelInvitesBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteInvitesResultsResponseArray cancelInvitesOrRequests(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CancelInvitesBody cancelInvitesBody) throws Exception;

    public Result createAssetInvitesHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetInvitesRequest createAssetInvitesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UpdateInvitesResultsResponseArray obj = createAssetInvites(request, businessId, createAssetInvitesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateInvitesResultsResponseArray createAssetInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetInvitesRequest createAssetInvitesRequest) throws Exception;

    public Result createMembershipOrPartnershipInvitesHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CreateInvitesResultsResponseArray obj = createMembershipOrPartnershipInvites(request, businessId, createMembershipOrPartnershipInvitesBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) throws Exception;

    public Result getInvitesHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean isMember,  @Size(min=1)List<String> inviteStatus, InviteType inviteType, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        GetInvites200Response obj = getInvites(request, businessId, isMember, inviteStatus, inviteType, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetInvites200Response getInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean isMember,  @Size(min=1)List<String> inviteStatus, InviteType inviteType, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result respondBusinessAccessInvitesHttp(Http.Request request, AuthRespondInvitesBody authRespondInvitesBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        RespondToInvitesResponseArray obj = respondBusinessAccessInvites(request, authRespondInvitesBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RespondToInvitesResponseArray respondBusinessAccessInvites(Http.Request request, AuthRespondInvitesBody authRespondInvitesBody) throws Exception;

}
