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
 * 
 * @export
 * @interface ConversionEventsUserDataAnyOf1
 */
export interface ConversionEventsUserDataAnyOf1  {
    /**
     * Sha256 hashes of lowercase version of user\'s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @type {Array<string>}
     * @memberof ConversionEventsUserDataAnyOf1
     */
    em?: Array<string>;
    /**
     * Sha256 hashes of user\'s \"Google Advertising IDs\" (GAIDs) or \"Apple\'s Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @type {Array<string>}
     * @memberof ConversionEventsUserDataAnyOf1
     */
    hashedMaids: Array<string>;
    /**
     * The user\'s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
     * @type {string}
     * @memberof ConversionEventsUserDataAnyOf1
     */
    clientIpAddress?: string;
    /**
     * The user agent string of the user\'s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
     * @type {string}
     * @memberof ConversionEventsUserDataAnyOf1
     */
    clientUserAgent?: string;
}

export function ConversionEventsUserDataAnyOf1FromJSON(json: any): ConversionEventsUserDataAnyOf1 {
    return {
        'em': !exists(json, 'em') ? undefined : json['em'],
        'hashedMaids': json['hashed_maids'],
        'clientIpAddress': !exists(json, 'client_ip_address') ? undefined : json['client_ip_address'],
        'clientUserAgent': !exists(json, 'client_user_agent') ? undefined : json['client_user_agent'],
    };
}

export function ConversionEventsUserDataAnyOf1ToJSON(value?: ConversionEventsUserDataAnyOf1): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'em': value.em,
        'hashed_maids': value.hashedMaids,
        'client_ip_address': value.clientIpAddress,
        'client_user_agent': value.clientUserAgent,
    };
}


