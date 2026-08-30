import { CatalogsType } from './catalogs-type';


/**
 * Resource create or update operation model.
 */
export interface CatalogUpdate { 
  catalog_type?: CatalogsType;
  /**
   * A human-friendly name associated to a catalog entity.
   */
  name?: string;
}
export namespace CatalogUpdate {
}


