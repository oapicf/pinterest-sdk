import { ItemDeleteBatchRecord } from './item-delete-batch-record';
import { CatalogsItemsUpsertBatchRequest } from './catalogs-items-upsert-batch-request';
import { CatalogsItemsCreateBatchRequest } from './catalogs-items-create-batch-request';
import { CatalogsItemsUpdateBatchRequest } from './catalogs-items-update-batch-request';
import { Country } from './country';
import { CatalogsItemsDeleteBatchRequest } from './catalogs-items-delete-batch-request';
import { CatalogsItemsDeleteDiscontinuedBatchRequest } from './catalogs-items-delete-discontinued-batch-request';


/**
 * Request object of catalogs items batch
 */
/**
 * @type CatalogsItemsBatchRequest
 * Request object of catalogs items batch
 * @export
 */
export type CatalogsItemsBatchRequest = CatalogsItemsCreateBatchRequest | CatalogsItemsDeleteBatchRequest | CatalogsItemsDeleteDiscontinuedBatchRequest | CatalogsItemsUpdateBatchRequest | CatalogsItemsUpsertBatchRequest;

