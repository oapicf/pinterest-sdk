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
import {
    AudienceDemographicValue,
    AudienceDemographicValueFromJSON,
    AudienceDemographicValueToJSON,
} from './';

/**
 * Audience demographics
 * @export
 * @interface AudienceDemographics
 */
export interface AudienceDemographics  {
    /**
     * Ages distribution.
     * @type {Array<AudienceDemographicValue>}
     * @memberof AudienceDemographics
     */
    ages?: Array<AudienceDemographicValue>;
    /**
     * Gender distribution.
     * @type {Array<AudienceDemographicValue>}
     * @memberof AudienceDemographics
     */
    genders?: Array<AudienceDemographicValue>;
    /**
     * Device usage distribution.
     * @type {Array<AudienceDemographicValue>}
     * @memberof AudienceDemographics
     */
    devices?: Array<AudienceDemographicValue>;
    /**
     * Geographic metro area distribution.
     * @type {Array<AudienceDemographicValue>}
     * @memberof AudienceDemographics
     */
    metros?: Array<AudienceDemographicValue>;
    /**
     * Country area distribution.
     * @type {Array<AudienceDemographicValue>}
     * @memberof AudienceDemographics
     */
    countries?: Array<AudienceDemographicValue>;
}

export function AudienceDemographicsFromJSON(json: any): AudienceDemographics {
    return {
        'ages': !exists(json, 'ages') ? undefined : (json['ages'] as Array<any>).map(AudienceDemographicValueFromJSON),
        'genders': !exists(json, 'genders') ? undefined : (json['genders'] as Array<any>).map(AudienceDemographicValueFromJSON),
        'devices': !exists(json, 'devices') ? undefined : (json['devices'] as Array<any>).map(AudienceDemographicValueFromJSON),
        'metros': !exists(json, 'metros') ? undefined : (json['metros'] as Array<any>).map(AudienceDemographicValueFromJSON),
        'countries': !exists(json, 'countries') ? undefined : (json['countries'] as Array<any>).map(AudienceDemographicValueFromJSON),
    };
}

export function AudienceDemographicsToJSON(value?: AudienceDemographics): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'ages': value.ages === undefined ? undefined : (value.ages as Array<any>).map(AudienceDemographicValueToJSON),
        'genders': value.genders === undefined ? undefined : (value.genders as Array<any>).map(AudienceDemographicValueToJSON),
        'devices': value.devices === undefined ? undefined : (value.devices as Array<any>).map(AudienceDemographicValueToJSON),
        'metros': value.metros === undefined ? undefined : (value.metros as Array<any>).map(AudienceDemographicValueToJSON),
        'countries': value.countries === undefined ? undefined : (value.countries as Array<any>).map(AudienceDemographicValueToJSON),
    };
}


