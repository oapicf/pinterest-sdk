package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.vertxweb.server.model.AudienceAccountType;
import org.openapitools.vertxweb.server.model.AudiencesList200Response;
import org.openapitools.vertxweb.server.model.BusinessSharedAudience;
import org.openapitools.vertxweb.server.model.BusinessSharedAudienceResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.SharedAudience;
import org.openapitools.vertxweb.server.model.SharedAudienceResponse;

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

public class AudienceSharingApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AudienceSharingApiHandler.class);

    private final AudienceSharingApi api;

    public AudienceSharingApiHandler(AudienceSharingApi api) {
        this.api = api;
    }

    @Deprecated
    public AudienceSharingApiHandler() {
        this(new AudienceSharingApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adAccountsAudiencesSharedAccountsList").handler(this::adAccountsAudiencesSharedAccountsList);
        builder.operation("businessAccountAudiencesSharedAccountsList").handler(this::businessAccountAudiencesSharedAccountsList);
        builder.operation("sharedAudiencesForBusinessList").handler(this::sharedAudiencesForBusinessList);
        builder.operation("updateAdAccountToAdAccountSharedAudience").handler(this::updateAdAccountToAdAccountSharedAudience);
        builder.operation("updateAdAccountToBusinessSharedAudience").handler(this::updateAdAccountToBusinessSharedAudience);
        builder.operation("updateBusinessToAdAccountSharedAudience").handler(this::updateBusinessToAdAccountSharedAudience);
        builder.operation("updateBusinessToBusinessSharedAudience").handler(this::updateBusinessToBusinessSharedAudience);
    }

    private void adAccountsAudiencesSharedAccountsList(RoutingContext routingContext) {
        logger.info("adAccountsAudiencesSharedAccountsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String audienceId = requestParameters.queryParameter("audience_id") != null ? requestParameters.queryParameter("audience_id").getString() : null;
        AudienceAccountType accountType = requestParameters.queryParameter("account_type") != null ? requestParameters.queryParameter("account_type").getAudienceAccountType() : ;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter audienceId is {}", audienceId);
        logger.debug("Parameter accountType is {}", accountType);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)
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

    private void businessAccountAudiencesSharedAccountsList(RoutingContext routingContext) {
        logger.info("businessAccountAudiencesSharedAccountsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        String audienceId = requestParameters.queryParameter("audience_id") != null ? requestParameters.queryParameter("audience_id").getString() : null;
        AudienceAccountType accountType = requestParameters.queryParameter("account_type") != null ? requestParameters.queryParameter("account_type").getAudienceAccountType() : ;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter audienceId is {}", audienceId);
        logger.debug("Parameter accountType is {}", accountType);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)
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

    private void sharedAudiencesForBusinessList(RoutingContext routingContext) {
        logger.info("sharedAudiencesForBusinessList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)
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

    private void updateAdAccountToAdAccountSharedAudience(RoutingContext routingContext) {
        logger.info("updateAdAccountToAdAccountSharedAudience()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        SharedAudience sharedAudience = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SharedAudience>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter sharedAudience is {}", sharedAudience);

        api.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)
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

    private void updateAdAccountToBusinessSharedAudience(RoutingContext routingContext) {
        logger.info("updateAdAccountToBusinessSharedAudience()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BusinessSharedAudience businessSharedAudience = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BusinessSharedAudience>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter businessSharedAudience is {}", businessSharedAudience);

        api.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)
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

    private void updateBusinessToAdAccountSharedAudience(RoutingContext routingContext) {
        logger.info("updateBusinessToAdAccountSharedAudience()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        SharedAudience sharedAudience = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SharedAudience>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter sharedAudience is {}", sharedAudience);

        api.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)
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

    private void updateBusinessToBusinessSharedAudience(RoutingContext routingContext) {
        logger.info("updateBusinessToBusinessSharedAudience()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String businessId = requestParameters.pathParameter("business_id") != null ? requestParameters.pathParameter("business_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BusinessSharedAudience businessSharedAudience = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BusinessSharedAudience>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter businessSharedAudience is {}", businessSharedAudience);

        api.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)
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
