

/**
 * Product counts for a Retail CatalogsProductGroup
 */
export interface CatalogsRetailProductGroupProductCounts { 
  catalog_type: CatalogsRetailProductGroupProductCounts.CatalogTypeEnum;
  in_stock: number;
  out_of_stock: number;
  preorder: number;
  total: number;
  videos?: number;
}
export namespace CatalogsRetailProductGroupProductCounts {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


