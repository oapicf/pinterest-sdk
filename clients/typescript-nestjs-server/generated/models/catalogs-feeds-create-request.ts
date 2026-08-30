import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { ProductAvailabilityType } from './product-availability-type';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { Country } from './country';
import { CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale } from './catalogs-creative-assets-feeds-create-request-default-locale';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';


/**
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */
export interface CatalogsFeedsCreateRequest { 
  credentials?: CatalogsFeedCredentials | null;
  default_availability?: ProductAvailabilityType | null;
  default_country?: Country;
  default_currency?: NullableCurrency | null;
  default_locale?: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
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
export namespace CatalogsFeedsCreateRequest {
}


