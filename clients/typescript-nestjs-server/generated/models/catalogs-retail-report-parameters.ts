import { CatalogsRetailReportParametersReport } from './catalogs-retail-report-parameters-report';


/**
 * Parameters for retail report
 */
export interface CatalogsRetailReportParameters { 
  catalog_type: CatalogsRetailReportParameters.CatalogTypeEnum;
  report: CatalogsRetailReportParametersReport;
}
export namespace CatalogsRetailReportParameters {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


