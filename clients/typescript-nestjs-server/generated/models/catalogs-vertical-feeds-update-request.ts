import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { ProductAvailabilityType } from './product-availability-type';
import { CatalogsHotelFeedsUpdateRequest } from './catalogs-hotel-feeds-update-request';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { CatalogsCreativeAssetsFeedsUpdateRequest } from './catalogs-creative-assets-feeds-update-request';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';
import { CatalogsRetailFeedsUpdateRequest } from './catalogs-retail-feeds-update-request';


/**
 * Request object for updating a feed.
 */
/**
 * @type CatalogsVerticalFeedsUpdateRequest
 * Request object for updating a feed.
 * @export
 */
export type CatalogsVerticalFeedsUpdateRequest = CatalogsCreativeAssetsFeedsUpdateRequest | CatalogsHotelFeedsUpdateRequest | CatalogsRetailFeedsUpdateRequest;

