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
public abstract class BusinessAccessRelationshipsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result brandAccountsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId, BrandAccountCreate brandAccountCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BrandAccount obj = brandAccountsCreate(request, businessHierarchyId, brandAccountCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BrandAccount brandAccountsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId, BrandAccountCreate brandAccountCreate) throws Exception;

    public Result brandAccountsUpdateHttp(Http.Request request, String brandAccountId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId, BrandAccountUpdate brandAccountUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BrandAccount obj = brandAccountsUpdate(request, brandAccountId, businessHierarchyId, brandAccountUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BrandAccount brandAccountsUpdate(Http.Request request, String brandAccountId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId, BrandAccountUpdate brandAccountUpdate) throws Exception;

    public Result deleteBusinessMembershipHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeleteBusinessMembership200Response obj = deleteBusinessMembership(request, businessId, deleteBusinessMembershipBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteBusinessMembership200Response deleteBusinessMembership(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody) throws Exception;

    public Result deleteBusinessPartnersHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeleteBusinessPartners obj = deleteBusinessPartners(request, businessId, deleteBusinessPartnersDelete);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteBusinessPartners deleteBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete) throws Exception;

    public Result getBusinessEmployersHttp(Http.Request request, Boolean assetsSummary, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        GetBusinessEmployers200Response obj = getBusinessEmployers(request, assetsSummary, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessEmployers200Response getBusinessEmployers(Http.Request request, Boolean assetsSummary, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result getBusinessMembersHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles,  @Size(max=500)String memberIds,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        GetBusinessEmployers200Response obj = getBusinessMembers(request, businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessEmployers200Response getBusinessMembers(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles,  @Size(max=500)String memberIds,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result getBusinessPartnersHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, PartnerType partnerType,  @Size(max=500)String partnerIds,  @Min(0)Integer startIndex, Boolean sortAscending, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        GetBusinessEmployers200Response obj = getBusinessPartners(request, businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessEmployers200Response getBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, PartnerType partnerType,  @Size(max=500)String partnerIds,  @Min(0)Integer startIndex, Boolean sortAscending, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result systemUserUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        systemUserUpdate(request, businessId, systemUserId, systemUserUpdateWithRequiredBody);
        return ok();

    }

    public abstract void systemUserUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody) throws Exception;

    public Result updateBusinessMembershipsHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<@Valid BusinessMembershipMember> businessMembershipMember) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UpdateBusinessMembershipsResponse obj = updateBusinessMemberships(request, businessId, businessMembershipMember);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateBusinessMembershipsResponse updateBusinessMemberships(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<@Valid BusinessMembershipMember> businessMembershipMember) throws Exception;

}
