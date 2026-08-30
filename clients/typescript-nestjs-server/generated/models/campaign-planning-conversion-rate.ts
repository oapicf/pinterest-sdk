import { CampaignPlanningConversionEvent } from './campaign-planning-conversion-event';
import { CampaignPlanningConversionAttribution } from './campaign-planning-conversion-attribution';


/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */
export interface CampaignPlanningConversionRate { 
  attribution_windows: CampaignPlanningConversionAttribution;
  conversion_event: CampaignPlanningConversionEvent;
  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
   */
  conversion_rate: number;
}
export namespace CampaignPlanningConversionRate {
}


