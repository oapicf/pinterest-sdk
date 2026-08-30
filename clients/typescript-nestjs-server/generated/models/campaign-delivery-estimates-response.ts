import { CampaignDeliveryEstimatesDerivedMetrics } from './campaign-delivery-estimates-derived-metrics';
import { CampaignPlanningCurveEstimate } from './campaign-planning-curve-estimate';


/**
 * Delivery estimates response for a campaign.
 */
export interface CampaignDeliveryEstimatesResponse { 
  /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   */
  curves?: Array<CampaignPlanningCurveEstimate>;
  derived_metrics?: CampaignDeliveryEstimatesDerivedMetrics;
  /**
   * Maximum potential spend estimate.
   */
  max_potential_spend?: number;
}

