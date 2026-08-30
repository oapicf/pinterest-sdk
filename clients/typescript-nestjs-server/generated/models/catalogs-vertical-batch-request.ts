import { CatalogsCreativeAssetsBatchRequest } from './catalogs-creative-assets-batch-request';
import { CatalogsCreativeAssetsBatchItem } from './catalogs-creative-assets-batch-item';
import { CatalogsHotelBatchRequest } from './catalogs-hotel-batch-request';
import { Country } from './country';
import { CatalogsRetailBatchRequest } from './catalogs-retail-batch-request';


/**
 * A request object that can have multiple operations on a single batch
 */
/**
 * @type CatalogsVerticalBatchRequest
 * A request object that can have multiple operations on a single batch
 * @export
 */
export type CatalogsVerticalBatchRequest = CatalogsCreativeAssetsBatchRequest | CatalogsHotelBatchRequest | CatalogsRetailBatchRequest;

