package controllers;

import apimodels.BrandAccountsCreate200Response;
import apimodels.BrandAccountsCreateRequest;
import apimodels.BrandAccountsUpdateRequest;
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
import apimodels.SystemUserUpdateRequest;
import apimodels.UpdateMemberBusinessRoleBody;
import apimodels.UpdateMemberResultsResponseArray;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BusinessAccessRelationshipsApiController extends Controller {
    private final BusinessAccessRelationshipsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BusinessAccessRelationshipsApiController(Config configuration, BusinessAccessRelationshipsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result brandAccountsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId) throws Exception {
        JsonNode nodebrandAccountsCreateRequest = request.body().asJson();
        BrandAccountsCreateRequest brandAccountsCreateRequest;
        if (nodebrandAccountsCreateRequest != null) {
            brandAccountsCreateRequest = mapper.readValue(nodebrandAccountsCreateRequest.toString(), BrandAccountsCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(brandAccountsCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'BrandAccountsCreateRequest' parameter is required");
        }
        return imp.brandAccountsCreateHttp(request, businessHierarchyId, brandAccountsCreateRequest);
    }

    @ApiAction
    public Result brandAccountsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String brandAccountId) throws Exception {
        JsonNode nodebrandAccountsUpdateRequest = request.body().asJson();
        BrandAccountsUpdateRequest brandAccountsUpdateRequest;
        if (nodebrandAccountsUpdateRequest != null) {
            brandAccountsUpdateRequest = mapper.readValue(nodebrandAccountsUpdateRequest.toString(), BrandAccountsUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(brandAccountsUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'BrandAccountsUpdateRequest' parameter is required");
        }
        return imp.brandAccountsUpdateHttp(request, businessHierarchyId, brandAccountId, brandAccountsUpdateRequest);
    }

    @ApiAction
    public Result deleteBusinessMembership(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodemembersToDeleteBody = request.body().asJson();
        MembersToDeleteBody membersToDeleteBody;
        if (nodemembersToDeleteBody != null) {
            membersToDeleteBody = mapper.readValue(nodemembersToDeleteBody.toString(), MembersToDeleteBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(membersToDeleteBody);
            }
        } else {
            throw new IllegalArgumentException("'MembersToDeleteBody' parameter is required");
        }
        return imp.deleteBusinessMembershipHttp(request, businessId, membersToDeleteBody);
    }

    @ApiAction
    public Result deleteBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodedeletePartnersRequest = request.body().asJson();
        DeletePartnersRequest deletePartnersRequest;
        if (nodedeletePartnersRequest != null) {
            deletePartnersRequest = mapper.readValue(nodedeletePartnersRequest.toString(), DeletePartnersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deletePartnersRequest);
            }
        } else {
            throw new IllegalArgumentException("'DeletePartnersRequest' parameter is required");
        }
        return imp.deleteBusinessPartnersHttp(request, businessId, deletePartnersRequest);
    }

    @ApiAction
    public Result getBusinessEmployers(Http.Request request) throws Exception {
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
        return imp.getBusinessEmployersHttp(request, pageSize, bookmark);
    }

    @ApiAction
    public Result getBusinessMembers(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        String valuefetchSystemUsers = request.getQueryString("fetch_system_users");
        Boolean fetchSystemUsers;
        if (valuefetchSystemUsers != null) {
            fetchSystemUsers = Boolean.valueOf(valuefetchSystemUsers);
        } else {
            fetchSystemUsers = false;
        }
        String valueassetsSummary = request.getQueryString("assets_summary");
        Boolean assetsSummary;
        if (valueassetsSummary != null) {
            assetsSummary = Boolean.valueOf(valueassetsSummary);
        } else {
            assetsSummary = false;
        }
        String[] businessRolesArray = request.queryString().get("business_roles");
        List<String> businessRolesList = OpenAPIUtils.parametersToList("multi", businessRolesArray);
        List<MemberBusinessRole> businessRoles = new ArrayList<>();
        for (String curParam : businessRolesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                businessRoles.add(curParam);
            }
        }
        String valuememberIds = request.getQueryString("member_ids");
        String memberIds;
        if (valuememberIds != null) {
            memberIds = valuememberIds;
        } else {
            memberIds = null;
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
        return imp.getBusinessMembersHttp(request, businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize);
    }

    @ApiAction
    public Result getBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        String valueassetsSummary = request.getQueryString("assets_summary");
        Boolean assetsSummary;
        if (valueassetsSummary != null) {
            assetsSummary = Boolean.valueOf(valueassetsSummary);
        } else {
            assetsSummary = false;
        }
        String valuepartnerType = request.getQueryString("partner_type");
        PartnerType partnerType;
        if (valuepartnerType != null) {
            partnerType = valuepartnerType;
        } else {
            partnerType = null;
        }
        String valuepartnerIds = request.getQueryString("partner_ids");
        String partnerIds;
        if (valuepartnerIds != null) {
            partnerIds = valuepartnerIds;
        } else {
            partnerIds = null;
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
        return imp.getBusinessPartnersHttp(request, businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark);
    }

    @ApiAction
    public Result systemUserUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String systemUserId) throws Exception {
        JsonNode nodesystemUserUpdateRequest = request.body().asJson();
        SystemUserUpdateRequest systemUserUpdateRequest;
        if (nodesystemUserUpdateRequest != null) {
            systemUserUpdateRequest = mapper.readValue(nodesystemUserUpdateRequest.toString(), SystemUserUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(systemUserUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'SystemUserUpdateRequest' parameter is required");
        }
        return imp.systemUserUpdateHttp(request, businessId, systemUserId, systemUserUpdateRequest);
    }

    @ApiAction
    public Result updateBusinessMemberships(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodeupdateMemberBusinessRoleBody = request.body().asJson();
        List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody;
        if (nodeupdateMemberBusinessRoleBody != null) {
            updateMemberBusinessRoleBody = mapper.readValue(nodeupdateMemberBusinessRoleBody.toString(), new TypeReference<List<@Valid UpdateMemberBusinessRoleBody>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (UpdateMemberBusinessRoleBody curItem : updateMemberBusinessRoleBody) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'UpdateMemberBusinessRoleBody' parameter is required");
        }
        return imp.updateBusinessMembershipsHttp(request, businessId, updateMemberBusinessRoleBody);
    }

}
