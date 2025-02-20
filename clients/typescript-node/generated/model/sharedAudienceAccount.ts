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
    'accountType': SharedAudienceAccount.AccountTypeEnum;
    /**
    * Epoch timestamp in seconds for the shared audience event
    */
    'sharedOnTimestamp': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "accountId",
            "baseName": "account_id",
            "type": "string"
        },
        {
            "name": "accountName",
            "baseName": "account_name",
            "type": "string"
        },
        {
            "name": "accountType",
            "baseName": "account_type",
            "type": "SharedAudienceAccount.AccountTypeEnum"
        },
        {
            "name": "sharedOnTimestamp",
            "baseName": "shared_on_timestamp",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return SharedAudienceAccount.attributeTypeMap;
    }
}

export namespace SharedAudienceAccount {
    export enum AccountTypeEnum {
        AdAccount = <any> 'AD_ACCOUNT',
        BusinessAccount = <any> 'BUSINESS_ACCOUNT'
    }
}
