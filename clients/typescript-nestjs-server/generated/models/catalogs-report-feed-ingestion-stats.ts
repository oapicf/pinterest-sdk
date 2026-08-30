

export interface CatalogsReportFeedIngestionStats { 
  /**
   * ID of the catalog entity.
   */
  catalog_id?: string;
  /**
   * The event code that a diagnostics aggregated number references
   */
  code?: number;
  /**
   * A human-friendly label for the event code (e.g, \'AVAILABILITY_INVALID\')
   */
  code_label?: string;
  /**
   * Title message describing the diagnostic issue
   */
  message?: string;
  /**
   * Number of occurrences of the issue
   */
  occurrences?: number;
  report_type?: CatalogsReportFeedIngestionStats.ReportTypeEnum;
  /**
   * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
   */
  severity?: CatalogsReportFeedIngestionStats.SeverityEnum;
}
export namespace CatalogsReportFeedIngestionStats {
  export const ReportTypeEnum = {
    FeedIngestionIssues: 'FEED_INGESTION_ISSUES'
  } as const;
  export type ReportTypeEnum = typeof ReportTypeEnum[keyof typeof ReportTypeEnum];
  export const SeverityEnum = {
    Warn: 'WARN',
    Error: 'ERROR'
  } as const;
  export type SeverityEnum = typeof SeverityEnum[keyof typeof SeverityEnum];
}


