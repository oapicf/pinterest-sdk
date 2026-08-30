import { AdvancedAuctionKey } from './advanced-auction-key';


/**
 * Request object used to get bid options values for a batch of retail catalog items
 */
export interface AdvancedAuctionItemsGetRequest { 
  /**
   * Catalog id pertaining to the retail item
   */
  catalog_id: string;
  /**
   * A list of retail catalog items to fetch bid options for
   */
  items: Array<AdvancedAuctionKey>;
}

