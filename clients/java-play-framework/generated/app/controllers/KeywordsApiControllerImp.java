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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordsApiControllerImp extends KeywordsApiControllerImpInterface {
    @Override
    public KeywordsMetricsArrayResponse countryKeywordsMetricsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String countryCode, @NotNull  @Size(min=1,max=2000)List<String> keywords) throws Exception {
        //Do your magic!!!
        return new KeywordsMetricsArrayResponse();
    }

    @Override
    public Keywords keywordsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, KeywordsCreate keywordsCreate) throws Exception {
        //Do your magic!!!
        return new Keywords();
    }

    @Override
    public KeywordsGet200Response keywordsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> adGroupIds,  @Size(min=1,max=5)List<MatchType> matchTypes, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new KeywordsGet200Response();
    }

    @Override
    public Keywords keywordsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, KeywordsUpdate keywordsUpdate) throws Exception {
        //Do your magic!!!
        return new Keywords();
    }

    @Override
    public TrendingKeywordsResponse trendingKeywordsList(Http.Request request, TrendsSupportedRegion region, TrendType trendType, List<TrendsL1Interest> interests, List<TrendsGenderFilter> genders, List<TrendsAgeBucket> ages,  @Size(min=1,max=50)List<@Size(min = 1, max = 100)String> includeKeywords, Boolean normalizeAgainstGroup,  @Min(1) @Max(50)Integer limit, Boolean includeDemographics) throws Exception {
        //Do your magic!!!
        return new TrendingKeywordsResponse();
    }

}
