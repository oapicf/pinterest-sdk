import { CampaignPlanningExperimentBudgetRecommendation } from './campaign-planning-experiment-budget-recommendation';
import { CampaignPlanningBudgetRecommendationPoint } from './campaign-planning-budget-recommendation-point';


/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */
export interface CampaignPlanningBudgetRecommendation { 
  /**
   * The recommended budget amount.
   */
  budget_recommendation?: number;
  /**
   * List of experimental budget recommendations.
   */
  experiment_campaign_budget_recommendation?: Array<CampaignPlanningExperimentBudgetRecommendation>;
  /**
   * Recommended number of days for the campaign lifetime.
   */
  lifetime_days_recommendation?: number;
  /**
   * List of point estimations for different budget scenarios.
   */
  point_estimations?: Array<CampaignPlanningBudgetRecommendationPoint>;
}

