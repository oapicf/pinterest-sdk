import { KeywordInfo } from './keyword-info';


/**
 * Information of the published editorial article.
 */
export interface TrendsEditorial { 
  /**
   * URL of the editorial board
   */
  board_url: string;
  /**
   * Description of the editorial article
   */
  description: string;
  /**
   * List of interests related to the editorial article
   */
  interests: Array<string>;
  /**
   * URL of the pins related to the editorial article
   */
  pins_url: Array<string>;
  /**
   * List of keywords related to the editorial article
   */
  related_keywords: Array<KeywordInfo>;
  /**
   * Title of the editorial article
   */
  title: string;
}

