/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { GetMMMReportResponseData } from './GetMMMReportResponseData';
import {
    GetMMMReportResponseDataFromJSON,
    GetMMMReportResponseDataFromJSONTyped,
    GetMMMReportResponseDataToJSON,
    GetMMMReportResponseDataToJSONTyped,
} from './GetMMMReportResponseData';

/**
 * 
 * @export
 * @interface GetMMMReportResponse
 */
export interface GetMMMReportResponse {
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

/**
 * Check if a given object implements the GetMMMReportResponse interface.
 */
export function instanceOfGetMMMReportResponse(value: object): value is GetMMMReportResponse {
    return true;
}

export function GetMMMReportResponseFromJSON(json: any): GetMMMReportResponse {
    return GetMMMReportResponseFromJSONTyped(json, false);
}

export function GetMMMReportResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetMMMReportResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'] == null ? undefined : json['code'],
        'data': json['data'] == null ? undefined : GetMMMReportResponseDataFromJSON(json['data']),
        'message': json['message'] == null ? undefined : json['message'],
        'status': json['status'] == null ? undefined : json['status'],
    };
}

  export function GetMMMReportResponseToJSON(json: any): GetMMMReportResponse {
      return GetMMMReportResponseToJSONTyped(json, false);
  }

  export function GetMMMReportResponseToJSONTyped(value?: GetMMMReportResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'code': value['code'],
        'data': GetMMMReportResponseDataToJSON(value['data']),
        'message': value['message'],
        'status': value['status'],
    };
}

