// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    BoardOwner,
    BoardOwnerFromJSON,
    BoardOwnerToJSON,
} from './';

/**
 * Board
 * @export
 * @interface Board
 */
export interface Board  {
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
    readonly owner?: BoardOwner;
    /**
     * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
     * @type {string}
     * @memberof Board
     */
    privacy?: BoardPrivacyEnum;
}

export function BoardFromJSON(json: any): Board {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'name': json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'owner': !exists(json, 'owner') ? undefined : mapValues(json['owner'], FromJSON),
        'privacy': !exists(json, 'privacy') ? undefined : json['privacy'],
    };
}

export function BoardToJSON(value?: Board): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
        'description': value.description,
        'privacy': value.privacy,
    };
}

/**
* @export
* @enum {string}
*/
export enum BoardPrivacyEnum {
    Public = 'PUBLIC',
    Protected = 'PROTECTED',
    Secret = 'SECRET'
}

