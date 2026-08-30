

/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */
export interface CampaignPlanningPointEstimate { 
  /**
   * The budget value of the point.
   */
  budget: number;
  /**
   * Y value as a decimal.
   */
  double_y: number | null;
  /**
   * The maximum Y value of the point.
   */
  max_y: number | null;
  /**
   * The minimum Y value of the point.
   */
  min_y: number | null;
  /**
   * The expected Y value of the point.
   */
  y: number | null;
}

