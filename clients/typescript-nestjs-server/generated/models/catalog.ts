import { CatalogsType } from './catalogs-type';


/**
 * Catalog entity
 */
export interface Catalog { 
  catalog_type: CatalogsType;
  readonly created_at: string;
  /**
   * ID of the catalog entity.
   */
  id: string;
  /**
   * A human-friendly name associated to a catalog entity.
   */
  name: string;
  readonly updated_at: string;
}
export namespace Catalog {
}


