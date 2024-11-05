package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.KeywordUpdateBody;
import com.prokarma.pkmst.model.KeywordsGet200Response;
import com.prokarma.pkmst.model.KeywordsMetricsArrayResponse;
import com.prokarma.pkmst.model.KeywordsRequest;
import com.prokarma.pkmst.model.KeywordsResponse;
import java.util.List;
import com.prokarma.pkmst.model.MatchType;
import com.prokarma.pkmst.model.TrendType;
import com.prokarma.pkmst.model.TrendingKeywordsResponse;
import com.prokarma.pkmst.model.TrendsSupportedRegion;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
public class KeywordsApiController implements KeywordsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public KeywordsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<KeywordsMetricsArrayResponse> countryKeywordsMetricsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Two letter country code (ISO 3166-1 alpha-2)", required = true)  @RequestParam(value = "country_code", required = true) String countryCode,
        @ApiParam(value = "Comma-separated keywords", required = true)  @RequestParam(value = "keywords", required = true) List<String> keywords,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<KeywordsMetricsArrayResponse>(objectMapper.readValue("", KeywordsMetricsArrayResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<KeywordsMetricsArrayResponse>(objectMapper.readValue("", KeywordsMetricsArrayResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<KeywordsMetricsArrayResponse>(HttpStatus.OK);
    }

    public ResponseEntity<KeywordsResponse> keywordsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody KeywordsRequest keywordsRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<KeywordsResponse>(objectMapper.readValue("", KeywordsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<KeywordsResponse>(objectMapper.readValue("", KeywordsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<KeywordsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<KeywordsGet200Response> keywordsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Campaign Id to use to filter the results.")  @RequestParam(value = "campaign_id", required = false) String campaignId,
        @ApiParam(value = "Ad group Id.")  @RequestParam(value = "ad_group_id", required = false) String adGroupId,
        @ApiParam(value = "Keyword <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type</a>")  @RequestParam(value = "match_types", required = false) List<MatchType> matchTypes,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<KeywordsGet200Response>(objectMapper.readValue("", KeywordsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<KeywordsGet200Response>(objectMapper.readValue("", KeywordsGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<KeywordsGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<KeywordsResponse> keywordsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody KeywordUpdateBody keywordUpdateBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<KeywordsResponse>(objectMapper.readValue("", KeywordsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<KeywordsResponse>(objectMapper.readValue("", KeywordsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<KeywordsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<TrendingKeywordsResponse> trendingKeywordsList(@ApiParam(value = "The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia",required=true, allowableValues="{values=[US, CA, DE, FR, ES, IT, DE+AT+CH, GB+IE, IT+ES+PT+GR+MT, PL+RO+HU+SK+CZ, SE+DK+FI+NO, NL+BE+LU, AR, BR, CO, MX, MX+AR+CO+CL, AU+NZ], enumVars=[{name=US, isString=true, value="US"}, {name=CA, isString=true, value="CA"}, {name=DE, isString=true, value="DE"}, {name=FR, isString=true, value="FR"}, {name=ES, isString=true, value="ES"}, {name=IT, isString=true, value="IT"}, {name=DE_AT_CH, isString=true, value="DE+AT+CH"}, {name=GB_IE, isString=true, value="GB+IE"}, {name=IT_ES_PT_GR_MT, isString=true, value="IT+ES+PT+GR+MT"}, {name=PL_RO_HU_SK_CZ, isString=true, value="PL+RO+HU+SK+CZ"}, {name=SE_DK_FI_NO, isString=true, value="SE+DK+FI+NO"}, {name=NL_BE_LU, isString=true, value="NL+BE+LU"}, {name=AR, isString=true, value="AR"}, {name=BR, isString=true, value="BR"}, {name=CO, isString=true, value="CO"}, {name=MX, isString=true, value="MX"}, {name=MX_AR_CO_CL, isString=true, value="MX+AR+CO+CL"}, {name=AU_NZ, isString=true, value="AU+NZ"}]}" ) @PathVariable("region") TrendsSupportedRegion region,
        @ApiParam(value = "The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)",required=true, allowableValues="{values=[growing, monthly, yearly, seasonal], enumVars=[{name=GROWING, isString=true, value="growing"}, {name=MONTHLY, isString=true, value="monthly"}, {name=YEARLY, isString=true, value="yearly"}, {name=SEASONAL, isString=true, value="seasonal"}]}" ) @PathVariable("trend_type") TrendType trendType,
        @ApiParam(value = "If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion", allowableValues = "animals, architecture, art, beauty, childrens_fashion, design, diy_and_crafts, education, electronics, entertainment, event_planning, finance, food_and_drinks, gardening, health, home_decor, mens_fashion, parenting, quotes, sport, travel, vehicles, wedding, womens_fashion")  @RequestParam(value = "interests", required = false) List<String> interests,
        @ApiParam(value = "If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.", allowableValues = "female, male, unknown")  @RequestParam(value = "genders", required = false) List<String> genders,
        @ApiParam(value = "If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.", allowableValues = "18-24, 25-34, 35-44, 45-49, 50-54, 55-64, 65+")  @RequestParam(value = "ages", required = false) List<String> ages,
        @ApiParam(value = "If set, filters the results to top trends which include at least one of the specified keywords.<br /> If unset, no keyword filtering logic is applied.")  @RequestParam(value = "include_keywords", required = false) List<String> includeKeywords,
        @ApiParam(value = "Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.", defaultValue = "false")  @RequestParam(value = "normalize_against_group", required = false, defaultValue="false") Boolean normalizeAgainstGroup,
        @ApiParam(value = "The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.", defaultValue = "50")  @RequestParam(value = "limit", required = false, defaultValue="50") Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TrendingKeywordsResponse>(objectMapper.readValue("", TrendingKeywordsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TrendingKeywordsResponse>(objectMapper.readValue("", TrendingKeywordsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TrendingKeywordsResponse>(objectMapper.readValue("", TrendingKeywordsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<TrendingKeywordsResponse>(HttpStatus.OK);
    }

}
