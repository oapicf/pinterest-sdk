// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface SharedAudienceAccount
 */
export interface SharedAudienceAccount  {
    /**
     * Account ID (ad account or business ID).
     * @type {string}
     * @memberof SharedAudienceAccount
     */
    accountId: string;
    /**
     * Account name.
     * @type {string}
     * @memberof SharedAudienceAccount
     */
    accountName: string;
    /**
     * account type
     * @type {string}
     * @memberof SharedAudienceAccount
     */
    accountType: SharedAudienceAccountAccountTypeEnum;
    /**
     * Epoch timestamp in seconds for the shared audience event
     * @type {number}
     * @memberof SharedAudienceAccount
     */
    sharedOnTimestamp: number;
}

export function SharedAudienceAccountFromJSON(json: any): SharedAudienceAccount {
    return {
        'accountId': json['account_id'],
        'accountName': json['account_name'],
        'accountType': json['account_type'],
        'sharedOnTimestamp': json['shared_on_timestamp'],
    };
}

export function SharedAudienceAccountToJSON(value?: SharedAudienceAccount): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'account_id': value.accountId,
        'account_name': value.accountName,
        'account_type': value.accountType,
        'shared_on_timestamp': value.sharedOnTimestamp,
    };
}

/**
* @export
* @enum {string}
*/
export enum SharedAudienceAccountAccountTypeEnum {
    AdAccount = 'AD_ACCOUNT',
    BusinessAccount = 'BUSINESS_ACCOUNT'
}


