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
    LeadFormArrayResponseItemsInner,
    LeadFormArrayResponseItemsInnerFromJSON,
    LeadFormArrayResponseItemsInnerToJSON,
} from './';

/**
 * 
 * @export
 * @interface LeadFormArrayResponse
 */
export interface LeadFormArrayResponse  {
    /**
     * 
     * @type {Array<LeadFormArrayResponseItemsInner>}
     * @memberof LeadFormArrayResponse
     */
    items?: Array<LeadFormArrayResponseItemsInner>;
}

export function LeadFormArrayResponseFromJSON(json: any): LeadFormArrayResponse {
    return {
        'items': !exists(json, 'items') ? undefined : (json['items'] as Array<any>).map(LeadFormArrayResponseItemsInnerFromJSON),
    };
}

export function LeadFormArrayResponseToJSON(value?: LeadFormArrayResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'items': value.items === undefined ? undefined : (value.items as Array<any>).map(LeadFormArrayResponseItemsInnerToJSON),
    };
}


