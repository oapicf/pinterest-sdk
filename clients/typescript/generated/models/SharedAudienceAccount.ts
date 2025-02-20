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

export class SharedAudienceAccount {
    /**
    * Account ID (ad account or business ID).
    */
    'accountId': string;
    /**
    * Account name.
    */
    'accountName': string;
    /**
    * account type
    */
    'accountType': SharedAudienceAccountAccountTypeEnum;
    /**
    * Epoch timestamp in seconds for the shared audience event
    */
    'sharedOnTimestamp': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "accountId",
            "baseName": "account_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "accountName",
            "baseName": "account_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "accountType",
            "baseName": "account_type",
            "type": "SharedAudienceAccountAccountTypeEnum",
            "format": ""
        },
        {
            "name": "sharedOnTimestamp",
            "baseName": "shared_on_timestamp",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SharedAudienceAccount.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum SharedAudienceAccountAccountTypeEnum {
    AdAccount = 'AD_ACCOUNT',
    BusinessAccount = 'BUSINESS_ACCOUNT'
}

