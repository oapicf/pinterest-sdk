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

import { HttpFile } from '../http/http';

export class UserWebsiteVerificationCode {
    /**
    * Code to check against the user claiming the website
    */
    'verificationCode'?: string;
    /**
    * DNS TXT record to check against for the website to be claimed
    */
    'dnsTxtRecord'?: string;
    /**
    * Metatag the verification process searchs for the website to be claimed
    */
    'metatag'?: string;
    /**
    * File expected to find on the website being claimed
    */
    'filename'?: string;
    /**
    * A full html file to upload to the website in order for it to be claimed
    */
    'fileContent'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "verificationCode",
            "baseName": "verification_code",
            "type": "string",
            "format": ""
        },
        {
            "name": "dnsTxtRecord",
            "baseName": "dns_txt_record",
            "type": "string",
            "format": ""
        },
        {
            "name": "metatag",
            "baseName": "metatag",
            "type": "string",
            "format": ""
        },
        {
            "name": "filename",
            "baseName": "filename",
            "type": "string",
            "format": ""
        },
        {
            "name": "fileContent",
            "baseName": "file_content",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UserWebsiteVerificationCode.attributeTypeMap;
    }

    public constructor() {
    }
}
