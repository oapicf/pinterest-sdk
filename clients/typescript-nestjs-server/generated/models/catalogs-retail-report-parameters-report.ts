import { CatalogsReportFeedIngestionFilter } from './catalogs-report-feed-ingestion-filter';
import { CatalogsReportDistributionIssueFilter } from './catalogs-report-distribution-issue-filter';
import { CatalogsRetailReportAllItemsFilter } from './catalogs-retail-report-all-items-filter';


/**
 * @type CatalogsRetailReportParametersReport
 * @export
 */
export type CatalogsRetailReportParametersReport = CatalogsReportDistributionIssueFilter | CatalogsReportFeedIngestionFilter | CatalogsRetailReportAllItemsFilter;

