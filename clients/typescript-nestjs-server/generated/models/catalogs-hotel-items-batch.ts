import { HotelProcessingRecord } from './hotel-processing-record';
import { BatchOperationStatus } from './batch-operation-status';


/**
 * Object describing the catalogs hotel items batch. If specified, you must provide all properties.
 */
export interface CatalogsHotelItemsBatch { 
  /**
   * Id of the catalogs items batch
   */
  batch_id?: string;
  catalog_type: CatalogsHotelItemsBatch.CatalogTypeEnum;
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
  items?: Array<HotelProcessingRecord>;
  status?: BatchOperationStatus;
}
export namespace CatalogsHotelItemsBatch {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


