import { AdvancedAuctionItemsSubmitRecord } from './advanced-auction-items-submit-record';


/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */
export interface AdvancedAuctionItemsSubmitRequest { 
  /**
   * Catalog id pertaining to all items
   */
  catalog_id: string;
  /**
   * Array of item bid option operations
   */
  items: Array<AdvancedAuctionItemsSubmitRecord>;
}

