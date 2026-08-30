package org.openapitools.api;

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
import org.openapitools.model.TrendingProductCategory;
import org.openapitools.model.TrendsEditorial;
import org.openapitools.model.VerticalProductCategory;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/trends")
@Api(value = "/", description = "")
public interface TrendsApi  {

    /**
     * Returns editorial articles for a given region
     *
     *   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
     *
     */
    @GET
    @Path("/editorial_articles")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns editorial articles for a given region", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = TrendsEditorial.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<TrendsEditorial> trendsEditorialArticlesList(@QueryParam("region") ProductCategoryRegion region);

    /**
     * Get featured topics
     *
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     *
     */
    @GET
    @Path("/topics/featured")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get featured topics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = FeaturedTrend.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<FeaturedTrend> trendsFeaturedTopicsList(@QueryParam("region") ProductCategoryRegion region, @QueryParam("interest") InterestsEnum interest);

    /**
     * Get product category details
     *
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     *
     */
    @GET
    @Path("/product_categories/details")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product category details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ProductCategoryDetails.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<ProductCategoryDetails> trendsProductCategoriesDetailsList(@QueryParam("product_categories") List<ProductCategoryEnum> productCategories, @QueryParam("region") ProductCategoryRegion region, @QueryParam("lookback_window") ProductCategoryDetailLookbackWindow lookbackWindow, @QueryParam("engagement_type") ProductCategoriesEngagementType engagementType);

    /**
     * Get a list of growing Shopping Product Categories
     *
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     *
     */
    @GET
    @Path("/product_categories/trending")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a list of growing Shopping Product Categories", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = TrendingProductCategory.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<TrendingProductCategory> trendsProductCategoriesTrendingList(@QueryParam("region") ProductCategoryRegion region, @QueryParam("verticals") List<VerticalProductCategory> verticals, @QueryParam("ages") List<AgeTrendsBucket> ages, @QueryParam("genders") List<GenderBucket> genders, @QueryParam("engagement_type") ProductCategoriesEngagementType engagementType);
}
