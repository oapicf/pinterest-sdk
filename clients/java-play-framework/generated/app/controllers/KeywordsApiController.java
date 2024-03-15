package controllers;

import apimodels.Error;
import apimodels.KeywordUpdateBody;
import apimodels.KeywordsGet200Response;
import apimodels.KeywordsMetricsArrayResponse;
import apimodels.KeywordsRequest;
import apimodels.KeywordsResponse;
import apimodels.MatchType;
import apimodels.TrendType;
import apimodels.TrendingKeywordsResponse;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
        JsonNode nodekeywordsRequest = request.body().asJson();
        KeywordsRequest keywordsRequest;
        if (nodekeywordsRequest != null) {
            keywordsRequest = mapper.readValue(nodekeywordsRequest.toString(), KeywordsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(keywordsRequest);
            }
        } else {
            throw new IllegalArgumentException("'KeywordsRequest' parameter is required");
        }
        return imp.keywordsCreateHttp(request, adAccountId, keywordsRequest);
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
        String[] matchTypesArray = request.queryString().get("match_types");
        List<String> matchTypesList = OpenAPIUtils.parametersToList("multi", matchTypesArray);
        List<MatchType> matchTypes = new ArrayList<>();
        for (String curParam : matchTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                matchTypes.add(curParam);
            }
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        return imp.keywordsGetHttp(request, adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark);
    }

    @ApiAction
    public Result keywordsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodekeywordUpdateBody = request.body().asJson();
        KeywordUpdateBody keywordUpdateBody;
        if (nodekeywordUpdateBody != null) {
            keywordUpdateBody = mapper.readValue(nodekeywordUpdateBody.toString(), KeywordUpdateBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(keywordUpdateBody);
            }
        } else {
            throw new IllegalArgumentException("'KeywordUpdateBody' parameter is required");
        }
        return imp.keywordsUpdateHttp(request, adAccountId, keywordUpdateBody);
    }

    @ApiAction
    public Result trendingKeywordsList(Http.Request request, TrendsSupportedRegion region,TrendType trendType) throws Exception {
        String[] interestsArray = request.queryString().get("interests");
        List<String> interestsList = OpenAPIUtils.parametersToList("multi", interestsArray);
        List<String> interests = new ArrayList<>();
        for (String curParam : interestsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                interests.add(curParam);
            }
        }
        String[] gendersArray = request.queryString().get("genders");
        List<String> gendersList = OpenAPIUtils.parametersToList("multi", gendersArray);
        List<String> genders = new ArrayList<>();
        for (String curParam : gendersList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                genders.add(curParam);
            }
        }
        String[] agesArray = request.queryString().get("ages");
        List<String> agesList = OpenAPIUtils.parametersToList("multi", agesArray);
        List<String> ages = new ArrayList<>();
        for (String curParam : agesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ages.add(curParam);
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
        return imp.trendingKeywordsListHttp(request, region, trendType, interests, genders, ages, normalizeAgainstGroup, limit);
    }

}
