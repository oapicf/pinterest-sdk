package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AuthRespondInvitesBody;
import org.openapitools.server.api.model.CancelInvitesBody;
import org.openapitools.server.api.model.CreateAssetAccessRequestBody;
import org.openapitools.server.api.model.CreateAssetAccessRequestResponse;
import org.openapitools.server.api.model.CreateAssetInvitesRequest;
import org.openapitools.server.api.model.CreateInvitesResultsResponseArray;
import org.openapitools.server.api.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.server.api.model.DeleteInvitesResultsResponseArray;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.GetInvites200Response;
import org.openapitools.server.api.model.InviteType;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RespondToInvitesResponseArray;
import org.openapitools.server.api.model.UpdateInvitesResultsResponseArray;

import java.util.List;
import java.util.Map;

public class BusinessAccessInviteApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BusinessAccessInviteApiVerticle.class);

    static final String ASSET_ACCESS_REQUESTS/CREATE_SERVICE_ID = "asset_access_requests/create";
    static final String CANCEL_INVITES_OR_REQUESTS_SERVICE_ID = "cancel_invites_or_requests";
    static final String CREATE_ASSET_INVITES_SERVICE_ID = "create_asset_invites";
    static final String CREATE_MEMBERSHIP_OR_PARTNERSHIP_INVITES_SERVICE_ID = "create_membership_or_partnership_invites";
    static final String GET/INVITES_SERVICE_ID = "get/invites";
    static final String RESPOND_BUSINESS_ACCESS_INVITES_SERVICE_ID = "respond_business_access_invites";
    
    final BusinessAccessInviteApi service;

    public BusinessAccessInviteApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BusinessAccessInviteApiImpl");
            service = (BusinessAccessInviteApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BusinessAccessInviteApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for asset_access_requests/create
        vertx.eventBus().<JsonObject> consumer(ASSET_ACCESS_REQUESTS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "asset_access_requests/create";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject createAssetAccessRequestBodyParam = message.body().getJsonObject("CreateAssetAccessRequestBody");
                if (createAssetAccessRequestBodyParam == null) {
                    manageError(message, new MainApiException(400, "CreateAssetAccessRequestBody is required"), serviceId);
                    return;
                }
                CreateAssetAccessRequestBody createAssetAccessRequestBody = Json.mapper.readValue(createAssetAccessRequestBodyParam.encode(), CreateAssetAccessRequestBody.class);
                service.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "asset_access_requests/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("asset_access_requests/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for cancel_invites_or_requests
        vertx.eventBus().<JsonObject> consumer(CANCEL_INVITES_OR_REQUESTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "cancel_invites_or_requests";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject cancelInvitesBodyParam = message.body().getJsonObject("CancelInvitesBody");
                if (cancelInvitesBodyParam == null) {
                    manageError(message, new MainApiException(400, "CancelInvitesBody is required"), serviceId);
                    return;
                }
                CancelInvitesBody cancelInvitesBody = Json.mapper.readValue(cancelInvitesBodyParam.encode(), CancelInvitesBody.class);
                service.cancelInvitesOrRequests(businessId, cancelInvitesBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "cancel_invites_or_requests");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("cancel_invites_or_requests", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for create_asset_invites
        vertx.eventBus().<JsonObject> consumer(CREATE_ASSET_INVITES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create_asset_invites";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject createAssetInvitesRequestParam = message.body().getJsonObject("CreateAssetInvitesRequest");
                if (createAssetInvitesRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateAssetInvitesRequest is required"), serviceId);
                    return;
                }
                CreateAssetInvitesRequest createAssetInvitesRequest = Json.mapper.readValue(createAssetInvitesRequestParam.encode(), CreateAssetInvitesRequest.class);
                service.createAssetInvites(businessId, createAssetInvitesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "create_asset_invites");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create_asset_invites", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for create_membership_or_partnership_invites
        vertx.eventBus().<JsonObject> consumer(CREATE_MEMBERSHIP_OR_PARTNERSHIP_INVITES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create_membership_or_partnership_invites";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject createMembershipOrPartnershipInvitesBodyParam = message.body().getJsonObject("CreateMembershipOrPartnershipInvitesBody");
                if (createMembershipOrPartnershipInvitesBodyParam == null) {
                    manageError(message, new MainApiException(400, "CreateMembershipOrPartnershipInvitesBody is required"), serviceId);
                    return;
                }
                CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody = Json.mapper.readValue(createMembershipOrPartnershipInvitesBodyParam.encode(), CreateMembershipOrPartnershipInvitesBody.class);
                service.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "create_membership_or_partnership_invites");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create_membership_or_partnership_invites", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get/invites
        vertx.eventBus().<JsonObject> consumer(GET/INVITES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get/invites";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String isMemberParam = message.body().getString("is_member");
                Boolean isMember = (isMemberParam == null) ? true : Json.mapper.readValue(isMemberParam, Boolean.class);
                JsonArray inviteStatusParam = message.body().getJsonArray("invite_status");
                List<String> inviteStatus = (inviteStatusParam == null) ? null : Json.mapper.readValue(inviteStatusParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonObject inviteTypeParam = message.body().getJsonObject("invite_type");
                if (inviteTypeParam == null) {
                    manageError(message, new MainApiException(400, "invite_type is required"), serviceId);
                    return;
                }
                InviteType inviteType = Json.mapper.readValue(inviteTypeParam.encode(), InviteType.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get/invites");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get/invites", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for respond_business_access_invites
        vertx.eventBus().<JsonObject> consumer(RESPOND_BUSINESS_ACCESS_INVITES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "respond_business_access_invites";
                JsonObject authRespondInvitesBodyParam = message.body().getJsonObject("AuthRespondInvitesBody");
                if (authRespondInvitesBodyParam == null) {
                    manageError(message, new MainApiException(400, "AuthRespondInvitesBody is required"), serviceId);
                    return;
                }
                AuthRespondInvitesBody authRespondInvitesBody = Json.mapper.readValue(authRespondInvitesBodyParam.encode(), AuthRespondInvitesBody.class);
                service.respondBusinessAccessInvites(authRespondInvitesBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "respond_business_access_invites");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("respond_business_access_invites", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
