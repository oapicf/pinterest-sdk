import { CatalogsCreativeAssetsProductGroupUpdateRequest } from './catalogs-creative-assets-product-group-update-request';
import { CatalogsLocale } from './catalogs-locale';
import { CatalogsRetailProductGroupUpdateRequest } from './catalogs-retail-product-group-update-request';
import { Country } from './country';
import { CatalogsHotelProductGroupUpdateRequest } from './catalogs-hotel-product-group-update-request';
import { CatalogsCreativeAssetsProductGroupFilters } from './catalogs-creative-assets-product-group-filters';


/**
 * Request object for updating a catalog based product group.
 */
/**
 * @type CatalogsVerticalProductGroupUpdateRequest
 * Request object for updating a catalog based product group.
 * @export
 */
export type CatalogsVerticalProductGroupUpdateRequest = CatalogsCreativeAssetsProductGroupUpdateRequest | CatalogsHotelProductGroupUpdateRequest | CatalogsRetailProductGroupUpdateRequest;

