import { BulkReportingJobStatus } from './bulk-reporting-job-status';


export interface AdsAnalyticsCreateAsyncResponse { 
  message?: string | null;
  report_status?: BulkReportingJobStatus;
  token?: string;
}
export namespace AdsAnalyticsCreateAsyncResponse {
}


