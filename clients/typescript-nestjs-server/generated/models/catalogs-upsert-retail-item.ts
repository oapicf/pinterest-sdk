import { ItemAttributesRequest } from './item-attributes-request';


/**
 * An item to be upserted
 */
export interface CatalogsUpsertRetailItem { 
  attributes: ItemAttributesRequest;
  /**
   * The catalog item id in the merchant namespace
   */
  item_id: string;
  operation: CatalogsUpsertRetailItem.OperationEnum;
}
export namespace CatalogsUpsertRetailItem {
  export const OperationEnum = {
    Upsert: 'UPSERT'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


