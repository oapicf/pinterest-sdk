import { Catalog } from './catalog';


export interface CatalogsList200Response { 
  bookmark?: string | null;
  items: Array<Catalog>;
}

