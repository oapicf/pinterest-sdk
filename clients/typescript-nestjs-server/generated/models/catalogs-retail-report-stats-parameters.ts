import { CatalogsRetailReportStatsParametersReport } from './catalogs-retail-report-stats-parameters-report';


/**
 * Parameters for retail report
 */
export interface CatalogsRetailReportStatsParameters { 
  catalog_type: CatalogsRetailReportStatsParameters.CatalogTypeEnum;
  report: CatalogsRetailReportStatsParametersReport;
}
export namespace CatalogsRetailReportStatsParameters {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


