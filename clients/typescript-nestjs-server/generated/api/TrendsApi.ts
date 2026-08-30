import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AgeTrendsBucket, FeaturedTrend, GenderBucket, InterestsEnum, ProductCategoriesEngagementType, ProductCategoryDetailLookbackWindow, ProductCategoryDetails, ProductCategoryEnum, ProductCategoryRegion, TrendingProductCategory, TrendsEditorial, VerticalProductCategory,  } from '../models';


@Injectable()
export abstract class TrendsApi {

  abstract trendsEditorialArticlesList(region: ProductCategoryRegion,  request: Request): Array<TrendsEditorial> | Promise<Array<TrendsEditorial>> | Observable<Array<TrendsEditorial>>;


  abstract trendsFeaturedTopicsList(region: ProductCategoryRegion, interest: InterestsEnum | undefined,  request: Request): Array<FeaturedTrend> | Promise<Array<FeaturedTrend>> | Observable<Array<FeaturedTrend>>;


  abstract trendsProductCategoriesDetailsList(productCategories: Array<ProductCategoryEnum>, region: ProductCategoryRegion, lookbackWindow: ProductCategoryDetailLookbackWindow | undefined, engagementType: ProductCategoriesEngagementType | undefined,  request: Request): Array<ProductCategoryDetails> | Promise<Array<ProductCategoryDetails>> | Observable<Array<ProductCategoryDetails>>;


  abstract trendsProductCategoriesTrendingList(region: ProductCategoryRegion, verticals: Array<VerticalProductCategory> | undefined, ages: Array<AgeTrendsBucket> | undefined, genders: Array<GenderBucket> | undefined, engagementType: ProductCategoriesEngagementType | undefined,  request: Request): Array<TrendingProductCategory> | Promise<Array<TrendingProductCategory>> | Observable<Array<TrendingProductCategory>>;

} 