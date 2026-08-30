import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { ProductAvailabilityType } from './product-availability-type';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { CatalogsFeedsUpdateRequest } from './catalogs-feeds-update-request';
import { CatalogsFormat } from './catalogs-format';
import { NullableCurrency } from './nullable-currency';
import { CatalogsVerticalFeedsUpdateRequest } from './catalogs-vertical-feeds-update-request';


/**
 * @type CatalogsFeedUpdateRequestSchema
 * @export
 */
export type CatalogsFeedUpdateRequestSchema = CatalogsFeedsUpdateRequest | CatalogsVerticalFeedsUpdateRequest;

