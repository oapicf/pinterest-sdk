import { CatalogsFeedProcessingResult } from './catalogs-feed-processing-result';


export interface FeedProcessingResultsList200Response { 
  bookmark?: string | null;
  items: Array<CatalogsFeedProcessingResult>;
}

