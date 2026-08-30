import { Pin } from './pin';
import { CatalogsHotelProductMetadata } from './catalogs-hotel-product-metadata';


export interface CatalogsHotelProduct { 
  catalog_type: CatalogsHotelProduct.CatalogTypeEnum;
  metadata: CatalogsHotelProductMetadata;
  pin: Pin;
}
export namespace CatalogsHotelProduct {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


