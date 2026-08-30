import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AdsApi } from '../api';
import { 0 | 1 | 7 | 14 | 30 | 60, Ad, AdBatchUpdate, AdBatchWriteResponseModel, AdCreate, AdPreviewRequest, AdPreviewURLResponse, AdsAnalytics, AdsAnalyticsAdTargetingType, AdsList200Response, CampaignAdPreview, CampaignAdPreviewCreate, CampaignAdPreviewCreate200ResponseInner, CampaignAdPreviewDelete200ResponseInner, ConversionAttributionWindowDays, ConversionReportAttributionType, ConversionReportTimeType, EntityStatus, Granularity, MetricsResponse, PinterestLibPaginationOrder, ReportingColumnSync, ReportingTimeZone,  } from '../models';

@Controller()
export class AdsApiController {
  constructor(private readonly adsApi: AdsApi) {}

  @Post('/ad_accounts/:ad_account_id/ad_previews')
  adPreviewsCreate(@Param('ad_account_id') adAccountId: string, @Body() adPreviewRequest: AdPreviewRequest, @Req() request: Request): AdPreviewURLResponse | Promise<AdPreviewURLResponse> | Observable<AdPreviewURLResponse> {
    return this.adsApi.adPreviewsCreate(adAccountId, adPreviewRequest, request);
  }

  @Get('/ad_accounts/:ad_account_id/ads/targeting_analytics')
  adTargetingAnalyticsGet(@Param('ad_account_id') adAccountId: string, @Query('ad_ids') adIds: Array<string>, @Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('targeting_types') targetingTypes: Array<AdsAnalyticsAdTargetingType>, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Query('click_window_days') clickWindowDays: ConversionAttributionWindowDays | undefined, @Query('engagement_window_days') engagementWindowDays: ConversionAttributionWindowDays | undefined, @Query('view_window_days') viewWindowDays: ConversionAttributionWindowDays | undefined, @Query('conversion_report_time') conversionReportTime: ConversionReportTimeType | undefined, @Query('attribution_types') attributionTypes: Array<ConversionReportAttributionType> | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Query('sort_columns') sortColumns: Array<string> | undefined, @Query('sort_ascending') sortAscending: boolean | undefined, @Req() request: Request): MetricsResponse | Promise<MetricsResponse> | Observable<MetricsResponse> {
    return this.adsApi.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending, request);
  }

  @Get('/ad_accounts/:ad_account_id/ads/analytics')
  adsAnalytics(@Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Param('ad_account_id') adAccountId: string, @Query('pin_ids') pinIds: Array<string> | undefined, @Query('ad_ids') adIds: Array<string> | undefined, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Query('campaign_ids') campaignIds: Array<string> | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Req() request: Request): Array<AdsAnalytics> | Promise<Array<AdsAnalytics>> | Observable<Array<AdsAnalytics>> {
    return this.adsApi.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone, request);
  }

  @Post('/ad_accounts/:ad_account_id/ads')
  adsCreate(@Param('ad_account_id') adAccountId: string, @Body() adCreate: Array<AdCreate>, @Req() request: Request): AdBatchWriteResponseModel | Promise<AdBatchWriteResponseModel> | Observable<AdBatchWriteResponseModel> {
    return this.adsApi.adsCreate(adAccountId, adCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/ads/:ad_id')
  adsGet(@Param('ad_id') adId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): Ad | Promise<Ad> | Observable<Ad> {
    return this.adsApi.adsGet(adId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/ads')
  adsList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('campaign_ids') campaignIds: Array<string> | undefined, @Query('ad_group_ids') adGroupIds: Array<string> | undefined, @Query('ad_ids') adIds: Array<string> | undefined, @Query('entity_statuses') entityStatuses: Array<EntityStatus> | undefined, @Req() request: Request): AdsList200Response | Promise<AdsList200Response> | Observable<AdsList200Response> {
    return this.adsApi.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses, request);
  }

  @Patch('/ad_accounts/:ad_account_id/ads')
  adsUpdate(@Param('ad_account_id') adAccountId: string, @Body() adBatchUpdate: Array<AdBatchUpdate>, @Req() request: Request): AdBatchWriteResponseModel | Promise<AdBatchWriteResponseModel> | Observable<AdBatchWriteResponseModel> {
    return this.adsApi.adsUpdate(adAccountId, adBatchUpdate, request);
  }

  @Post('/ad_accounts/:ad_account_id/campaign_ad_preview')
  campaignAdPreviewCreate(@Param('ad_account_id') adAccountId: string, @Body() campaignAdPreviewCreate: Array<CampaignAdPreviewCreate>, @Req() request: Request): Array<CampaignAdPreviewCreate200ResponseInner> | Promise<Array<CampaignAdPreviewCreate200ResponseInner>> | Observable<Array<CampaignAdPreviewCreate200ResponseInner>> {
    return this.adsApi.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate, request);
  }

  @Delete('/ad_accounts/:ad_account_id/campaign_ad_preview')
  campaignAdPreviewDelete(@Query('ad_group_ids') adGroupIds: Array<string>, @Param('ad_account_id') adAccountId: string, @Req() request: Request): Array<CampaignAdPreviewDelete200ResponseInner> | Promise<Array<CampaignAdPreviewDelete200ResponseInner>> | Observable<Array<CampaignAdPreviewDelete200ResponseInner>> {
    return this.adsApi.campaignAdPreviewDelete(adGroupIds, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/campaign_ad_preview')
  campaignAdPreviewRead(@Query('ad_group_ids') adGroupIds: Array<string>, @Param('ad_account_id') adAccountId: string, @Req() request: Request): Array<CampaignAdPreview> | Promise<Array<CampaignAdPreview>> | Observable<Array<CampaignAdPreview>> {
    return this.adsApi.campaignAdPreviewRead(adGroupIds, adAccountId, request);
  }

} 