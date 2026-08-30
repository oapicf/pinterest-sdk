import { AdvancedAuctionItemsSubmitRecord } from './advanced-auction-items-submit-record';


/**
 * Response object containing the results of an operation on an item bid option
 */
export interface AdvancedAuctionProcessedItems { 
  /**
   * Catalog id pertaining to all items
   */
  catalog_id?: string;
  /**
   * Array of advanced auction processed items
   */
  items?: Array<AdvancedAuctionItemsSubmitRecord>;
}

