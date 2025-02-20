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
 * Object describing a creative assets item error
 * @export
 * @interface CatalogsCreativeAssetsItemErrorResponse
 */
export interface CatalogsCreativeAssetsItemErrorResponse {
    /**
     * @type {CatalogsType}
     * @memberof CatalogsCreativeAssetsItemErrorResponse
     */
    catalog_type: CatalogsType;
    /**
     * The catalog creative assets id in the merchant namespace
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemErrorResponse
     */
    creative_assets_id?: string;
    /**
     * Array with the errors for the item id requested
     * @type {Array<ItemValidationEvent>}
     * @memberof CatalogsCreativeAssetsItemErrorResponse
     */
    errors?: Array<ItemValidationEvent>;
}


