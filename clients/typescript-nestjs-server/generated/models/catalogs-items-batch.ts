import { CatalogsCreativeAssetsItemsBatch } from './catalogs-creative-assets-items-batch';
import { CreativeAssetsProcessingRecord } from './creative-assets-processing-record';
import { CatalogsRetailItemsBatch } from './catalogs-retail-items-batch';
import { BatchOperationStatus } from './batch-operation-status';
import { CatalogsHotelItemsBatch } from './catalogs-hotel-items-batch';


/**
 * Object describing the catalogs items batch
 */
/**
 * @type CatalogsItemsBatch
 * Object describing the catalogs items batch
 * @export
 */
export type CatalogsItemsBatch = CatalogsCreativeAssetsItemsBatch | CatalogsHotelItemsBatch | CatalogsRetailItemsBatch;

