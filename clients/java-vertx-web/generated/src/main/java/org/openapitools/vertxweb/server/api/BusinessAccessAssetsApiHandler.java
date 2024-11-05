package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BusinessAssetMembersGet200Response;
import org.openapitools.vertxweb.server.model.BusinessAssetPartnersGet200Response;
import org.openapitools.vertxweb.server.model.BusinessAssetsGet200Response;
import org.openapitools.vertxweb.server.model.BusinessMemberAssetsGet200Response;
import org.openapitools.vertxweb.server.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.vertxweb.server.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.vertxweb.server.model.CreateAssetGroupBody;
import org.openapitools.vertxweb.server.model.CreateAssetGroupResponse;
import org.openapitools.vertxweb.server.model.DeleteAssetGroupBody;
import org.openapitools.vertxweb.server.model.DeleteAssetGroupResponse;
import org.openapitools.vertxweb.server.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.vertxweb.server.model.DeletePartnerAssetAccessBody;
import org.openapitools.vertxweb.server.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.PartnerType;
import org.openapitools.vertxweb.server.model.PermissionsWithOwner;
import org.openapitools.vertxweb.server.model.UpdateAssetGroupBody;
import org.openapitools.vertxweb.server.model.UpdateAssetGroupResponse;
import org.openapitools.vertxweb.server.model.UpdateMemberAssetAccessBody;
import org.openapitools.vertxweb.server.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.vertxweb.server.model.UpdatePartnerAssetAccessBody;
import org.openapitools.vertxweb.server.model.UpdatePartnerAssetsResultsResponseArray;

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

public class BusinessAccessAssetsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BusinessAccessAssetsApiHandler.class);

    private final BusinessAccessAssetsApi api;

    public BusinessAccessAssetsApiHandler(BusinessAccessAssetsApi api) {
        this.api = api;
    }

    @Deprecated
    public BusinessAccessAssetsApiHandler() {
        this(new BusinessAccessAssetsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("assetGroupCreate").handler(this::assetGroupCreate);
        builder.operation("assetGroupDelete").handler(this::assetGroupDelete);
        builder.operation("assetGroupUpdate").handler(this::assetGroupUpdate);
        builder.operation("businessAssetMembersGet").handler(this::businessAssetMembersGet);
        builder.operation("businessAssetPartnersGet").handler(this::businessAssetPartnersGet);
        builder.operation("businessAssetsGet").handler(this::businessAssetsGet);
        builder.operation("businessMemberAssetsGet").handler(this::businessMemberAssetsGet);
        builder.operation("businessMembersAssetAccessDelete").handler(this::businessMembersAssetAccessDelete);
        builder.operation("businessMembersAssetAccessUpdate").handler(this::businessMembersAssetAccessUpdate);
        builder.operation("businessPartnerAssetAccessGet").handler(this::businessPartnerAssetAccessGet);
        builder.operation("deletePartnerAssetAccessHandlerImpl").handler(this::deletePartnerAssetAccessHandlerImpl);
        builder.operation("updatePartnerAssetAccessHandlerImpl").handler(this::updatePartnerAssetAccessHandlerImpl);
    }

    private void assetGroupCreate(RoutingContext routingContext) {
        logger.info("assetGroupCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CreateAssetGroupBody createAssetGroupBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateAssetGroupBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter createAssetGroupBody is {}", createAssetGroupBody);

        api.assetGroupCreate(businessId, createAssetGroupBody)
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

    private void assetGroupDelete(RoutingContext routingContext) {
        logger.info("assetGroupDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        DeleteAssetGroupBody deleteAssetGroupBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteAssetGroupBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteAssetGroupBody is {}", deleteAssetGroupBody);

        api.assetGroupDelete(businessId, deleteAssetGroupBody)
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

    private void assetGroupUpdate(RoutingContext routingContext) {
        logger.info("assetGroupUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        UpdateAssetGroupBody updateAssetGroupBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateAssetGroupBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateAssetGroupBody is {}", updateAssetGroupBody);

        api.assetGroupUpdate(businessId, updateAssetGroupBody)
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

    private void businessAssetMembersGet(RoutingContext routingContext) {
        logger.info("businessAssetMembersGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        String assetId = requestParameters.pathParameter("asset_id") != null ? requestParameters.pathParameter("asset_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        Integer startIndex = requestParameters.queryParameter("start_index") != null ? requestParameters.queryParameter("start_index").getInteger() : 0;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter assetId is {}", assetId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter startIndex is {}", startIndex);

        api.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex)
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

    private void businessAssetPartnersGet(RoutingContext routingContext) {
        logger.info("businessAssetPartnersGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        String assetId = requestParameters.pathParameter("asset_id") != null ? requestParameters.pathParameter("asset_id").getString() : null;
        Integer startIndex = requestParameters.queryParameter("start_index") != null ? requestParameters.queryParameter("start_index").getInteger() : 0;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter assetId is {}", assetId);
        logger.debug("Parameter startIndex is {}", startIndex);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)
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

    private void businessAssetsGet(RoutingContext routingContext) {
        logger.info("businessAssetsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        List<PermissionsWithOwner> permissions = requestParameters.queryParameter("permissions") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("permissions").get(), new TypeReference<List<PermissionsWithOwner>>(){}) : null;
        String childAssetId = requestParameters.queryParameter("child_asset_id") != null ? requestParameters.queryParameter("child_asset_id").getString() : null;
        String assetGroupId = requestParameters.queryParameter("asset_group_id") != null ? requestParameters.queryParameter("asset_group_id").getString() : null;
        String assetType = requestParameters.queryParameter("asset_type") != null ? requestParameters.queryParameter("asset_type").getString() : "AD_ACCOUNT";
        Integer startIndex = requestParameters.queryParameter("start_index") != null ? requestParameters.queryParameter("start_index").getInteger() : 0;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter permissions is {}", permissions);
        logger.debug("Parameter childAssetId is {}", childAssetId);
        logger.debug("Parameter assetGroupId is {}", assetGroupId);
        logger.debug("Parameter assetType is {}", assetType);
        logger.debug("Parameter startIndex is {}", startIndex);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)
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

    private void businessMemberAssetsGet(RoutingContext routingContext) {
        logger.info("businessMemberAssetsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        String memberId = requestParameters.pathParameter("member_id") != null ? requestParameters.pathParameter("member_id").getString() : null;
        String assetType = requestParameters.queryParameter("asset_type") != null ? requestParameters.queryParameter("asset_type").getString() : "AD_ACCOUNT";
        Integer startIndex = requestParameters.queryParameter("start_index") != null ? requestParameters.queryParameter("start_index").getInteger() : 0;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter memberId is {}", memberId);
        logger.debug("Parameter assetType is {}", assetType);
        logger.debug("Parameter startIndex is {}", startIndex);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize)
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

    private void businessMembersAssetAccessDelete(RoutingContext routingContext) {
        logger.info("businessMembersAssetAccessDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BusinessMembersAssetAccessDeleteRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter businessMembersAssetAccessDeleteRequest is {}", businessMembersAssetAccessDeleteRequest);

        api.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest)
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

    private void businessMembersAssetAccessUpdate(RoutingContext routingContext) {
        logger.info("businessMembersAssetAccessUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        UpdateMemberAssetAccessBody updateMemberAssetAccessBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateMemberAssetAccessBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateMemberAssetAccessBody is {}", updateMemberAssetAccessBody);

        api.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)
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

    private void businessPartnerAssetAccessGet(RoutingContext routingContext) {
        logger.info("businessPartnerAssetAccessGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        String partnerId = requestParameters.pathParameter("partner_id") != null ? requestParameters.pathParameter("partner_id").getString() : null;
        PartnerType partnerType = requestParameters.queryParameter("partner_type") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("partner_type").get(), new TypeReference<PartnerType>(){}) : null;
        String assetType = requestParameters.queryParameter("asset_type") != null ? requestParameters.queryParameter("asset_type").getString() : "AD_ACCOUNT";
        Integer startIndex = requestParameters.queryParameter("start_index") != null ? requestParameters.queryParameter("start_index").getInteger() : 0;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter partnerId is {}", partnerId);
        logger.debug("Parameter partnerType is {}", partnerType);
        logger.debug("Parameter assetType is {}", assetType);
        logger.debug("Parameter startIndex is {}", startIndex);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark)
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

    private void deletePartnerAssetAccessHandlerImpl(RoutingContext routingContext) {
        logger.info("deletePartnerAssetAccessHandlerImpl()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeletePartnerAssetAccessBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deletePartnerAssetAccessBody is {}", deletePartnerAssetAccessBody);

        api.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)
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

    private void updatePartnerAssetAccessHandlerImpl(RoutingContext routingContext) {
        logger.info("updatePartnerAssetAccessHandlerImpl()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdatePartnerAssetAccessBody>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updatePartnerAssetAccessBody is {}", updatePartnerAssetAccessBody);

        api.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)
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
