import { CatalogsFeedProcessingSchedule } from './catalogs-feed-processing-schedule';
import { ProductAvailabilityType } from './product-availability-type';
import { CatalogsRetailFeed } from './catalogs-retail-feed';
import { CatalogsStatus } from './catalogs-status';
import { CatalogsFeedCredentials } from './catalogs-feed-credentials';
import { CatalogsHotelFeed } from './catalogs-hotel-feed';
import { Country } from './country';
import { CatalogsFormat } from './catalogs-format';
import { CatalogsCreativeAssetsFeed } from './catalogs-creative-assets-feed';
import { NullableCurrency } from './nullable-currency';


/**
 * Catalogs Feed object
 */
/**
 * @type CatalogsFeed
 * Catalogs Feed object
 * @export
 */
export type CatalogsFeed = CatalogsCreativeAssetsFeed | CatalogsHotelFeed | CatalogsRetailFeed;

