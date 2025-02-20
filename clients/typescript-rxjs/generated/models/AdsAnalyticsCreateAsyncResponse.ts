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
    BulkReportingJobStatus,
} from './';

/**
 * @export
 * @interface AdsAnalyticsCreateAsyncResponse
 */
export interface AdsAnalyticsCreateAsyncResponse {
    /**
     * @type {BulkReportingJobStatus}
     * @memberof AdsAnalyticsCreateAsyncResponse
     */
    report_status?: BulkReportingJobStatus;
    /**
     * @type {string}
     * @memberof AdsAnalyticsCreateAsyncResponse
     */
    token?: string;
    /**
     * @type {string}
     * @memberof AdsAnalyticsCreateAsyncResponse
     */
    message?: string | null;
}


