

export interface CatalogsHotelItemsPostFilter { 
  /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   */
  catalog_id?: string;
  catalog_type: CatalogsHotelItemsPostFilter.CatalogTypeEnum;
  hotel_ids: Array<string>;
}
export namespace CatalogsHotelItemsPostFilter {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


