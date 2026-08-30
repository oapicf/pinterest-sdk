import { LocalInventoryItemResponse } from './local-inventory-item-response';


/**
 * Model for getting local inventory items
 */
export interface LocalInventoryItemsGet { 
  /**
   * Array of local inventory items
   */
  readonly items: Array<LocalInventoryItemResponse>;
}

