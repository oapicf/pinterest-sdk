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
    ConversionTagResponse,
    ConversionTagResponseFromJSON,
    ConversionTagResponseToJSON,
} from './';

/**
 * 
 * @export
 * @interface ConversionTagListResponse
 */
export interface ConversionTagListResponse  {
    /**
     * 
     * @type {Array<ConversionTagResponse>}
     * @memberof ConversionTagListResponse
     */
    items?: Array<ConversionTagResponse>;
}

export function ConversionTagListResponseFromJSON(json: any): ConversionTagListResponse {
    return {
        'items': !exists(json, 'items') ? undefined : (json['items'] as Array<any>).map(ConversionTagResponseFromJSON),
    };
}

export function ConversionTagListResponseToJSON(value?: ConversionTagListResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'items': value.items === undefined ? undefined : (value.items as Array<any>).map(ConversionTagResponseToJSON),
    };
}

