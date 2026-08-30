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
        JsonNode nodebrandAccountCreate = request.body().asJson();
        BrandAccountCreate brandAccountCreate;
        if (nodebrandAccountCreate != null) {
            brandAccountCreate = mapper.readValue(nodebrandAccountCreate.toString(), BrandAccountCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(brandAccountCreate);
            }
        } else {
            throw new IllegalArgumentException("'BrandAccountCreate' parameter is required");
        }
        return imp.brandAccountsCreateHttp(request, businessHierarchyId, brandAccountCreate);
    }

    @ApiAction
    public Result brandAccountsUpdate(Http.Request request, String brandAccountId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId) throws Exception {
        JsonNode nodebrandAccountUpdate = request.body().asJson();
        BrandAccountUpdate brandAccountUpdate;
        if (nodebrandAccountUpdate != null) {
            brandAccountUpdate = mapper.readValue(nodebrandAccountUpdate.toString(), BrandAccountUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(brandAccountUpdate);
            }
        } else {
            throw new IllegalArgumentException("'BrandAccountUpdate' parameter is required");
        }
        return imp.brandAccountsUpdateHttp(request, brandAccountId, businessHierarchyId, brandAccountUpdate);
    }

    @ApiAction
    public Result deleteBusinessMembership(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodedeleteBusinessMembershipBody = request.body().asJson();
        DeleteBusinessMembershipBody deleteBusinessMembershipBody;
        if (nodedeleteBusinessMembershipBody != null) {
            deleteBusinessMembershipBody = mapper.readValue(nodedeleteBusinessMembershipBody.toString(), DeleteBusinessMembershipBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteBusinessMembershipBody);
            }
        } else {
            throw new IllegalArgumentException("'DeleteBusinessMembershipBody' parameter is required");
        }
        return imp.deleteBusinessMembershipHttp(request, businessId, deleteBusinessMembershipBody);
    }

    @ApiAction
    public Result deleteBusinessPartners(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodedeleteBusinessPartnersDelete = request.body().asJson();
        DeleteBusinessPartnersDelete deleteBusinessPartnersDelete;
        if (nodedeleteBusinessPartnersDelete != null) {
            deleteBusinessPartnersDelete = mapper.readValue(nodedeleteBusinessPartnersDelete.toString(), DeleteBusinessPartnersDelete.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(deleteBusinessPartnersDelete);
            }
        } else {
            throw new IllegalArgumentException("'DeleteBusinessPartnersDelete' parameter is required");
        }
        return imp.deleteBusinessPartnersHttp(request, businessId, deleteBusinessPartnersDelete);
    }

    @ApiAction
    public Result getBusinessEmployers(Http.Request request) throws Exception {
        String valueassetsSummary = request.getQueryString("assets_summary");
        Boolean assetsSummary;
        if (valueassetsSummary != null) {
            assetsSummary = Boolean.valueOf(valueassetsSummary);
        } else {
            assetsSummary = true;
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
        return imp.getBusinessEmployersHttp(request, assetsSummary, bookmark, pageSize);
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
        String valuesortAscending = request.getQueryString("sort_ascending");
        Boolean sortAscending;
        if (valuesortAscending != null) {
            sortAscending = Boolean.valueOf(valuesortAscending);
        } else {
            sortAscending = null;
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
        return imp.getBusinessPartnersHttp(request, businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize);
    }

    @ApiAction
    public Result systemUserUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String systemUserId) throws Exception {
        JsonNode nodesystemUserUpdateWithRequiredBody = request.body().asJson();
        SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody;
        if (nodesystemUserUpdateWithRequiredBody != null) {
            systemUserUpdateWithRequiredBody = mapper.readValue(nodesystemUserUpdateWithRequiredBody.toString(), SystemUserUpdateWithRequiredBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(systemUserUpdateWithRequiredBody);
            }
        } else {
            throw new IllegalArgumentException("'SystemUserUpdateWithRequiredBody' parameter is required");
        }
        return imp.systemUserUpdateHttp(request, businessId, systemUserId, systemUserUpdateWithRequiredBody);
    }

    @ApiAction
    public Result updateBusinessMemberships(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodebusinessMembershipMember = request.body().asJson();
        List<@Valid BusinessMembershipMember> businessMembershipMember;
        if (nodebusinessMembershipMember != null) {
            businessMembershipMember = mapper.readValue(nodebusinessMembershipMember.toString(), new TypeReference<List<@Valid BusinessMembershipMember>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (BusinessMembershipMember curItem : businessMembershipMember) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'BusinessMembershipMember' parameter is required");
        }
        return imp.updateBusinessMembershipsHttp(request, businessId, businessMembershipMember);
    }

}
