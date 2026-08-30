import { Keyword } from './keyword';
import { KeywordError } from './keyword-error';


export interface Keywords { 
  /**
   * Keyword error
   */
  readonly errors: Array<KeywordError>;
  /**
   * Keywords
   */
  keywords: Array<Keyword>;
}

