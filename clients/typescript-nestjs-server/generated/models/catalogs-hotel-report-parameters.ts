import { CatalogsHotelReportParametersReport } from './catalogs-hotel-report-parameters-report';


/**
 * Parameters for hotel report
 */
export interface CatalogsHotelReportParameters { 
  catalog_type: CatalogsHotelReportParameters.CatalogTypeEnum;
  report: CatalogsHotelReportParametersReport;
}
export namespace CatalogsHotelReportParameters {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


