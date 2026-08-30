import { RetailLocalInventoryItemAttributesOptional } from './retail-local-inventory-item-attributes-optional';


/**
 * Update operation for local inventory item
 */
export interface LocalInventoryUpdateOperation { 
  attributes: RetailLocalInventoryItemAttributesOptional;
  /**
   * Catalog item id in the merchant namespace
   */
  item_id: string;
  operation: LocalInventoryUpdateOperation.OperationEnum;
  /**
   * Store code for the local inventory item
   */
  store_code: string;
}
export namespace LocalInventoryUpdateOperation {
  export const OperationEnum = {
    Update: 'UPDATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


