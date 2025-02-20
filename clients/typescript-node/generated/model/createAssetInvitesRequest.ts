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
import { CreateAssetInvitesRequestItem } from './createAssetInvitesRequestItem';

/**
* Request body for updating asset roles for existing invites.
*/
export class CreateAssetInvitesRequest {
    'invites': Array<CreateAssetInvitesRequestItem>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "invites",
            "baseName": "invites",
            "type": "Array<CreateAssetInvitesRequestItem>"
        }    ];

    static getAttributeTypeMap() {
        return CreateAssetInvitesRequest.attributeTypeMap;
    }
}

