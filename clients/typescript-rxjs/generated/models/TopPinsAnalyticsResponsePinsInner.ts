// tslint:disable
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

import type {
    DataStatus,
} from './';

/**
 * Array with metrics, status, and pin id for the requested metric
 * @export
 * @interface TopPinsAnalyticsResponsePinsInner
 */
export interface TopPinsAnalyticsResponsePinsInner {
    /**
     * The metric name and daily value for each requested metric
     * @type {{ [key: string]: number; }}
     * @memberof TopPinsAnalyticsResponsePinsInner
     */
    metrics?: { [key: string]: number; };
    /**
     * @type {{ [key: string]: DataStatus; }}
     * @memberof TopPinsAnalyticsResponsePinsInner
     */
    data_status?: { [key: string]: DataStatus; };
    /**
     * The pin id
     * @type {string}
     * @memberof TopPinsAnalyticsResponsePinsInner
     */
    pin_id?: string;
}