/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CatalogsCreativeAssetsItemsBatch } from './catalogsCreativeAssetsItemsBatch';
import { CreativeAssetsProcessingRecord } from './creativeAssetsProcessingRecord';
import { CatalogsRetailItemsBatch } from './catalogsRetailItemsBatch';
import { CatalogsType } from './catalogsType';
import { BatchOperationStatus } from './batchOperationStatus';
import { CatalogsHotelItemsBatch } from './catalogsHotelItemsBatch';


/**
 * Object describing the catalogs items batch
 */
/**
 * @type CatalogsItemsBatch
 * Object describing the catalogs items batch
 * @export
 */
export type CatalogsItemsBatch = CatalogsCreativeAssetsItemsBatch | CatalogsHotelItemsBatch | CatalogsRetailItemsBatch;

