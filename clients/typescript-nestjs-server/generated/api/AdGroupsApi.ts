import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { 0 | 1 | 7 | 14 | 30 | 60, AdGroup, AdGroupAudienceSizing, AdGroupAudienceSizingCreate, AdGroupCreateCreate, AdGroupUpdateBatchUpdate, AdGroupsAnalyticsMetrics, AdGroupsCreate200Response, AdGroupsList200Response, AdsAnalyticsAdGroupTargetingType, BidFloor, BidFloorCreate, ConversionReportAttributionType, DynamicTitlesDownloadCSV, DynamicTitlesGetStatus, DynamicTitlesProcessCSV, DynamicTitlesProcessCSVCreate, DynamicTitlesUploadURL, EntityStatus, Granularity, MetricsResponse, PinterestLibPaginationOrder, ReportingColumnSync, ReportingTimeZone,  } from '../models';


@Injectable()
export abstract class AdGroupsApi {

  abstract adGroupsAnalytics(startDate: string, endDate: string, adGroupIds: Array<string>, columns: Array<ReportingColumnSync>, granularity: Granularity, adAccountId: string, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, aggregateReportRows: boolean | undefined, reportingTimezone: ReportingTimeZone | undefined,  request: Request): Array<AdGroupsAnalyticsMetrics> | Promise<Array<AdGroupsAnalyticsMetrics>> | Observable<Array<AdGroupsAnalyticsMetrics>>;


  abstract adGroupsAudienceSizing(adAccountId: string, adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate,  request: Request): AdGroupAudienceSizing | Promise<AdGroupAudienceSizing> | Observable<AdGroupAudienceSizing>;


  abstract adGroupsBidFloorGet(adAccountId: string, bidFloorCreate: BidFloorCreate,  request: Request): BidFloor | Promise<BidFloor> | Observable<BidFloor>;


  abstract adGroupsCreate(adAccountId: string, adGroupCreateCreate: Array<AdGroupCreateCreate>,  request: Request): AdGroupsCreate200Response | Promise<AdGroupsCreate200Response> | Observable<AdGroupsCreate200Response>;


  abstract adGroupsDynamicTitlesDownloadCsv(adAccountId: string, adGroupId: string,  request: Request): DynamicTitlesDownloadCSV | Promise<DynamicTitlesDownloadCSV> | Observable<DynamicTitlesDownloadCSV>;


  abstract adGroupsDynamicTitlesGetStatus(adAccountId: string, adGroupId: string,  request: Request): DynamicTitlesGetStatus | Promise<DynamicTitlesGetStatus> | Observable<DynamicTitlesGetStatus>;


  abstract adGroupsDynamicTitlesGetUploadUrl(adAccountId: string, adGroupId: string,  request: Request): DynamicTitlesUploadURL | Promise<DynamicTitlesUploadURL> | Observable<DynamicTitlesUploadURL>;


  abstract adGroupsDynamicTitlesProcessCsv(adAccountId: string, adGroupId: string, dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate,  request: Request): DynamicTitlesProcessCSV | Promise<DynamicTitlesProcessCSV> | Observable<DynamicTitlesProcessCSV>;


  abstract adGroupsGet(adGroupId: string, adAccountId: string,  request: Request): AdGroup | Promise<AdGroup> | Observable<AdGroup>;


  abstract adGroupsList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, campaignIds: Array<string> | undefined, adGroupIds: Array<string> | undefined, entityStatuses: Array<EntityStatus> | undefined, translateInterestsToNames: boolean | undefined,  request: Request): AdGroupsList200Response | Promise<AdGroupsList200Response> | Observable<AdGroupsList200Response>;


  abstract adGroupsTargetingAnalyticsGet(adAccountId: string, adGroupIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsAdGroupTargetingType>, columns: Array<ReportingColumnSync>, granularity: Granularity, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, attributionTypes: Array<ConversionReportAttributionType> | undefined, reportingTimezone: ReportingTimeZone | undefined, sortColumns: Array<string> | undefined, sortAscending: boolean | undefined,  request: Request): MetricsResponse | Promise<MetricsResponse> | Observable<MetricsResponse>;


  abstract adGroupsUpdate(adAccountId: string, adGroupUpdateBatchUpdate: Array<AdGroupUpdateBatchUpdate>,  request: Request): AdGroupsCreate200Response | Promise<AdGroupsCreate200Response> | Observable<AdGroupsCreate200Response>;


  abstract getAdGroupsByPromotionIdsList(adAccountId: string, promotionIds: Array<string>, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined,  request: Request): AdGroupsList200Response | Promise<AdGroupsList200Response> | Observable<AdGroupsList200Response>;

} 