import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { ProductAvailabilityType } from './product-availability-type';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';


/**
 * Request object for updating a feed.
 */
export interface CatalogsFeedsUpdateRequest { 
  credentials?: CatalogsFeedCredentials | null;
  default_availability?: ProductAvailabilityType | null;
  default_currency?: NullableCurrency | null;
  format?: CatalogsFormat;
  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   */
  location?: string;
  /**
   * A human-friendly name associated to a given feed.
   */
  name?: string;
  preferred_processing_schedule?: CatalogsFeedProcessingSchedule | null;
  status?: CatalogsStatus;
}
export namespace CatalogsFeedsUpdateRequest {
}


