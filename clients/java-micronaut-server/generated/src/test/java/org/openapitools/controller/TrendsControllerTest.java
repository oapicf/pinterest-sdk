package org.openapitools.controller;

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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for TrendsController
 */
@MicronautTest
public class TrendsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    TrendsController controller;

    /**
     * This test is used to validate the implementation of trendsEditorialArticlesList() method
     *
     * The method should: Returns editorial articles for a given region
     *
     *   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void trendsEditorialArticlesListMethodTest() {
        // given
        ProductCategoryRegion region = ProductCategoryRegion.fromValue("US");

        // when
        List<TrendsEditorial> result = controller.trendsEditorialArticlesList(region).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/trends/editorial_articles' to the features of trendsEditorialArticlesList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void trendsEditorialArticlesListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/trends/editorial_articles").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2e254127");
        request.getParameters()
            .add("region", String.valueOf(ProductCategoryRegion.fromValue("US"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, TrendsEditorial.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of trendsFeaturedTopicsList() method
     *
     * The method should: Get featured topics
     *
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void trendsFeaturedTopicsListMethodTest() {
        // given
        ProductCategoryRegion region = ProductCategoryRegion.fromValue("US");
        InterestsEnum interest = InterestsEnum.fromValue("ALL");

        // when
        List<FeaturedTrend> result = controller.trendsFeaturedTopicsList(region, interest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/trends/topics/featured' to the features of trendsFeaturedTopicsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void trendsFeaturedTopicsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/trends/topics/featured").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@63b0d8fc");
        request.getParameters()
            .add("interest", String.valueOf(InterestsEnum.fromValue("ALL"))) // The query parameter format should be 
            .add("region", String.valueOf(ProductCategoryRegion.fromValue("US"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, FeaturedTrend.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of trendsProductCategoriesDetailsList() method
     *
     * The method should: Get product category details
     *
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void trendsProductCategoriesDetailsListMethodTest() {
        // given
        List<ProductCategoryEnum> productCategories = Arrays.asList();
        ProductCategoryRegion region = ProductCategoryRegion.fromValue("US");
        ProductCategoryDetailLookbackWindow lookbackWindow = ProductCategoryDetailLookbackWindow.fromValue("90");
        ProductCategoriesEngagementType engagementType = ProductCategoriesEngagementType.fromValue("ENGAGEMENT");

        // when
        List<ProductCategoryDetails> result = controller.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/trends/product_categories/details' to the features of trendsProductCategoriesDetailsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void trendsProductCategoriesDetailsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/trends/product_categories/details").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@28e37266");
        request.getParameters()
            .add("product_categories", Arrays.asList()) // The query format should be multi
            .add("region", String.valueOf(ProductCategoryRegion.fromValue("US"))) // The query parameter format should be 
            .add("lookback_window", String.valueOf(ProductCategoryDetailLookbackWindow.fromValue("90"))) // The query parameter format should be 
            .add("engagement_type", String.valueOf(ProductCategoriesEngagementType.fromValue("ENGAGEMENT"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, ProductCategoryDetails.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of trendsProductCategoriesTrendingList() method
     *
     * The method should: Get a list of growing Shopping Product Categories
     *
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void trendsProductCategoriesTrendingListMethodTest() {
        // given
        ProductCategoryRegion region = ProductCategoryRegion.fromValue("US");
        List<VerticalProductCategory> verticals = Arrays.asList();
        List<AgeTrendsBucket> ages = Arrays.asList();
        List<GenderBucket> genders = Arrays.asList();
        ProductCategoriesEngagementType engagementType = ProductCategoriesEngagementType.fromValue("ENGAGEMENT");

        // when
        List<TrendingProductCategory> result = controller.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/trends/product_categories/trending' to the features of trendsProductCategoriesTrendingList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void trendsProductCategoriesTrendingListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/trends/product_categories/trending").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@11d1a510");
        request.getParameters()
            .add("region", String.valueOf(ProductCategoryRegion.fromValue("US"))) // The query parameter format should be 
            .add("verticals", Arrays.asList()) // The query format should be multi
            .add("ages", Arrays.asList()) // The query format should be multi
            .add("genders", Arrays.asList()) // The query format should be multi
            .add("engagement_type", String.valueOf(ProductCategoriesEngagementType.fromValue("ENGAGEMENT"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, TrendingProductCategory.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
