// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import {
    Catalog,
    CatalogFromJSON,
    CatalogToJSON,
} from './';

/**
 * @type CatalogsList200Response
 * @export
 */
export interface CatalogsList200Response extends Paginated {
}

export function CatalogsList200ResponseFromJSON(json: any): CatalogsList200Response {
    return {
        ...PaginatedFromJSON(json),
    };
}

export function CatalogsList200ResponseToJSON(value?: CatalogsList200Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...PaginatedToJSON(value),
    };
}