import { IntendedPromotionType } from './intended-promotion-type';
import { CampaignBidOptionsUpdate } from './campaign-bid-options-update';
import { ObjectiveType } from './objective-type';


export interface CampaignUpdateRequestAllOf2 { 
  bid_options?: CampaignBidOptionsUpdate | null;
  intended_promotion_type?: IntendedPromotionType;
  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   */
  is_ltv_optimized?: boolean;
  /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
   */
  is_performance_plus?: boolean;
  /**
   * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
   */
  is_top_of_search?: boolean;
  objective_type?: ObjectiveType | null;
}
export namespace CampaignUpdateRequestAllOf2 {
}


