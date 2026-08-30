

/**
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */
export interface ItemIdStoreCodePair { 
  /**
   * Catalog item id in the merchant namespace
   */
  item_id: string;
  /**
   * Store code for the local inventory item
   */
  store_code: string;
}

