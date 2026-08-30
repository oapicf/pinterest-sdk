import { ScrollupGoalMetadata } from './scrollup-goal-metadata';
import { FrequencyGoalMetadata } from './frequency-goal-metadata';
import { ConversionTagV3GoalMetadata } from './conversion-tag-v3-goal-metadata';


export interface OptimizationGoalMetadata { 
  conversion_tag_v3_goal_metadata?: ConversionTagV3GoalMetadata;
  frequency_goal_metadata?: FrequencyGoalMetadata;
  scrollup_goal_metadata?: ScrollupGoalMetadata;
}

