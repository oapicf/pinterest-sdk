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
 * @interface IntegrationLogsInvalidLogResponseRejectedLogsInner
 */
export interface IntegrationLogsInvalidLogResponseRejectedLogsInner {
    /**
     * Index of the log in the batch.
     * @type {number}
     * @memberof IntegrationLogsInvalidLogResponseRejectedLogsInner
     */
    log_index?: number;
    /**
     * The field name containing an invalid value.
     * @type {string}
     * @memberof IntegrationLogsInvalidLogResponseRejectedLogsInner
     */
    field: string;
    /**
     * The value that is invalid.
     * @type {string}
     * @memberof IntegrationLogsInvalidLogResponseRejectedLogsInner
     */
    value: string;
    /**
     * The reason the value is invalid.
     * @type {string}
     * @memberof IntegrationLogsInvalidLogResponseRejectedLogsInner
     */
    reason: string;
}
