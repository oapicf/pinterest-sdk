import { ItemAttributesRequest } from './item-attributes-request';


/**
 * Object describing an item batch record to create items
 */
export interface ItemCreateBatchRecord { 
  attributes?: ItemAttributesRequest;
  /**
   * The catalog item id in the merchant namespace
   */
  item_id?: string;
}

