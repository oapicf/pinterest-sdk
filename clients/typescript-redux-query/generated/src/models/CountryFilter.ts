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
import {
    CatalogsProductGroupMultipleCountriesCriteria,
    CatalogsProductGroupMultipleCountriesCriteriaFromJSON,
    CatalogsProductGroupMultipleCountriesCriteriaToJSON,
} from './';

/**
 * 
 * @export
 * @interface CountryFilter
 */
export interface CountryFilter  {
    /**
     * 
     * @type {CatalogsProductGroupMultipleCountriesCriteria}
     * @memberof CountryFilter
     */
    cOUNTRY: CatalogsProductGroupMultipleCountriesCriteria;
}

export function CountryFilterFromJSON(json: any): CountryFilter {
    return {
        'cOUNTRY': json['COUNTRY'],
    };
}

export function CountryFilterToJSON(value?: CountryFilter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'COUNTRY': value.cOUNTRY,
    };
}

