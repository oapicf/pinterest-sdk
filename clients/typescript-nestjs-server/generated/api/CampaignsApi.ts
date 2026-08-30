import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { 0 | 1 | 7 | 14 | 30 | 60, AdPinAnalytics, AdsAnalyticsCampaignTargetingType, Campaign, CampaignBatchUpdateItem, CampaignBatchWriteResponseModel, CampaignCreateItem, CampaignDeliveryEstimatesCampaign, CampaignDeliveryEstimatesResponse, CampaignsAnalyticsMetrics, CampaignsList200Response, ConversionReportAttributionType, EntityStatus, Granularity, MetricsResponse, PinterestLibPaginationOrder, ReportingColumnSync, ReportingTimeZone,  } from '../models';


@Injectable()
export abstract class CampaignsApi {

  abstract adPinsAnalytics(campaignId: string, pinIds: Array<string>, startDate: string, endDate: string, columns: Array<ReportingColumnSync>, granularity: Granularity, adAccountId: string, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined,  request: Request): Array<AdPinAnalytics> | Promise<Array<AdPinAnalytics>> | Observable<Array<AdPinAnalytics>>;


  abstract campaignTargetingAnalyticsGet(adAccountId: string, campaignIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsCampaignTargetingType>, columns: Array<ReportingColumnSync>, granularity: Granularity, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, attributionTypes: Array<ConversionReportAttributionType> | undefined, reportingTimezone: ReportingTimeZone | undefined,  request: Request): MetricsResponse | Promise<MetricsResponse> | Observable<MetricsResponse>;


  abstract campaignsAnalytics(startDate: string, endDate: string, campaignIds: Array<string>, columns: Array<ReportingColumnSync>, granularity: Granularity, adAccountId: string, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, aggregateReportRows: boolean | undefined, reportingTimezone: ReportingTimeZone | undefined,  request: Request): Array<CampaignsAnalyticsMetrics> | Promise<Array<CampaignsAnalyticsMetrics>> | Observable<Array<CampaignsAnalyticsMetrics>>;


  abstract campaignsCreate(adAccountId: string, campaignCreateItem: Array<CampaignCreateItem>,  request: Request): CampaignBatchWriteResponseModel | Promise<CampaignBatchWriteResponseModel> | Observable<CampaignBatchWriteResponseModel>;


  abstract campaignsGet(campaignId: string, adAccountId: string,  request: Request): Campaign | Promise<Campaign> | Observable<Campaign>;


  abstract campaignsList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, campaignIds: Array<string> | undefined, entityStatuses: Array<EntityStatus> | undefined,  request: Request): CampaignsList200Response | Promise<CampaignsList200Response> | Observable<CampaignsList200Response>;


  abstract campaignsUpdate(adAccountId: string, campaignBatchUpdateItem: Array<CampaignBatchUpdateItem>,  request: Request): CampaignBatchWriteResponseModel | Promise<CampaignBatchWriteResponseModel> | Observable<CampaignBatchWriteResponseModel>;


  abstract getCampaignDeliveryEstimates(adAccountId: string, campaignDeliveryEstimatesCampaign: Array<CampaignDeliveryEstimatesCampaign>,  request: Request): CampaignDeliveryEstimatesResponse | Promise<CampaignDeliveryEstimatesResponse> | Observable<CampaignDeliveryEstimatesResponse>;

} 