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

import { UpdateMemberAssetAccessBodyAccessesInner } from '../models/UpdateMemberAssetAccessBodyAccessesInner';
import { HttpFile } from '../http/http';

/**
* An object with a list of all the new accesses.
*/
export class UpdateMemberAssetAccessBody {
    'accesses': Array<UpdateMemberAssetAccessBodyAccessesInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "accesses",
            "baseName": "accesses",
            "type": "Array<UpdateMemberAssetAccessBodyAccessesInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateMemberAssetAccessBody.attributeTypeMap;
    }

    public constructor() {
    }
}
