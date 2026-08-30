import { CampaignPlanningConversionAttributionWindowDays } from './campaign-planning-conversion-attribution-window-days';


/**
 * Attribution windows for a conversion event.
 */
export interface CampaignPlanningConversionAttribution { 
  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   */
  click_window_days?: CampaignPlanningConversionAttributionWindowDays;
  /**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
   */
  engagement_window_days?: CampaignPlanningConversionAttributionWindowDays;
  /**
   * Number of days to use as the conversion attribution window for a view action.
   */
  view_window_days?: CampaignPlanningConversionAttributionWindowDays;
}
export namespace CampaignPlanningConversionAttribution {
}


