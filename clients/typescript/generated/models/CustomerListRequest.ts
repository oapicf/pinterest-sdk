/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { UserListType } from '../models/UserListType';
import { HttpFile } from '../http/http';

export class CustomerListRequest {
    /**
    * Customer list name.
    */
    'name': string;
    /**
    * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
    */
    'records': string;
    'listType'?: UserListType;
    /**
    * Customer list errors.
    */
    'exceptions'?: any;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "records",
            "baseName": "records",
            "type": "string",
            "format": ""
        },
        {
            "name": "listType",
            "baseName": "list_type",
            "type": "UserListType",
            "format": ""
        },
        {
            "name": "exceptions",
            "baseName": "exceptions",
            "type": "any",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CustomerListRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


