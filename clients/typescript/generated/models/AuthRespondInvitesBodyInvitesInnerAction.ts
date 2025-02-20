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

import { Permissions } from '../models/Permissions';
import { HttpFile } from '../http/http';

export class AuthRespondInvitesBodyInvitesInnerAction {
    /**
    * Whether the invite/request is accepted.
    */
    'acceptInvite': boolean;
    /**
    * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
    */
    'assetIdToPermissions'?: { [key: string]: Array<Permissions>; };

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "acceptInvite",
            "baseName": "accept_invite",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "assetIdToPermissions",
            "baseName": "asset_id_to_permissions",
            "type": "{ [key: string]: Array<Permissions>; }",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AuthRespondInvitesBodyInvitesInnerAction.attributeTypeMap;
    }

    public constructor() {
    }
}
