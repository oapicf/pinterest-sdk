import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { ProductAvailabilityType } from './product-availability-type';
import { CatalogsHotelFeedsCreateRequest } from './catalogs-hotel-feeds-create-request';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsCreativeAssetsFeedsCreateRequest } from './catalogs-creative-assets-feeds-create-request';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { CatalogsRetailFeedsCreateRequest } from './catalogs-retail-feeds-create-request';
import { Country } from './country';
import { CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale } from './catalogs-creative-assets-feeds-create-request-default-locale';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';


/**
 * Request object for creating a feed.
 */
/**
 * @type CatalogsVerticalFeedsCreateRequest
 * Request object for creating a feed.
 * @export
 */
export type CatalogsVerticalFeedsCreateRequest = CatalogsCreativeAssetsFeedsCreateRequest | CatalogsHotelFeedsCreateRequest | CatalogsRetailFeedsCreateRequest;

