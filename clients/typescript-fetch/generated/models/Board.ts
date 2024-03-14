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
import type { BoardOwner } from './BoardOwner';
import {
    BoardOwnerFromJSON,
    BoardOwnerFromJSONTyped,
    BoardOwnerToJSON,
} from './BoardOwner';

/**
 * Board
 * @export
 * @interface Board
 */
export interface Board {
    /**
     * 
     * @type {string}
     * @memberof Board
     */
    readonly id?: string;
    /**
     * 
     * @type {string}
     * @memberof Board
     */
    name: string;
    /**
     * 
     * @type {string}
     * @memberof Board
     */
    description?: string;
    /**
     * 
     * @type {BoardOwner}
     * @memberof Board
     */
    owner?: BoardOwner;
    /**
     * Privacy setting for a board. Learn more about <a href="https://help.pinterest.com/en/article/secret-boards">secret boards</a> and <a href="https://help.pinterest.com/en/business/article/protected-boards">protected boards</a>
     * @type {string}
     * @memberof Board
     */
    privacy?: BoardPrivacyEnum;
}


/**
 * @export
 */
export const BoardPrivacyEnum = {
    Public: 'PUBLIC',
    Protected: 'PROTECTED',
    Secret: 'SECRET'
} as const;
export type BoardPrivacyEnum = typeof BoardPrivacyEnum[keyof typeof BoardPrivacyEnum];


/**
 * Check if a given object implements the Board interface.
 */
export function instanceOfBoard(value: object): boolean {
    if (!('name' in value)) return false;
    return true;
}

export function BoardFromJSON(json: any): Board {
    return BoardFromJSONTyped(json, false);
}

export function BoardFromJSONTyped(json: any, ignoreDiscriminator: boolean): Board {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'name': json['name'],
        'description': json['description'] == null ? undefined : json['description'],
        'owner': json['owner'] == null ? undefined : BoardOwnerFromJSON(json['owner']),
        'privacy': json['privacy'] == null ? undefined : json['privacy'],
    };
}

export function BoardToJSON(value?: Board | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'description': value['description'],
        'owner': BoardOwnerToJSON(value['owner']),
        'privacy': value['privacy'],
    };
}
