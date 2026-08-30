import { BulkReportingJobStatus } from './bulk-reporting-job-status';


export interface ConversionProductReport { 
  /**
   * Message returned from the create report request
   */
  readonly message?: string;
  /**
   * Async report status
   */
  readonly report_status?: BulkReportingJobStatus;
  /**
   * Size of the report in bytes
   */
  readonly size?: number;
  /**
   * Token returned from the create report request
   */
  readonly token?: string;
  /**
   * URL of the report
   */
  readonly url?: string;
}
export namespace ConversionProductReport {
}


