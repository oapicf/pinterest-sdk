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
import type { OrderLine } from './OrderLine';
import {
    OrderLineFromJSON,
    OrderLineFromJSONTyped,
    OrderLineToJSON,
} from './OrderLine';

/**
 * 
 * @export
 * @interface OrderLinesList200Response
 */
export interface OrderLinesList200Response {
    /**
     * 
     * @type {Array<OrderLine>}
     * @memberof OrderLinesList200Response
     */
    items: Array<OrderLine>;
    /**
     * 
     * @type {string}
     * @memberof OrderLinesList200Response
     */
    bookmark?: string;
}

/**
 * Check if a given object implements the OrderLinesList200Response interface.
 */
export function instanceOfOrderLinesList200Response(value: object): boolean {
    if (!('items' in value)) return false;
    return true;
}

export function OrderLinesList200ResponseFromJSON(json: any): OrderLinesList200Response {
    return OrderLinesList200ResponseFromJSONTyped(json, false);
}

export function OrderLinesList200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderLinesList200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'items': ((json['items'] as Array<any>).map(OrderLineFromJSON)),
        'bookmark': json['bookmark'] == null ? undefined : json['bookmark'],
    };
}

export function OrderLinesList200ResponseToJSON(value?: OrderLinesList200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'items': ((value['items'] as Array<any>).map(OrderLineToJSON)),
        'bookmark': value['bookmark'],
    };
}
