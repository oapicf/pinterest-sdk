import { CatalogsRetailAvailableFilterValues } from './catalogs-retail-available-filter-values';
import { CatalogsCreativeAssetsAvailableFilterValues } from './catalogs-creative-assets-available-filter-values';
import { CatalogsHotelAvailableFilterValues } from './catalogs-hotel-available-filter-values';
import { CatalogsCreativeAssetsFilterValuesMap } from './catalogs-creative-assets-filter-values-map';


/**
 * Object holding available filter values for each filter key
 */
/**
 * @type CatalogsAvailableFilterValues
 * Object holding available filter values for each filter key
 * @export
 */
export type CatalogsAvailableFilterValues = CatalogsCreativeAssetsAvailableFilterValues | CatalogsHotelAvailableFilterValues | CatalogsRetailAvailableFilterValues;

