import { Keyword } from './keyword';


export interface KeywordError { 
  data?: Keyword;
  error_messages?: Array<string>;
}

