import { CreativeAssetsProcessingRecord } from './creative-assets-processing-record';
import { BatchOperationStatus } from './batch-operation-status';


/**
 * Object describing the catalogs creative assets items batch
 */
export interface CatalogsCreativeAssetsItemsBatch { 
  /**
   * Id of the catalogs items batch
   */
  batch_id?: string;
  catalog_type: CatalogsCreativeAssetsItemsBatch.CatalogTypeEnum;
  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD\'T\'hh:mm:ss
   */
  completed_time?: string | null;
  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD\'T\'hh:mm:ss
   */
  created_time?: string;
  /**
   * Array with the catalogs items processing records part of the catalogs items batch
   */
  items?: Array<CreativeAssetsProcessingRecord>;
  status?: BatchOperationStatus;
}
export namespace CatalogsCreativeAssetsItemsBatch {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


