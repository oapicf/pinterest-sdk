import { FreqBidMultiplierTimeWindow } from './freq-bid-multiplier-time-window';
import { AgeBucketMultipliers } from './age-bucket-multipliers';
import { FrequencyMultipliers } from './frequency-multipliers';
import { GenderMultipliers } from './gender-multipliers';
import { CampaignAudienceMultipliers } from './campaign-audience-multipliers';
import { AppTypeMultipliers } from './app-type-multipliers';
import { PlacementMultipliers } from './placement-multipliers';


/**
 * Object describing the campaign level bid multipliers.
 */
export interface CampaignBidOptions { 
  /**
   * Age bucket multipliers for bid adjustments.
   */
  age_bucket_multipliers?: AgeBucketMultipliers | null;
  /**
   * App type multipliers for bid adjustments.
   */
  app_type_multipliers?: AppTypeMultipliers | null;
  /**
   * Audience multipliers for bid adjustments.
   */
  audience_multipliers?: CampaignAudienceMultipliers;
  /**
   * The time window for frequency bid multipliers.
   */
  freq_bid_multiplier_time_window?: FreqBidMultiplierTimeWindow | null;
  /**
   * Frequency multipliers for bid adjustments.
   */
  frequency_multipliers?: FrequencyMultipliers | null;
  /**
   * Gender multipliers for bid adjustments.
   */
  gender_multipliers?: GenderMultipliers | null;
  /**
   * Placement multipliers for bid adjustments.
   */
  placement_multipliers?: PlacementMultipliers | null;
}
export namespace CampaignBidOptions {
}


