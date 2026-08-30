import { CampaignPlanningPointEstimate } from './campaign-planning-point-estimate';
import { CampaignPlanningEstimationType } from './campaign-planning-estimation-type';


/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */
export interface CampaignPlanningBudgetRecommendationPoint { 
  /**
   * Estimation type for this point.
   */
  estimation_type?: CampaignPlanningEstimationType;
  /**
   * Point estimate data.
   */
  point_estimate?: CampaignPlanningPointEstimate;
}
export namespace CampaignPlanningBudgetRecommendationPoint {
}


