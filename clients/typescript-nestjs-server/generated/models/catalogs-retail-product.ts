import { Pin } from './pin';
import { CatalogsRetailProductMetadata } from './catalogs-retail-product-metadata';


export interface CatalogsRetailProduct { 
  catalog_type: CatalogsRetailProduct.CatalogTypeEnum;
  metadata: CatalogsRetailProductMetadata;
  pin: Pin;
}
export namespace CatalogsRetailProduct {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


