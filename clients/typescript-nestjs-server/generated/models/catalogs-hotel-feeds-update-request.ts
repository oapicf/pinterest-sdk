import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';


/**
 * Request object for updating a feed.
 */
export interface CatalogsHotelFeedsUpdateRequest { 
  catalog_type: CatalogsHotelFeedsUpdateRequest.CatalogTypeEnum;
  credentials?: CatalogsFeedCredentials | null;
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
export namespace CatalogsHotelFeedsUpdateRequest {
  export const CatalogTypeEnum = {
    Hotel: 'HOTEL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


