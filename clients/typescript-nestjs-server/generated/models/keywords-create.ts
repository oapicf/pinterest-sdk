import { KeywordCreateItem } from './keyword-create-item';


/**
 * Resource create operation model.
 */
export interface KeywordsCreate { 
  /**
   * Keywords
   */
  keywords: Array<KeywordCreateItem>;
  /**
   * Keyword data
   */
  parent_id: string;
}

