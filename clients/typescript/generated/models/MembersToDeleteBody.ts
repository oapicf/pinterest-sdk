/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { MembersToDeleteBodyMembersInner } from '../models/MembersToDeleteBodyMembersInner';
import { HttpFile } from '../http/http';

export class MembersToDeleteBody {
    'members': Array<MembersToDeleteBodyMembersInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "members",
            "baseName": "members",
            "type": "Array<MembersToDeleteBodyMembersInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MembersToDeleteBody.attributeTypeMap;
    }

    public constructor() {
    }
}
