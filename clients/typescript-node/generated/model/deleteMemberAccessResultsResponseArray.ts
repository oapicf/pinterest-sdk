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
import { DeleteMemberAccessResult } from './deleteMemberAccessResult';

export class DeleteMemberAccessResultsResponseArray {
    /**
    * List of member asset permissions that were deleted.
    */
    'items'?: Array<DeleteMemberAccessResult>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<DeleteMemberAccessResult>"
        }    ];

    static getAttributeTypeMap() {
        return DeleteMemberAccessResultsResponseArray.attributeTypeMap;
    }
}

