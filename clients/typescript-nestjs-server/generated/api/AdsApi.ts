import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { 0 | 1 | 7 | 14 | 30 | 60, Ad, AdBatchUpdate, AdBatchWriteResponseModel, AdCreate, AdPreviewRequest, AdPreviewURLResponse, AdsAnalytics, AdsAnalyticsAdTargetingType, AdsList200Response, CampaignAdPreview, CampaignAdPreviewCreate, CampaignAdPreviewCreate200ResponseInner, CampaignAdPreviewDelete200ResponseInner, ConversionAttributionWindowDays, ConversionReportAttributionType, ConversionReportTimeType, EntityStatus, Granularity, MetricsResponse, PinterestLibPaginationOrder, ReportingColumnSync, ReportingTimeZone,  } from '../models';


@Injectable()
export abstract class AdsApi {

  abstract adPreviewsCreate(adAccountId: string, adPreviewRequest: AdPreviewRequest,  request: Request): AdPreviewURLResponse | Promise<AdPreviewURLResponse> | Observable<AdPreviewURLResponse>;


  abstract adTargetingAnalyticsGet(adAccountId: string, adIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsAdTargetingType>, columns: Array<ReportingColumnSync>, granularity: Granularity, clickWindowDays: ConversionAttributionWindowDays | undefined, engagementWindowDays: ConversionAttributionWindowDays | undefined, viewWindowDays: ConversionAttributionWindowDays | undefined, conversionReportTime: ConversionReportTimeType | undefined, attributionTypes: Array<ConversionReportAttributionType> | undefined, reportingTimezone: ReportingTimeZone | undefined, sortColumns: Array<string> | undefined, sortAscending: boolean | undefined,  request: Request): MetricsResponse | Promise<MetricsResponse> | Observable<MetricsResponse>;


  abstract adsAnalytics(startDate: string, endDate: string, columns: Array<ReportingColumnSync>, granularity: Granularity, adAccountId: string, pinIds: Array<string> | undefined, adIds: Array<string> | undefined, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, campaignIds: Array<string> | undefined, reportingTimezone: ReportingTimeZone | undefined,  request: Request): Array<AdsAnalytics> | Promise<Array<AdsAnalytics>> | Observable<Array<AdsAnalytics>>;


  abstract adsCreate(adAccountId: string, adCreate: Array<AdCreate>,  request: Request): AdBatchWriteResponseModel | Promise<AdBatchWriteResponseModel> | Observable<AdBatchWriteResponseModel>;


  abstract adsGet(adId: string, adAccountId: string,  request: Request): Ad | Promise<Ad> | Observable<Ad>;


  abstract adsList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, campaignIds: Array<string> | undefined, adGroupIds: Array<string> | undefined, adIds: Array<string> | undefined, entityStatuses: Array<EntityStatus> | undefined,  request: Request): AdsList200Response | Promise<AdsList200Response> | Observable<AdsList200Response>;


  abstract adsUpdate(adAccountId: string, adBatchUpdate: Array<AdBatchUpdate>,  request: Request): AdBatchWriteResponseModel | Promise<AdBatchWriteResponseModel> | Observable<AdBatchWriteResponseModel>;


  abstract campaignAdPreviewCreate(adAccountId: string, campaignAdPreviewCreate: Array<CampaignAdPreviewCreate>,  request: Request): Array<CampaignAdPreviewCreate200ResponseInner> | Promise<Array<CampaignAdPreviewCreate200ResponseInner>> | Observable<Array<CampaignAdPreviewCreate200ResponseInner>>;


  abstract campaignAdPreviewDelete(adGroupIds: Array<string>, adAccountId: string,  request: Request): Array<CampaignAdPreviewDelete200ResponseInner> | Promise<Array<CampaignAdPreviewDelete200ResponseInner>> | Observable<Array<CampaignAdPreviewDelete200ResponseInner>>;


  abstract campaignAdPreviewRead(adGroupIds: Array<string>, adAccountId: string,  request: Request): Array<CampaignAdPreview> | Promise<Array<CampaignAdPreview>> | Observable<Array<CampaignAdPreview>>;

} 