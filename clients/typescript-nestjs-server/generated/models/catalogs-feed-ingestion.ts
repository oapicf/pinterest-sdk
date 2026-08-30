import { CatalogsFeedProcessingStatus } from './catalogs-feed-processing-status';


export interface CatalogsFeedIngestion { 
  /**
   * Timestamp of the feed ingestion.
   */
  created_at: string;
  /**
   * Catalog Feed id pertaining to the feed ingestion.
   */
  feed_id: string;
  /**
   * Unique identifier of a feed ingestion.
   */
  id: string;
  /**
   * Status of the feed ingestion.
   */
  status: CatalogsFeedProcessingStatus;
}
export namespace CatalogsFeedIngestion {
}


