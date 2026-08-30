import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AdGroupsApi } from '../api';
import { 0 | 1 | 7 | 14 | 30 | 60, AdGroup, AdGroupAudienceSizing, AdGroupAudienceSizingCreate, AdGroupCreateCreate, AdGroupUpdateBatchUpdate, AdGroupsAnalyticsMetrics, AdGroupsCreate200Response, AdGroupsList200Response, AdsAnalyticsAdGroupTargetingType, BidFloor, BidFloorCreate, ConversionReportAttributionType, DynamicTitlesDownloadCSV, DynamicTitlesGetStatus, DynamicTitlesProcessCSV, DynamicTitlesProcessCSVCreate, DynamicTitlesUploadURL, EntityStatus, Granularity, MetricsResponse, PinterestLibPaginationOrder, ReportingColumnSync, ReportingTimeZone,  } from '../models';

@Controller()
export class AdGroupsApiController {
  constructor(private readonly adGroupsApi: AdGroupsApi) {}

  @Get('/ad_accounts/:ad_account_id/ad_groups/analytics')
  adGroupsAnalytics(@Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('ad_group_ids') adGroupIds: Array<string>, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Param('ad_account_id') adAccountId: string, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Query('aggregate_report_rows', new DefaultValuePipe(false)) aggregateReportRows: boolean | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Req() request: Request): Array<AdGroupsAnalyticsMetrics> | Promise<Array<AdGroupsAnalyticsMetrics>> | Observable<Array<AdGroupsAnalyticsMetrics>> {
    return this.adGroupsApi.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone, request);
  }

  @Post('/ad_accounts/:ad_account_id/ad_groups/audience_sizing')
  adGroupsAudienceSizing(@Param('ad_account_id') adAccountId: string, @Body() adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate, @Req() request: Request): AdGroupAudienceSizing | Promise<AdGroupAudienceSizing> | Observable<AdGroupAudienceSizing> {
    return this.adGroupsApi.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate, request);
  }

  @Post('/ad_accounts/:ad_account_id/bid_floor')
  adGroupsBidFloorGet(@Param('ad_account_id') adAccountId: string, @Body() bidFloorCreate: BidFloorCreate, @Req() request: Request): BidFloor | Promise<BidFloor> | Observable<BidFloor> {
    return this.adGroupsApi.adGroupsBidFloorGet(adAccountId, bidFloorCreate, request);
  }

  @Post('/ad_accounts/:ad_account_id/ad_groups')
  adGroupsCreate(@Param('ad_account_id') adAccountId: string, @Body() adGroupCreateCreate: Array<AdGroupCreateCreate>, @Req() request: Request): AdGroupsCreate200Response | Promise<AdGroupsCreate200Response> | Observable<AdGroupsCreate200Response> {
    return this.adGroupsApi.adGroupsCreate(adAccountId, adGroupCreateCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/ad_groups/:ad_group_id/dynamic_titles/csv')
  adGroupsDynamicTitlesDownloadCsv(@Param('ad_account_id') adAccountId: string, @Param('ad_group_id') adGroupId: string, @Req() request: Request): DynamicTitlesDownloadCSV | Promise<DynamicTitlesDownloadCSV> | Observable<DynamicTitlesDownloadCSV> {
    return this.adGroupsApi.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId, request);
  }

  @Get('/ad_accounts/:ad_account_id/ad_groups/:ad_group_id/dynamic_titles/status')
  adGroupsDynamicTitlesGetStatus(@Param('ad_account_id') adAccountId: string, @Param('ad_group_id') adGroupId: string, @Req() request: Request): DynamicTitlesGetStatus | Promise<DynamicTitlesGetStatus> | Observable<DynamicTitlesGetStatus> {
    return this.adGroupsApi.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId, request);
  }

  @Get('/ad_accounts/:ad_account_id/ad_groups/:ad_group_id/dynamic_titles/uploads')
  adGroupsDynamicTitlesGetUploadUrl(@Param('ad_account_id') adAccountId: string, @Param('ad_group_id') adGroupId: string, @Req() request: Request): DynamicTitlesUploadURL | Promise<DynamicTitlesUploadURL> | Observable<DynamicTitlesUploadURL> {
    return this.adGroupsApi.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId, request);
  }

  @Post('/ad_accounts/:ad_account_id/ad_groups/:ad_group_id/dynamic_titles')
  adGroupsDynamicTitlesProcessCsv(@Param('ad_account_id') adAccountId: string, @Param('ad_group_id') adGroupId: string, @Body() dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate, @Req() request: Request): DynamicTitlesProcessCSV | Promise<DynamicTitlesProcessCSV> | Observable<DynamicTitlesProcessCSV> {
    return this.adGroupsApi.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/ad_groups/:ad_group_id')
  adGroupsGet(@Param('ad_group_id') adGroupId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): AdGroup | Promise<AdGroup> | Observable<AdGroup> {
    return this.adGroupsApi.adGroupsGet(adGroupId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/ad_groups')
  adGroupsList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('campaign_ids') campaignIds: Array<string> | undefined, @Query('ad_group_ids') adGroupIds: Array<string> | undefined, @Query('entity_statuses') entityStatuses: Array<EntityStatus> | undefined, @Query('translate_interests_to_names', new DefaultValuePipe(false)) translateInterestsToNames: boolean | undefined, @Req() request: Request): AdGroupsList200Response | Promise<AdGroupsList200Response> | Observable<AdGroupsList200Response> {
    return this.adGroupsApi.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames, request);
  }

  @Get('/ad_accounts/:ad_account_id/ad_groups/targeting_analytics')
  adGroupsTargetingAnalyticsGet(@Param('ad_account_id') adAccountId: string, @Query('ad_group_ids') adGroupIds: Array<string>, @Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('targeting_types') targetingTypes: Array<AdsAnalyticsAdGroupTargetingType>, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Query('attribution_types') attributionTypes: Array<ConversionReportAttributionType> | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Query('sort_columns') sortColumns: Array<string> | undefined, @Query('sort_ascending') sortAscending: boolean | undefined, @Req() request: Request): MetricsResponse | Promise<MetricsResponse> | Observable<MetricsResponse> {
    return this.adGroupsApi.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending, request);
  }

  @Patch('/ad_accounts/:ad_account_id/ad_groups')
  adGroupsUpdate(@Param('ad_account_id') adAccountId: string, @Body() adGroupUpdateBatchUpdate: Array<AdGroupUpdateBatchUpdate>, @Req() request: Request): AdGroupsCreate200Response | Promise<AdGroupsCreate200Response> | Observable<AdGroupsCreate200Response> {
    return this.adGroupsApi.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate, request);
  }

  @Get('/ad_accounts/:ad_account_id/promotion_applied_entities')
  getAdGroupsByPromotionIdsList(@Param('ad_account_id') adAccountId: string, @Query('promotion_ids') promotionIds: Array<string>, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Req() request: Request): AdGroupsList200Response | Promise<AdGroupsList200Response> | Observable<AdGroupsList200Response> {
    return this.adGroupsApi.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order, request);
  }

} 