/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CatalogsFeedsCreateRequest } from '../models/CatalogsFeedsCreateRequest';
import { CatalogsVerticalFeedsCreateRequest } from '../models/CatalogsVerticalFeedsCreateRequest';
import { HttpFile } from '../http/http';

/**
 * @type FeedsCreateRequest
 * Type
 * @export
 */
export type FeedsCreateRequest = CatalogsFeedsCreateRequest | CatalogsVerticalFeedsCreateRequest;

/**
* @type FeedsCreateRequestClass
* @export
*/
export class FeedsCreateRequestClass {
    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;
}

