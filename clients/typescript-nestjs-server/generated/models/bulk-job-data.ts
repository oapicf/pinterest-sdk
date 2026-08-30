import { BulkRequestStatus } from './bulk-request-status';


/**
 * Bulk request result data.
 */
export interface BulkJobData { 
  /**
   * Presigned s3 file url for the bulk request result.
   */
  result_url?: string;
  status: BulkRequestStatus;
  /**
   * Bulk Workload Id.
   */
  workload_id?: number;
}
export namespace BulkJobData {
}


