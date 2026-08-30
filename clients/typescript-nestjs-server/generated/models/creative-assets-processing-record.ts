import { ItemValidationEvent } from './item-validation-event';
import { ItemProcessingStatus } from './item-processing-status';


/**
 * Object describing an item processing record
 */
export interface CreativeAssetsProcessingRecord { 
  /**
   * The catalog creative assets id in the merchant namespace
   */
  creative_assets_id?: string;
  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   */
  errors?: Array<ItemValidationEvent>;
  status?: ItemProcessingStatus;
  /**
   * Array with the validation warnings for the item processing record
   */
  warnings?: Array<ItemValidationEvent>;
}
export namespace CreativeAssetsProcessingRecord {
}


