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

import { exists, mapValues } from '../runtime';
/**
 * ID of the bulk request.
 * @export
 * @interface BulkUpsertResponse
 */
export interface BulkUpsertResponse  {
    /**
     * 
     * @type {string}
     * @memberof BulkUpsertResponse
     */
    requestId?: string;
}

export function BulkUpsertResponseFromJSON(json: any): BulkUpsertResponse {
    return {
        'requestId': !exists(json, 'request_id') ? undefined : json['request_id'],
    };
}

export function BulkUpsertResponseToJSON(value?: BulkUpsertResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'request_id': value.requestId,
    };
}

