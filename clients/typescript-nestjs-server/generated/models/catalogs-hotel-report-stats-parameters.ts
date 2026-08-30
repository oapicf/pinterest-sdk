import { CatalogsHotelReportStatsParametersReport } from './catalogs-hotel-report-stats-parameters-report';


/**
 * Parameters for hotel report
 */
export interface CatalogsHotelReportStatsParameters { 
  catalog_type: CatalogsHotelReportStatsParameters.CatalogTypeEnum;
  report: CatalogsHotelReportStatsParametersReport;
}
export namespace CatalogsHotelReportStatsParameters {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


