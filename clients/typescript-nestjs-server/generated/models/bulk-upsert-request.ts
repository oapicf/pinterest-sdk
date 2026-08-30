import { BulkUpsertRequestCreate } from './bulk-upsert-request-create';
import { BulkUpsertRequestUpdate } from './bulk-upsert-request-update';


/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */
export interface BulkUpsertRequest { 
  create?: BulkUpsertRequestCreate;
  update?: BulkUpsertRequestUpdate;
}

