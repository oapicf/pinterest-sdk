import { CatalogsHotelAttributes } from './catalogs-hotel-attributes';


/**
 * A hotel item to be upserted.
 */
export interface CatalogsUpsertHotelItem { 
  attributes: CatalogsHotelAttributes;
  /**
   * The catalog hotel id in the merchant namespace
   */
  hotel_id: string;
  operation: CatalogsUpsertHotelItem.OperationEnum;
}
export namespace CatalogsUpsertHotelItem {
  export const OperationEnum = {
    Upsert: 'UPSERT'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


