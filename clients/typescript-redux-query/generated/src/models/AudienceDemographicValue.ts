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
 * Demographic detail for a single audience demographic
 * @export
 * @interface AudienceDemographicValue
 */
export interface AudienceDemographicValue  {
    /**
     * Unique key for demographic item
     * @type {string}
     * @memberof AudienceDemographicValue
     */
    key?: string;
    /**
     * Display name for demographic
     * @type {string}
     * @memberof AudienceDemographicValue
     */
    name?: string;
    /**
     * Value of demographic item as a percent of total audience
     * @type {number}
     * @memberof AudienceDemographicValue
     */
    ratio?: number;
}

export function AudienceDemographicValueFromJSON(json: any): AudienceDemographicValue {
    return {
        'key': !exists(json, 'key') ? undefined : json['key'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'ratio': !exists(json, 'ratio') ? undefined : json['ratio'],
    };
}

export function AudienceDemographicValueToJSON(value?: AudienceDemographicValue): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'key': value.key,
        'name': value.name,
        'ratio': value.ratio,
    };
}


