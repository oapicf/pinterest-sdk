package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.BusinessAssetMembersGet200Response;
import org.openapitools.server.api.model.BusinessAssetPartnersGet200Response;
import org.openapitools.server.api.model.BusinessAssetsGet200Response;
import org.openapitools.server.api.model.BusinessMemberAssetsGet200Response;
import org.openapitools.server.api.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.server.api.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.server.api.model.CreateAssetGroupBody;
import org.openapitools.server.api.model.CreateAssetGroupResponse;
import org.openapitools.server.api.model.DeleteAssetGroupBody;
import org.openapitools.server.api.model.DeleteAssetGroupResponse;
import org.openapitools.server.api.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.server.api.model.DeletePartnerAssetAccessBody;
import org.openapitools.server.api.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PartnerType;
import org.openapitools.server.api.model.PermissionsWithOwner;
import org.openapitools.server.api.model.UpdateAssetGroupBody;
import org.openapitools.server.api.model.UpdateAssetGroupResponse;
import org.openapitools.server.api.model.UpdateMemberAssetAccessBody;
import org.openapitools.server.api.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.server.api.model.UpdatePartnerAssetAccessBody;
import org.openapitools.server.api.model.UpdatePartnerAssetsResultsResponseArray;

import java.util.List;
import java.util.Map;

public class BusinessAccessAssetsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BusinessAccessAssetsApiVerticle.class);

    static final String ASSET_GROUP/CREATE_SERVICE_ID = "asset_group/create";
    static final String ASSET_GROUP/DELETE_SERVICE_ID = "asset_group/delete";
    static final String ASSET_GROUP/UPDATE_SERVICE_ID = "asset_group/update";
    static final String BUSINESS_ASSET_MEMBERS/GET_SERVICE_ID = "business_asset_members/get";
    static final String BUSINESS_ASSET_PARTNERS/GET_SERVICE_ID = "business_asset_partners/get";
    static final String BUSINESS_ASSETS/GET_SERVICE_ID = "business_assets/get";
    static final String BUSINESS_MEMBER_ASSETS/GET_SERVICE_ID = "business_member_assets/get";
    static final String BUSINESS_MEMBERS_ASSET_ACCESS/DELETE_SERVICE_ID = "business_members_asset_access/delete";
    static final String BUSINESS_MEMBERS_ASSET_ACCESS/UPDATE_SERVICE_ID = "business_members_asset_access/update";
    static final String BUSINESS_PARTNER_ASSET_ACCESS/GET_SERVICE_ID = "business_partner_asset_access/get";
    static final String DELETE_PARTNER_ASSET_ACCESS_HANDLER_IMPL_SERVICE_ID = "delete_partner_asset_access_handler_impl";
    static final String UPDATE_PARTNER_ASSET_ACCESS_HANDLER_IMPL_SERVICE_ID = "update_partner_asset_access_handler_impl";
    
    final BusinessAccessAssetsApi service;

    public BusinessAccessAssetsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BusinessAccessAssetsApiImpl");
            service = (BusinessAccessAssetsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BusinessAccessAssetsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for asset_group/create
        vertx.eventBus().<JsonObject> consumer(ASSET_GROUP/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "asset_group/create";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject createAssetGroupBodyParam = message.body().getJsonObject("CreateAssetGroupBody");
                if (createAssetGroupBodyParam == null) {
                    manageError(message, new MainApiException(400, "CreateAssetGroupBody is required"), serviceId);
                    return;
                }
                CreateAssetGroupBody createAssetGroupBody = Json.mapper.readValue(createAssetGroupBodyParam.encode(), CreateAssetGroupBody.class);
                service.assetGroupCreate(businessId, createAssetGroupBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "asset_group/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("asset_group/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for asset_group/delete
        vertx.eventBus().<JsonObject> consumer(ASSET_GROUP/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "asset_group/delete";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject deleteAssetGroupBodyParam = message.body().getJsonObject("DeleteAssetGroupBody");
                if (deleteAssetGroupBodyParam == null) {
                    manageError(message, new MainApiException(400, "DeleteAssetGroupBody is required"), serviceId);
                    return;
                }
                DeleteAssetGroupBody deleteAssetGroupBody = Json.mapper.readValue(deleteAssetGroupBodyParam.encode(), DeleteAssetGroupBody.class);
                service.assetGroupDelete(businessId, deleteAssetGroupBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "asset_group/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("asset_group/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for asset_group/update
        vertx.eventBus().<JsonObject> consumer(ASSET_GROUP/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "asset_group/update";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject updateAssetGroupBodyParam = message.body().getJsonObject("UpdateAssetGroupBody");
                if (updateAssetGroupBodyParam == null) {
                    manageError(message, new MainApiException(400, "UpdateAssetGroupBody is required"), serviceId);
                    return;
                }
                UpdateAssetGroupBody updateAssetGroupBody = Json.mapper.readValue(updateAssetGroupBodyParam.encode(), UpdateAssetGroupBody.class);
                service.assetGroupUpdate(businessId, updateAssetGroupBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "asset_group/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("asset_group/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for business_asset_members/get
        vertx.eventBus().<JsonObject> consumer(BUSINESS_ASSET_MEMBERS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "business_asset_members/get";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String assetIdParam = message.body().getString("asset_id");
                if(assetIdParam == null) {
                    manageError(message, new MainApiException(400, "asset_id is required"), serviceId);
                    return;
                }
                String assetId = assetIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String startIndexParam = message.body().getString("start_index");
                Integer startIndex = (startIndexParam == null) ? 0 : Json.mapper.readValue(startIndexParam, Integer.class);
                service.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "business_asset_members/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("business_asset_members/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for business_asset_partners/get
        vertx.eventBus().<JsonObject> consumer(BUSINESS_ASSET_PARTNERS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "business_asset_partners/get";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String assetIdParam = message.body().getString("asset_id");
                if(assetIdParam == null) {
                    manageError(message, new MainApiException(400, "asset_id is required"), serviceId);
                    return;
                }
                String assetId = assetIdParam;
                String startIndexParam = message.body().getString("start_index");
                Integer startIndex = (startIndexParam == null) ? 0 : Json.mapper.readValue(startIndexParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "business_asset_partners/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("business_asset_partners/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for business_assets/get
        vertx.eventBus().<JsonObject> consumer(BUSINESS_ASSETS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "business_assets/get";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonArray permissionsParam = message.body().getJsonArray("permissions");
                List<PermissionsWithOwner> permissions = (permissionsParam == null) ? null : Json.mapper.readValue(permissionsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, PermissionsWithOwner.class));
                String childAssetIdParam = message.body().getString("child_asset_id");
                String childAssetId = (childAssetIdParam == null) ? null : childAssetIdParam;
                String assetGroupIdParam = message.body().getString("asset_group_id");
                String assetGroupId = (assetGroupIdParam == null) ? null : assetGroupIdParam;
                String assetTypeParam = message.body().getString("asset_type");
                String assetType = (assetTypeParam == null) ? "AD_ACCOUNT" : assetTypeParam;
                String startIndexParam = message.body().getString("start_index");
                Integer startIndex = (startIndexParam == null) ? 0 : Json.mapper.readValue(startIndexParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "business_assets/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("business_assets/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for business_member_assets/get
        vertx.eventBus().<JsonObject> consumer(BUSINESS_MEMBER_ASSETS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "business_member_assets/get";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String memberIdParam = message.body().getString("member_id");
                if(memberIdParam == null) {
                    manageError(message, new MainApiException(400, "member_id is required"), serviceId);
                    return;
                }
                String memberId = memberIdParam;
                String assetTypeParam = message.body().getString("asset_type");
                String assetType = (assetTypeParam == null) ? "AD_ACCOUNT" : assetTypeParam;
                String startIndexParam = message.body().getString("start_index");
                Integer startIndex = (startIndexParam == null) ? 0 : Json.mapper.readValue(startIndexParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "business_member_assets/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("business_member_assets/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for business_members_asset_access/delete
        vertx.eventBus().<JsonObject> consumer(BUSINESS_MEMBERS_ASSET_ACCESS/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "business_members_asset_access/delete";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject businessMembersAssetAccessDeleteRequestParam = message.body().getJsonObject("BusinessMembersAssetAccessDeleteRequest");
                if (businessMembersAssetAccessDeleteRequestParam == null) {
                    manageError(message, new MainApiException(400, "BusinessMembersAssetAccessDeleteRequest is required"), serviceId);
                    return;
                }
                BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest = Json.mapper.readValue(businessMembersAssetAccessDeleteRequestParam.encode(), BusinessMembersAssetAccessDeleteRequest.class);
                service.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "business_members_asset_access/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("business_members_asset_access/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for business_members_asset_access/update
        vertx.eventBus().<JsonObject> consumer(BUSINESS_MEMBERS_ASSET_ACCESS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "business_members_asset_access/update";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject updateMemberAssetAccessBodyParam = message.body().getJsonObject("UpdateMemberAssetAccessBody");
                if (updateMemberAssetAccessBodyParam == null) {
                    manageError(message, new MainApiException(400, "UpdateMemberAssetAccessBody is required"), serviceId);
                    return;
                }
                UpdateMemberAssetAccessBody updateMemberAssetAccessBody = Json.mapper.readValue(updateMemberAssetAccessBodyParam.encode(), UpdateMemberAssetAccessBody.class);
                service.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "business_members_asset_access/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("business_members_asset_access/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for business_partner_asset_access/get
        vertx.eventBus().<JsonObject> consumer(BUSINESS_PARTNER_ASSET_ACCESS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "business_partner_asset_access/get";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String partnerIdParam = message.body().getString("partner_id");
                if(partnerIdParam == null) {
                    manageError(message, new MainApiException(400, "partner_id is required"), serviceId);
                    return;
                }
                String partnerId = partnerIdParam;
                JsonObject partnerTypeParam = message.body().getJsonObject("partner_type");
                if (partnerTypeParam == null) {
                    manageError(message, new MainApiException(400, "partner_type is required"), serviceId);
                    return;
                }
                PartnerType partnerType = Json.mapper.readValue(partnerTypeParam.encode(), PartnerType.class);
                String assetTypeParam = message.body().getString("asset_type");
                String assetType = (assetTypeParam == null) ? "AD_ACCOUNT" : assetTypeParam;
                String startIndexParam = message.body().getString("start_index");
                Integer startIndex = (startIndexParam == null) ? 0 : Json.mapper.readValue(startIndexParam, Integer.class);
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "business_partner_asset_access/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("business_partner_asset_access/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for delete_partner_asset_access_handler_impl
        vertx.eventBus().<JsonObject> consumer(DELETE_PARTNER_ASSET_ACCESS_HANDLER_IMPL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delete_partner_asset_access_handler_impl";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject deletePartnerAssetAccessBodyParam = message.body().getJsonObject("DeletePartnerAssetAccessBody");
                if (deletePartnerAssetAccessBodyParam == null) {
                    manageError(message, new MainApiException(400, "DeletePartnerAssetAccessBody is required"), serviceId);
                    return;
                }
                DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = Json.mapper.readValue(deletePartnerAssetAccessBodyParam.encode(), DeletePartnerAssetAccessBody.class);
                service.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "delete_partner_asset_access_handler_impl");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delete_partner_asset_access_handler_impl", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_partner_asset_access_handler_impl
        vertx.eventBus().<JsonObject> consumer(UPDATE_PARTNER_ASSET_ACCESS_HANDLER_IMPL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_partner_asset_access_handler_impl";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject updatePartnerAssetAccessBodyParam = message.body().getJsonObject("UpdatePartnerAssetAccessBody");
                if (updatePartnerAssetAccessBodyParam == null) {
                    manageError(message, new MainApiException(400, "UpdatePartnerAssetAccessBody is required"), serviceId);
                    return;
                }
                UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = Json.mapper.readValue(updatePartnerAssetAccessBodyParam.encode(), UpdatePartnerAssetAccessBody.class);
                service.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update_partner_asset_access_handler_impl");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_partner_asset_access_handler_impl", e);
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
