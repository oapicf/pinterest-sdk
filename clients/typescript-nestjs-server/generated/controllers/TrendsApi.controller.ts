import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { TrendsApi } from '../api';
import { AgeTrendsBucket, FeaturedTrend, GenderBucket, InterestsEnum, ProductCategoriesEngagementType, ProductCategoryDetailLookbackWindow, ProductCategoryDetails, ProductCategoryEnum, ProductCategoryRegion, TrendingProductCategory, TrendsEditorial, VerticalProductCategory,  } from '../models';

@Controller()
export class TrendsApiController {
  constructor(private readonly trendsApi: TrendsApi) {}

  @Get('/trends/editorial_articles')
  trendsEditorialArticlesList(@Query('region') region: ProductCategoryRegion, @Req() request: Request): Array<TrendsEditorial> | Promise<Array<TrendsEditorial>> | Observable<Array<TrendsEditorial>> {
    return this.trendsApi.trendsEditorialArticlesList(region, request);
  }

  @Get('/trends/topics/featured')
  trendsFeaturedTopicsList(@Query('region') region: ProductCategoryRegion, @Query('interest') interest: InterestsEnum | undefined, @Req() request: Request): Array<FeaturedTrend> | Promise<Array<FeaturedTrend>> | Observable<Array<FeaturedTrend>> {
    return this.trendsApi.trendsFeaturedTopicsList(region, interest, request);
  }

  @Get('/trends/product_categories/details')
  trendsProductCategoriesDetailsList(@Query('product_categories') productCategories: Array<ProductCategoryEnum>, @Query('region') region: ProductCategoryRegion, @Query('lookback_window') lookbackWindow: ProductCategoryDetailLookbackWindow | undefined, @Query('engagement_type') engagementType: ProductCategoriesEngagementType | undefined, @Req() request: Request): Array<ProductCategoryDetails> | Promise<Array<ProductCategoryDetails>> | Observable<Array<ProductCategoryDetails>> {
    return this.trendsApi.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType, request);
  }

  @Get('/trends/product_categories/trending')
  trendsProductCategoriesTrendingList(@Query('region') region: ProductCategoryRegion, @Query('verticals') verticals: Array<VerticalProductCategory> | undefined, @Query('ages') ages: Array<AgeTrendsBucket> | undefined, @Query('genders') genders: Array<GenderBucket> | undefined, @Query('engagement_type') engagementType: ProductCategoriesEngagementType | undefined, @Req() request: Request): Array<TrendingProductCategory> | Promise<Array<TrendingProductCategory>> | Observable<Array<TrendingProductCategory>> {
    return this.trendsApi.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType, request);
  }

} 