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
    Exception,
    ExceptionFromJSON,
    ExceptionToJSON,
    LeadFormResponse,
    LeadFormResponseFromJSON,
    LeadFormResponseToJSON,
} from './';

/**
 * 
 * @export
 * @interface LeadFormArrayResponseItemsInner
 */
export interface LeadFormArrayResponseItemsInner  {
    /**
     * 
     * @type {LeadFormResponse}
     * @memberof LeadFormArrayResponseItemsInner
     */
    data?: LeadFormResponse;
    /**
     * 
     * @type {Array<Exception>}
     * @memberof LeadFormArrayResponseItemsInner
     */
    exceptions?: Array<Exception>;
}

export function LeadFormArrayResponseItemsInnerFromJSON(json: any): LeadFormArrayResponseItemsInner {
    return {
        'data': !exists(json, 'data') ? undefined : LeadFormResponseFromJSON(json['data']),
        'exceptions': !exists(json, 'exceptions') ? undefined : (json['exceptions'] as Array<any>).map(ExceptionFromJSON),
    };
}

export function LeadFormArrayResponseItemsInnerToJSON(value?: LeadFormArrayResponseItemsInner): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'data': LeadFormResponseToJSON(value.data),
        'exceptions': value.exceptions === undefined ? undefined : (value.exceptions as Array<any>).map(ExceptionToJSON),
    };
}


