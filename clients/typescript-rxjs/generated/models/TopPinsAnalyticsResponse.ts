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

import type {
    TopPinsAnalyticsResponseDateAvailability,
    TopPinsAnalyticsResponsePinsInner,
} from './';

/**
 * @export
 * @interface TopPinsAnalyticsResponse
 */
export interface TopPinsAnalyticsResponse {
    /**
     * @type {TopPinsAnalyticsResponseDateAvailability}
     * @memberof TopPinsAnalyticsResponse
     */
    date_availability?: TopPinsAnalyticsResponseDateAvailability;
    /**
     * @type {Array<TopPinsAnalyticsResponsePinsInner>}
     * @memberof TopPinsAnalyticsResponse
     */
    pins?: Array<TopPinsAnalyticsResponsePinsInner>;
    /**
     * @type {string}
     * @memberof TopPinsAnalyticsResponse
     */
    sort_by?: TopPinsAnalyticsResponseSortByEnum;
}

/**
 * @export
 * @enum {string}
 */
export enum TopPinsAnalyticsResponseSortByEnum {
    Engagement = 'ENGAGEMENT',
    Save = 'SAVE',
    Impression = 'IMPRESSION',
    OutboundClick = 'OUTBOUND_CLICK',
    PinClick = 'PIN_CLICK'
}

