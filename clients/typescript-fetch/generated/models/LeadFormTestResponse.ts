/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * Response for lead data test API.
 * @export
 * @interface LeadFormTestResponse
 */
export interface LeadFormTestResponse {
    /**
     * Subscription ID.
     * @type {string}
     * @memberof LeadFormTestResponse
     */
    subscriptionId?: string;
}

/**
 * Check if a given object implements the LeadFormTestResponse interface.
 */
export function instanceOfLeadFormTestResponse(value: object): boolean {
    return true;
}

export function LeadFormTestResponseFromJSON(json: any): LeadFormTestResponse {
    return LeadFormTestResponseFromJSONTyped(json, false);
}

export function LeadFormTestResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): LeadFormTestResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'subscriptionId': json['subscription_id'] == null ? undefined : json['subscription_id'],
    };
}

export function LeadFormTestResponseToJSON(value?: LeadFormTestResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'subscription_id': value['subscriptionId'],
    };
}
