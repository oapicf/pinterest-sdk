import { CatalogsType } from './catalogs-type';


/**
 * Resource create operation model.
 */
export interface CatalogCreate { 
  catalog_type: CatalogsType;
  /**
   * A human-friendly name associated to a catalog entity.
   */
  name: string;
}
export namespace CatalogCreate {
}


