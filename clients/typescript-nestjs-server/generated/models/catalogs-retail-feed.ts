import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { ProductAvailabilityType } from './product-availability-type';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { Country } from './country';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';


/**
 * Catalogs Retail Feed object
 */
export interface CatalogsRetailFeed { 
  catalog_type: CatalogsRetailFeed.CatalogTypeEnum;
  readonly created_at: string;
  credentials?: CatalogsFeedCredentials | null;
  default_availability?: ProductAvailabilityType | null;
  default_country: Country;
  default_currency?: NullableCurrency | null;
  /**
   * The locale used within a feed for product descriptions.
   */
  default_locale: string;
  format: CatalogsFormat;
  /**
   * ID of the feed entity.
   */
  readonly id: string;
  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   */
  location: string;
  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   */
  name: string | null;
  preferred_processing_schedule?: CatalogsFeedProcessingSchedule | null;
  status: CatalogsStatus;
  readonly updated_at: string;
}
export namespace CatalogsRetailFeed {
  export const CatalogTypeEnum = {
    Retail: 'RETAIL'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


