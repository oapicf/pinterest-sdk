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
 * @interface AdAccountGetSubscriptionResponse
 */
export interface AdAccountGetSubscriptionResponse  {
    /**
     * Lead form ID.
     * @type {string}
     * @memberof AdAccountGetSubscriptionResponse
     */
    leadFormId?: string;
    /**
     * Standard HTTPS webhook URL.
     * @type {string}
     * @memberof AdAccountGetSubscriptionResponse
     */
    webhookUrl?: string;
    /**
     * Subscription ID.
     * @type {string}
     * @memberof AdAccountGetSubscriptionResponse
     */
    id?: string;
    /**
     * User account used to subscribe lead data.
     * @type {string}
     * @memberof AdAccountGetSubscriptionResponse
     */
    userAccountId?: string;
    /**
     * The Ad Account ID that this lead form belongs to.
     * @type {string}
     * @memberof AdAccountGetSubscriptionResponse
     */
    adAccountId?: string;
    /**
     * API version.
     * @type {string}
     * @memberof AdAccountGetSubscriptionResponse
     */
    apiVersion?: string;
    /**
     * Base64 encoded key for client to decrypt lead data.
     * @type {string}
     * @memberof AdAccountGetSubscriptionResponse
     */
    cryptographicKey?: string;
    /**
     * Lead data encryption algorithm.
     * @type {string}
     * @memberof AdAccountGetSubscriptionResponse
     */
    cryptographicAlgorithm?: string;
    /**
     * Lead form creation time. Unix timestamp in milliseconds.
     * @type {number}
     * @memberof AdAccountGetSubscriptionResponse
     */
    createdTime?: number;
}

export function AdAccountGetSubscriptionResponseFromJSON(json: any): AdAccountGetSubscriptionResponse {
    return {
        'leadFormId': !exists(json, 'lead_form_id') ? undefined : json['lead_form_id'],
        'webhookUrl': !exists(json, 'webhook_url') ? undefined : json['webhook_url'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'userAccountId': !exists(json, 'user_account_id') ? undefined : json['user_account_id'],
        'adAccountId': !exists(json, 'ad_account_id') ? undefined : json['ad_account_id'],
        'apiVersion': !exists(json, 'api_version') ? undefined : json['api_version'],
        'cryptographicKey': !exists(json, 'cryptographic_key') ? undefined : json['cryptographic_key'],
        'cryptographicAlgorithm': !exists(json, 'cryptographic_algorithm') ? undefined : json['cryptographic_algorithm'],
        'createdTime': !exists(json, 'created_time') ? undefined : json['created_time'],
    };
}

export function AdAccountGetSubscriptionResponseToJSON(value?: AdAccountGetSubscriptionResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'lead_form_id': value.leadFormId,
        'webhook_url': value.webhookUrl,
        'id': value.id,
        'user_account_id': value.userAccountId,
        'ad_account_id': value.adAccountId,
        'api_version': value.apiVersion,
        'cryptographic_key': value.cryptographicKey,
        'cryptographic_algorithm': value.cryptographicAlgorithm,
        'created_time': value.createdTime,
    };
}


