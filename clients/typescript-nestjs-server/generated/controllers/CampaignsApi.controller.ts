import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CampaignsApi } from '../api';
import { 0 | 1 | 7 | 14 | 30 | 60, AdPinAnalytics, AdsAnalyticsCampaignTargetingType, Campaign, CampaignBatchUpdateItem, CampaignBatchWriteResponseModel, CampaignCreateItem, CampaignDeliveryEstimatesCampaign, CampaignDeliveryEstimatesResponse, CampaignsAnalyticsMetrics, CampaignsList200Response, ConversionReportAttributionType, EntityStatus, Granularity, MetricsResponse, PinterestLibPaginationOrder, ReportingColumnSync, ReportingTimeZone,  } from '../models';

@Controller()
export class CampaignsApiController {
  constructor(private readonly campaignsApi: CampaignsApi) {}

  @Get('/ad_accounts/:ad_account_id/pins/analytics')
  adPinsAnalytics(@Query('campaign_id') campaignId: string, @Query('pin_ids') pinIds: Array<string>, @Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Param('ad_account_id') adAccountId: string, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Req() request: Request): Array<AdPinAnalytics> | Promise<Array<AdPinAnalytics>> | Observable<Array<AdPinAnalytics>> {
    return this.campaignsApi.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, request);
  }

  @Get('/ad_accounts/:ad_account_id/campaigns/targeting_analytics')
  campaignTargetingAnalyticsGet(@Param('ad_account_id') adAccountId: string, @Query('campaign_ids') campaignIds: Array<string>, @Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('targeting_types') targetingTypes: Array<AdsAnalyticsCampaignTargetingType>, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Query('attribution_types') attributionTypes: Array<ConversionReportAttributionType> | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Req() request: Request): MetricsResponse | Promise<MetricsResponse> | Observable<MetricsResponse> {
    return this.campaignsApi.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, request);
  }

  @Get('/ad_accounts/:ad_account_id/campaigns/analytics')
  campaignsAnalytics(@Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('campaign_ids') campaignIds: Array<string>, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Param('ad_account_id') adAccountId: string, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Query('aggregate_report_rows', new DefaultValuePipe(false)) aggregateReportRows: boolean | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Req() request: Request): Array<CampaignsAnalyticsMetrics> | Promise<Array<CampaignsAnalyticsMetrics>> | Observable<Array<CampaignsAnalyticsMetrics>> {
    return this.campaignsApi.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone, request);
  }

  @Post('/ad_accounts/:ad_account_id/campaigns')
  campaignsCreate(@Param('ad_account_id') adAccountId: string, @Body() campaignCreateItem: Array<CampaignCreateItem>, @Req() request: Request): CampaignBatchWriteResponseModel | Promise<CampaignBatchWriteResponseModel> | Observable<CampaignBatchWriteResponseModel> {
    return this.campaignsApi.campaignsCreate(adAccountId, campaignCreateItem, request);
  }

  @Get('/ad_accounts/:ad_account_id/campaigns/:campaign_id')
  campaignsGet(@Param('campaign_id') campaignId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): Campaign | Promise<Campaign> | Observable<Campaign> {
    return this.campaignsApi.campaignsGet(campaignId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/campaigns')
  campaignsList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('campaign_ids') campaignIds: Array<string> | undefined, @Query('entity_statuses') entityStatuses: Array<EntityStatus> | undefined, @Req() request: Request): CampaignsList200Response | Promise<CampaignsList200Response> | Observable<CampaignsList200Response> {
    return this.campaignsApi.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses, request);
  }

  @Patch('/ad_accounts/:ad_account_id/campaigns')
  campaignsUpdate(@Param('ad_account_id') adAccountId: string, @Body() campaignBatchUpdateItem: Array<CampaignBatchUpdateItem>, @Req() request: Request): CampaignBatchWriteResponseModel | Promise<CampaignBatchWriteResponseModel> | Observable<CampaignBatchWriteResponseModel> {
    return this.campaignsApi.campaignsUpdate(adAccountId, campaignBatchUpdateItem, request);
  }

  @Post('/ad_accounts/:ad_account_id/campaigns/delivery_estimates')
  getCampaignDeliveryEstimates(@Param('ad_account_id') adAccountId: string, @Body() campaignDeliveryEstimatesCampaign: Array<CampaignDeliveryEstimatesCampaign>, @Req() request: Request): CampaignDeliveryEstimatesResponse | Promise<CampaignDeliveryEstimatesResponse> | Observable<CampaignDeliveryEstimatesResponse> {
    return this.campaignsApi.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign, request);
  }

} 