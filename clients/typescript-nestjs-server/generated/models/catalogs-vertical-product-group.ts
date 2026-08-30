import { CatalogsRetailProductGroup } from './catalogs-retail-product-group';
import { CatalogsProductGroupStatus } from './catalogs-product-group-status';
import { CatalogsCreativeAssetsProductGroup } from './catalogs-creative-assets-product-group';
import { CatalogsHotelProductGroupType } from './catalogs-hotel-product-group-type';
import { CatalogsCreativeAssetsProductGroupFilters } from './catalogs-creative-assets-product-group-filters';
import { CatalogsHotelProductGroup } from './catalogs-hotel-product-group';


/**
 * @type CatalogsVerticalProductGroup
 * @export
 */
export type CatalogsVerticalProductGroup = CatalogsCreativeAssetsProductGroup | CatalogsHotelProductGroup | CatalogsRetailProductGroup;

