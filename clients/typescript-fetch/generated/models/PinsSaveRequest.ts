/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface PinsSaveRequest
 */
export interface PinsSaveRequest {
    /**
     * Unique identifier of the board to which the pin will be saved.
     * @type {string}
     * @memberof PinsSaveRequest
     */
    boardId?: string;
    /**
     * Unique identifier of the board section to which the pin will be saved.
     * @type {string}
     * @memberof PinsSaveRequest
     */
    boardSectionId?: string;
}

/**
 * Check if a given object implements the PinsSaveRequest interface.
 */
export function instanceOfPinsSaveRequest(value: object): boolean {
    return true;
}

export function PinsSaveRequestFromJSON(json: any): PinsSaveRequest {
    return PinsSaveRequestFromJSONTyped(json, false);
}

export function PinsSaveRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): PinsSaveRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'boardId': json['board_id'] == null ? undefined : json['board_id'],
        'boardSectionId': json['board_section_id'] == null ? undefined : json['board_section_id'],
    };
}

export function PinsSaveRequestToJSON(value?: PinsSaveRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'board_id': value['boardId'],
        'board_section_id': value['boardSectionId'],
    };
}
