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

import { CatalogsListProductsByFeedBasedFilter } from '../models/CatalogsListProductsByFeedBasedFilter';
import { CatalogsVerticalsListProductsByCatalogBasedFilterRequest } from '../models/CatalogsVerticalsListProductsByCatalogBasedFilterRequest';
import { HttpFile } from '../http/http';

/**
* Request object to list products for a given product group filter.
*/
/**
 * @type CatalogsListProductsByFilterRequest
 * Type
 * @export
 */
export type CatalogsListProductsByFilterRequest = CatalogsListProductsByFeedBasedFilter | CatalogsVerticalsListProductsByCatalogBasedFilterRequest;

/**
* @type CatalogsListProductsByFilterRequestClass
    * Request object to list products for a given product group filter.
* @export
*/
export class CatalogsListProductsByFilterRequestClass {
    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;
}

