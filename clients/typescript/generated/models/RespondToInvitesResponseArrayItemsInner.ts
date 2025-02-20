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

import { BaseInviteDataResponse } from '../models/BaseInviteDataResponse';
import { InviteExceptionResponse } from '../models/InviteExceptionResponse';
import { HttpFile } from '../http/http';

export class RespondToInvitesResponseArrayItemsInner {
    'exception'?: InviteExceptionResponse | null;
    'invite'?: BaseInviteDataResponse | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "exception",
            "baseName": "exception",
            "type": "InviteExceptionResponse",
            "format": ""
        },
        {
            "name": "invite",
            "baseName": "invite",
            "type": "BaseInviteDataResponse",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RespondToInvitesResponseArrayItemsInner.attributeTypeMap;
    }

    public constructor() {
    }
}
