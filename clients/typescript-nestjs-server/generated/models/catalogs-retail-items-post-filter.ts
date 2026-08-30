

export interface CatalogsRetailItemsPostFilter { 
  /**
   * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
   */
  catalog_id?: string;
  catalog_type: CatalogsRetailItemsPostFilter.CatalogTypeEnum;
  item_ids: Array<string>;
}
export namespace CatalogsRetailItemsPostFilter {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


