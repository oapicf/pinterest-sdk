import { BulkReportingJobStatus } from './bulk-reporting-job-status';


export interface AdsAnalyticsGetAsyncResponse { 
  report_status?: BulkReportingJobStatus;
  size?: number | null;
  url?: string | null;
}
export namespace AdsAnalyticsGetAsyncResponse {
}


