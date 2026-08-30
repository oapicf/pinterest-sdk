import { Pin } from './pin';
import { ItemAttributes } from './item-attributes';


/**
 * Object describing a retail item record
 */
export interface CatalogsRetailItemResponse { 
  attributes?: ItemAttributes;
  catalog_type: CatalogsRetailItemResponse.CatalogTypeEnum;
  /**
   * The catalog retail item id in the merchant namespace
   */
  item_id?: string;
  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  item_response_kind: CatalogsRetailItemResponse.ItemResponseKindEnum;
  /**
   * The pins mapped to the item
   */
  pins?: Array<Pin> | null;
}
export namespace CatalogsRetailItemResponse {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
  export const ItemResponseKindEnum = {
    RetailItem: 'retail_item'
  } as const;
  export type ItemResponseKindEnum = typeof ItemResponseKindEnum[keyof typeof ItemResponseKindEnum];
}


