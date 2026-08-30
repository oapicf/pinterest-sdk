import { BulkReportingJobStatus } from './bulk-reporting-job-status';


/**
 * Resource create operation model.
 */
export interface TemplateBasedReportCreate { 
  message?: string;
  report_status: BulkReportingJobStatus;
  token?: string;
}
export namespace TemplateBasedReportCreate {
}


