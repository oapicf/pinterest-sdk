import { ProductTagItem } from './product-tag-item';


/**
 * Request body for bulk adding product tags to a pin.
 */
export interface ProductTagsBulkAddRequest { 
  /**
   * List of product tags to add. Maximum 24 items allowed.
   */
  product_tags: Array<ProductTagItem>;
}

