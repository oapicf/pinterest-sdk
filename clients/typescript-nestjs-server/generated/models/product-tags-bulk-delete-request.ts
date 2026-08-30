import { ProductTagItem } from './product-tag-item';


/**
 * Request body for bulk deleting product tags from a pin.
 */
export interface ProductTagsBulkDeleteRequest { 
  /**
   * List of product tags to delete.
   */
  product_tags: Array<ProductTagItem>;
}

