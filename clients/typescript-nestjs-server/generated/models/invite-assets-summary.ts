import { InviteAssetsSummaryItem } from './invite-assets-summary-item';


/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
export interface InviteAssetsSummary { 
  /**
   * List of ad account IDs and respective permission levels that will be assigned.
   */
  ad_accounts?: Array<InviteAssetsSummaryItem>;
  /**
   * List of profile IDs and respective permission levels that will be assigned.
   */
  profiles?: Array<InviteAssetsSummaryItem>;
}

