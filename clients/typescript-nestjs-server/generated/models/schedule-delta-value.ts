import { BidOptionsPlacementMultipliers } from './bid-options-placement-multipliers';
import { BidOptionsGenderMultipliers } from './bid-options-gender-multipliers';
import { ScheduleBidMultipliers } from './schedule-bid-multipliers';
import { BidOptionsAppTypeMultipliers } from './bid-options-app-type-multipliers';
import { BidOptionsAudienceMultipliers } from './bid-options-audience-multipliers';
import { BidOptionsAgeBucketMultipliers } from './bid-options-age-bucket-multipliers';


/**
 * The value of the scheduled adjustment.
 */
export interface ScheduleDeltaValue { 
  age_bucket_multipliers?: BidOptionsAgeBucketMultipliers;
  app_type_multipliers?: BidOptionsAppTypeMultipliers;
  audience_multipliers?: Array<BidOptionsAudienceMultipliers>;
  gender_multipliers?: BidOptionsGenderMultipliers;
  placement_multipliers?: BidOptionsPlacementMultipliers;
}

