

/**
 * Product counts for a Hotel CatalogsProductGroup
 */
export interface CatalogsHotelProductGroupProductCounts { 
  catalog_type: CatalogsHotelProductGroupProductCounts.CatalogTypeEnum;
  total: number;
}
export namespace CatalogsHotelProductGroupProductCounts {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


