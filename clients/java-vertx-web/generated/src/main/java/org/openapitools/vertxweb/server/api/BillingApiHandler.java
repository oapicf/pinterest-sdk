package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdsCreditRedeemRequest;
import org.openapitools.vertxweb.server.model.AdsCreditRedeemResponse;
import org.openapitools.vertxweb.server.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.vertxweb.server.model.BillingProfilesGet200Response;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.SSIOAccountResponse;
import org.openapitools.vertxweb.server.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.vertxweb.server.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.vertxweb.server.model.SSIOEditInsertionOrderRequest;
import org.openapitools.vertxweb.server.model.SSIOEditInsertionOrderResponse;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.vertxweb.server.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.vertxweb.server.model.SsioOrderLinesGetByAdAccount200Response;

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

public class BillingApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BillingApiHandler.class);

    private final BillingApi api;

    public BillingApiHandler(BillingApi api) {
        this.api = api;
    }

    @Deprecated
    public BillingApiHandler() {
        this(new BillingApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adsCreditRedeem").handler(this::adsCreditRedeem);
        builder.operation("adsCreditsDiscountsGet").handler(this::adsCreditsDiscountsGet);
        builder.operation("billingProfilesGet").handler(this::billingProfilesGet);
        builder.operation("ssioAccountsGet").handler(this::ssioAccountsGet);
        builder.operation("ssioInsertionOrderCreate").handler(this::ssioInsertionOrderCreate);
        builder.operation("ssioInsertionOrderEdit").handler(this::ssioInsertionOrderEdit);
        builder.operation("ssioInsertionOrdersStatusGetByAdAccount").handler(this::ssioInsertionOrdersStatusGetByAdAccount);
        builder.operation("ssioInsertionOrdersStatusGetByPinOrderId").handler(this::ssioInsertionOrdersStatusGetByPinOrderId);
        builder.operation("ssioOrderLinesGetByAdAccount").handler(this::ssioOrderLinesGetByAdAccount);
    }

    private void adsCreditRedeem(RoutingContext routingContext) {
        logger.info("adsCreditRedeem()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AdsCreditRedeemRequest adsCreditRedeemRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdsCreditRedeemRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adsCreditRedeemRequest is {}", adsCreditRedeemRequest);

        api.adsCreditRedeem(adAccountId, adsCreditRedeemRequest)
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

    private void adsCreditsDiscountsGet(RoutingContext routingContext) {
        logger.info("adsCreditsDiscountsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)
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

    private void billingProfilesGet(RoutingContext routingContext) {
        logger.info("billingProfilesGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        Boolean isActive = requestParameters.queryParameter("is_active") != null ? requestParameters.queryParameter("is_active").getBoolean() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter isActive is {}", isActive);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.billingProfilesGet(adAccountId, isActive, bookmark, pageSize)
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

    private void ssioAccountsGet(RoutingContext routingContext) {
        logger.info("ssioAccountsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.ssioAccountsGet(adAccountId)
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

    private void ssioInsertionOrderCreate(RoutingContext routingContext) {
        logger.info("ssioInsertionOrderCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SSIOCreateInsertionOrderRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter ssIOCreateInsertionOrderRequest is {}", ssIOCreateInsertionOrderRequest);

        api.ssioInsertionOrderCreate(adAccountId, ssIOCreateInsertionOrderRequest)
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

    private void ssioInsertionOrderEdit(RoutingContext routingContext) {
        logger.info("ssioInsertionOrderEdit()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SSIOEditInsertionOrderRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter ssIOEditInsertionOrderRequest is {}", ssIOEditInsertionOrderRequest);

        api.ssioInsertionOrderEdit(adAccountId, ssIOEditInsertionOrderRequest)
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

    private void ssioInsertionOrdersStatusGetByAdAccount(RoutingContext routingContext) {
        logger.info("ssioInsertionOrdersStatusGetByAdAccount()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)
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

    private void ssioInsertionOrdersStatusGetByPinOrderId(RoutingContext routingContext) {
        logger.info("ssioInsertionOrdersStatusGetByPinOrderId()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String pinOrderId = requestParameters.pathParameter("pin_order_id") != null ? requestParameters.pathParameter("pin_order_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pinOrderId is {}", pinOrderId);

        api.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)
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

    private void ssioOrderLinesGetByAdAccount(RoutingContext routingContext) {
        logger.info("ssioOrderLinesGetByAdAccount()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String pinOrderId = requestParameters.queryParameter("pin_order_id") != null ? requestParameters.queryParameter("pin_order_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter pinOrderId is {}", pinOrderId);

        api.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId)
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
