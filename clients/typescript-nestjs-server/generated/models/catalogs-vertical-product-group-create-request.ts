import { CatalogsHotelProductGroupCreateRequest } from './catalogs-hotel-product-group-create-request';
import { CatalogsLocale } from './catalogs-locale';
import { Country } from './country';
import { CatalogsCreativeAssetsProductGroupCreateRequest } from './catalogs-creative-assets-product-group-create-request';
import { CatalogsRetailProductGroupCreateRequest } from './catalogs-retail-product-group-create-request';
import { CatalogsCreativeAssetsProductGroupFilters } from './catalogs-creative-assets-product-group-filters';


/**
 * Request object for creating a catalog based product group.
 */
/**
 * @type CatalogsVerticalProductGroupCreateRequest
 * Request object for creating a catalog based product group.
 * @export
 */
export type CatalogsVerticalProductGroupCreateRequest = CatalogsCreativeAssetsProductGroupCreateRequest | CatalogsHotelProductGroupCreateRequest | CatalogsRetailProductGroupCreateRequest;

