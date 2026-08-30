import { KeywordsCommon } from './keywords-common';


export interface KeywordsRequest { 
  /**
   * Keyword JSON array. Each array element has 3 fields
   */
  keywords: Array<KeywordsCommon>;
  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   */
  parent_id: string;
}

