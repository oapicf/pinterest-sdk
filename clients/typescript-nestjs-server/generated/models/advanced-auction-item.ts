import { Language } from './language';
import { Country } from './country';
import { AdvancedAuctionBidOptions } from './advanced-auction-bid-options';


export interface AdvancedAuctionItem { 
  bid_options: AdvancedAuctionBidOptions;
  country: Country;
  /**
   * The catalog retail item id in the merchant namespace
   */
  item_id: string;
  language: Language;
}
export namespace AdvancedAuctionItem {
}


