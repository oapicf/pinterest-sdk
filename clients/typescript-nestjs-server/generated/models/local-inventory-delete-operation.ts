

/**
 * Delete operation for local inventory item
 */
export interface LocalInventoryDeleteOperation { 
  /**
   * Catalog item id in the merchant namespace
   */
  item_id: string;
  operation: LocalInventoryDeleteOperation.OperationEnum;
  /**
   * Store code for the local inventory item
   */
  store_code: string;
}
export namespace LocalInventoryDeleteOperation {
  export const OperationEnum = {
    Delete: 'DELETE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


