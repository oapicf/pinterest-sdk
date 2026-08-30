import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ProductGroupPromotionsApi } from '../api';
import { 0 | 1 | 7 | 14 | 30 | 60, EntityStatus, Granularity, PinterestLibPaginationOrder, ProductGroupAnalyticsItems, ProductGroupPromotion, ProductGroupPromotions, ProductGroupPromotionsCreate, ProductGroupPromotionsList200Response, ProductGroupPromotionsUpdateWithRequiredBody, ReportingColumnSync, ReportingTimeZone,  } from '../models';

@Controller()
export class ProductGroupPromotionsApiController {
  constructor(private readonly productGroupPromotionsApi: ProductGroupPromotionsApi) {}

  @Post('/ad_accounts/:ad_account_id/product_group_promotions')
  productGroupPromotionsCreate(@Param('ad_account_id') adAccountId: string, @Body() productGroupPromotionsCreate: ProductGroupPromotionsCreate, @Req() request: Request): ProductGroupPromotions | Promise<ProductGroupPromotions> | Observable<ProductGroupPromotions> {
    return this.productGroupPromotionsApi.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/product_group_promotions/:product_group_promotion_id')
  productGroupPromotionsGet(@Param('ad_account_id') adAccountId: string, @Param('product_group_promotion_id') productGroupPromotionId: string, @Req() request: Request): ProductGroupPromotion | Promise<ProductGroupPromotion> | Observable<ProductGroupPromotion> {
    return this.productGroupPromotionsApi.productGroupPromotionsGet(adAccountId, productGroupPromotionId, request);
  }

  @Get('/ad_accounts/:ad_account_id/product_group_promotions')
  productGroupPromotionsList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('product_group_promotion_ids') productGroupPromotionIds: Array<string> | undefined, @Query('entity_statuses') entityStatuses: Array<EntityStatus> | undefined, @Query('ad_group_id') adGroupId: string | undefined, @Req() request: Request): ProductGroupPromotionsList200Response | Promise<ProductGroupPromotionsList200Response> | Observable<ProductGroupPromotionsList200Response> {
    return this.productGroupPromotionsApi.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId, request);
  }

  @Patch('/ad_accounts/:ad_account_id/product_group_promotions')
  productGroupPromotionsUpdate(@Param('ad_account_id') adAccountId: string, @Body() productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody, @Req() request: Request): ProductGroupPromotions | Promise<ProductGroupPromotions> | Observable<ProductGroupPromotions> {
    return this.productGroupPromotionsApi.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody, request);
  }

  @Get('/ad_accounts/:ad_account_id/product_groups/analytics')
  productGroupsAnalytics(@Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('product_group_ids') productGroupIds: Array<string>, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Param('ad_account_id') adAccountId: string, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Req() request: Request): Array<ProductGroupAnalyticsItems> | Promise<Array<ProductGroupAnalyticsItems>> | Observable<Array<ProductGroupAnalyticsItems>> {
    return this.productGroupPromotionsApi.productGroupsAnalytics(startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone, request);
  }

} 