import { CampaignPlanningResponseErrorCode } from './campaign-planning-response-error-code';


/**
 * Error encountered while estimating delivery for a campaign.
 */
export interface CampaignPlanningResponseError { 
  code?: CampaignPlanningResponseErrorCode;
  /**
   * Human-readable error message.
   */
  message?: string;
}
export namespace CampaignPlanningResponseError {
}


