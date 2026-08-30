import { AttributionWindows } from './attribution-windows';
import { ConversionEvent } from './conversion-event';


export interface ConversionTagV3GoalMetadata { 
  attribution_windows?: AttributionWindows;
  conversion_event?: ConversionEvent;
  conversion_tag_id?: string;
  cpa_goal_value_in_micro_currency?: string;
  /**
   * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
   */
  is_roas_optimized?: boolean | null;
  /**
   * Event name for custom or standard events mapped to an oCPM model
   */
  reporting_event?: string;
}
export namespace ConversionTagV3GoalMetadata {
}


