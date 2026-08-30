import { CatalogsHotelAttributes } from './catalogs-hotel-attributes';


/**
 * A hotel item to be created.
 */
export interface CatalogsCreateHotelItem { 
  attributes: CatalogsHotelAttributes;
  /**
   * The catalog hotel id in the merchant namespace
   */
  hotel_id: string;
  operation: CatalogsCreateHotelItem.OperationEnum;
}
export namespace CatalogsCreateHotelItem {
  export const OperationEnum = {
    Create: 'CREATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


