

/**
 * Error which occurred when applying a bid options operation to a specific item.
 */
export interface AdvancedAuctionOperationError { 
  /**
   * The error code for the item bid option operation validation error
   */
  code?: number;
  /**
   * Message describing the item bid option operation validation error
   */
  message?: string;
}

