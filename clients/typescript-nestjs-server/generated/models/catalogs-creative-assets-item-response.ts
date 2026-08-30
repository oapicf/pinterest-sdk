import { Pin } from './pin';
import { CatalogsCreativeAssetsAttributes } from './catalogs-creative-assets-attributes';


/**
 * Object describing a creative assets item record
 */
export interface CatalogsCreativeAssetsItemResponse { 
  attributes?: CatalogsCreativeAssetsAttributes;
  catalog_type: CatalogsCreativeAssetsItemResponse.CatalogTypeEnum;
  /**
   * The catalog creative assets id in the merchant namespace
   */
  creative_assets_id?: string;
  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  item_response_kind: CatalogsCreativeAssetsItemResponse.ItemResponseKindEnum;
  /**
   * The pins mapped to the item
   */
  pins?: Array<Pin> | null;
}
export namespace CatalogsCreativeAssetsItemResponse {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
  export const ItemResponseKindEnum = {
    CreativeAssetsItem: 'creative_assets_item'
  } as const;
  export type ItemResponseKindEnum = typeof ItemResponseKindEnum[keyof typeof ItemResponseKindEnum];
}


