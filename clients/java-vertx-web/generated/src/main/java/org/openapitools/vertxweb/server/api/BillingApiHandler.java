package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdsCreditRedeem;
import org.openapitools.vertxweb.server.model.AdsCreditRedeemCreate;
import org.openapitools.vertxweb.server.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.vertxweb.server.model.BillingInvoiceDocumentType;
import org.openapitools.vertxweb.server.model.BillingInvoiceDownloadResponse;
import org.openapitools.vertxweb.server.model.BillingInvoiceSortField;
import org.openapitools.vertxweb.server.model.BillingInvoiceStatus;
import org.openapitools.vertxweb.server.model.BillingInvoicesGet200Response;
import org.openapitools.vertxweb.server.model.BillingProfilesGet200Response;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.SSIOAccount;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrder;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrderCreate;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrderUpdate;
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
        builder.operation("billingInvoiceDownloadGet").handler(this::billingInvoiceDownloadGet);
        builder.operation("billingInvoicesGet").handler(this::billingInvoicesGet);
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
        AdsCreditRedeemCreate adsCreditRedeemCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdsCreditRedeemCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter adsCreditRedeemCreate is {}", adsCreditRedeemCreate);

        api.adsCreditRedeem(adAccountId, adsCreditRedeemCreate)
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

    private void billingInvoiceDownloadGet(RoutingContext routingContext) {
        logger.info("billingInvoiceDownloadGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String billingInvoiceId = requestParameters.pathParameter("billing_invoice_id") != null ? requestParameters.pathParameter("billing_invoice_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter billingInvoiceId is {}", billingInvoiceId);

        api.billingInvoiceDownloadGet(adAccountId, billingInvoiceId)
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

    private void billingInvoicesGet(RoutingContext routingContext) {
        logger.info("billingInvoicesGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;
        BillingInvoiceSortField sort = requestParameters.queryParameter("sort") != null ? requestParameters.queryParameter("sort").getBillingInvoiceSortField() : ;
        BillingInvoiceStatus status = requestParameters.queryParameter("status") != null ? requestParameters.queryParameter("status").getBillingInvoiceStatus() : null;
        BillingInvoiceDocumentType documentType = requestParameters.queryParameter("document_type") != null ? requestParameters.queryParameter("document_type").getBillingInvoiceDocumentType() : null;
        LocalDate startDueDate = requestParameters.queryParameter("start_due_date") != null ? requestParameters.queryParameter("start_due_date").getLocalDate() : null;
        LocalDate endDueDate = requestParameters.queryParameter("end_due_date") != null ? requestParameters.queryParameter("end_due_date").getLocalDate() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter sort is {}", sort);
        logger.debug("Parameter status is {}", status);
        logger.debug("Parameter documentType is {}", documentType);
        logger.debug("Parameter startDueDate is {}", startDueDate);
        logger.debug("Parameter endDueDate is {}", endDueDate);

        api.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate)
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

        Boolean isActive = requestParameters.queryParameter("is_active") != null ? requestParameters.queryParameter("is_active").getBoolean() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter isActive is {}", isActive);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.billingProfilesGet(isActive, adAccountId, bookmark, pageSize)
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
        SSIOInsertionOrderCreate ssIOInsertionOrderCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SSIOInsertionOrderCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter ssIOInsertionOrderCreate is {}", ssIOInsertionOrderCreate);

        api.ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate)
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
        SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SSIOInsertionOrderUpdate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter ssIOInsertionOrderUpdate is {}", ssIOInsertionOrderUpdate);

        api.ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate)
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
        String pinOrderId = requestParameters.queryParameter("pin_order_id") != null ? requestParameters.queryParameter("pin_order_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pinOrderId is {}", pinOrderId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize)
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
