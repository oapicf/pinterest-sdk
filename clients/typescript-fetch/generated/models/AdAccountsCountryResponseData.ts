/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { Country } from './Country';
import {
    CountryFromJSON,
    CountryFromJSONTyped,
    CountryToJSON,
} from './Country';

/**
 * 
 * @export
 * @interface AdAccountsCountryResponseData
 */
export interface AdAccountsCountryResponseData {
    /**
     * 
     * @type {Country}
     * @memberof AdAccountsCountryResponseData
     */
    code?: Country;
    /**
     * Country currency.
     * @type {string}
     * @memberof AdAccountsCountryResponseData
     */
    currency?: string;
    /**
     * Country index
     * @type {number}
     * @memberof AdAccountsCountryResponseData
     */
    index?: number;
    /**
     * Country name
     * @type {string}
     * @memberof AdAccountsCountryResponseData
     */
    name?: string;
}

/**
 * Check if a given object implements the AdAccountsCountryResponseData interface.
 */
export function instanceOfAdAccountsCountryResponseData(value: object): boolean {
    return true;
}

export function AdAccountsCountryResponseDataFromJSON(json: any): AdAccountsCountryResponseData {
    return AdAccountsCountryResponseDataFromJSONTyped(json, false);
}

export function AdAccountsCountryResponseDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdAccountsCountryResponseData {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'] == null ? undefined : CountryFromJSON(json['code']),
        'currency': json['currency'] == null ? undefined : json['currency'],
        'index': json['index'] == null ? undefined : json['index'],
        'name': json['name'] == null ? undefined : json['name'],
    };
}

export function AdAccountsCountryResponseDataToJSON(value?: AdAccountsCountryResponseData | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'code': CountryToJSON(value['code']),
        'currency': value['currency'],
        'index': value['index'],
        'name': value['name'],
    };
}
