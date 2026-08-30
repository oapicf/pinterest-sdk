import { ProductTagItem } from './product-tag-item';


/**
 * Response containing a list of product tags for a pin.
 */
export interface ProductTagsResponse { 
  /**
   * List of product tags on the pin.
   */
  product_tags: Array<ProductTagItem>;
}

