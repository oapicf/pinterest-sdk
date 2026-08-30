import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { Country } from './country';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';


/**
 * Catalogs Creative Asset Feed object
 */
export interface CatalogsCreativeAssetsFeed { 
  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   */
  catalog_id: string;
  catalog_type: CatalogsCreativeAssetsFeed.CatalogTypeEnum;
  readonly created_at: string;
  credentials?: CatalogsFeedCredentials | null;
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
export namespace CatalogsCreativeAssetsFeed {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


