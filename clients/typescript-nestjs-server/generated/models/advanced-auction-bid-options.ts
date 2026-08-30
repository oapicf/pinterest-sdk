import { AppTypeMultipliers } from './app-type-multipliers';
import { PlacementMultipliers } from './placement-multipliers';


/**
 * Object describing a retail catalog item\'s bid options (bid price and bid multipliers).
 */
export interface AdvancedAuctionBidOptions { 
  app_type_multipliers?: AppTypeMultipliers | null;
  /**
   * Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group\'s `bid_in_micro_currency`.
   */
  bid_in_micro_currency?: number | null;
  placement_multipliers?: PlacementMultipliers | null;
}

