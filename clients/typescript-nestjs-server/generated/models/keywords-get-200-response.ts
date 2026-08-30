import { Keyword } from './keyword';


export interface KeywordsGet200Response { 
  bookmark?: string | null;
  items: Array<Keyword>;
}

