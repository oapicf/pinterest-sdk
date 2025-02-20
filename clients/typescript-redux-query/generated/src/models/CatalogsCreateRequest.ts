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

import { exists, mapValues } from '../runtime';
/**
 * Request object for creating a catalog.
 * @export
 * @interface CatalogsCreateRequest
 */
export interface CatalogsCreateRequest  {
    /**
     * Type of the catalog entity.
     * @type {string}
     * @memberof CatalogsCreateRequest
     */
    catalogType: CatalogsCreateRequestCatalogTypeEnum;
    /**
     * A human-friendly name associated to a given catalog.
     * @type {string}
     * @memberof CatalogsCreateRequest
     */
    name: string;
}

export function CatalogsCreateRequestFromJSON(json: any): CatalogsCreateRequest {
    return {
        'catalogType': json['catalog_type'],
        'name': json['name'],
    };
}

export function CatalogsCreateRequestToJSON(value?: CatalogsCreateRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'catalog_type': value.catalogType,
        'name': value.name,
    };
}

/**
* @export
* @enum {string}
*/
export enum CatalogsCreateRequestCatalogTypeEnum {
    Hotel = 'HOTEL'
}


