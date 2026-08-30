import { CatalogsCreativeAssetsProductMetadata } from './catalogs-creative-assets-product-metadata';
import { CatalogsRetailProduct } from './catalogs-retail-product';
import { Pin } from './pin';
import { CatalogsCreativeAssetsProduct } from './catalogs-creative-assets-product';
import { CatalogsHotelProduct } from './catalogs-hotel-product';


/**
 * @type CatalogsProduct
 * @export
 */
export type CatalogsProduct = CatalogsCreativeAssetsProduct | CatalogsHotelProduct | CatalogsRetailProduct;

