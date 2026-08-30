import { CatalogsUpsertHotelItem } from './catalogs-upsert-hotel-item';
import { CatalogsUpdatableHotelAttributes } from './catalogs-updatable-hotel-attributes';
import { CatalogsUpdateHotelItem } from './catalogs-update-hotel-item';
import { CatalogsCreateHotelItem } from './catalogs-create-hotel-item';
import { CatalogsDeleteHotelItem } from './catalogs-delete-hotel-item';


/**
 * Hotel batch item
 */
/**
 * @type CatalogsHotelBatchItem
 * Hotel batch item
 * @export
 */
export type CatalogsHotelBatchItem = CatalogsCreateHotelItem | CatalogsDeleteHotelItem | CatalogsUpdateHotelItem | CatalogsUpsertHotelItem;

