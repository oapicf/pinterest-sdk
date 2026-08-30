import { CatalogsFeedProductCounts } from './catalogs-feed-product-counts';
import { CatalogsFeedValidationDetails } from './catalogs-feed-validation-details';
import { CatalogsFeedProcessingStatus } from './catalogs-feed-processing-status';
import { CatalogsFeedVideoCounts } from './catalogs-feed-video-counts';
import { CatalogsFeedIngestionDetails } from './catalogs-feed-ingestion-details';


export interface CatalogsFeedProcessingResult { 
  readonly created_at: string;
  /**
   * ID of the feed processing result.
   */
  id: string;
  ingestion_details: CatalogsFeedIngestionDetails;
  product_counts: CatalogsFeedProductCounts | null;
  status: CatalogsFeedProcessingStatus;
  readonly updated_at: string;
  validation_details: CatalogsFeedValidationDetails;
  video_counts?: CatalogsFeedVideoCounts;
}
export namespace CatalogsFeedProcessingResult {
}


