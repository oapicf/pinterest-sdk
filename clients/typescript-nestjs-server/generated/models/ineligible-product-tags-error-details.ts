import { IneligibleProductTagErrorItem } from './ineligible-product-tag-error-item';


/**
 * Details about ineligible product tags in the request.
 */
export interface IneligibleProductTagsErrorDetails { 
  /**
   * List of product tags that failed eligibility check.
   */
  product_tags: Array<IneligibleProductTagErrorItem>;
}

