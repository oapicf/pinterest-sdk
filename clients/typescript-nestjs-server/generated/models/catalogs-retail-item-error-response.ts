import { ItemValidationEvent } from './item-validation-event';


/**
 * Object describing a retail item error
 */
export interface CatalogsRetailItemErrorResponse { 
  catalog_type: CatalogsRetailItemErrorResponse.CatalogTypeEnum;
  /**
   * Array with the errors for the item id requested
   */
  errors: Array<ItemValidationEvent>;
  /**
   * The catalog item id in the merchant namespace
   */
  item_id?: string;
  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  item_response_kind: CatalogsRetailItemErrorResponse.ItemResponseKindEnum;
}
export namespace CatalogsRetailItemErrorResponse {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
  export const ItemResponseKindEnum = {
    RetailItemError: 'retail_item_error'
  } as const;
  export type ItemResponseKindEnum = typeof ItemResponseKindEnum[keyof typeof ItemResponseKindEnum];
}


