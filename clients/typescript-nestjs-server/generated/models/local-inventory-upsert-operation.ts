import { RetailLocalInventoryItemAttributes } from './retail-local-inventory-item-attributes';


/**
 * Upsert operation for local inventory item
 */
export interface LocalInventoryUpsertOperation { 
  attributes: RetailLocalInventoryItemAttributes;
  /**
   * Catalog item id in the merchant namespace
   */
  item_id: string;
  operation: LocalInventoryUpsertOperation.OperationEnum;
  /**
   * Store code for the local inventory item
   */
  store_code: string;
}
export namespace LocalInventoryUpsertOperation {
  export const OperationEnum = {
    Upsert: 'UPSERT'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


