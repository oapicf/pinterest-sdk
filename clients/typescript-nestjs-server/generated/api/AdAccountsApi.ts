import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { 0 | 1 | 7 | 14 | 30 | 60, AdAccount, AdAccountAnalyticsItems, AdAccountCreate, AdAccountsList200Response, AdsAnalyticsAccountTargetingType, AdsAnalyticsCreateAsyncRequest, AdsAnalyticsCreateAsyncResponse, AdsAnalyticsGetAsyncResponse, ConversionProductReport, ConversionProductReportCreate, ConversionReportAttributionType, Granularity, MMMReport, MMMReportCreate, MetricsResponse, PinterestLibPaginationOrder, ReportingColumnSync, ReportingTimeZone, TemplateBasedReport, TemplatesList200Response,  } from '../models';


@Injectable()
export abstract class AdAccountsApi {

  abstract adAccountAnalytics(startDate: string, endDate: string, columns: Array<ReportingColumnSync>, granularity: Granularity, adAccountId: string, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, reportingTimezone: ReportingTimeZone | undefined,  request: Request): Array<AdAccountAnalyticsItems> | Promise<Array<AdAccountAnalyticsItems>> | Observable<Array<AdAccountAnalyticsItems>>;


  abstract adAccountTargetingAnalyticsGet(adAccountId: string, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsAccountTargetingType>, columns: Array<ReportingColumnSync>, granularity: Granularity, clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, attributionTypes: Array<ConversionReportAttributionType> | undefined, reportingTimezone: ReportingTimeZone | undefined,  request: Request): MetricsResponse | Promise<MetricsResponse> | Observable<MetricsResponse>;


  abstract adAccountsCreate(adAccountCreate: AdAccountCreate,  request: Request): AdAccount | Promise<AdAccount> | Observable<AdAccount>;


  abstract adAccountsGet(adAccountId: string,  request: Request): AdAccount | Promise<AdAccount> | Observable<AdAccount>;


  abstract adAccountsList(includeSharedAccounts: boolean | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): AdAccountsList200Response | Promise<AdAccountsList200Response> | Observable<AdAccountsList200Response>;


  abstract analyticsCreateConversionProductReport(adAccountId: string, conversionProductReportCreate: ConversionProductReportCreate,  request: Request): ConversionProductReport | Promise<ConversionProductReport> | Observable<ConversionProductReport>;


  abstract analyticsCreateMmmReport(adAccountId: string, mMMReportCreate: MMMReportCreate,  request: Request): MMMReport | Promise<MMMReport> | Observable<MMMReport>;


  abstract analyticsCreateReport(adAccountId: string, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest,  request: Request): AdsAnalyticsCreateAsyncResponse | Promise<AdsAnalyticsCreateAsyncResponse> | Observable<AdsAnalyticsCreateAsyncResponse>;


  abstract analyticsCreateTemplateReport(adAccountId: string, templateId: string, startDate: string | undefined, endDate: string | undefined, granularity: Granularity | undefined,  request: Request): TemplateBasedReport | Promise<TemplateBasedReport> | Observable<TemplateBasedReport>;


  abstract analyticsGetConversionProductReport(adAccountId: string, token: string,  request: Request): ConversionProductReport | Promise<ConversionProductReport> | Observable<ConversionProductReport>;


  abstract analyticsGetMmmReport(adAccountId: string, token: string,  request: Request): MMMReport | Promise<MMMReport> | Observable<MMMReport>;


  abstract analyticsGetReport(adAccountId: string, token: string,  request: Request): AdsAnalyticsGetAsyncResponse | Promise<AdsAnalyticsGetAsyncResponse> | Observable<AdsAnalyticsGetAsyncResponse>;


  abstract sandboxDelete(adAccountId: string,  request: Request): string | Promise<string> | Observable<string>;


  abstract templatesList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined,  request: Request): TemplatesList200Response | Promise<TemplatesList200Response> | Observable<TemplatesList200Response>;

} 