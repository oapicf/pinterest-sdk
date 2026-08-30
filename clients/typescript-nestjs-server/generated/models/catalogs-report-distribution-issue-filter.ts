

export interface CatalogsReportDistributionIssueFilter { 
  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   */
  catalog_id?: string;
  report_type: CatalogsReportDistributionIssueFilter.ReportTypeEnum;
}
export namespace CatalogsReportDistributionIssueFilter {
  export const ReportTypeEnum = {
    DistributionIssues: 'DISTRIBUTION_ISSUES'
  } as const;
  export type ReportTypeEnum = typeof ReportTypeEnum[keyof typeof ReportTypeEnum];
}


