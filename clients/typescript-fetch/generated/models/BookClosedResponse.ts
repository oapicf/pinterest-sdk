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
 * Creation fields
 * @export
 * @interface BookClosedResponse
 */
export interface BookClosedResponse {
    /**
     * Are conversion metrics ready?
     * @type {boolean}
     * @memberof BookClosedResponse
     */
    conversionMetricsReady?: boolean;
    /**
     * Are non-conversion metrics ready?
     * @type {boolean}
     * @memberof BookClosedResponse
     */
    nonConversionMetricsReady?: boolean;
}

/**
 * Check if a given object implements the BookClosedResponse interface.
 */
export function instanceOfBookClosedResponse(value: object): value is BookClosedResponse {
    return true;
}

export function BookClosedResponseFromJSON(json: any): BookClosedResponse {
    return BookClosedResponseFromJSONTyped(json, false);
}

export function BookClosedResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): BookClosedResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'conversionMetricsReady': json['conversion_metrics_ready'] == null ? undefined : json['conversion_metrics_ready'],
        'nonConversionMetricsReady': json['non_conversion_metrics_ready'] == null ? undefined : json['non_conversion_metrics_ready'],
    };
}

  export function BookClosedResponseToJSON(json: any): BookClosedResponse {
      return BookClosedResponseToJSONTyped(json, false);
  }

  export function BookClosedResponseToJSONTyped(value?: BookClosedResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'conversion_metrics_ready': value['conversionMetricsReady'],
        'non_conversion_metrics_ready': value['nonConversionMetricsReady'],
    };
}

