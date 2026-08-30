import { SupplementalItemProcessingStatus } from './supplemental-item-processing-status';
import { SupplementalItemValidationEvent } from './supplemental-item-validation-event';


/**
 * Result of a supplemental item operation, discriminated by supplemental_type
 */
export interface SupplementalOperationResult { 
  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   */
  errors?: Array<SupplementalItemValidationEvent>;
  /**
   * Catalog item id in the merchant namespace
   */
  item_id: string;
  /**
   * Status of the item processing record
   */
  status: SupplementalItemProcessingStatus;
  /**
   * Store code for the local inventory item
   */
  store_code: string;
  supplemental_type: SupplementalOperationResult.SupplementalTypeEnum;
  /**
   * Array with the validation warnings for the item processing record
   */
  warnings?: Array<SupplementalItemValidationEvent>;
}
export namespace SupplementalOperationResult {
  export const SupplementalTypeEnum = {
    LocalInventory: 'LOCAL_INVENTORY'
  } as const;
  export type SupplementalTypeEnum = typeof SupplementalTypeEnum[keyof typeof SupplementalTypeEnum];
}


