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
    AdGroupResponse,
    AdGroupResponseFromJSON,
    AdGroupResponseToJSON,
    Exception,
    ExceptionFromJSON,
    ExceptionToJSON,
} from './';

/**
 * 
 * @export
 * @interface AdGroupArrayResponseElement
 */
export interface AdGroupArrayResponseElement  {
    /**
     * 
     * @type {AdGroupResponse}
     * @memberof AdGroupArrayResponseElement
     */
    data?: AdGroupResponse;
    /**
     * 
     * @type {Array<Exception>}
     * @memberof AdGroupArrayResponseElement
     */
    exceptions?: Array<Exception>;
}

export function AdGroupArrayResponseElementFromJSON(json: any): AdGroupArrayResponseElement {
    return {
        'data': !exists(json, 'data') ? undefined : AdGroupResponseFromJSON(json['data']),
        'exceptions': !exists(json, 'exceptions') ? undefined : (json['exceptions'] as Array<any>).map(ExceptionFromJSON),
    };
}

export function AdGroupArrayResponseElementToJSON(value?: AdGroupArrayResponseElement): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'data': AdGroupResponseToJSON(value.data),
        'exceptions': value.exceptions === undefined ? undefined : (value.exceptions as Array<any>).map(ExceptionToJSON),
    };
}


