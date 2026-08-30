import { BidFloorSpec } from './bid-floor-spec';
import { TargetingSpecOptimal } from './targeting-spec-optimal';


/**
 * Resource create operation model.
 */
export interface BidFloorCreate { 
  /**
   * List of bid floor specifications.
   */
  bid_floor_specs: Array<BidFloorSpec>;
  /**
   * Ad group targeting specification defining the ad group target audience.
   */
  targeting_spec?: TargetingSpecOptimal;
}

