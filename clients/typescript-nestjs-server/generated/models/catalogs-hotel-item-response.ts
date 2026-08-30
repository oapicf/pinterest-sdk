import { Pin } from './pin';
import { CatalogsHotelAttributes } from './catalogs-hotel-attributes';


/**
 * Object describing a hotel record
 */
export interface CatalogsHotelItemResponse { 
  attributes?: CatalogsHotelAttributes;
  catalog_type: CatalogsHotelItemResponse.CatalogTypeEnum;
  /**
   * The catalog hotel id in the merchant namespace
   */
  hotel_id?: string;
  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  item_response_kind: CatalogsHotelItemResponse.ItemResponseKindEnum;
  /**
   * The pins mapped to the item
   */
  pins?: Array<Pin> | null;
}
export namespace CatalogsHotelItemResponse {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
  export const ItemResponseKindEnum = {
    HotelItem: 'hotel_item'
  } as const;
  export type ItemResponseKindEnum = typeof ItemResponseKindEnum[keyof typeof ItemResponseKindEnum];
}


