import { PinterestLibError } from './pinterest-lib-error';
import { Country } from './country';
import { LocalStore } from './local-store';
import { CatalogsLocalStoresCreate200ResponseInnerDataOneOf } from './catalogs-local-stores-create200-response-inner-data-one-of';


/**
 * Created/updated resource on success or error details on failure
 */
/**
 * @type CatalogsLocalStoresCreate200ResponseInnerData
 * Created/updated resource on success or error details on failure
 * @export
 */
export type CatalogsLocalStoresCreate200ResponseInnerData = CatalogsLocalStoresCreate200ResponseInnerDataOneOf | LocalStore;

