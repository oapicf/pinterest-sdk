import { CatalogsCreativeAssetsItemsPostFilter } from './catalogs-creative-assets-items-post-filter';
import { CatalogsHotelItemsPostFilter } from './catalogs-hotel-items-post-filter';
import { CatalogsRetailItemsPostFilter } from './catalogs-retail-items-post-filter';


/**
 * @type CatalogsItemsPostFilters
 * @export
 */
export type CatalogsItemsPostFilters = CatalogsCreativeAssetsItemsPostFilter | CatalogsHotelItemsPostFilter | CatalogsRetailItemsPostFilter;

