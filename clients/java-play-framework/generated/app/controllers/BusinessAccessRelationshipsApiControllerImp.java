package controllers;

import apimodels.DeletePartnersRequest;
import apimodels.DeletePartnersResponse;
import apimodels.DeletedMembersResponse;
import apimodels.Error;
import apimodels.GetBusinessEmployers200Response;
import apimodels.GetBusinessMembers200Response;
import apimodels.GetBusinessPartners200Response;
import apimodels.MemberBusinessRole;
import apimodels.MembersToDeleteBody;
import apimodels.PartnerType;
import apimodels.UpdateMemberBusinessRoleBody;
import apimodels.UpdateMemberResultsResponseArray;

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
public class BusinessAccessRelationshipsApiControllerImp extends BusinessAccessRelationshipsApiControllerImpInterface {
    @Override
    public DeletedMembersResponse deleteBusinessMembership(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, MembersToDeleteBody membersToDeleteBody) throws Exception {
        //Do your magic!!!
        return new DeletedMembersResponse();
    }

    @Override
    public DeletePartnersResponse deleteBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnersRequest deletePartnersRequest) throws Exception {
        //Do your magic!!!
        return new DeletePartnersResponse();
    }

    @Override
    public GetBusinessEmployers200Response getBusinessEmployers(Http.Request request,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new GetBusinessEmployers200Response();
    }

    @Override
    public GetBusinessMembers200Response getBusinessMembers(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles,  @Size(max=500)String memberIds,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetBusinessMembers200Response();
    }

    @Override
    public GetBusinessPartners200Response getBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, PartnerType partnerType,  @Size(max=500)String partnerIds,  @Min(0)Integer startIndex,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new GetBusinessPartners200Response();
    }

    @Override
    public UpdateMemberResultsResponseArray updateBusinessMemberships(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody) throws Exception {
        //Do your magic!!!
        return new UpdateMemberResultsResponseArray();
    }

}
