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
    CreateMMMReportResponseData,
    CreateMMMReportResponseDataFromJSON,
    CreateMMMReportResponseDataToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateMMMReportResponse
 */
export interface CreateMMMReportResponse  {
    /**
     * 
     * @type {number}
     * @memberof CreateMMMReportResponse
     */
    code?: number;
    /**
     * 
     * @type {CreateMMMReportResponseData}
     * @memberof CreateMMMReportResponse
     */
    data?: CreateMMMReportResponseData;
}

export function CreateMMMReportResponseFromJSON(json: any): CreateMMMReportResponse {
    return {
        'code': !exists(json, 'code') ? undefined : json['code'],
        'data': !exists(json, 'data') ? undefined : CreateMMMReportResponseDataFromJSON(json['data']),
    };
}

export function CreateMMMReportResponseToJSON(value?: CreateMMMReportResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'code': value.code,
        'data': CreateMMMReportResponseDataToJSON(value.data),
    };
}


