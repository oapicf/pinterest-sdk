import { TargetingTemplateAudienceSizingReachEstimate } from './targeting-template-audience-sizing-reach-estimate';


/**
 * Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
 */
export interface TargetingTemplateAudienceSizing { 
  reach_estimate?: TargetingTemplateAudienceSizingReachEstimate;
}

