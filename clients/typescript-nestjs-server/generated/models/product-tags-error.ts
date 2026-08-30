import { IneligibleProductTagsErrorDetails } from './ineligible-product-tags-error-details';


/**
 * Error response for requests containing ineligible product tags.
 */
export interface ProductTagsError { 
  code: number;
  /**
   * Details about which product tags failed eligibility check.
   */
  details?: IneligibleProductTagsErrorDetails;
  message: string;
}

