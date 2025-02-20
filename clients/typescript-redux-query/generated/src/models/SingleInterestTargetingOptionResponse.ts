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
 * @interface SingleInterestTargetingOptionResponse
 */
export interface SingleInterestTargetingOptionResponse  {
    /**
     * 
     * @type {string}
     * @memberof SingleInterestTargetingOptionResponse
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof SingleInterestTargetingOptionResponse
     */
    name?: string;
    /**
     * 
     * @type {Array<string>}
     * @memberof SingleInterestTargetingOptionResponse
     */
    childInterests?: Array<string>;
    /**
     * 
     * @type {number}
     * @memberof SingleInterestTargetingOptionResponse
     */
    level?: number;
}

export function SingleInterestTargetingOptionResponseFromJSON(json: any): SingleInterestTargetingOptionResponse {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'childInterests': !exists(json, 'child_interests') ? undefined : json['child_interests'],
        'level': !exists(json, 'level') ? undefined : json['level'],
    };
}

export function SingleInterestTargetingOptionResponseToJSON(value?: SingleInterestTargetingOptionResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'name': value.name,
        'child_interests': value.childInterests,
        'level': value.level,
    };
}


