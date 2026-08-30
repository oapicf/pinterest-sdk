package org.openapitools.api

import org.openapitools.model.AgeTrendsBucket
import org.openapitools.model.FeaturedTrend
import org.openapitools.model.GenderBucket
import org.openapitools.model.InterestsEnum
import org.openapitools.model.PinterestLibError
import org.openapitools.model.ProductCategoriesEngagementType
import org.openapitools.model.ProductCategoryDetailLookbackWindow
import org.openapitools.model.ProductCategoryDetails
import org.openapitools.model.ProductCategoryEnum
import org.openapitools.model.ProductCategoryRegion
import org.openapitools.model.TrendType
import org.openapitools.model.TrendingKeywordsResponse
import org.openapitools.model.TrendingProductCategory
import org.openapitools.model.TrendsAgeBucket
import org.openapitools.model.TrendsEditorial
import org.openapitools.model.TrendsGenderFilter
import org.openapitools.model.TrendsL1Interest
import org.openapitools.model.TrendsSupportedRegion
import org.openapitools.model.VerticalProductCategory
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
        description = """Get the top trending search keywords among the Pinterest user audience.

Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.

Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.

For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = TrendingKeywordsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trends/keywords/{region}/top/{trend_type}"
        value = [PATH_TRENDING_KEYWORDS_LIST],
        produces = ["application/json"]
    )
    fun trendingKeywordsList(
        @Parameter(description = "  The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia", required = true, schema = Schema(allowableValues = ["US", "CA", "DE", "FR", "ES", "IT", "DE+AT+CH", "GB+IE", "IT+ES+PT+GR+MT", "PL+RO+HU+SK+CZ", "SE+DK+FI+NO", "NL+BE+LU", "AR", "BR", "CO", "MX", "MX+AR+CO+CL", "AU+NZ"])) @PathVariable("region") region: TrendsSupportedRegion,
        @Parameter(description = "  The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)", required = true, schema = Schema(allowableValues = ["growing", "monthly", "yearly", "seasonal"])) @PathVariable("trend_type") trendType: TrendType,
        @Parameter(description = "  The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion") @Valid @RequestParam(value = "interests", required = false) interests: kotlin.collections.List<TrendsL1Interest>?,
        @Parameter(description = "If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings.") @Valid @RequestParam(value = "genders", required = false) genders: kotlin.collections.List<TrendsGenderFilter>?,
        @Parameter(description = "If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.") @Valid @RequestParam(value = "ages", required = false) ages: kotlin.collections.List<TrendsAgeBucket>?,
        @Size(min=1,max=50) @Parameter(description = "If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.") @Valid @RequestParam(value = "include_keywords", required = false) includeKeywords: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = " Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "normalize_against_group", required = false, defaultValue = "false") normalizeAgainstGroup: kotlin.Boolean,
        @Min(value=1) @Max(value=50) @Parameter(description = "The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.", schema = Schema(defaultValue = "50")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "50") limit: kotlin.Int,
        @Parameter(description = "Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_demographics", required = false, defaultValue = "false") includeDemographics: kotlin.Boolean
    ): ResponseEntity<TrendingKeywordsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns editorial articles for a given region",
        operationId = "trendsEditorialArticlesList",
        description = """  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = TrendsEditorial::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trends/editorial_articles"
        value = [PATH_TRENDS_EDITORIAL_ARTICLES_LIST],
        produces = ["application/json"]
    )
    fun trendsEditorialArticlesList(
        @NotNull @Parameter(description = "     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada", required = true, schema = Schema(allowableValues = ["US", "GB+IE", "CA"])) @Valid @RequestParam(value = "region", required = true) region: ProductCategoryRegion
    ): ResponseEntity<List<TrendsEditorial>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get featured topics",
        operationId = "trendsFeaturedTopicsList",
        description = """  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = FeaturedTrend::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trends/topics/featured"
        value = [PATH_TRENDS_FEATURED_TOPICS_LIST],
        produces = ["application/json"]
    )
    fun trendsFeaturedTopicsList(
        @NotNull @Parameter(description = "     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada", required = true, schema = Schema(allowableValues = ["US", "GB+IE", "CA"])) @Valid @RequestParam(value = "region", required = true) region: ProductCategoryRegion,
        @Parameter(description = "Interest to filter by", schema = Schema(allowableValues = ["ALL", "ANIMALS", "ARCHITECTURE", "ART", "BEAUTY", "DIY_AND_CRAFTS", "EDUCATION", "EVENT_PLANNING", "FASHION", "FOOD_AND_DRINKS", "GARDENING", "HEALTH", "HOME_DECOR", "PARENTING", "TRAVEL", "WEDDING"])) @Valid @RequestParam(value = "interest", required = false) interest: InterestsEnum?
    ): ResponseEntity<List<FeaturedTrend>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product category details",
        operationId = "trendsProductCategoriesDetailsList",
        description = """  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = ProductCategoryDetails::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trends/product_categories/details"
        value = [PATH_TRENDS_PRODUCT_CATEGORIES_DETAILS_LIST],
        produces = ["application/json"]
    )
    fun trendsProductCategoriesDetailsList(
        @NotNull @Size(min=1,max=20) @Parameter(description = "List of product categories", required = true) @Valid @RequestParam(value = "product_categories", required = true) productCategories: kotlin.collections.List<ProductCategoryEnum>,
        @NotNull @Parameter(description = "     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada", required = true, schema = Schema(allowableValues = ["US", "GB+IE", "CA"])) @Valid @RequestParam(value = "region", required = true) region: ProductCategoryRegion,
        @Parameter(description = "  Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)", schema = Schema(allowableValues = ["90", "180", "365", "730"])) @Valid @RequestParam(value = "lookback_window", required = false) lookbackWindow: ProductCategoryDetailLookbackWindow?,
        @Parameter(description = "    Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves", schema = Schema(allowableValues = ["ENGAGEMENT", "OUTBOUND_CLICK", "SAVE"])) @Valid @RequestParam(value = "engagement_type", required = false) engagementType: ProductCategoriesEngagementType?
    ): ResponseEntity<List<ProductCategoryDetails>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get a list of growing Shopping Product Categories",
        operationId = "trendsProductCategoriesTrendingList",
        description = """  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = TrendingProductCategory::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trends/product_categories/trending"
        value = [PATH_TRENDS_PRODUCT_CATEGORIES_TRENDING_LIST],
        produces = ["application/json"]
    )
    fun trendsProductCategoriesTrendingList(
        @NotNull @Parameter(description = "     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada", required = true, schema = Schema(allowableValues = ["US", "GB+IE", "CA"])) @Valid @RequestParam(value = "region", required = true) region: ProductCategoryRegion,
        @Parameter(description = "List of verticals to filter by") @Valid @RequestParam(value = "verticals", required = false) verticals: kotlin.collections.List<VerticalProductCategory>?,
        @Parameter(description = "Age to filter by. If not provided, the results will be filtered by all ages.") @Valid @RequestParam(value = "ages", required = false) ages: kotlin.collections.List<AgeTrendsBucket>?,
        @Parameter(description = "Gender to filter by, If not provided, the results will be filtered by all genders.") @Valid @RequestParam(value = "genders", required = false) genders: kotlin.collections.List<GenderBucket>?,
        @Parameter(description = "    Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves", schema = Schema(allowableValues = ["ENGAGEMENT", "OUTBOUND_CLICK", "SAVE"])) @Valid @RequestParam(value = "engagement_type", required = false) engagementType: ProductCategoriesEngagementType?
    ): ResponseEntity<List<TrendingProductCategory>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_TRENDING_KEYWORDS_LIST: String = "/trends/keywords/{region}/top/{trend_type}"
        const val PATH_TRENDS_EDITORIAL_ARTICLES_LIST: String = "/trends/editorial_articles"
        const val PATH_TRENDS_FEATURED_TOPICS_LIST: String = "/trends/topics/featured"
        const val PATH_TRENDS_PRODUCT_CATEGORIES_DETAILS_LIST: String = "/trends/product_categories/details"
        const val PATH_TRENDS_PRODUCT_CATEGORIES_TRENDING_LIST: String = "/trends/product_categories/trending"
    }
}
