import { KeywordUpdateItem } from './keyword-update-item';


/**
 * Resource create or update operation model.
 */
export interface KeywordsUpdate { 
  /**
   * Keywords
   */
  keywords?: Array<KeywordUpdateItem>;
}

