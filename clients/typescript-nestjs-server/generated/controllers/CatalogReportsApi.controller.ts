import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CatalogReportsApi } from '../api';
import { CatalogsCreateReportResponse, CatalogsReport, CatalogsReportParameters, CatalogsReportStatsParameters, ReportsStats200Response,  } from '../models';

@Controller()
export class CatalogReportsApiController {
  constructor(private readonly catalogReportsApi: CatalogReportsApi) {}

  @Post('/catalogs/reports')
  reportsCreate(@Body() catalogsReportParameters: CatalogsReportParameters, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsCreateReportResponse | Promise<CatalogsCreateReportResponse> | Observable<CatalogsCreateReportResponse> {
    return this.catalogReportsApi.reportsCreate(catalogsReportParameters, adAccountId, request);
  }

  @Get('/catalogs/reports')
  reportsGet(@Query('token') token: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsReport | Promise<CatalogsReport> | Observable<CatalogsReport> {
    return this.catalogReportsApi.reportsGet(token, adAccountId, request);
  }

  @Get('/catalogs/reports/stats')
  reportsStats(@Query('parameters') parameters: CatalogsReportStatsParameters, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): ReportsStats200Response | Promise<ReportsStats200Response> | Observable<ReportsStats200Response> {
    return this.catalogReportsApi.reportsStats(parameters, adAccountId, bookmark, pageSize, request);
  }

} 