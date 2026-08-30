

export interface CatalogsReport { 
  report_status?: CatalogsReport.ReportStatusEnum;
  /**
   * Size of the report in bytes
   */
  size?: number | null;
  /**
   * URL to download the report
   */
  url?: string | null;
}
export namespace CatalogsReport {
  export const ReportStatusEnum = {
    Finished: 'FINISHED',
    InProgress: 'IN_PROGRESS'
  } as const;
  export type ReportStatusEnum = typeof ReportStatusEnum[keyof typeof ReportStatusEnum];
}


