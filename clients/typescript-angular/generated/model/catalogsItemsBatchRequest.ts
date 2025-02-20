/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { ItemDeleteBatchRecord } from './itemDeleteBatchRecord';
import { CatalogsItemsUpsertBatchRequest } from './catalogsItemsUpsertBatchRequest';
import { CatalogsItemsCreateBatchRequest } from './catalogsItemsCreateBatchRequest';
import { CatalogsItemsUpdateBatchRequest } from './catalogsItemsUpdateBatchRequest';
import { Country } from './country';
import { BatchOperation } from './batchOperation';
import { CatalogsItemsDeleteBatchRequest } from './catalogsItemsDeleteBatchRequest';
import { CatalogsItemsRequestLanguage } from './catalogsItemsRequestLanguage';
import { CatalogsItemsDeleteDiscontinuedBatchRequest } from './catalogsItemsDeleteDiscontinuedBatchRequest';


/**
 * Request object of catalogs items batch
 */
/**
 * @type CatalogsItemsBatchRequest
 * Request object of catalogs items batch
 * @export
 */
export type CatalogsItemsBatchRequest = CatalogsItemsCreateBatchRequest | CatalogsItemsDeleteBatchRequest | CatalogsItemsDeleteDiscontinuedBatchRequest | CatalogsItemsUpdateBatchRequest | CatalogsItemsUpsertBatchRequest;

