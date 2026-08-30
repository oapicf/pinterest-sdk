import { LocalInventoryOperation } from './local-inventory-operation';


/**
 * Resource create operation model.
 */
export interface LocalInventoryItemsBatchCreate { 
  /**
   * Array of inventory operations. Up to 1000 items per request.
   */
  operations: Array<LocalInventoryOperation>;
}

