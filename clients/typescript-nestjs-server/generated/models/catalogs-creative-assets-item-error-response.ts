import { ItemValidationEvent } from './item-validation-event';


/**
 * Object describing a creative assets item error
 */
export interface CatalogsCreativeAssetsItemErrorResponse { 
  catalog_type: CatalogsCreativeAssetsItemErrorResponse.CatalogTypeEnum;
  /**
   * The catalog creative assets id in the merchant namespace
   */
  creative_assets_id?: string;
  /**
   * Array with the errors for the item id requested
   */
  errors: Array<ItemValidationEvent>;
  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  item_response_kind: CatalogsCreativeAssetsItemErrorResponse.ItemResponseKindEnum;
}
export namespace CatalogsCreativeAssetsItemErrorResponse {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
  export const ItemResponseKindEnum = {
    CreativeAssetsItemError: 'creative_assets_item_error'
  } as const;
  export type ItemResponseKindEnum = typeof ItemResponseKindEnum[keyof typeof ItemResponseKindEnum];
}


