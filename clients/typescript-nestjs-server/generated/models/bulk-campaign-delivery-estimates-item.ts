import { CampaignPlanningAdGroupAudienceSize } from './campaign-planning-ad-group-audience-size';
import { CampaignPlanningConversionRate } from './campaign-planning-conversion-rate';
import { CampaignPlanningResponseError } from './campaign-planning-response-error';
import { CampaignDeliveryEstimatesDerivedMetrics } from './campaign-delivery-estimates-derived-metrics';
import { CampaignPlanningCurveEstimate } from './campaign-planning-curve-estimate';


/**
 * Delivery estimate result for a single campaign within a bulk request.
 */
export interface BulkCampaignDeliveryEstimatesItem { 
  /**
   * Range audience sizes for each ad group, in the same order as the ad groups in the request.
   */
  adgroup_audience_sizes?: Array<CampaignPlanningAdGroupAudienceSize>;
  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
   */
  conversion_rate?: number;
  /**
   * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
   */
  conversion_rates?: Array<CampaignPlanningConversionRate>;
  /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   */
  curves?: Array<CampaignPlanningCurveEstimate>;
  derived_metrics?: CampaignDeliveryEstimatesDerivedMetrics;
  /**
   * Errors encountered during estimation for this campaign.
   */
  errors?: Array<CampaignPlanningResponseError>;
  /**
   * UUID used to track delivery estimates when they are generated as part of a saved campaign.
   */
  estimate_id?: string;
  /**
   * Maximum potential spend estimate.
   */
  max_potential_spend?: number;
}

