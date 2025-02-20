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

import { RequestFile } from './models';
import { UpdateMemberResult } from './updateMemberResult';

export class UpdateMemberResultsResponseArray {
    /**
    * List of members with updated business access role.
    */
    'items'?: Array<UpdateMemberResult>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<UpdateMemberResult>"
        }    ];

    static getAttributeTypeMap() {
        return UpdateMemberResultsResponseArray.attributeTypeMap;
    }
}

