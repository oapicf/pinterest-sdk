import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { 0 | 1 | 7 | 14 | 30 | 60, EntityStatus, Granularity, PinterestLibPaginationOrder, ProductGroupAnalyticsItems, ProductGroupPromotion, ProductGroupPromotions, ProductGroupPromotionsCreate, ProductGroupPromotionsList200Response, ProductGroupPromotionsUpdateWithRequiredBody, ReportingColumnSync, ReportingTimeZone,  } from '../models';


@Injectable()
export abstract class ProductGroupPromotionsApi {

  abstract productGroupPromotionsCreate(adAccountId: string, productGroupPromotionsCreate: ProductGroupPromotionsCreate,  request: Request): ProductGroupPromotions | Promise<ProductGroupPromotions> | Observable<ProductGroupPromotions>;


  abstract productGroupPromotionsGet(adAccountId: string, productGroupPromotionId: string,  request: Request): ProductGroupPromotion | Promise<ProductGroupPromotion> | Observable<ProductGroupPromotion>;


  abstract productGroupPromotionsList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, productGroupPromotionIds: Array<string> | undefined, entityStatuses: Array<EntityStatus> | undefined, adGroupId: string | undefined,  request: Request): ProductGroupPromotionsList200Response | Promise<ProductGroupPromotionsList200Response> | Observable<ProductGroupPromotionsList200Response>;


  abstract productGroupPromotionsUpdate(adAccountId: string, productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody,  request: Request): ProductGroupPromotions | Promise<ProductGroupPromotions> | Observable<ProductGroupPromotions>;


  abstract productGroupsAnalytics(startDate: string, endDate: string, productGroupIds: Array<string>, columns: Array<ReportingColumnSync>, granularity: Granularity, adAccountId: string, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, reportingTimezone: ReportingTimeZone | undefined,  request: Request): Array<ProductGroupAnalyticsItems> | Promise<Array<ProductGroupAnalyticsItems>> | Observable<Array<ProductGroupAnalyticsItems>>;

} 