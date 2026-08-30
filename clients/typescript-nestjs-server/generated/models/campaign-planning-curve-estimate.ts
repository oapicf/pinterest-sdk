import { CampaignPlanningPointEstimate } from './campaign-planning-point-estimate';
import { CampaignPlanningEstimationType } from './campaign-planning-estimation-type';


export interface CampaignPlanningCurveEstimate { 
  /**
   * Estimation type for campaign planning estimated curve
   */
  estimation_type?: CampaignPlanningEstimationType;
  /**
   * The estimation points that make up the estimated curve.
   */
  points?: Array<CampaignPlanningPointEstimate>;
}
export namespace CampaignPlanningCurveEstimate {
}


