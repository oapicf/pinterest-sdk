import { AdvancedAuctionItem } from './advanced-auction-item';


/**
 * Response object containing item bid options
 */
export interface AdvancedAuctionItems { 
  /**
   * Response object of item bid options
   */
  catalog_id?: string;
  /**
   * Array with item bid options
   */
  items?: Array<AdvancedAuctionItem>;
}

