/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CatalogsCreativeAssetsBatchRequest } from './catalogsCreativeAssetsBatchRequest';
import { CatalogsCreativeAssetsBatchItem } from './catalogsCreativeAssetsBatchItem';
import { CatalogsHotelBatchRequest } from './catalogsHotelBatchRequest';
import { Country } from './country';
import { CatalogsItemsRequestLanguage } from './catalogsItemsRequestLanguage';
import { CatalogsRetailBatchRequest } from './catalogsRetailBatchRequest';


/**
 * A request object that can have multiple operations on a single batch
 */
/**
 * @type CatalogsVerticalBatchRequest
 * A request object that can have multiple operations on a single batch
 * @export
 */
export type CatalogsVerticalBatchRequest = CatalogsCreativeAssetsBatchRequest | CatalogsHotelBatchRequest | CatalogsRetailBatchRequest;

