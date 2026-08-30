import { CatalogsLocale } from './catalogs-locale';
import { CatalogsVerticalProductGroupCreateRequest } from './catalogs-vertical-product-group-create-request';
import { Country } from './country';
import { CatalogsProductGroupCreateRequest } from './catalogs-product-group-create-request';
import { CatalogsProductGroupFiltersRequest } from './catalogs-product-group-filters-request';


/**
 * @type CatalogsProductGroupsCreateRequestSchema
 * @export
 */
export type CatalogsProductGroupsCreateRequestSchema = CatalogsProductGroupCreateRequest | CatalogsVerticalProductGroupCreateRequest;

