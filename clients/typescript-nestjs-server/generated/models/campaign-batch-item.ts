import { CampaignBatchResponseData } from './campaign-batch-response-data';
import { Exception } from './exception';


/**
 * Item in a batch campaign response.
 */
export interface CampaignBatchItem { 
  /**
   * Campaign data on success.
   */
  data?: CampaignBatchResponseData;
  /**
   * Exceptions on failure.
   */
  exceptions?: Array<Exception>;
}

