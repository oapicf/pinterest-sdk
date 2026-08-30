import { ItemValidationEvent } from './item-validation-event';
import { ItemProcessingStatus } from './item-processing-status';


/**
 * Object describing an item processing record
 */
export interface ItemProcessingRecord { 
  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   */
  errors?: Array<ItemValidationEvent>;
  /**
   * The catalog item id in the merchant namespace
   */
  item_id?: string;
  status?: ItemProcessingStatus;
  /**
   * Array with the validation warnings for the item processing record
   */
  warnings?: Array<ItemValidationEvent>;
}
export namespace ItemProcessingRecord {
}


