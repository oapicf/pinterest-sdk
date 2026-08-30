import { Language } from './language';
import { UpdateMaskBidOptionField } from './update-mask-bid-option-field';
import { Country } from './country';
import { AdvancedAuctionBidOptions } from './advanced-auction-bid-options';
import { AdvancedAuctionOperationError } from './advanced-auction-operation-error';


/**
 * Object describing an item bid option upsert operation
 */
export interface AdvancedAuctionItemsSubmitUpsertRecord { 
  bid_options: AdvancedAuctionBidOptions;
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
  operation: AdvancedAuctionItemsSubmitUpsertRecord.OperationEnum;
  /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
   */
  update_mask: Array<UpdateMaskBidOptionField> | null;
}
export namespace AdvancedAuctionItemsSubmitUpsertRecord {
  export const OperationEnum = {
    Upsert: 'UPSERT'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


