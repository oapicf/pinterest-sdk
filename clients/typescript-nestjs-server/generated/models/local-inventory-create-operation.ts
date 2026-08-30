import { RetailLocalInventoryItemAttributes } from './retail-local-inventory-item-attributes';


/**
 * Create operation for local inventory item
 */
export interface LocalInventoryCreateOperation { 
  attributes: RetailLocalInventoryItemAttributes;
  /**
   * Catalog item id in the merchant namespace
   */
  item_id: string;
  operation: LocalInventoryCreateOperation.OperationEnum;
  /**
   * Store code for the local inventory item
   */
  store_code: string;
}
export namespace LocalInventoryCreateOperation {
  export const OperationEnum = {
    Create: 'CREATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


