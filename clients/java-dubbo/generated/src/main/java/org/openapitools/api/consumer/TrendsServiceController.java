package org.openapitools.api.consumer;

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
import org.openapitools.model.*;
import org.openapitools.api.interfaces.TrendsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/trends")
public class TrendsServiceController {

    @DubboReference
    private TrendsService trendsService;

    @RequestMapping(method = RequestMethod.GET, value = "/keywords/{region}/top/{trend_type}")
    public TrendingKeywordsResponse trendingKeywordsList(
        @RequestParam(name = "region") TrendsSupportedRegion region,
        @RequestParam(name = "trendType") TrendType trendType,
        @RequestParam(name = "interests") List<TrendsL1Interest> interests,
        @RequestParam(name = "genders") List<TrendsGenderFilter> genders,
        @RequestParam(name = "ages") List<TrendsAgeBucket> ages,
        @RequestParam(name = "includeKeywords") List<String> includeKeywords,
        @RequestParam(name = "normalizeAgainstGroup", defaultValue = "false") Boolean normalizeAgainstGroup,
        @RequestParam(name = "limit", defaultValue = "50") Integer limit,
        @RequestParam(name = "includeDemographics", defaultValue = "false") Boolean includeDemographics
    ) {
        return trendsService.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/editorial_articles")
    public List<TrendsEditorial> trendsEditorialArticlesList(
        @RequestParam(name = "region") ProductCategoryRegion region
    ) {
        return trendsService.trendsEditorialArticlesList(region);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/topics/featured")
    public List<FeaturedTrend> trendsFeaturedTopicsList(
        @RequestParam(name = "region") ProductCategoryRegion region,
        @RequestParam(name = "interest") InterestsEnum interest
    ) {
        return trendsService.trendsFeaturedTopicsList(region, interest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product_categories/details")
    public List<ProductCategoryDetails> trendsProductCategoriesDetailsList(
        @RequestParam(name = "productCategories") List<ProductCategoryEnum> productCategories,
        @RequestParam(name = "region") ProductCategoryRegion region,
        @RequestParam(name = "lookbackWindow") ProductCategoryDetailLookbackWindow lookbackWindow,
        @RequestParam(name = "engagementType") ProductCategoriesEngagementType engagementType
    ) {
        return trendsService.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product_categories/trending")
    public List<TrendingProductCategory> trendsProductCategoriesTrendingList(
        @RequestParam(name = "region") ProductCategoryRegion region,
        @RequestParam(name = "verticals") List<VerticalProductCategory> verticals,
        @RequestParam(name = "ages") List<AgeTrendsBucket> ages,
        @RequestParam(name = "genders") List<GenderBucket> genders,
        @RequestParam(name = "engagementType") ProductCategoriesEngagementType engagementType
    ) {
        return trendsService.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType);
    }
}
