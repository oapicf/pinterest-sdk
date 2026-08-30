import { FrequencyGoalMetadataTimerange } from './frequency-goal-metadata-timerange';


/**
 * Frequency target can only be between 2 and 20
 */
export interface FrequencyGoalMetadata { 
  frequency?: number;
  timerange?: FrequencyGoalMetadataTimerange;
}
export namespace FrequencyGoalMetadata {
}


