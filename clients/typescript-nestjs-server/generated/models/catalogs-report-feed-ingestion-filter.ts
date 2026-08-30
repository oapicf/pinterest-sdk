

export interface CatalogsReportFeedIngestionFilter { 
  /**
   * ID of the feed entity.
   */
  feed_id: string;
  /**
   * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
   */
  processing_result_id?: string;
  report_type: CatalogsReportFeedIngestionFilter.ReportTypeEnum;
}
export namespace CatalogsReportFeedIngestionFilter {
  export const ReportTypeEnum = {
    FeedIngestionIssues: 'FEED_INGESTION_ISSUES'
  } as const;
  export type ReportTypeEnum = typeof ReportTypeEnum[keyof typeof ReportTypeEnum];
}


