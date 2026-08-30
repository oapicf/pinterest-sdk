import { ItemDeleteBatchRecord } from './item-delete-batch-record';
import { CatalogsItemsBatchRequest } from './catalogs-items-batch-request';
import { Country } from './country';
import { CatalogsVerticalBatchRequest } from './catalogs-vertical-batch-request';


/**
 * @type CatalogsItemsBatchPostRequest
 * @export
 */
export type CatalogsItemsBatchPostRequest = CatalogsItemsBatchRequest | CatalogsVerticalBatchRequest;

