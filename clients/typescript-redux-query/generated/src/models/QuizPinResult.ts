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
 * The result, and link out, based on the user’s choice.
 * @export
 * @interface QuizPinResult
 */
export interface QuizPinResult  {
    /**
     * 
     * @type {string}
     * @memberof QuizPinResult
     */
    organicPinId?: string;
    /**
     * 
     * @type {string}
     * @memberof QuizPinResult
     */
    androidDeepLink?: string;
    /**
     * 
     * @type {string}
     * @memberof QuizPinResult
     */
    iosDeepLink?: string;
    /**
     * 
     * @type {string}
     * @memberof QuizPinResult
     */
    destinationUrl?: string;
    /**
     * 
     * @type {number}
     * @memberof QuizPinResult
     */
    resultId?: number;
}

export function QuizPinResultFromJSON(json: any): QuizPinResult {
    return {
        'organicPinId': !exists(json, 'organic_pin_id') ? undefined : json['organic_pin_id'],
        'androidDeepLink': !exists(json, 'android_deep_link') ? undefined : json['android_deep_link'],
        'iosDeepLink': !exists(json, 'ios_deep_link') ? undefined : json['ios_deep_link'],
        'destinationUrl': !exists(json, 'destination_url') ? undefined : json['destination_url'],
        'resultId': !exists(json, 'result_id') ? undefined : json['result_id'],
    };
}

export function QuizPinResultToJSON(value?: QuizPinResult): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'organic_pin_id': value.organicPinId,
        'android_deep_link': value.androidDeepLink,
        'ios_deep_link': value.iosDeepLink,
        'destination_url': value.destinationUrl,
        'result_id': value.resultId,
    };
}


