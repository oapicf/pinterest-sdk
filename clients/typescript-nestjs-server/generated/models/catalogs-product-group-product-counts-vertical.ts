import { CatalogsRetailProductGroupProductCounts } from './catalogs-retail-product-group-product-counts';
import { CatalogsCreativeAssetsProductGroupProductCounts } from './catalogs-creative-assets-product-group-product-counts';
import { CatalogsHotelProductGroupProductCounts } from './catalogs-hotel-product-group-product-counts';


/**
 * Product counts for a CatalogsProductGroup
 */
/**
 * @type CatalogsProductGroupProductCountsVertical
 * Product counts for a CatalogsProductGroup
 * @export
 */
export type CatalogsProductGroupProductCountsVertical = CatalogsCreativeAssetsProductGroupProductCounts | CatalogsHotelProductGroupProductCounts | CatalogsRetailProductGroupProductCounts;

