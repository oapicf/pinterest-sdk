import { ItemProcessingRecord } from './item-processing-record';
import { BatchOperationStatus } from './batch-operation-status';


/**
 * Object describing the catalogs retail items batch
 */
export interface CatalogsRetailItemsBatch { 
  /**
   * Id of the catalogs items batch
   */
  batch_id?: string;
  catalog_type: CatalogsRetailItemsBatch.CatalogTypeEnum;
  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD\'T\'hh:mm:ss
   */
  completed_time?: string | null;
  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD\'T\'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.
   */
  created_time: string | null;
  /**
   * Array with the catalogs items processing records part of the catalogs items batch
   */
  items?: Array<ItemProcessingRecord>;
  status?: BatchOperationStatus;
}
export namespace CatalogsRetailItemsBatch {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


