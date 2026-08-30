import { ScheduleBidOptionsGenderMultipliers } from './schedule-bid-options-gender-multipliers';
import { ScheduleBidOptionsPlacementMultipliers } from './schedule-bid-options-placement-multipliers';
import { ScheduleAppTypeMultipliers } from './schedule-app-type-multipliers';
import { ScheduleAgeBucketMultipliers } from './schedule-age-bucket-multipliers';
import { ScheduleAudienceMultipliers } from './schedule-audience-multipliers';


/**
 * Object describing the schedule level bid level changes.
 */
export interface ScheduleBidOptions { 
  age_bucket_multipliers?: ScheduleAgeBucketMultipliers | null;
  app_type_multipliers?: ScheduleAppTypeMultipliers | null;
  audience_multipliers?: ScheduleAudienceMultipliers;
  gender_multipliers?: ScheduleBidOptionsGenderMultipliers | null;
  placement_multipliers?: ScheduleBidOptionsPlacementMultipliers | null;
}

