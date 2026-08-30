import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { Country } from './country';
import { CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale } from './catalogs-creative-assets-feeds-create-request-default-locale';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';


/**
 * Request object for creating a feed.
 */
export interface CatalogsCreativeAssetsFeedsCreateRequest { 
  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   */
  catalog_id?: string;
  catalog_type: CatalogsCreativeAssetsFeedsCreateRequest.CatalogTypeEnum;
  credentials?: CatalogsFeedCredentials | null;
  default_country: Country;
  default_currency?: NullableCurrency | null;
  default_locale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
  format: CatalogsFormat;
  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   */
  location: string;
  /**
   * A human-friendly name associated to a given feed.
   */
  name: string;
  preferred_processing_schedule?: CatalogsFeedProcessingSchedule | null;
  status?: CatalogsStatus;
}
export namespace CatalogsCreativeAssetsFeedsCreateRequest {
  export const CatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
  } as const;
  export type CatalogTypeEnum = typeof CatalogTypeEnum[keyof typeof CatalogTypeEnum];
}


