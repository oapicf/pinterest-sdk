/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { CreateMMMReportResponseData } from './CreateMMMReportResponseData';
import {
    CreateMMMReportResponseDataFromJSON,
    CreateMMMReportResponseDataFromJSONTyped,
    CreateMMMReportResponseDataToJSON,
} from './CreateMMMReportResponseData';

/**
 * 
 * @export
 * @interface CreateMMMReportResponse
 */
export interface CreateMMMReportResponse {
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

/**
 * Check if a given object implements the CreateMMMReportResponse interface.
 */
export function instanceOfCreateMMMReportResponse(value: object): boolean {
    return true;
}

export function CreateMMMReportResponseFromJSON(json: any): CreateMMMReportResponse {
    return CreateMMMReportResponseFromJSONTyped(json, false);
}

export function CreateMMMReportResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateMMMReportResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'] == null ? undefined : json['code'],
        'data': json['data'] == null ? undefined : CreateMMMReportResponseDataFromJSON(json['data']),
    };
}

export function CreateMMMReportResponseToJSON(value?: CreateMMMReportResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'code': value['code'],
        'data': CreateMMMReportResponseDataToJSON(value['data']),
    };
}
