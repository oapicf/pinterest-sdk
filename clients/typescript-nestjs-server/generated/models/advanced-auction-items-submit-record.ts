import { Language } from './language';
import { UpdateMaskBidOptionField } from './update-mask-bid-option-field';
import { AdvancedAuctionItemsSubmitUpsertRecord } from './advanced-auction-items-submit-upsert-record';
import { AdvancedAuctionItemsSubmitDeleteRecord } from './advanced-auction-items-submit-delete-record';
import { Country } from './country';
import { AdvancedAuctionBidOptions } from './advanced-auction-bid-options';
import { AdvancedAuctionOperationError } from './advanced-auction-operation-error';


/**
 * Object describing an item bid option operation
 */
/**
 * @type AdvancedAuctionItemsSubmitRecord
 * Object describing an item bid option operation
 * @export
 */
export type AdvancedAuctionItemsSubmitRecord = AdvancedAuctionItemsSubmitDeleteRecord | AdvancedAuctionItemsSubmitUpsertRecord;

