import { ActionType } from './action-type';
import { Currency } from './currency';
import { OptimizationGoalMetadata } from './optimization-goal-metadata';
import { Country } from './country';
import { BidFloorObjectiveType } from './bid-floor-objective-type';
import { CreativeType } from './creative-type';


/**
 * Bid floor specification for a given campaign configuration.
 */
export interface BidFloorSpec { 
  /**
   * Ad group billable event type.
   */
  billable_event: ActionType;
  /**
   * List of ISO 3166-1 alpha-2 country codes.
   */
  countries?: Array<Country>;
  /**
   * Creative type for the bid floor request.
   */
  creative_type?: CreativeType;
  /**
   * Currency for the bid floor value.
   */
  currency: Currency;
  /**
   * Campaign objective type.
   */
  objective_type?: BidFloorObjectiveType;
  /**
   * Optimization goal metadata.
   */
  optimization_goal_metadata?: OptimizationGoalMetadata;
}
export namespace BidFloorSpec {
}


