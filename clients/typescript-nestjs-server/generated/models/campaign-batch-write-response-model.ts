import { CampaignBatchItem } from './campaign-batch-item';


/**
 * Response model for batch campaign write operations.
 */
export interface CampaignBatchWriteResponseModel { 
  items: Array<CampaignBatchItem>;
}

