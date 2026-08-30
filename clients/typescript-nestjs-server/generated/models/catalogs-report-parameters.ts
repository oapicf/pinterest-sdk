import { CatalogsHotelReportParameters } from './catalogs-hotel-report-parameters';
import { CatalogsRetailReportParameters } from './catalogs-retail-report-parameters';
import { CatalogsHotelReportParametersReport } from './catalogs-hotel-report-parameters-report';


/**
 * Report parameters
 */
/**
 * @type CatalogsReportParameters
 * Report parameters
 * @export
 */
export type CatalogsReportParameters = CatalogsHotelReportParameters | CatalogsRetailReportParameters;

