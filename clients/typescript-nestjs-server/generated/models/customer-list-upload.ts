import { ErrorDetail } from './error-detail';
import { UserListOperationType } from './user-list-operation-type';
import { RecordCounts } from './record-counts';
import { WorkloadState } from './workload-state';


export interface CustomerListUpload { 
  /**
   * Advertiser ID.
   */
  ad_account_id: string;
  /**
   * Customer List Upload creation_time. Epoch (seconds).
   */
  creation_time: number;
  /**
   * ID of the customer list associated with this upload.
   */
  customer_list_id: string;
  /**
   * Error counts by error code
   */
  error_counts?: Array<ErrorDetail> | null;
  /**
   * Customer List Upload ID.
   */
  id: string;
  operation: UserListOperationType;
  /**
   * Record processing counts
   */
  record_counts?: RecordCounts;
  state: WorkloadState;
  /**
   * Customer List Upload updated_time. Epoch (seconds).
   */
  updated_time: number;
}
export namespace CustomerListUpload {
}


