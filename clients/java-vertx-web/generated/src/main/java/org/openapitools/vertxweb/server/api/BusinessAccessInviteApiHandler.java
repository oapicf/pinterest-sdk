package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AuthRespondInvitesBody;
import org.openapitools.vertxweb.server.model.CancelInvitesBody;
import org.openapitools.vertxweb.server.model.CreateAssetAccessRequestBody;
import org.openapitools.vertxweb.server.model.CreateAssetAccessRequestResponse;
import org.openapitools.vertxweb.server.model.CreateAssetInvitesRequest;
import org.openapitools.vertxweb.server.model.CreateInvitesResultsResponseArray;
import org.openapitools.vertxweb.server.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.vertxweb.server.model.DeleteInvitesResultsResponseArray;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.GetInvites200Response;
import org.openapitools.vertxweb.server.model.InviteType;
import org.openapitools.vertxweb.server.model.RespondToInvitesResponseArray;
import org.openapitools.vertxweb.server.model.UpdateInvitesResultsResponseArray;

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

public class BusinessAccessInviteApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BusinessAccessInviteApiHandler.class);

    private final BusinessAccessInviteApi api;

    public BusinessAccessInviteApiHandler(BusinessAccessInviteApi api) {
        this.api = api;
    }

    @Deprecated
    public BusinessAccessInviteApiHandler() {
        this(new BusinessAccessInviteApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("assetAccessRequestsCreate").handler(this::assetAccessRequestsCreate);
        builder.operation("cancelInvitesOrRequests").handler(this::cancelInvitesOrRequests);
        builder.operation("createAssetInvites").handler(this::createAssetInvites);
        builder.operation("createMembershipOrPartnershipInvites").handler(this::createMembershipOrPartnershipInvites);
        builder.operation("getInvites").handler(this::getInvites);
        builder.operation("respondBusinessAccessInvites").handler(this::respondBusinessAccessInvites);
    }

    private void assetAccessRequestsCreate(RoutingContext routingContext) {
        logger.info("assetAccessRequestsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CreateAssetAccessRequestBody createAssetAccessRequestBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateAssetAccessRequestBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter createAssetAccessRequestBody is {}", createAssetAccessRequestBody);

        api.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody)
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

    private void cancelInvitesOrRequests(RoutingContext routingContext) {
        logger.info("cancelInvitesOrRequests()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CancelInvitesBody cancelInvitesBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CancelInvitesBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter cancelInvitesBody is {}", cancelInvitesBody);

        api.cancelInvitesOrRequests(businessId, cancelInvitesBody)
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

    private void createAssetInvites(RoutingContext routingContext) {
        logger.info("createAssetInvites()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CreateAssetInvitesRequest createAssetInvitesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateAssetInvitesRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter createAssetInvitesRequest is {}", createAssetInvitesRequest);

        api.createAssetInvites(businessId, createAssetInvitesRequest)
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

    private void createMembershipOrPartnershipInvites(RoutingContext routingContext) {
        logger.info("createMembershipOrPartnershipInvites()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateMembershipOrPartnershipInvitesBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter createMembershipOrPartnershipInvitesBody is {}", createMembershipOrPartnershipInvitesBody);

        api.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody)
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

    private void getInvites(RoutingContext routingContext) {
        logger.info("getInvites()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        Boolean isMember = requestParameters.queryParameter("is_member") != null ? requestParameters.queryParameter("is_member").getBoolean() : true;
        List<String> inviteStatus = requestParameters.queryParameter("invite_status") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("invite_status").get(), new TypeReference<List<String>>(){}) : null;
        InviteType inviteType = requestParameters.queryParameter("invite_type") != null ? requestParameters.queryParameter("invite_type").getInviteType() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter isMember is {}", isMember);
        logger.debug("Parameter inviteStatus is {}", inviteStatus);
        logger.debug("Parameter inviteType is {}", inviteType);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize)
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

    private void respondBusinessAccessInvites(RoutingContext routingContext) {
        logger.info("respondBusinessAccessInvites()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        AuthRespondInvitesBody authRespondInvitesBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AuthRespondInvitesBody>(){}) : null;

        logger.debug("Parameter authRespondInvitesBody is {}", authRespondInvitesBody);

        api.respondBusinessAccessInvites(authRespondInvitesBody)
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
