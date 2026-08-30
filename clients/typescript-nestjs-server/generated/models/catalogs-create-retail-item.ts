import { ItemAttributesRequest } from './item-attributes-request';


/**
 * An item to be created
 */
export interface CatalogsCreateRetailItem { 
  attributes: ItemAttributesRequest;
  /**
   * The catalog item id in the merchant namespace
   */
  item_id: string;
  operation: CatalogsCreateRetailItem.OperationEnum;
}
export namespace CatalogsCreateRetailItem {
  export const OperationEnum = {
    Create: 'CREATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


