package controllers;

import apimodels.BrandAccount;
import apimodels.BrandAccountCreate;
import apimodels.BrandAccountUpdate;
import apimodels.BusinessMembershipMember;
import apimodels.DeleteBusinessMembership200Response;
import apimodels.DeleteBusinessMembershipBody;
import apimodels.DeleteBusinessPartners;
import apimodels.DeleteBusinessPartnersDelete;
import apimodels.GetBusinessEmployers200Response;
import apimodels.MemberBusinessRole;
import apimodels.PartnerType;
import apimodels.PinterestLibError;
import apimodels.SystemUserUpdateWithRequiredBody;
import apimodels.UpdateBusinessMembershipsResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessAccessRelationshipsApiControllerImp extends BusinessAccessRelationshipsApiControllerImpInterface {
    @Override
    public BrandAccount brandAccountsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId, BrandAccountCreate brandAccountCreate) throws Exception {
        //Do your magic!!!
        return new BrandAccount();
    }

    @Override
    public BrandAccount brandAccountsUpdate(Http.Request request, String brandAccountId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId, BrandAccountUpdate brandAccountUpdate) throws Exception {
        //Do your magic!!!
        return new BrandAccount();
    }

    @Override
    public DeleteBusinessMembership200Response deleteBusinessMembership(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody) throws Exception {
        //Do your magic!!!
        return new DeleteBusinessMembership200Response();
    }

    @Override
    public DeleteBusinessPartners deleteBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete) throws Exception {
        //Do your magic!!!
        return new DeleteBusinessPartners();
    }

    @Override
    public GetBusinessEmployers200Response getBusinessEmployers(Http.Request request, Boolean assetsSummary, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetBusinessEmployers200Response();
    }

    @Override
    public GetBusinessEmployers200Response getBusinessMembers(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles,  @Size(max=500)String memberIds,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetBusinessEmployers200Response();
    }

    @Override
    public GetBusinessEmployers200Response getBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, PartnerType partnerType,  @Size(max=500)String partnerIds,  @Min(0)Integer startIndex, Boolean sortAscending, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new GetBusinessEmployers200Response();
    }

    @Override
    public void systemUserUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody) throws Exception {
        //Do your magic!!!
    }

    @Override
    public UpdateBusinessMembershipsResponse updateBusinessMemberships(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<@Valid BusinessMembershipMember> businessMembershipMember) throws Exception {
        //Do your magic!!!
        return new UpdateBusinessMembershipsResponse();
    }

}
