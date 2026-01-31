package org.openapitools.api;

import org.openapitools.api.TrendsApiService;
import org.openapitools.api.factories.TrendsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AgeTrendsBucket;
import org.openapitools.model.Error;
import org.openapitools.model.FeaturedTrend;
import org.openapitools.model.GenderBucket;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductCategoriesEngagementType;
import org.openapitools.model.ProductCategoryDetailLookbackWindow;
import org.openapitools.model.ProductCategoryDetails;
import org.openapitools.model.ProductCategoryEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
import org.openapitools.model.TrendingProductCategory;
import org.openapitools.model.TrendsSupportedRegion;
import org.openapitools.model.VerticalProductCategory;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/trends")


@io.swagger.annotations.Api(description = "the trends API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendsApi  {
   private final TrendsApiService delegate;

   public TrendsApi(@Context ServletConfig servletContext) {
      TrendsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TrendsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TrendsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TrendsApiServiceFactory.getTrendsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/keywords/{region}/top/{trend_type}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List trending keywords", notes = "<p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>. ", response = TrendingKeywordsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = TrendingKeywordsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid trending keywords request parameters", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response trendingKeywordsList(@ApiParam(value = "The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia", required = true, allowableValues="US, CA, DE, FR, ES, IT, DE+AT+CH, GB+IE, IT+ES+PT+GR+MT, PL+RO+HU+SK+CZ, SE+DK+FI+NO, NL+BE+LU, AR, BR, CO, MX, MX+AR+CO+CL, AU+NZ") @PathParam("region") @NotNull  TrendsSupportedRegion region,@ApiParam(value = "The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)", required = true, allowableValues="growing, monthly, yearly, seasonal") @PathParam("trend_type") @NotNull  TrendType trendType,@ApiParam(value = "If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion") @QueryParam("interests")  List<String> interests,@ApiParam(value = "If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.") @QueryParam("genders")  List<String> genders,@ApiParam(value = "If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.") @QueryParam("ages")  List<String> ages,@ApiParam(value = "If set, filters the results to top trends which include at least one of the specified keywords.<br /> If unset, no keyword filtering logic is applied.") @QueryParam("include_keywords")  @Size(min=1,max=50) List<@Size(min = 1, max = 100)String> includeKeywords,@ApiParam(value = "Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.", defaultValue = "false") @DefaultValue("false") @QueryParam("normalize_against_group")  Boolean normalizeAgainstGroup,@ApiParam(value = "The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.", defaultValue = "50") @DefaultValue("50") @QueryParam("limit")  @Min(1) @Max(50) Integer limit,@ApiParam(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> Including predicted weekly search volume data for the next 90 days. By default (`false`), the response will not include predicted data.", defaultValue = "false") @DefaultValue("false") @QueryParam("include_prediction")  Boolean includePrediction,@ApiParam(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.", defaultValue = "false") @DefaultValue("false") @QueryParam("include_demographics")  Boolean includeDemographics,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includePrediction, includeDemographics, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/topics/featured")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get featured topics", notes = "  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.", response = FeaturedTrend.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "product_categories", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = FeaturedTrend.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response trendsFeaturedTopicsList(@ApiParam(value = "      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada", required = true, allowableValues="US, GB+IE, CA") @QueryParam("region") @NotNull  ProductCategoryRegion region,@ApiParam(value = "Interest to filter by", allowableValues="ALL, ANIMALS, ARCHITECTURE, ART, BEAUTY, DIY_AND_CRAFTS, EDUCATION, EVENT_PLANNING, FASHION, FOOD_AND_DRINKS, GARDENING, HEALTH, HOME_DECOR, PARENTING, TRAVEL, WEDDING") @QueryParam("interest")  InterestsEnum interest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trendsFeaturedTopicsList(region, interest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/product_categories/details")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product category details", notes = "  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories", response = ProductCategoryDetails.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "product_categories", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ProductCategoryDetails.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response trendsProductCategoriesDetailsList(@ApiParam(value = "List of product categories", required = true) @QueryParam("product_categories") @NotNull  @Size(min=1,max=20) List<ProductCategoryEnum> productCategories,@ApiParam(value = "      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada", required = true, allowableValues="US, GB+IE, CA") @QueryParam("region") @NotNull  ProductCategoryRegion region,@ApiParam(value = "   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)", allowableValues="90, 180, 365, 730") @QueryParam("lookback_window")  ProductCategoryDetailLookbackWindow lookbackWindow,@ApiParam(value = "     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves", allowableValues="ENGAGEMENT, OUTBOUND_CLICK, SAVE") @QueryParam("engagement_type")  ProductCategoriesEngagementType engagementType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/product_categories/trending")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a list of growing Shopping Product Categories", notes = "  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.", response = TrendingProductCategory.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "product_categories", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TrendingProductCategory.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response trendsProductCategoriesTrendingList(@ApiParam(value = "      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada", required = true, allowableValues="US, GB+IE, CA") @QueryParam("region") @NotNull  ProductCategoryRegion region,@ApiParam(value = "List of verticals to filter by") @QueryParam("verticals")  List<VerticalProductCategory> verticals,@ApiParam(value = "Age to filter by. If not provided, the results will be filtered by all ages.") @QueryParam("ages")  List<AgeTrendsBucket> ages,@ApiParam(value = "Gender to filter by, If not provided, the results will be filtered by all genders.") @QueryParam("genders")  List<GenderBucket> genders,@ApiParam(value = "     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves", allowableValues="ENGAGEMENT, OUTBOUND_CLICK, SAVE") @QueryParam("engagement_type")  ProductCategoriesEngagementType engagementType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType, securityContext);
    }
}
