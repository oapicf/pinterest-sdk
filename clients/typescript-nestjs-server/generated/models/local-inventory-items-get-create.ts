import { ItemIdStoreCodePair } from './item-id-store-code-pair';


/**
 * Resource create operation model.
 */
export interface LocalInventoryItemsGetCreate { 
  /**
   * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
   */
  item_filters: Array<ItemIdStoreCodePair>;
}

