import { BulkCampaignDeliveryEstimatesItem } from './bulk-campaign-delivery-estimates-item';


/**
 * Bulk campaign delivery estimates response.
 */
export interface BulkCampaignDeliveryEstimatesResponse { 
  /**
   * Per-campaign delivery estimate results, in the same order as the request.
   */
  data: Array<BulkCampaignDeliveryEstimatesItem>;
}

