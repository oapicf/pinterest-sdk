package controllers;

import apimodels.Keywords;
import apimodels.KeywordsCreate;
import apimodels.KeywordsGet200Response;
import apimodels.KeywordsMetricsArrayResponse;
import apimodels.KeywordsUpdate;
import apimodels.MatchType;
import apimodels.PinterestLibError;
import apimodels.TrendType;
import apimodels.TrendingKeywordsResponse;
import apimodels.TrendsAgeBucket;
import apimodels.TrendsGenderFilter;
import apimodels.TrendsL1Interest;
import apimodels.TrendsSupportedRegion;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordsApiController extends Controller {
    private final KeywordsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private KeywordsApiController(Config configuration, KeywordsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result countryKeywordsMetricsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuecountryCode = request.getQueryString("country_code");
        String countryCode;
        if (valuecountryCode != null) {
            countryCode = valuecountryCode;
        } else {
            throw new IllegalArgumentException("'country_code' parameter is required");
        }
        String[] keywordsArray = request.queryString().get("keywords");
        if (keywordsArray == null) {
            throw new IllegalArgumentException("'keywords' parameter is required");
        }
        List<String> keywordsList = OpenAPIUtils.parametersToList("csv", keywordsArray);
        List<String> keywords = new ArrayList<>();
        for (String curParam : keywordsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                keywords.add(curParam);
            }
        }
        return imp.countryKeywordsMetricsGetHttp(request, adAccountId, countryCode, keywords);
    }

    @ApiAction
    public Result keywordsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodekeywordsCreate = request.body().asJson();
        KeywordsCreate keywordsCreate;
        if (nodekeywordsCreate != null) {
            keywordsCreate = mapper.readValue(nodekeywordsCreate.toString(), KeywordsCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(keywordsCreate);
            }
        } else {
            throw new IllegalArgumentException("'KeywordsCreate' parameter is required");
        }
        return imp.keywordsCreateHttp(request, adAccountId, keywordsCreate);
    }

    @ApiAction
    public Result keywordsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuecampaignId = request.getQueryString("campaign_id");
        String campaignId;
        if (valuecampaignId != null) {
            campaignId = valuecampaignId;
        } else {
            campaignId = null;
        }
        String valueadGroupId = request.getQueryString("ad_group_id");
        String adGroupId;
        if (valueadGroupId != null) {
            adGroupId = valueadGroupId;
        } else {
            adGroupId = null;
        }
        String[] adGroupIdsArray = request.queryString().get("ad_group_ids");
        List<String> adGroupIdsList = OpenAPIUtils.parametersToList("multi", adGroupIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
        for (String curParam : adGroupIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                adGroupIds.add(curParam);
            }
        }
        String[] matchTypesArray = request.queryString().get("match_types");
        List<String> matchTypesList = OpenAPIUtils.parametersToList("multi", matchTypesArray);
        List<MatchType> matchTypes = new ArrayList<>();
        for (String curParam : matchTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                matchTypes.add(curParam);
            }
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.keywordsGetHttp(request, adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize);
    }

    @ApiAction
    public Result keywordsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodekeywordsUpdate = request.body().asJson();
        KeywordsUpdate keywordsUpdate;
        if (nodekeywordsUpdate != null) {
            keywordsUpdate = mapper.readValue(nodekeywordsUpdate.toString(), KeywordsUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(keywordsUpdate);
            }
        } else {
            throw new IllegalArgumentException("'KeywordsUpdate' parameter is required");
        }
        return imp.keywordsUpdateHttp(request, adAccountId, keywordsUpdate);
    }

    @ApiAction
    public Result trendingKeywordsList(Http.Request request, TrendsSupportedRegion region,TrendType trendType) throws Exception {
        String[] interestsArray = request.queryString().get("interests");
        List<String> interestsList = OpenAPIUtils.parametersToList("multi", interestsArray);
        List<TrendsL1Interest> interests = new ArrayList<>();
        for (String curParam : interestsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                interests.add(curParam);
            }
        }
        String[] gendersArray = request.queryString().get("genders");
        List<String> gendersList = OpenAPIUtils.parametersToList("multi", gendersArray);
        List<TrendsGenderFilter> genders = new ArrayList<>();
        for (String curParam : gendersList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                genders.add(curParam);
            }
        }
        String[] agesArray = request.queryString().get("ages");
        List<String> agesList = OpenAPIUtils.parametersToList("multi", agesArray);
        List<TrendsAgeBucket> ages = new ArrayList<>();
        for (String curParam : agesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ages.add(curParam);
            }
        }
        String[] includeKeywordsArray = request.queryString().get("include_keywords");
        List<String> includeKeywordsList = OpenAPIUtils.parametersToList("multi", includeKeywordsArray);
        List<@Size(min = 1, max = 100)String> includeKeywords = new ArrayList<>();
        for (String curParam : includeKeywordsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                includeKeywords.add(curParam);
            }
        }
        String valuenormalizeAgainstGroup = request.getQueryString("normalize_against_group");
        Boolean normalizeAgainstGroup;
        if (valuenormalizeAgainstGroup != null) {
            normalizeAgainstGroup = Boolean.valueOf(valuenormalizeAgainstGroup);
        } else {
            normalizeAgainstGroup = false;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 50;
        }
        String valueincludeDemographics = request.getQueryString("include_demographics");
        Boolean includeDemographics;
        if (valueincludeDemographics != null) {
            includeDemographics = Boolean.valueOf(valueincludeDemographics);
        } else {
            includeDemographics = false;
        }
        return imp.trendingKeywordsListHttp(request, region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics);
    }

}
