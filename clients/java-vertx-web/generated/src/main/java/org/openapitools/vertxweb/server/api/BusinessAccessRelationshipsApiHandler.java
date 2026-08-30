package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BrandAccount;
import org.openapitools.vertxweb.server.model.BrandAccountCreate;
import org.openapitools.vertxweb.server.model.BrandAccountUpdate;
import org.openapitools.vertxweb.server.model.BusinessMembershipMember;
import org.openapitools.vertxweb.server.model.DeleteBusinessMembership200Response;
import org.openapitools.vertxweb.server.model.DeleteBusinessMembershipBody;
import org.openapitools.vertxweb.server.model.DeleteBusinessPartners;
import org.openapitools.vertxweb.server.model.DeleteBusinessPartnersDelete;
import org.openapitools.vertxweb.server.model.GetBusinessEmployers200Response;
import org.openapitools.vertxweb.server.model.MemberBusinessRole;
import org.openapitools.vertxweb.server.model.PartnerType;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.SystemUserUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.UpdateBusinessMembershipsResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class BusinessAccessRelationshipsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BusinessAccessRelationshipsApiHandler.class);

    private final BusinessAccessRelationshipsApi api;

    public BusinessAccessRelationshipsApiHandler(BusinessAccessRelationshipsApi api) {
        this.api = api;
    }

    @Deprecated
    public BusinessAccessRelationshipsApiHandler() {
        this(new BusinessAccessRelationshipsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("brandAccountsCreate").handler(this::brandAccountsCreate);
        builder.operation("brandAccountsUpdate").handler(this::brandAccountsUpdate);
        builder.operation("deleteBusinessMembership").handler(this::deleteBusinessMembership);
        builder.operation("deleteBusinessPartners").handler(this::deleteBusinessPartners);
        builder.operation("getBusinessEmployers").handler(this::getBusinessEmployers);
        builder.operation("getBusinessMembers").handler(this::getBusinessMembers);
        builder.operation("getBusinessPartners").handler(this::getBusinessPartners);
        builder.operation("systemUserUpdate").handler(this::systemUserUpdate);
        builder.operation("updateBusinessMemberships").handler(this::updateBusinessMemberships);
    }

    private void brandAccountsCreate(RoutingContext routingContext) {
        logger.info("brandAccountsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessHierarchyId = requestParameters.pathParameter("business_hierarchy_id") != null ? requestParameters.pathParameter("business_hierarchy_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BrandAccountCreate brandAccountCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BrandAccountCreate>(){}) : null;

        logger.debug("Parameter businessHierarchyId is {}", businessHierarchyId);
        logger.debug("Parameter brandAccountCreate is {}", brandAccountCreate);

        api.brandAccountsCreate(businessHierarchyId, brandAccountCreate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void brandAccountsUpdate(RoutingContext routingContext) {
        logger.info("brandAccountsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String brandAccountId = requestParameters.pathParameter("brand_account_id") != null ? requestParameters.pathParameter("brand_account_id").getString() : null;
        String businessHierarchyId = requestParameters.pathParameter("business_hierarchy_id") != null ? requestParameters.pathParameter("business_hierarchy_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BrandAccountUpdate brandAccountUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BrandAccountUpdate>(){}) : null;

        logger.debug("Parameter brandAccountId is {}", brandAccountId);
        logger.debug("Parameter businessHierarchyId is {}", businessHierarchyId);
        logger.debug("Parameter brandAccountUpdate is {}", brandAccountUpdate);

        api.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteBusinessMembership(RoutingContext routingContext) {
        logger.info("deleteBusinessMembership()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        DeleteBusinessMembershipBody deleteBusinessMembershipBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteBusinessMembershipBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteBusinessMembershipBody is {}", deleteBusinessMembershipBody);

        api.deleteBusinessMembership(businessId, deleteBusinessMembershipBody)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteBusinessPartners(RoutingContext routingContext) {
        logger.info("deleteBusinessPartners()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        DeleteBusinessPartnersDelete deleteBusinessPartnersDelete = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteBusinessPartnersDelete>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteBusinessPartnersDelete is {}", deleteBusinessPartnersDelete);

        api.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getBusinessEmployers(RoutingContext routingContext) {
        logger.info("getBusinessEmployers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean assetsSummary = requestParameters.queryParameter("assets_summary") != null ? requestParameters.queryParameter("assets_summary").getBoolean() : true;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter assetsSummary is {}", assetsSummary);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getBusinessEmployers(assetsSummary, bookmark, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getBusinessMembers(RoutingContext routingContext) {
        logger.info("getBusinessMembers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        Boolean fetchSystemUsers = requestParameters.queryParameter("fetch_system_users") != null ? requestParameters.queryParameter("fetch_system_users").getBoolean() : false;
        Boolean assetsSummary = requestParameters.queryParameter("assets_summary") != null ? requestParameters.queryParameter("assets_summary").getBoolean() : false;
        List<MemberBusinessRole> businessRoles = requestParameters.queryParameter("business_roles") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("business_roles").get(), new TypeReference<List<MemberBusinessRole>>(){}) : null;
        String memberIds = requestParameters.queryParameter("member_ids") != null ? requestParameters.queryParameter("member_ids").getString() : null;
        Integer startIndex = requestParameters.queryParameter("start_index") != null ? requestParameters.queryParameter("start_index").getInteger() : 0;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter fetchSystemUsers is {}", fetchSystemUsers);
        logger.debug("Parameter assetsSummary is {}", assetsSummary);
        logger.debug("Parameter businessRoles is {}", businessRoles);
        logger.debug("Parameter memberIds is {}", memberIds);
        logger.debug("Parameter startIndex is {}", startIndex);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getBusinessPartners(RoutingContext routingContext) {
        logger.info("getBusinessPartners()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        Boolean assetsSummary = requestParameters.queryParameter("assets_summary") != null ? requestParameters.queryParameter("assets_summary").getBoolean() : false;
        PartnerType partnerType = requestParameters.queryParameter("partner_type") != null ? requestParameters.queryParameter("partner_type").getPartnerType() : null;
        String partnerIds = requestParameters.queryParameter("partner_ids") != null ? requestParameters.queryParameter("partner_ids").getString() : null;
        Integer startIndex = requestParameters.queryParameter("start_index") != null ? requestParameters.queryParameter("start_index").getInteger() : 0;
        Boolean sortAscending = requestParameters.queryParameter("sort_ascending") != null ? requestParameters.queryParameter("sort_ascending").getBoolean() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter assetsSummary is {}", assetsSummary);
        logger.debug("Parameter partnerType is {}", partnerType);
        logger.debug("Parameter partnerIds is {}", partnerIds);
        logger.debug("Parameter startIndex is {}", startIndex);
        logger.debug("Parameter sortAscending is {}", sortAscending);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void systemUserUpdate(RoutingContext routingContext) {
        logger.info("systemUserUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        String systemUserId = requestParameters.pathParameter("system_user_id") != null ? requestParameters.pathParameter("system_user_id").getString() : null;
        RequestParameter body = requestParameters.body();
        SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SystemUserUpdateWithRequiredBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter systemUserId is {}", systemUserId);
        logger.debug("Parameter systemUserUpdateWithRequiredBody is {}", systemUserUpdateWithRequiredBody);

        api.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateBusinessMemberships(RoutingContext routingContext) {
        logger.info("updateBusinessMemberships()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<BusinessMembershipMember> businessMembershipMember = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<BusinessMembershipMember>>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter businessMembershipMember is {}", businessMembershipMember);

        api.updateBusinessMemberships(businessId, businessMembershipMember)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
