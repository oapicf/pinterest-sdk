import { BidOptionsPlacementMultipliers } from './bid-options-placement-multipliers';
import { BidOptionsGenderMultipliers } from './bid-options-gender-multipliers';
import { BidOptionsAppTypeMultipliers } from './bid-options-app-type-multipliers';
import { BidOptionsAudienceMultipliers } from './bid-options-audience-multipliers';
import { BidOptionsAgeBucketMultipliers } from './bid-options-age-bucket-multipliers';


/**
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 */
export interface ScheduleBidMultipliers { 
  age_bucket_multipliers?: BidOptionsAgeBucketMultipliers;
  app_type_multipliers?: BidOptionsAppTypeMultipliers;
  audience_multipliers?: Array<BidOptionsAudienceMultipliers>;
  gender_multipliers?: BidOptionsGenderMultipliers;
  placement_multipliers?: BidOptionsPlacementMultipliers;
}

