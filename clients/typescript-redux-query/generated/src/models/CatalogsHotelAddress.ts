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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CatalogsHotelAddress
 */
export interface CatalogsHotelAddress  {
    /**
     * Primary street address of hotel.
     * @type {string}
     * @memberof CatalogsHotelAddress
     */
    addr1?: string;
    /**
     * City where the hotel is located.
     * @type {string}
     * @memberof CatalogsHotelAddress
     */
    city?: string;
    /**
     * State, county, province, where the hotel is located.
     * @type {string}
     * @memberof CatalogsHotelAddress
     */
    region?: string;
    /**
     * Country where the hotel is located.
     * @type {string}
     * @memberof CatalogsHotelAddress
     */
    country?: string;
    /**
     * Required for countries with a postal code system. Postal or zip code of the hotel.
     * @type {string}
     * @memberof CatalogsHotelAddress
     */
    postalCode?: string;
}

export function CatalogsHotelAddressFromJSON(json: any): CatalogsHotelAddress {
    return {
        'addr1': !exists(json, 'addr1') ? undefined : json['addr1'],
        'city': !exists(json, 'city') ? undefined : json['city'],
        'region': !exists(json, 'region') ? undefined : json['region'],
        'country': !exists(json, 'country') ? undefined : json['country'],
        'postalCode': !exists(json, 'postal_code') ? undefined : json['postal_code'],
    };
}

export function CatalogsHotelAddressToJSON(value?: CatalogsHotelAddress): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'addr1': value.addr1,
        'city': value.city,
        'region': value.region,
        'country': value.country,
        'postal_code': value.postalCode,
    };
}

