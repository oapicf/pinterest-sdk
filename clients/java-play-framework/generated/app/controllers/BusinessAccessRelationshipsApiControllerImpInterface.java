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

    public Result deleteBusinessMembershipHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, MembersToDeleteBody membersToDeleteBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeletedMembersResponse obj = deleteBusinessMembership(request, businessId, membersToDeleteBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeletedMembersResponse deleteBusinessMembership(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, MembersToDeleteBody membersToDeleteBody) throws Exception;

    public Result deleteBusinessPartnersHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnersRequest deletePartnersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeletePartnersResponse obj = deleteBusinessPartners(request, businessId, deletePartnersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeletePartnersResponse deleteBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnersRequest deletePartnersRequest) throws Exception;

    public Result getBusinessEmployersHttp(Http.Request request,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        GetBusinessEmployers200Response obj = getBusinessEmployers(request, pageSize, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessEmployers200Response getBusinessEmployers(Http.Request request,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception;

    public Result getBusinessMembersHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles,  @Size(max=500)String memberIds,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        GetBusinessMembers200Response obj = getBusinessMembers(request, businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessMembers200Response getBusinessMembers(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles,  @Size(max=500)String memberIds,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result getBusinessPartnersHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, PartnerType partnerType,  @Size(max=500)String partnerIds,  @Min(0)Integer startIndex,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        GetBusinessPartners200Response obj = getBusinessPartners(request, businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetBusinessPartners200Response getBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, PartnerType partnerType,  @Size(max=500)String partnerIds,  @Min(0)Integer startIndex,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception;

    public Result updateBusinessMembershipsHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UpdateMemberResultsResponseArray obj = updateBusinessMemberships(request, businessId, updateMemberBusinessRoleBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateMemberResultsResponseArray updateBusinessMemberships(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody) throws Exception;

}
