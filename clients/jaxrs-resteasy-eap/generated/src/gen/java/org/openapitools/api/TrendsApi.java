package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AgeTrendsBucket;
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
import org.openapitools.model.TrendsAgeBucket;
import org.openapitools.model.TrendsEditorial;
import org.openapitools.model.TrendsGenderFilter;
import org.openapitools.model.TrendsL1Interest;
import org.openapitools.model.TrendsSupportedRegion;
import org.openapitools.model.VerticalProductCategory;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/trends")


@io.swagger.annotations.Api(description = "the trends API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface TrendsApi  {

    @GET
    @Path("/keywords/{region}/top/{trend_type}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List trending keywords", notes = "Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).", response = TrendingKeywordsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TrendingKeywordsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response trendingKeywordsList( @PathParam("region") TrendsSupportedRegion region, @PathParam("trend_type") TrendType trendType, @QueryParam("interests") List<TrendsL1Interest> interests, @QueryParam("genders") List<TrendsGenderFilter> genders, @QueryParam("ages") List<TrendsAgeBucket> ages, @Size(min=1,max=50) @QueryParam("include_keywords") List<@Size(min = 1, max = 100)String> includeKeywords, @DefaultValue("false") @QueryParam("normalize_against_group") Boolean normalizeAgainstGroup, @Min(1) @Max(50) @DefaultValue("50") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("include_demographics") Boolean includeDemographics,@Context SecurityContext securityContext);
    @GET
    @Path("/editorial_articles")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns editorial articles for a given region", notes = "  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.", response = TrendsEditorial.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "trends", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TrendsEditorial.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response trendsEditorialArticlesList( @NotNull, allowableValues="US, GB+IE, CA" @QueryParam("region") ProductCategoryRegion region,@Context SecurityContext securityContext);
    @GET
    @Path("/topics/featured")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get featured topics", notes = "  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.", response = FeaturedTrend.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "trends", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = FeaturedTrend.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response trendsFeaturedTopicsList( @NotNull, allowableValues="US, GB+IE, CA" @QueryParam("region") ProductCategoryRegion region,, allowableValues="ALL, ANIMALS, ARCHITECTURE, ART, BEAUTY, DIY_AND_CRAFTS, EDUCATION, EVENT_PLANNING, FASHION, FOOD_AND_DRINKS, GARDENING, HEALTH, HOME_DECOR, PARENTING, TRAVEL, WEDDING" @QueryParam("interest") InterestsEnum interest,@Context SecurityContext securityContext);
    @GET
    @Path("/product_categories/details")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product category details", notes = "  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories", response = ProductCategoryDetails.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "trends", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ProductCategoryDetails.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response trendsProductCategoriesDetailsList( @NotNull @Size(min=1,max=20) @QueryParam("product_categories") List<ProductCategoryEnum> productCategories, @NotNull, allowableValues="US, GB+IE, CA" @QueryParam("region") ProductCategoryRegion region,, allowableValues="90, 180, 365, 730" @QueryParam("lookback_window") ProductCategoryDetailLookbackWindow lookbackWindow,, allowableValues="ENGAGEMENT, OUTBOUND_CLICK, SAVE" @QueryParam("engagement_type") ProductCategoriesEngagementType engagementType,@Context SecurityContext securityContext);
    @GET
    @Path("/product_categories/trending")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a list of growing Shopping Product Categories", notes = "  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.", response = TrendingProductCategory.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "trends", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TrendingProductCategory.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response trendsProductCategoriesTrendingList( @NotNull, allowableValues="US, GB+IE, CA" @QueryParam("region") ProductCategoryRegion region, @QueryParam("verticals") List<VerticalProductCategory> verticals, @QueryParam("ages") List<AgeTrendsBucket> ages, @QueryParam("genders") List<GenderBucket> genders,, allowableValues="ENGAGEMENT, OUTBOUND_CLICK, SAVE" @QueryParam("engagement_type") ProductCategoriesEngagementType engagementType,@Context SecurityContext securityContext);
}
