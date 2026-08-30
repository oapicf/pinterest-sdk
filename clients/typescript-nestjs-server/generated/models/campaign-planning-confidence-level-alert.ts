import { CampaignPlanningConfidenceLevelAlertReason } from './campaign-planning-confidence-level-alert-reason';
import { CampaignPlanningConfidenceLevelAlertSeverity } from './campaign-planning-confidence-level-alert-severity';


/**
 * A confidence level alert for the delivery estimates provided in the response.
 */
export interface CampaignPlanningConfidenceLevelAlert { 
  /**
   * Human-readable context for debugging. Not intended for display to end users.
   */
  description?: string;
  /**
   * Reason for the confidence level alert.
   */
  reason?: CampaignPlanningConfidenceLevelAlertReason;
  /**
   * Severity of the confidence level alert.
   */
  severity?: CampaignPlanningConfidenceLevelAlertSeverity;
}
export namespace CampaignPlanningConfidenceLevelAlert {
}


