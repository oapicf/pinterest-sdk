/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface PinUpdateCarouselSlotsInner
 */
export interface PinUpdateCarouselSlotsInner {
    /**
     * Carousel Pin slot title.
     * @type {string}
     * @memberof PinUpdateCarouselSlotsInner
     */
    title?: string;
    /**
     * Carousel Pin slot description.
     * @type {string}
     * @memberof PinUpdateCarouselSlotsInner
     */
    description?: string;
    /**
     * Carousel Pin slot link.
     * @type {string}
     * @memberof PinUpdateCarouselSlotsInner
     */
    link?: string;
}

/**
 * Check if a given object implements the PinUpdateCarouselSlotsInner interface.
 */
export function instanceOfPinUpdateCarouselSlotsInner(value: object): value is PinUpdateCarouselSlotsInner {
    return true;
}

export function PinUpdateCarouselSlotsInnerFromJSON(json: any): PinUpdateCarouselSlotsInner {
    return PinUpdateCarouselSlotsInnerFromJSONTyped(json, false);
}

export function PinUpdateCarouselSlotsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): PinUpdateCarouselSlotsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'title': json['title'] == null ? undefined : json['title'],
        'description': json['description'] == null ? undefined : json['description'],
        'link': json['link'] == null ? undefined : json['link'],
    };
}

  export function PinUpdateCarouselSlotsInnerToJSON(json: any): PinUpdateCarouselSlotsInner {
      return PinUpdateCarouselSlotsInnerToJSONTyped(json, false);
  }

  export function PinUpdateCarouselSlotsInnerToJSONTyped(value?: PinUpdateCarouselSlotsInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'title': value['title'],
        'description': value['description'],
        'link': value['link'],
    };
}

