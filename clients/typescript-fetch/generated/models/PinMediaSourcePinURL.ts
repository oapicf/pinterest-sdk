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
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 * @export
 * @interface PinMediaSourcePinURL
 */
export interface PinMediaSourcePinURL {
    /**
     * 
     * @type {string}
     * @memberof PinMediaSourcePinURL
     */
    sourceType: PinMediaSourcePinURLSourceTypeEnum;
    /**
     * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     * @type {boolean}
     * @memberof PinMediaSourcePinURL
     */
    isAffiliateLink?: boolean;
}


/**
 * @export
 */
export const PinMediaSourcePinURLSourceTypeEnum = {
    PinUrl: 'pin_url'
} as const;
export type PinMediaSourcePinURLSourceTypeEnum = typeof PinMediaSourcePinURLSourceTypeEnum[keyof typeof PinMediaSourcePinURLSourceTypeEnum];


/**
 * Check if a given object implements the PinMediaSourcePinURL interface.
 */
export function instanceOfPinMediaSourcePinURL(value: object): boolean {
    if (!('sourceType' in value)) return false;
    return true;
}

export function PinMediaSourcePinURLFromJSON(json: any): PinMediaSourcePinURL {
    return PinMediaSourcePinURLFromJSONTyped(json, false);
}

export function PinMediaSourcePinURLFromJSONTyped(json: any, ignoreDiscriminator: boolean): PinMediaSourcePinURL {
    if (json == null) {
        return json;
    }
    return {
        
        'sourceType': json['source_type'],
        'isAffiliateLink': json['is_affiliate_link'] == null ? undefined : json['is_affiliate_link'],
    };
}

export function PinMediaSourcePinURLToJSON(value?: PinMediaSourcePinURL | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'source_type': value['sourceType'],
        'is_affiliate_link': value['isAffiliateLink'],
    };
}
