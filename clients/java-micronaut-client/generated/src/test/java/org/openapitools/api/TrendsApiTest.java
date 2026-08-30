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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for TrendsApi
 */
@MicronautTest
public class TrendsApiTest {

    @Inject
    TrendsApi api;

    
    /**
     * Returns editorial articles for a given region
     *
     *   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
     */
    @Test
    @Disabled("Not Implemented")
    public void trendsEditorialArticlesListTest() {
        // given
        ProductCategoryRegion region = ProductCategoryRegion.fromValue("US");

        // when
        List<TrendsEditorial> body = api.trendsEditorialArticlesList(region).block();

        // then
        // TODO implement the trendsEditorialArticlesListTest()
    }

    
    /**
     * Get featured topics
     *
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     */
    @Test
    @Disabled("Not Implemented")
    public void trendsFeaturedTopicsListTest() {
        // given
        ProductCategoryRegion region = ProductCategoryRegion.fromValue("US");
        InterestsEnum interest = InterestsEnum.fromValue("ALL");

        // when
        List<FeaturedTrend> body = api.trendsFeaturedTopicsList(region, interest).block();

        // then
        // TODO implement the trendsFeaturedTopicsListTest()
    }

    
    /**
     * Get product category details
     *
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     */
    @Test
    @Disabled("Not Implemented")
    public void trendsProductCategoriesDetailsListTest() {
        // given
        List<ProductCategoryEnum> productCategories = Arrays.asList();
        ProductCategoryRegion region = ProductCategoryRegion.fromValue("US");
        ProductCategoryDetailLookbackWindow lookbackWindow = ProductCategoryDetailLookbackWindow.fromValue("90");
        ProductCategoriesEngagementType engagementType = ProductCategoriesEngagementType.fromValue("ENGAGEMENT");

        // when
        List<ProductCategoryDetails> body = api.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType).block();

        // then
        // TODO implement the trendsProductCategoriesDetailsListTest()
    }

    
    /**
     * Get a list of growing Shopping Product Categories
     *
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     */
    @Test
    @Disabled("Not Implemented")
    public void trendsProductCategoriesTrendingListTest() {
        // given
        ProductCategoryRegion region = ProductCategoryRegion.fromValue("US");
        List<VerticalProductCategory> verticals = Arrays.asList();
        List<AgeTrendsBucket> ages = Arrays.asList();
        List<GenderBucket> genders = Arrays.asList();
        ProductCategoriesEngagementType engagementType = ProductCategoriesEngagementType.fromValue("ENGAGEMENT");

        // when
        List<TrendingProductCategory> body = api.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType).block();

        // then
        // TODO implement the trendsProductCategoriesTrendingListTest()
    }

    
}
