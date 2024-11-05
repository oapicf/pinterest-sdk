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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class KeywordsApiControllerImp extends KeywordsApiControllerImpInterface {
    @Override
    public KeywordsMetricsArrayResponse countryKeywordsMetricsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull String countryCode, @NotNull  @Size(min=1,max=2000)List<String> keywords) throws Exception {
        //Do your magic!!!
        return new KeywordsMetricsArrayResponse();
    }

    @Override
    public KeywordsResponse keywordsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, KeywordsRequest keywordsRequest) throws Exception {
        //Do your magic!!!
        return new KeywordsResponse();
    }

    @Override
    public KeywordsGet200Response keywordsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String campaignId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Size(min=1,max=5)List<MatchType> matchTypes,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new KeywordsGet200Response();
    }

    @Override
    public KeywordsResponse keywordsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, KeywordUpdateBody keywordUpdateBody) throws Exception {
        //Do your magic!!!
        return new KeywordsResponse();
    }

    @Override
    public TrendingKeywordsResponse trendingKeywordsList(Http.Request request, TrendsSupportedRegion region, TrendType trendType, List<String> interests, List<String> genders, List<String> ages,  @Size(min=1,max=50)List<@Size(min = 1, max = 100)String> includeKeywords, Boolean normalizeAgainstGroup,  @Min(1) @Max(50)Integer limit) throws Exception {
        //Do your magic!!!
        return new TrendingKeywordsResponse();
    }

}
