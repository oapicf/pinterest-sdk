import { Language } from './language';
import { Country } from './country';


/**
 * Object uniquely identifying a retail catalog item
 */
export interface AdvancedAuctionKey { 
  country: Country;
  /**
   * The catalog retail item id in the merchant namespace
   */
  item_id: string;
  language: Language;
}
export namespace AdvancedAuctionKey {
}


