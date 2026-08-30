import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { ProductAvailabilityType } from './product-availability-type';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { Country } from './country';
import { CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale } from './catalogs-creative-assets-feeds-create-request-default-locale';
import { CatalogsFeedsCreateRequest } from './catalogs-feeds-create-request';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';
import { CatalogsVerticalFeedsCreateRequest } from './catalogs-vertical-feeds-create-request';


/**
 * @type CatalogsFeedCreateRequestSchema
 * @export
 */
export type CatalogsFeedCreateRequestSchema = CatalogsFeedsCreateRequest | CatalogsVerticalFeedsCreateRequest;

