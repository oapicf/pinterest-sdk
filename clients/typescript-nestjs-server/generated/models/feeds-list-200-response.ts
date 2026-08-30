import { CatalogsFeed } from './catalogs-feed';


export interface FeedsList200Response { 
  bookmark?: string | null;
  items: Array<CatalogsFeed>;
}

