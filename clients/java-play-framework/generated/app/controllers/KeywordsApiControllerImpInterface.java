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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class KeywordsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result countryKeywordsMetricsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String countryCode, @NotNull  @Size(min=1,max=2000)List<String> keywords) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        KeywordsMetricsArrayResponse obj = countryKeywordsMetricsGet(request, adAccountId, countryCode, keywords);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract KeywordsMetricsArrayResponse countryKeywordsMetricsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String countryCode, @NotNull  @Size(min=1,max=2000)List<String> keywords) throws Exception;

    public Result keywordsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, KeywordsCreate keywordsCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Keywords obj = keywordsCreate(request, adAccountId, keywordsCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Keywords keywordsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, KeywordsCreate keywordsCreate) throws Exception;

    public Result keywordsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds,  @Size(min=1,max=5)List<MatchType> matchTypes, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        KeywordsGet200Response obj = keywordsGet(request, adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract KeywordsGet200Response keywordsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds,  @Size(min=1,max=5)List<MatchType> matchTypes, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result keywordsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, KeywordsUpdate keywordsUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Keywords obj = keywordsUpdate(request, adAccountId, keywordsUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Keywords keywordsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, KeywordsUpdate keywordsUpdate) throws Exception;

    public Result trendingKeywordsListHttp(Http.Request request, TrendsSupportedRegion region, TrendType trendType, List<TrendsL1Interest> interests, List<TrendsGenderFilter> genders, List<TrendsAgeBucket> ages,  @Size(min=1,max=50)List<@Size(min = 1, max = 100)String> includeKeywords, Boolean normalizeAgainstGroup,  @Min(1) @Max(50)Integer limit, Boolean includeDemographics) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TrendingKeywordsResponse obj = trendingKeywordsList(request, region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TrendingKeywordsResponse trendingKeywordsList(Http.Request request, TrendsSupportedRegion region, TrendType trendType, List<TrendsL1Interest> interests, List<TrendsGenderFilter> genders, List<TrendsAgeBucket> ages,  @Size(min=1,max=50)List<@Size(min = 1, max = 100)String> includeKeywords, Boolean normalizeAgainstGroup,  @Min(1) @Max(50)Integer limit, Boolean includeDemographics) throws Exception;

}
