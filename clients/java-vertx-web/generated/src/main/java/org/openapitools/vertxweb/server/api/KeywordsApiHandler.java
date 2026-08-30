package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Keywords;
import org.openapitools.vertxweb.server.model.KeywordsCreate;
import org.openapitools.vertxweb.server.model.KeywordsGet200Response;
import org.openapitools.vertxweb.server.model.KeywordsMetricsArrayResponse;
import org.openapitools.vertxweb.server.model.KeywordsUpdate;
import org.openapitools.vertxweb.server.model.MatchType;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.TrendType;
import org.openapitools.vertxweb.server.model.TrendingKeywordsResponse;
import org.openapitools.vertxweb.server.model.TrendsAgeBucket;
import org.openapitools.vertxweb.server.model.TrendsGenderFilter;
import org.openapitools.vertxweb.server.model.TrendsL1Interest;
import org.openapitools.vertxweb.server.model.TrendsSupportedRegion;

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

public class KeywordsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(KeywordsApiHandler.class);

    private final KeywordsApi api;

    public KeywordsApiHandler(KeywordsApi api) {
        this.api = api;
    }

    @Deprecated
    public KeywordsApiHandler() {
        this(new KeywordsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("countryKeywordsMetricsGet").handler(this::countryKeywordsMetricsGet);
        builder.operation("keywordsCreate").handler(this::keywordsCreate);
        builder.operation("keywordsGet").handler(this::keywordsGet);
        builder.operation("keywordsUpdate").handler(this::keywordsUpdate);
        builder.operation("trendingKeywordsList").handler(this::trendingKeywordsList);
    }

    private void countryKeywordsMetricsGet(RoutingContext routingContext) {
        logger.info("countryKeywordsMetricsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String countryCode = requestParameters.queryParameter("country_code") != null ? requestParameters.queryParameter("country_code").getString() : null;
        List<String> keywords = requestParameters.queryParameter("keywords") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("keywords").get(), new TypeReference<List<String>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter countryCode is {}", countryCode);
        logger.debug("Parameter keywords is {}", keywords);

        api.countryKeywordsMetricsGet(adAccountId, countryCode, keywords)
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

    private void keywordsCreate(RoutingContext routingContext) {
        logger.info("keywordsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        KeywordsCreate keywordsCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<KeywordsCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter keywordsCreate is {}", keywordsCreate);

        api.keywordsCreate(adAccountId, keywordsCreate)
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

    private void keywordsGet(RoutingContext routingContext) {
        logger.info("keywordsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String campaignId = requestParameters.queryParameter("campaign_id") != null ? requestParameters.queryParameter("campaign_id").getString() : null;
        String adGroupId = requestParameters.queryParameter("ad_group_id") != null ? requestParameters.queryParameter("ad_group_id").getString() : null;
        List<String> adGroupIds = requestParameters.queryParameter("ad_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ad_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<MatchType> matchTypes = requestParameters.queryParameter("match_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("match_types").get(), new TypeReference<List<MatchType>>(){}) : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter adGroupId is {}", adGroupId);
        logger.debug("Parameter adGroupIds is {}", adGroupIds);
        logger.debug("Parameter matchTypes is {}", matchTypes);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize)
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

    private void keywordsUpdate(RoutingContext routingContext) {
        logger.info("keywordsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        KeywordsUpdate keywordsUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<KeywordsUpdate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter keywordsUpdate is {}", keywordsUpdate);

        api.keywordsUpdate(adAccountId, keywordsUpdate)
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

    private void trendingKeywordsList(RoutingContext routingContext) {
        logger.info("trendingKeywordsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        TrendsSupportedRegion region = requestParameters.pathParameter("region") != null ? requestParameters.pathParameter("region").getTrendsSupportedRegion() : null;
        TrendType trendType = requestParameters.pathParameter("trend_type") != null ? requestParameters.pathParameter("trend_type").getTrendType() : null;
        List<TrendsL1Interest> interests = requestParameters.queryParameter("interests") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("interests").get(), new TypeReference<List<TrendsL1Interest>>(){}) : null;
        List<TrendsGenderFilter> genders = requestParameters.queryParameter("genders") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("genders").get(), new TypeReference<List<TrendsGenderFilter>>(){}) : null;
        List<TrendsAgeBucket> ages = requestParameters.queryParameter("ages") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ages").get(), new TypeReference<List<TrendsAgeBucket>>(){}) : null;
        List<String> includeKeywords = requestParameters.queryParameter("include_keywords") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("include_keywords").get(), new TypeReference<List<String>>(){}) : null;
        Boolean normalizeAgainstGroup = requestParameters.queryParameter("normalize_against_group") != null ? requestParameters.queryParameter("normalize_against_group").getBoolean() : false;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 50;
        Boolean includeDemographics = requestParameters.queryParameter("include_demographics") != null ? requestParameters.queryParameter("include_demographics").getBoolean() : false;

        logger.debug("Parameter region is {}", region);
        logger.debug("Parameter trendType is {}", trendType);
        logger.debug("Parameter interests is {}", interests);
        logger.debug("Parameter genders is {}", genders);
        logger.debug("Parameter ages is {}", ages);
        logger.debug("Parameter includeKeywords is {}", includeKeywords);
        logger.debug("Parameter normalizeAgainstGroup is {}", normalizeAgainstGroup);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter includeDemographics is {}", includeDemographics);

        api.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics)
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
