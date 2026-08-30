import { CatalogsReportStats } from './catalogs-report-stats';


export interface ReportsStats200Response { 
  bookmark?: string | null;
  items: Array<CatalogsReportStats>;
}

