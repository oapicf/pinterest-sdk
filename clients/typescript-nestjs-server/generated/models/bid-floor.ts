

/**
 * Bid floor request and response model.
 */
export interface BidFloor { 
  /**
   * A list of bid floors in micro currency. For example, [100000, 200000]
   */
  readonly bid_floors?: Array<number>;
  /**
   * Always the string \'bidfloor\'.
   */
  readonly type?: string;
}

