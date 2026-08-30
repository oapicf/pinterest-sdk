import { CatalogsRetailItemResponse } from './catalogs-retail-item-response';
import { CatalogsCreativeAssetsItemErrorResponse } from './catalogs-creative-assets-item-error-response';
import { CatalogsHotelItemResponse } from './catalogs-hotel-item-response';
import { Pin } from './pin';
import { CatalogsCreativeAssetsItemResponse } from './catalogs-creative-assets-item-response';
import { ItemValidationEvent } from './item-validation-event';
import { CatalogsHotelItemErrorResponse } from './catalogs-hotel-item-error-response';
import { CatalogsCreativeAssetsAttributes } from './catalogs-creative-assets-attributes';
import { CatalogsRetailItemErrorResponse } from './catalogs-retail-item-error-response';


/**
 * Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
 */
/**
 * @type ItemResponse
 * Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
 * @export
 */
export type ItemResponse = CatalogsCreativeAssetsItemErrorResponse | CatalogsCreativeAssetsItemResponse | CatalogsHotelItemErrorResponse | CatalogsHotelItemResponse | CatalogsRetailItemErrorResponse | CatalogsRetailItemResponse;

