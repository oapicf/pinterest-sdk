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
    ConversionEventsDataInner,
    ConversionEventsDataInnerFromJSON,
    ConversionEventsDataInnerToJSON,
} from './';

/**
 * A list of events (one or more) encapsulated by a data object.
 * @export
 * @interface ConversionEvents
 */
export interface ConversionEvents  {
    /**
     * 
     * @type {Array<ConversionEventsDataInner>}
     * @memberof ConversionEvents
     */
    data: Array<ConversionEventsDataInner>;
}

export function ConversionEventsFromJSON(json: any): ConversionEvents {
    return {
        'data': (json['data'] as Array<any>).map(ConversionEventsDataInnerFromJSON),
    };
}

export function ConversionEventsToJSON(value?: ConversionEvents): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'data': (value.data as Array<any>).map(ConversionEventsDataInnerToJSON),
    };
}


