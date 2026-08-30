package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface TrendsApiService {
      Response trendingKeywordsList(TrendsSupportedRegion region,TrendType trendType,List<TrendsL1Interest> interests,List<TrendsGenderFilter> genders,List<TrendsAgeBucket> ages,List<@Size(min = 1, max = 100)String> includeKeywords,Boolean normalizeAgainstGroup,Integer limit,Boolean includeDemographics,SecurityContext securityContext)
      throws NotFoundException;
      Response trendsEditorialArticlesList(ProductCategoryRegion region,SecurityContext securityContext)
      throws NotFoundException;
      Response trendsFeaturedTopicsList(ProductCategoryRegion region,InterestsEnum interest,SecurityContext securityContext)
      throws NotFoundException;
      Response trendsProductCategoriesDetailsList(List<ProductCategoryEnum> productCategories,ProductCategoryRegion region,ProductCategoryDetailLookbackWindow lookbackWindow,ProductCategoriesEngagementType engagementType,SecurityContext securityContext)
      throws NotFoundException;
      Response trendsProductCategoriesTrendingList(ProductCategoryRegion region,List<VerticalProductCategory> verticals,List<AgeTrendsBucket> ages,List<GenderBucket> genders,ProductCategoriesEngagementType engagementType,SecurityContext securityContext)
      throws NotFoundException;


}
