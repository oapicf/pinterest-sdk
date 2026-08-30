import { CatalogsReportDistributionStats } from './catalogs-report-distribution-stats';
import { CatalogsReportFeedIngestionStats } from './catalogs-report-feed-ingestion-stats';


/**
 * Diagnostics aggregated numbers
 */
/**
 * @type CatalogsReportStats
 * Diagnostics aggregated numbers
 * @export
 */
export type CatalogsReportStats = CatalogsReportDistributionStats | CatalogsReportFeedIngestionStats;

