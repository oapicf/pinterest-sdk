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

/**
 * @export
 * @interface GetMMMReportResponseData
 */
export interface GetMMMReportResponseData {
    /**
     * @type {string}
     * @memberof GetMMMReportResponseData
     */
    report_status?: GetMMMReportResponseDataReportStatusEnum;
    /**
     * @type {string}
     * @memberof GetMMMReportResponseData
     */
    url?: string | null;
    /**
     * @type {number}
     * @memberof GetMMMReportResponseData
     */
    size?: number | null;
}

/**
 * @export
 * @enum {string}
 */
export enum GetMMMReportResponseDataReportStatusEnum {
    DoesNotExist = 'DOES_NOT_EXIST',
    Finished = 'FINISHED',
    InProgress = 'IN_PROGRESS',
    Expired = 'EXPIRED',
    Failed = 'FAILED',
    Cancelled = 'CANCELLED'
}

