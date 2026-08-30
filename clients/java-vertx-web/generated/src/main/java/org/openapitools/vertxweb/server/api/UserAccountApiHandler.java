package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Account;
import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.BoardsList200Response;
import org.openapitools.vertxweb.server.model.FollowUser;
import org.openapitools.vertxweb.server.model.FollowUserCreate;
import org.openapitools.vertxweb.server.model.FollowersList200Response;
import org.openapitools.vertxweb.server.model.LinkedBusiness;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.QuerymetrictypesItems;
import org.openapitools.vertxweb.server.model.QueryvideopinmetrictypesItems;
import org.openapitools.vertxweb.server.model.TopPinsAnalyticsResponse;
import org.openapitools.vertxweb.server.model.TopPinsSortBy;
import org.openapitools.vertxweb.server.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.vertxweb.server.model.TopVideoPinsSortBy;
import org.openapitools.vertxweb.server.model.UserAccountFollowedInterests200Response;
import org.openapitools.vertxweb.server.model.UserFollowingFeedType;
import org.openapitools.vertxweb.server.model.UserWebsite;
import org.openapitools.vertxweb.server.model.UserWebsiteCreate;
import org.openapitools.vertxweb.server.model.UserWebsiteVerification;
import org.openapitools.vertxweb.server.model.UserWebsitesGet200Response;

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

public class UserAccountApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(UserAccountApiHandler.class);

    private final UserAccountApi api;

    public UserAccountApiHandler(UserAccountApi api) {
        this.api = api;
    }

    @Deprecated
    public UserAccountApiHandler() {
        this(new UserAccountApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("boardsUserFollowsList").handler(this::boardsUserFollowsList);
        builder.operation("followUserUpdate").handler(this::followUserUpdate);
        builder.operation("followersList").handler(this::followersList);
        builder.operation("linkedBusinessAccountsGet").handler(this::linkedBusinessAccountsGet);
        builder.operation("unverifyWebsiteDelete").handler(this::unverifyWebsiteDelete);
        builder.operation("userAccountAnalytics").handler(this::userAccountAnalytics);
        builder.operation("userAccountAnalyticsTopPins").handler(this::userAccountAnalyticsTopPins);
        builder.operation("userAccountAnalyticsTopVideoPins").handler(this::userAccountAnalyticsTopVideoPins);
        builder.operation("userAccountFollowedInterests").handler(this::userAccountFollowedInterests);
        builder.operation("userAccountGet").handler(this::userAccountGet);
        builder.operation("userFollowingGet").handler(this::userFollowingGet);
        builder.operation("userWebsitesGet").handler(this::userWebsitesGet);
        builder.operation("verifyWebsiteUpdate").handler(this::verifyWebsiteUpdate);
        builder.operation("websiteVerificationGet").handler(this::websiteVerificationGet);
    }

    private void boardsUserFollowsList(RoutingContext routingContext) {
        logger.info("boardsUserFollowsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        Boolean explicitFollowing = requestParameters.queryParameter("explicit_following") != null ? requestParameters.queryParameter("explicit_following").getBoolean() : false;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter explicitFollowing is {}", explicitFollowing);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize)
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

    private void followUserUpdate(RoutingContext routingContext) {
        logger.info("followUserUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String username = requestParameters.pathParameter("username") != null ? requestParameters.pathParameter("username").getString() : null;
        RequestParameter body = requestParameters.body();
        FollowUserCreate followUserCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<FollowUserCreate>(){}) : null;

        logger.debug("Parameter username is {}", username);
        logger.debug("Parameter followUserCreate is {}", followUserCreate);

        api.followUserUpdate(username, followUserCreate)
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

    private void followersList(RoutingContext routingContext) {
        logger.info("followersList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.followersList(bookmark, pageSize)
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

    private void linkedBusinessAccountsGet(RoutingContext routingContext) {
        logger.info("linkedBusinessAccountsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.linkedBusinessAccountsGet()
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

    private void unverifyWebsiteDelete(RoutingContext routingContext) {
        logger.info("unverifyWebsiteDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String website = requestParameters.queryParameter("website") != null ? requestParameters.queryParameter("website").getString() : null;

        logger.debug("Parameter website is {}", website);

        api.unverifyWebsiteDelete(website)
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

    private void userAccountAnalytics(RoutingContext routingContext) {
        logger.info("userAccountAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        String fromClaimedContent = requestParameters.queryParameter("from_claimed_content") != null ? requestParameters.queryParameter("from_claimed_content").getString() : "BOTH";
        String pinFormat = requestParameters.queryParameter("pin_format") != null ? requestParameters.queryParameter("pin_format").getString() : "ALL";
        String appTypes = requestParameters.queryParameter("app_types") != null ? requestParameters.queryParameter("app_types").getString() : "ALL";
        String contentType = requestParameters.queryParameter("content_type") != null ? requestParameters.queryParameter("content_type").getString() : "ALL";
        String source = requestParameters.queryParameter("source") != null ? requestParameters.queryParameter("source").getString() : "ALL";
        List<QuerymetrictypesItems> metricTypes = requestParameters.queryParameter("metric_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("metric_types").get(), new TypeReference<List<QuerymetrictypesItems>>(){}) : null;
        String splitField = requestParameters.queryParameter("split_field") != null ? requestParameters.queryParameter("split_field").getString() : "NO_SPLIT";
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter fromClaimedContent is {}", fromClaimedContent);
        logger.debug("Parameter pinFormat is {}", pinFormat);
        logger.debug("Parameter appTypes is {}", appTypes);
        logger.debug("Parameter contentType is {}", contentType);
        logger.debug("Parameter source is {}", source);
        logger.debug("Parameter metricTypes is {}", metricTypes);
        logger.debug("Parameter splitField is {}", splitField);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)
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

    private void userAccountAnalyticsTopPins(RoutingContext routingContext) {
        logger.info("userAccountAnalyticsTopPins()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        TopPinsSortBy sortBy = requestParameters.queryParameter("sort_by") != null ? requestParameters.queryParameter("sort_by").getTopPinsSortBy() : null;
        String fromClaimedContent = requestParameters.queryParameter("from_claimed_content") != null ? requestParameters.queryParameter("from_claimed_content").getString() : "BOTH";
        String pinFormat = requestParameters.queryParameter("pin_format") != null ? requestParameters.queryParameter("pin_format").getString() : "ALL";
        String appTypes = requestParameters.queryParameter("app_types") != null ? requestParameters.queryParameter("app_types").getString() : "ALL";
        String contentType = requestParameters.queryParameter("content_type") != null ? requestParameters.queryParameter("content_type").getString() : "ALL";
        String source = requestParameters.queryParameter("source") != null ? requestParameters.queryParameter("source").getString() : "ALL";
        List<QuerymetrictypesItems> metricTypes = requestParameters.queryParameter("metric_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("metric_types").get(), new TypeReference<List<QuerymetrictypesItems>>(){}) : null;
        Integer numOfPins = requestParameters.queryParameter("num_of_pins") != null ? requestParameters.queryParameter("num_of_pins").getInteger() : 10;
        BigDecimal createdInLastNDays = requestParameters.queryParameter("created_in_last_n_days") != null ? requestParameters.queryParameter("created_in_last_n_days").getBigDecimal() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter sortBy is {}", sortBy);
        logger.debug("Parameter fromClaimedContent is {}", fromClaimedContent);
        logger.debug("Parameter pinFormat is {}", pinFormat);
        logger.debug("Parameter appTypes is {}", appTypes);
        logger.debug("Parameter contentType is {}", contentType);
        logger.debug("Parameter source is {}", source);
        logger.debug("Parameter metricTypes is {}", metricTypes);
        logger.debug("Parameter numOfPins is {}", numOfPins);
        logger.debug("Parameter createdInLastNDays is {}", createdInLastNDays);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
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

    private void userAccountAnalyticsTopVideoPins(RoutingContext routingContext) {
        logger.info("userAccountAnalyticsTopVideoPins()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        TopVideoPinsSortBy sortBy = requestParameters.queryParameter("sort_by") != null ? requestParameters.queryParameter("sort_by").getTopVideoPinsSortBy() : null;
        String fromClaimedContent = requestParameters.queryParameter("from_claimed_content") != null ? requestParameters.queryParameter("from_claimed_content").getString() : "BOTH";
        String pinFormat = requestParameters.queryParameter("pin_format") != null ? requestParameters.queryParameter("pin_format").getString() : "ALL";
        String appTypes = requestParameters.queryParameter("app_types") != null ? requestParameters.queryParameter("app_types").getString() : "ALL";
        String contentType = requestParameters.queryParameter("content_type") != null ? requestParameters.queryParameter("content_type").getString() : "ALL";
        String source = requestParameters.queryParameter("source") != null ? requestParameters.queryParameter("source").getString() : "ALL";
        List<QueryvideopinmetrictypesItems> metricTypes = requestParameters.queryParameter("metric_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("metric_types").get(), new TypeReference<List<QueryvideopinmetrictypesItems>>(){}) : null;
        Integer numOfPins = requestParameters.queryParameter("num_of_pins") != null ? requestParameters.queryParameter("num_of_pins").getInteger() : 10;
        BigDecimal createdInLastNDays = requestParameters.queryParameter("created_in_last_n_days") != null ? requestParameters.queryParameter("created_in_last_n_days").getBigDecimal() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter sortBy is {}", sortBy);
        logger.debug("Parameter fromClaimedContent is {}", fromClaimedContent);
        logger.debug("Parameter pinFormat is {}", pinFormat);
        logger.debug("Parameter appTypes is {}", appTypes);
        logger.debug("Parameter contentType is {}", contentType);
        logger.debug("Parameter source is {}", source);
        logger.debug("Parameter metricTypes is {}", metricTypes);
        logger.debug("Parameter numOfPins is {}", numOfPins);
        logger.debug("Parameter createdInLastNDays is {}", createdInLastNDays);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
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

    private void userAccountFollowedInterests(RoutingContext routingContext) {
        logger.info("userAccountFollowedInterests()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String username = requestParameters.pathParameter("username") != null ? requestParameters.pathParameter("username").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter username is {}", username);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.userAccountFollowedInterests(username, bookmark, pageSize)
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

    private void userAccountGet(RoutingContext routingContext) {
        logger.info("userAccountGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.userAccountGet(adAccountId)
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

    private void userFollowingGet(RoutingContext routingContext) {
        logger.info("userFollowingGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        Boolean explicitFollowing = requestParameters.queryParameter("explicit_following") != null ? requestParameters.queryParameter("explicit_following").getBoolean() : false;
        UserFollowingFeedType feedType = requestParameters.queryParameter("feed_type") != null ? requestParameters.queryParameter("feed_type").getUserFollowingFeedType() : ;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter explicitFollowing is {}", explicitFollowing);
        logger.debug("Parameter feedType is {}", feedType);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize)
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

    private void userWebsitesGet(RoutingContext routingContext) {
        logger.info("userWebsitesGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.userWebsitesGet(bookmark, pageSize)
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

    private void verifyWebsiteUpdate(RoutingContext routingContext) {
        logger.info("verifyWebsiteUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        UserWebsiteCreate userWebsiteCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UserWebsiteCreate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter userWebsiteCreate is {}", userWebsiteCreate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.verifyWebsiteUpdate(userWebsiteCreate, adAccountId)
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

    private void websiteVerificationGet(RoutingContext routingContext) {
        logger.info("websiteVerificationGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.websiteVerificationGet(adAccountId)
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
