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
import {
    GetMMMReportResponseData,
    GetMMMReportResponseDataFromJSON,
    GetMMMReportResponseDataToJSON,
} from './';

/**
 * 
 * @export
 * @interface GetMMMReportResponse
 */
export interface GetMMMReportResponse  {
    /**
     * 
     * @type {number}
     * @memberof GetMMMReportResponse
     */
    code?: number;
    /**
     * 
     * @type {GetMMMReportResponseData}
     * @memberof GetMMMReportResponse
     */
    data?: GetMMMReportResponseData;
    /**
     * 
     * @type {string}
     * @memberof GetMMMReportResponse
     */
    message?: string;
    /**
     * 
     * @type {string}
     * @memberof GetMMMReportResponse
     */
    status?: string;
}

export function GetMMMReportResponseFromJSON(json: any): GetMMMReportResponse {
    return {
        'code': !exists(json, 'code') ? undefined : json['code'],
        'data': !exists(json, 'data') ? undefined : GetMMMReportResponseDataFromJSON(json['data']),
        'message': !exists(json, 'message') ? undefined : json['message'],
        'status': !exists(json, 'status') ? undefined : json['status'],
    };
}

export function GetMMMReportResponseToJSON(value?: GetMMMReportResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'code': value.code,
        'data': GetMMMReportResponseDataToJSON(value.data),
        'message': value.message,
        'status': value.status,
    };
}

