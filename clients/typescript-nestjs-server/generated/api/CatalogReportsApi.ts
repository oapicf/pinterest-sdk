import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CatalogsCreateReportResponse, CatalogsReport, CatalogsReportParameters, CatalogsReportStatsParameters, ReportsStats200Response,  } from '../models';


@Injectable()
export abstract class CatalogReportsApi {

  abstract reportsCreate(catalogsReportParameters: CatalogsReportParameters, adAccountId: string | undefined,  request: Request): CatalogsCreateReportResponse | Promise<CatalogsCreateReportResponse> | Observable<CatalogsCreateReportResponse>;


  abstract reportsGet(token: string, adAccountId: string | undefined,  request: Request): CatalogsReport | Promise<CatalogsReport> | Observable<CatalogsReport>;


  abstract reportsStats(parameters: CatalogsReportStatsParameters, adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): ReportsStats200Response | Promise<ReportsStats200Response> | Observable<ReportsStats200Response>;

} 