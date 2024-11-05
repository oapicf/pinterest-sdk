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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessAccessInviteApiControllerImp extends BusinessAccessInviteApiControllerImpInterface {
    @Override
    public CreateAssetAccessRequestResponse assetAccessRequestsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody) throws Exception {
        //Do your magic!!!
        return new CreateAssetAccessRequestResponse();
    }

    @Override
    public DeleteInvitesResultsResponseArray cancelInvitesOrRequests(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CancelInvitesBody cancelInvitesBody) throws Exception {
        //Do your magic!!!
        return new DeleteInvitesResultsResponseArray();
    }

    @Override
    public UpdateInvitesResultsResponseArray createAssetInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetInvitesRequest createAssetInvitesRequest) throws Exception {
        //Do your magic!!!
        return new UpdateInvitesResultsResponseArray();
    }

    @Override
    public CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) throws Exception {
        //Do your magic!!!
        return new CreateInvitesResultsResponseArray();
    }

    @Override
    public GetInvites200Response getInvites(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean isMember,  @Size(min=1)List<String> inviteStatus, InviteType inviteType, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetInvites200Response();
    }

    @Override
    public RespondToInvitesResponseArray respondBusinessAccessInvites(Http.Request request, AuthRespondInvitesBody authRespondInvitesBody) throws Exception {
        //Do your magic!!!
        return new RespondToInvitesResponseArray();
    }

}
