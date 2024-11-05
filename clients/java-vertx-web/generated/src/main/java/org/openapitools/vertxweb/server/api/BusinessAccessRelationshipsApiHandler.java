package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DeletePartnersRequest;
import org.openapitools.vertxweb.server.model.DeletePartnersResponse;
import org.openapitools.vertxweb.server.model.DeletedMembersResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.GetBusinessEmployers200Response;
import org.openapitools.vertxweb.server.model.GetBusinessMembers200Response;
import org.openapitools.vertxweb.server.model.GetBusinessPartners200Response;
import org.openapitools.vertxweb.server.model.MemberBusinessRole;
import org.openapitools.vertxweb.server.model.MembersToDeleteBody;
import org.openapitools.vertxweb.server.model.PartnerType;
import org.openapitools.vertxweb.server.model.UpdateMemberBusinessRoleBody;
import org.openapitools.vertxweb.server.model.UpdateMemberResultsResponseArray;

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
        builder.operation("deleteBusinessMembership").handler(this::deleteBusinessMembership);
        builder.operation("deleteBusinessPartners").handler(this::deleteBusinessPartners);
        builder.operation("getBusinessEmployers").handler(this::getBusinessEmployers);
        builder.operation("getBusinessMembers").handler(this::getBusinessMembers);
        builder.operation("getBusinessPartners").handler(this::getBusinessPartners);
        builder.operation("updateBusinessMemberships").handler(this::updateBusinessMemberships);
    }

    private void deleteBusinessMembership(RoutingContext routingContext) {
        logger.info("deleteBusinessMembership()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        MembersToDeleteBody membersToDeleteBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<MembersToDeleteBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter membersToDeleteBody is {}", membersToDeleteBody);

        api.deleteBusinessMembership(businessId, membersToDeleteBody)
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
        DeletePartnersRequest deletePartnersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeletePartnersRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deletePartnersRequest is {}", deletePartnersRequest);

        api.deleteBusinessPartners(businessId, deletePartnersRequest)
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

        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.getBusinessEmployers(pageSize, bookmark)
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
        Boolean assetsSummary = requestParameters.queryParameter("assets_summary") != null ? requestParameters.queryParameter("assets_summary").getBoolean() : false;
        List<MemberBusinessRole> businessRoles = requestParameters.queryParameter("business_roles") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("business_roles").get(), new TypeReference<List<MemberBusinessRole>>(){}) : null;
        String memberIds = requestParameters.queryParameter("member_ids") != null ? requestParameters.queryParameter("member_ids").getString() : null;
        Integer startIndex = requestParameters.queryParameter("start_index") != null ? requestParameters.queryParameter("start_index").getInteger() : 0;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter assetsSummary is {}", assetsSummary);
        logger.debug("Parameter businessRoles is {}", businessRoles);
        logger.debug("Parameter memberIds is {}", memberIds);
        logger.debug("Parameter startIndex is {}", startIndex);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)
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
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter assetsSummary is {}", assetsSummary);
        logger.debug("Parameter partnerType is {}", partnerType);
        logger.debug("Parameter partnerIds is {}", partnerIds);
        logger.debug("Parameter startIndex is {}", startIndex);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark)
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
        List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<UpdateMemberBusinessRoleBody>>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateMemberBusinessRoleBody is {}", updateMemberBusinessRoleBody);

        api.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody)
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
