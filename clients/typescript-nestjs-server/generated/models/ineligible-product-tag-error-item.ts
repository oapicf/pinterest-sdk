import { IneligibleProductTagReason } from './ineligible-product-tag-reason';


/**
 * Error item for a product tag that failed eligibility check.
 */
export interface IneligibleProductTagErrorItem { 
  /**
   * Reason why the pin is ineligible for tagging.
   */
  error_message: IneligibleProductTagReason;
  /**
   * Pin ID that failed eligibility check.
   */
  pin_id: string;
}
export namespace IneligibleProductTagErrorItem {
}


