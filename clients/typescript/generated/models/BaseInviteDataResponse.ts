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

import { BaseInviteDataResponseInviteData } from '../models/BaseInviteDataResponseInviteData';
import { BusinessAccessUserSummary } from '../models/BusinessAccessUserSummary';
import { HttpFile } from '../http/http';

export class BaseInviteDataResponse {
    /**
    * Unique identifier of the invite/request.
    */
    'id'?: string;
    'inviteData'?: BaseInviteDataResponseInviteData;
    /**
    * Indicates whether the invite/request was received.
    */
    'isReceivedInvite'?: boolean;
    /**
    * Metadata for the member/partner that was sent the invite/request.
    */
    'user'?: BusinessAccessUserSummary;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "inviteData",
            "baseName": "invite_data",
            "type": "BaseInviteDataResponseInviteData",
            "format": ""
        },
        {
            "name": "isReceivedInvite",
            "baseName": "is_received_invite",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "BusinessAccessUserSummary",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return BaseInviteDataResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
