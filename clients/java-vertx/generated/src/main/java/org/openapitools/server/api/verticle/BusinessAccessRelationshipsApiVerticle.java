package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.DeletePartnersRequest;
import org.openapitools.server.api.model.DeletePartnersResponse;
import org.openapitools.server.api.model.DeletedMembersResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.GetBusinessEmployers200Response;
import org.openapitools.server.api.model.GetBusinessMembers200Response;
import org.openapitools.server.api.model.GetBusinessPartners200Response;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MemberBusinessRole;
import org.openapitools.server.api.model.MembersToDeleteBody;
import org.openapitools.server.api.model.PartnerType;
import org.openapitools.server.api.model.UpdateMemberBusinessRoleBody;
import org.openapitools.server.api.model.UpdateMemberResultsResponseArray;

import java.util.List;
import java.util.Map;

public class BusinessAccessRelationshipsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BusinessAccessRelationshipsApiVerticle.class);

    static final String DELETE_BUSINESS_MEMBERSHIP_SERVICE_ID = "delete_business_membership";
    static final String DELETE_BUSINESS_PARTNERS_SERVICE_ID = "delete_business_partners";
    static final String GET/BUSINESS_EMPLOYERS_SERVICE_ID = "get/business_employers";
    static final String GET/BUSINESS_MEMBERS_SERVICE_ID = "get/business_members";
    static final String GET/BUSINESS_PARTNERS_SERVICE_ID = "get/business_partners";
    static final String UPDATE/BUSINESS_MEMBERSHIPS_SERVICE_ID = "update/business_memberships";
    
    final BusinessAccessRelationshipsApi service;

    public BusinessAccessRelationshipsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BusinessAccessRelationshipsApiImpl");
            service = (BusinessAccessRelationshipsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BusinessAccessRelationshipsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for delete_business_membership
        vertx.eventBus().<JsonObject> consumer(DELETE_BUSINESS_MEMBERSHIP_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delete_business_membership";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject membersToDeleteBodyParam = message.body().getJsonObject("MembersToDeleteBody");
                if (membersToDeleteBodyParam == null) {
                    manageError(message, new MainApiException(400, "MembersToDeleteBody is required"), serviceId);
                    return;
                }
                MembersToDeleteBody membersToDeleteBody = Json.mapper.readValue(membersToDeleteBodyParam.encode(), MembersToDeleteBody.class);
                service.deleteBusinessMembership(businessId, membersToDeleteBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "delete_business_membership");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delete_business_membership", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for delete_business_partners
        vertx.eventBus().<JsonObject> consumer(DELETE_BUSINESS_PARTNERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delete_business_partners";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject deletePartnersRequestParam = message.body().getJsonObject("DeletePartnersRequest");
                if (deletePartnersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeletePartnersRequest is required"), serviceId);
                    return;
                }
                DeletePartnersRequest deletePartnersRequest = Json.mapper.readValue(deletePartnersRequestParam.encode(), DeletePartnersRequest.class);
                service.deleteBusinessPartners(businessId, deletePartnersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "delete_business_partners");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delete_business_partners", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get/business_employers
        vertx.eventBus().<JsonObject> consumer(GET/BUSINESS_EMPLOYERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get/business_employers";
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.getBusinessEmployers(pageSize, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get/business_employers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get/business_employers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get/business_members
        vertx.eventBus().<JsonObject> consumer(GET/BUSINESS_MEMBERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get/business_members";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String assetsSummaryParam = message.body().getString("assets_summary");
                Boolean assetsSummary = (assetsSummaryParam == null) ? false : Json.mapper.readValue(assetsSummaryParam, Boolean.class);
                JsonArray businessRolesParam = message.body().getJsonArray("business_roles");
                List<MemberBusinessRole> businessRoles = (businessRolesParam == null) ? null : Json.mapper.readValue(businessRolesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, MemberBusinessRole.class));
                String memberIdsParam = message.body().getString("member_ids");
                String memberIds = (memberIdsParam == null) ? null : memberIdsParam;
                String startIndexParam = message.body().getString("start_index");
                Integer startIndex = (startIndexParam == null) ? 0 : Json.mapper.readValue(startIndexParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get/business_members");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get/business_members", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get/business_partners
        vertx.eventBus().<JsonObject> consumer(GET/BUSINESS_PARTNERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get/business_partners";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String assetsSummaryParam = message.body().getString("assets_summary");
                Boolean assetsSummary = (assetsSummaryParam == null) ? false : Json.mapper.readValue(assetsSummaryParam, Boolean.class);
                JsonObject partnerTypeParam = message.body().getJsonObject("partner_type");
                if (partnerTypeParam == null) {
                    manageError(message, new MainApiException(400, "partner_type is required"), serviceId);
                    return;
                }
                PartnerType partnerType = Json.mapper.readValue(partnerTypeParam.encode(), PartnerType.class);
                String partnerIdsParam = message.body().getString("partner_ids");
                String partnerIds = (partnerIdsParam == null) ? null : partnerIdsParam;
                String startIndexParam = message.body().getString("start_index");
                Integer startIndex = (startIndexParam == null) ? 0 : Json.mapper.readValue(startIndexParam, Integer.class);
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get/business_partners");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get/business_partners", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update/business_memberships
        vertx.eventBus().<JsonObject> consumer(UPDATE/BUSINESS_MEMBERSHIPS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update/business_memberships";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonArray updateMemberBusinessRoleBodyParam = message.body().getJsonArray("UpdateMemberBusinessRoleBody");
                if(updateMemberBusinessRoleBodyParam == null) {
                    manageError(message, new MainApiException(400, "UpdateMemberBusinessRoleBody is required"), serviceId);
                    return;
                }
                List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody = Json.mapper.readValue(updateMemberBusinessRoleBodyParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, UpdateMemberBusinessRoleBody.class));
                service.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update/business_memberships");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update/business_memberships", e);
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
