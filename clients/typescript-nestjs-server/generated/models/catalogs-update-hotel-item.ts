import { CatalogsUpdatableHotelAttributes } from './catalogs-updatable-hotel-attributes';


/**
 * Object describing an hotel item batch record
 */
export interface CatalogsUpdateHotelItem { 
  attributes: CatalogsUpdatableHotelAttributes;
  /**
   * The catalog hotel item id in the merchant namespace
   */
  hotel_id: string;
  operation: CatalogsUpdateHotelItem.OperationEnum;
}
export namespace CatalogsUpdateHotelItem {
  export const OperationEnum = {
    Update: 'UPDATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


