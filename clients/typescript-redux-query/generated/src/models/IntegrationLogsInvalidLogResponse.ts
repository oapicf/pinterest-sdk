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
import {
    IntegrationLogsInvalidLogResponseRejectedLogsInner,
    IntegrationLogsInvalidLogResponseRejectedLogsInnerFromJSON,
    IntegrationLogsInvalidLogResponseRejectedLogsInnerToJSON,
} from './';

/**
 * Schema describing the response when a log has invalid fields.
 * @export
 * @interface IntegrationLogsInvalidLogResponse
 */
export interface IntegrationLogsInvalidLogResponse  {
    /**
     * 
     * @type {Array<IntegrationLogsInvalidLogResponseRejectedLogsInner>}
     * @memberof IntegrationLogsInvalidLogResponse
     */
    rejectedLogs?: Array<IntegrationLogsInvalidLogResponseRejectedLogsInner>;
}

export function IntegrationLogsInvalidLogResponseFromJSON(json: any): IntegrationLogsInvalidLogResponse {
    return {
        'rejectedLogs': !exists(json, 'rejected_logs') ? undefined : (json['rejected_logs'] as Array<any>).map(IntegrationLogsInvalidLogResponseRejectedLogsInnerFromJSON),
    };
}

export function IntegrationLogsInvalidLogResponseToJSON(value?: IntegrationLogsInvalidLogResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'rejected_logs': value.rejectedLogs === undefined ? undefined : (value.rejectedLogs as Array<any>).map(IntegrationLogsInvalidLogResponseRejectedLogsInnerToJSON),
    };
}


