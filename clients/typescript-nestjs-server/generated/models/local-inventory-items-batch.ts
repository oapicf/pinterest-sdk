import { SupplementalOperationResult } from './supplemental-operation-result';
import { SupplementalItemBatchOperationStatus } from './supplemental-item-batch-operation-status';


/**
 * Unified model for local inventory items batch operation
 */
export interface LocalInventoryItemsBatch { 
  /**
   * Id of the batch operation
   */
  readonly batch_id: string;
  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD\'T\'hh:mm:ss
   */
  readonly completed_time?: string;
  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD\'T\'hh:mm:ss
   */
  readonly created_time: string;
  /**
   * Array of operation results
   */
  readonly operation_results: Array<SupplementalOperationResult>;
  /**
   * Status of the batch: PROCESSING, COMPLETED, FAILED
   */
  readonly status: SupplementalItemBatchOperationStatus;
}
export namespace LocalInventoryItemsBatch {
}


