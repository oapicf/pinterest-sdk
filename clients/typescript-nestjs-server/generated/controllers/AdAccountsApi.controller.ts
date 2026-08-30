import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AdAccountsApi } from '../api';
import { 0 | 1 | 7 | 14 | 30 | 60, AdAccount, AdAccountAnalyticsItems, AdAccountCreate, AdAccountsList200Response, AdsAnalyticsAccountTargetingType, AdsAnalyticsCreateAsyncRequest, AdsAnalyticsCreateAsyncResponse, AdsAnalyticsGetAsyncResponse, ConversionProductReport, ConversionProductReportCreate, ConversionReportAttributionType, Granularity, MMMReport, MMMReportCreate, MetricsResponse, PinterestLibPaginationOrder, ReportingColumnSync, ReportingTimeZone, TemplateBasedReport, TemplatesList200Response,  } from '../models';

@Controller()
export class AdAccountsApiController {
  constructor(private readonly adAccountsApi: AdAccountsApi) {}

  @Get('/ad_accounts/:ad_account_id/analytics')
  adAccountAnalytics(@Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Param('ad_account_id') adAccountId: string, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Req() request: Request): Array<AdAccountAnalyticsItems> | Promise<Array<AdAccountAnalyticsItems>> | Observable<Array<AdAccountAnalyticsItems>> {
    return this.adAccountsApi.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone, request);
  }

  @Get('/ad_accounts/:ad_account_id/targeting_analytics')
  adAccountTargetingAnalyticsGet(@Param('ad_account_id') adAccountId: string, @Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('targeting_types') targetingTypes: Array<AdsAnalyticsAccountTargetingType>, @Query('columns') columns: Array<ReportingColumnSync>, @Query('granularity') granularity: Granularity, @Query('click_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) clickWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('engagement_window_days', new DefaultValuePipe(30), new ParseIntPipe({optional: true})) engagementWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('view_window_days', new DefaultValuePipe(1), new ParseIntPipe({optional: true})) viewWindowDays: 0 | 1 | 7 | 14 | 30 | 60 | undefined, @Query('conversion_report_time', new DefaultValuePipe('TIME_OF_AD_ACTION')) conversionReportTime: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION' | undefined, @Query('attribution_types') attributionTypes: Array<ConversionReportAttributionType> | undefined, @Query('reporting_timezone') reportingTimezone: ReportingTimeZone | undefined, @Req() request: Request): MetricsResponse | Promise<MetricsResponse> | Observable<MetricsResponse> {
    return this.adAccountsApi.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, request);
  }

  @Post('/ad_accounts')
  adAccountsCreate(@Body() adAccountCreate: AdAccountCreate, @Req() request: Request): AdAccount | Promise<AdAccount> | Observable<AdAccount> {
    return this.adAccountsApi.adAccountsCreate(adAccountCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id')
  adAccountsGet(@Param('ad_account_id') adAccountId: string, @Req() request: Request): AdAccount | Promise<AdAccount> | Observable<AdAccount> {
    return this.adAccountsApi.adAccountsGet(adAccountId, request);
  }

  @Get('/ad_accounts')
  adAccountsList(@Query('include_shared_accounts', new DefaultValuePipe(true)) includeSharedAccounts: boolean | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): AdAccountsList200Response | Promise<AdAccountsList200Response> | Observable<AdAccountsList200Response> {
    return this.adAccountsApi.adAccountsList(includeSharedAccounts, bookmark, pageSize, request);
  }

  @Post('/ad_accounts/:ad_account_id/reports/brand_category_sku')
  analyticsCreateConversionProductReport(@Param('ad_account_id') adAccountId: string, @Body() conversionProductReportCreate: ConversionProductReportCreate, @Req() request: Request): ConversionProductReport | Promise<ConversionProductReport> | Observable<ConversionProductReport> {
    return this.adAccountsApi.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate, request);
  }

  @Post('/ad_accounts/:ad_account_id/mmm_reports')
  analyticsCreateMmmReport(@Param('ad_account_id') adAccountId: string, @Body() mMMReportCreate: MMMReportCreate, @Req() request: Request): MMMReport | Promise<MMMReport> | Observable<MMMReport> {
    return this.adAccountsApi.analyticsCreateMmmReport(adAccountId, mMMReportCreate, request);
  }

  @Post('/ad_accounts/:ad_account_id/reports')
  analyticsCreateReport(@Param('ad_account_id') adAccountId: string, @Body() adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest, @Req() request: Request): AdsAnalyticsCreateAsyncResponse | Promise<AdsAnalyticsCreateAsyncResponse> | Observable<AdsAnalyticsCreateAsyncResponse> {
    return this.adAccountsApi.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest, request);
  }

  @Post('/ad_accounts/:ad_account_id/templates/:template_id/reports')
  analyticsCreateTemplateReport(@Param('ad_account_id') adAccountId: string, @Param('template_id') templateId: string, @Query('start_date') startDate: string | undefined, @Query('end_date') endDate: string | undefined, @Query('granularity') granularity: Granularity | undefined, @Req() request: Request): TemplateBasedReport | Promise<TemplateBasedReport> | Observable<TemplateBasedReport> {
    return this.adAccountsApi.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity, request);
  }

  @Get('/ad_accounts/:ad_account_id/reports/brand_category_sku')
  analyticsGetConversionProductReport(@Param('ad_account_id') adAccountId: string, @Query('token') token: string, @Req() request: Request): ConversionProductReport | Promise<ConversionProductReport> | Observable<ConversionProductReport> {
    return this.adAccountsApi.analyticsGetConversionProductReport(adAccountId, token, request);
  }

  @Get('/ad_accounts/:ad_account_id/mmm_reports')
  analyticsGetMmmReport(@Param('ad_account_id') adAccountId: string, @Query('token') token: string, @Req() request: Request): MMMReport | Promise<MMMReport> | Observable<MMMReport> {
    return this.adAccountsApi.analyticsGetMmmReport(adAccountId, token, request);
  }

  @Get('/ad_accounts/:ad_account_id/reports')
  analyticsGetReport(@Param('ad_account_id') adAccountId: string, @Query('token') token: string, @Req() request: Request): AdsAnalyticsGetAsyncResponse | Promise<AdsAnalyticsGetAsyncResponse> | Observable<AdsAnalyticsGetAsyncResponse> {
    return this.adAccountsApi.analyticsGetReport(adAccountId, token, request);
  }

  @Delete('/ad_accounts/:ad_account_id/sandbox')
  sandboxDelete(@Param('ad_account_id') adAccountId: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.adAccountsApi.sandboxDelete(adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/templates')
  templatesList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Req() request: Request): TemplatesList200Response | Promise<TemplatesList200Response> | Observable<TemplatesList200Response> {
    return this.adAccountsApi.templatesList(adAccountId, bookmark, pageSize, order, request);
  }

} 