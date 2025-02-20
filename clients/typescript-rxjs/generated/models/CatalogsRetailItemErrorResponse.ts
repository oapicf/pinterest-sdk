// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    CatalogsType,
    ItemValidationEvent,
} from './';

/**
 * Object describing a retail item error
 * @export
 * @interface CatalogsRetailItemErrorResponse
 */
export interface CatalogsRetailItemErrorResponse {
    /**
     * @type {CatalogsType}
     * @memberof CatalogsRetailItemErrorResponse
     */
    catalog_type: CatalogsType;
    /**
     * The catalog item id in the merchant namespace
     * @type {string}
     * @memberof CatalogsRetailItemErrorResponse
     */
    item_id?: string;
    /**
     * Array with the errors for the item id requested
     * @type {Array<ItemValidationEvent>}
     * @memberof CatalogsRetailItemErrorResponse
     */
    errors?: Array<ItemValidationEvent>;
}


