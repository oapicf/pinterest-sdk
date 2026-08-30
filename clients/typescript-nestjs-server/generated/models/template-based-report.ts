import { BulkReportingJobStatus } from './bulk-reporting-job-status';


export interface TemplateBasedReport { 
  message?: string;
  report_status: BulkReportingJobStatus;
  /**
   * Unique identifier of a template.
   */
  template_id: string;
  token?: string;
}
export namespace TemplateBasedReport {
}


