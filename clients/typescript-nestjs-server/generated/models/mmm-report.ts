import { BulkReportingJobStatus } from './bulk-reporting-job-status';


export interface MMMReport { 
  readonly message?: string;
  readonly report_status?: BulkReportingJobStatus;
  readonly size?: number;
  readonly status?: string;
  readonly token?: string;
  readonly url?: string;
}
export namespace MMMReport {
}


