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
/**
 * 
 * @export
 * @interface ConversionEventsDataInnerCustomDataContentsInner
 */
export interface ConversionEventsDataInnerCustomDataContentsInner {
    /**
     * The price of a product. Accepted as a string in the request; it will be parsed into a double. For example, if there are two products in a checkout event, the value should be the total price
     * @type {string}
     * @memberof ConversionEventsDataInnerCustomDataContentsInner
     */
    itemPrice?: string;
    /**
     * The amount of a product.
     * @type {number}
     * @memberof ConversionEventsDataInnerCustomDataContentsInner
     */
    quantity?: number;
}

/**
 * Check if a given object implements the ConversionEventsDataInnerCustomDataContentsInner interface.
 */
export function instanceOfConversionEventsDataInnerCustomDataContentsInner(value: object): boolean {
    return true;
}

export function ConversionEventsDataInnerCustomDataContentsInnerFromJSON(json: any): ConversionEventsDataInnerCustomDataContentsInner {
    return ConversionEventsDataInnerCustomDataContentsInnerFromJSONTyped(json, false);
}

export function ConversionEventsDataInnerCustomDataContentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ConversionEventsDataInnerCustomDataContentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'itemPrice': json['item_price'] == null ? undefined : json['item_price'],
        'quantity': json['quantity'] == null ? undefined : json['quantity'],
    };
}

export function ConversionEventsDataInnerCustomDataContentsInnerToJSON(value?: ConversionEventsDataInnerCustomDataContentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'item_price': value['itemPrice'],
        'quantity': value['quantity'],
    };
}
