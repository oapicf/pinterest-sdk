import { CampaignPlanningBudgetRecommendationPoint } from './campaign-planning-budget-recommendation-point';


/**
 * Experimental budget recommendation for a single experiment version.
 */
export interface CampaignPlanningExperimentBudgetRecommendation { 
  /**
   * Recommended budget for this experiment version.
   */
  budget_recommendation?: number;
  /**
   * Recommended lifetime days for this experiment.
   */
  lifetime_days_recommendation?: number;
  /**
   * Point estimations for this experiment version.
   */
  point_estimations?: Array<CampaignPlanningBudgetRecommendationPoint>;
  /**
   * Version identifier for the experiment.
   */
  version_id?: string;
}

