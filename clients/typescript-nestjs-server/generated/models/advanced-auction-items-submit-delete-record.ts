import { Language } from './language';
import { Country } from './country';
import { AdvancedAuctionOperationError } from './advanced-auction-operation-error';


/**
 * Object describing an item bid option deletion operation
 */
export interface AdvancedAuctionItemsSubmitDeleteRecord { 
  country: Country;
  /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   */
  errors?: Array<AdvancedAuctionOperationError>;
  /**
   * The catalog retail item id in the merchant namespace
   */
  item_id: string;
  language: Language;
  operation: AdvancedAuctionItemsSubmitDeleteRecord.OperationEnum;
}
export namespace AdvancedAuctionItemsSubmitDeleteRecord {
  export const OperationEnum = {
    Delete: 'DELETE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


