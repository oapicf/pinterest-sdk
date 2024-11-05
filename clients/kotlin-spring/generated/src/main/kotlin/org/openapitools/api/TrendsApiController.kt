package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.TrendType
import org.openapitools.model.TrendingKeywordsResponse
import org.openapitools.model.TrendsSupportedRegion
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v5}")
class TrendsApiController() {

    @Operation(
        summary = "List trending keywords",
        operationId = "trendingKeywordsList",
        description = """<p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href="https://trends.pinterest.com">trends.pinterest.com</a>.
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = TrendingKeywordsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid trending keywords request parameters", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/trends/keywords/{region}/top/{trend_type}"],
        produces = ["application/json"]
    )
    fun trendingKeywordsList(@Parameter(description = "The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia", required = true, schema = Schema(allowableValues = ["\"US\"", "\"CA\"", "\"DE\"", "\"FR\"", "\"ES\"", "\"IT\"", "\"DE+AT+CH\"", "\"GB+IE\"", "\"IT+ES+PT+GR+MT\"", "\"PL+RO+HU+SK+CZ\"", "\"SE+DK+FI+NO\"", "\"NL+BE+LU\"", "\"AR\"", "\"BR\"", "\"CO\"", "\"MX\"", "\"MX+AR+CO+CL\"", "\"AU+NZ\""])) @PathVariable("region") region: TrendsSupportedRegion,@Parameter(description = "The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)", required = true, schema = Schema(allowableValues = ["\"growing\"", "\"monthly\"", "\"yearly\"", "\"seasonal\""])) @PathVariable("trend_type") trendType: TrendType,@Parameter(description = "If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion", schema = Schema(allowableValues = ["animals", "architecture", "art", "beauty", "childrens_fashion", "design", "diy_and_crafts", "education", "electronics", "entertainment", "event_planning", "finance", "food_and_drinks", "gardening", "health", "home_decor", "mens_fashion", "parenting", "quotes", "sport", "travel", "vehicles", "wedding", "womens_fashion"])) @Valid @RequestParam(value = "interests", required = false) interests: kotlin.collections.List<kotlin.String>?,@Parameter(description = "If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.", schema = Schema(allowableValues = ["female", "male", "unknown"])) @Valid @RequestParam(value = "genders", required = false) genders: kotlin.collections.List<kotlin.String>?,@Parameter(description = "If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.", schema = Schema(allowableValues = ["18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+"])) @Valid @RequestParam(value = "ages", required = false) ages: kotlin.collections.List<kotlin.String>?,@Size(min=1,max=50) @Parameter(description = "If set, filters the results to top trends which include at least one of the specified keywords.<br /> If unset, no keyword filtering logic is applied.") @Valid @RequestParam(value = "include_keywords", required = false) includeKeywords: kotlin.collections.List<kotlin.String>?,@Parameter(description = "Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "normalize_against_group", required = false, defaultValue = "false") normalizeAgainstGroup: kotlin.Boolean,@Min(1) @Max(50) @Parameter(description = "The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.", schema = Schema(defaultValue = "50")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "50") limit: kotlin.Int): ResponseEntity<TrendingKeywordsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
