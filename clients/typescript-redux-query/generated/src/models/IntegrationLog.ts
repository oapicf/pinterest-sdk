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
import {
    IntegrationLogClientError,
    IntegrationLogClientErrorFromJSON,
    IntegrationLogClientErrorToJSON,
    IntegrationLogClientRequest,
    IntegrationLogClientRequestFromJSON,
    IntegrationLogClientRequestToJSON,
} from './';

/**
 * Schema for log sent from an integration application.
 * @export
 * @interface IntegrationLog
 */
export interface IntegrationLog  {
    /**
     * Timestamp in milliseconds of when the log was executed at the client.
     * @type {number}
     * @memberof IntegrationLog
     */
    clientTimestamp: number;
    /**
     * Log event type
     * @type {string}
     * @memberof IntegrationLog
     */
    eventType: IntegrationLogEventTypeEnum;
    /**
     * Log level type
     * @type {string}
     * @memberof IntegrationLog
     */
    logLevel: IntegrationLogLogLevelEnum;
    /**
     * 
     * @type {string}
     * @memberof IntegrationLog
     */
    externalBusinessId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationLog
     */
    advertiserId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationLog
     */
    merchantId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationLog
     */
    tagId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationLog
     */
    feedProfileId?: string;
    /**
     * Explanation of the event that occured.
     * @type {string}
     * @memberof IntegrationLog
     */
    message?: string;
    /**
     * Version number of the integration application.
     * @type {string}
     * @memberof IntegrationLog
     */
    appVersionNumber?: string;
    /**
     * Version number of the platform the integration application is running on.
     * @type {string}
     * @memberof IntegrationLog
     */
    platformVersionNumber?: string;
    /**
     * 
     * @type {IntegrationLogClientError}
     * @memberof IntegrationLog
     */
    error?: IntegrationLogClientError;
    /**
     * 
     * @type {IntegrationLogClientRequest}
     * @memberof IntegrationLog
     */
    request?: IntegrationLogClientRequest;
}

export function IntegrationLogFromJSON(json: any): IntegrationLog {
    return {
        'clientTimestamp': json['client_timestamp'],
        'eventType': json['event_type'],
        'logLevel': json['log_level'],
        'externalBusinessId': !exists(json, 'external_business_id') ? undefined : json['external_business_id'],
        'advertiserId': !exists(json, 'advertiser_id') ? undefined : json['advertiser_id'],
        'merchantId': !exists(json, 'merchant_id') ? undefined : json['merchant_id'],
        'tagId': !exists(json, 'tag_id') ? undefined : json['tag_id'],
        'feedProfileId': !exists(json, 'feed_profile_id') ? undefined : json['feed_profile_id'],
        'message': !exists(json, 'message') ? undefined : json['message'],
        'appVersionNumber': !exists(json, 'app_version_number') ? undefined : json['app_version_number'],
        'platformVersionNumber': !exists(json, 'platform_version_number') ? undefined : json['platform_version_number'],
        'error': !exists(json, 'error') ? undefined : IntegrationLogClientErrorFromJSON(json['error']),
        'request': !exists(json, 'request') ? undefined : IntegrationLogClientRequestFromJSON(json['request']),
    };
}

export function IntegrationLogToJSON(value?: IntegrationLog): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'client_timestamp': value.clientTimestamp,
        'event_type': value.eventType,
        'log_level': value.logLevel,
        'external_business_id': value.externalBusinessId,
        'advertiser_id': value.advertiserId,
        'merchant_id': value.merchantId,
        'tag_id': value.tagId,
        'feed_profile_id': value.feedProfileId,
        'message': value.message,
        'app_version_number': value.appVersionNumber,
        'platform_version_number': value.platformVersionNumber,
        'error': IntegrationLogClientErrorToJSON(value.error),
        'request': IntegrationLogClientRequestToJSON(value.request),
    };
}

/**
* @export
* @enum {string}
*/
export enum IntegrationLogEventTypeEnum {
    App = 'APP',
    Api = 'API'
}
/**
* @export
* @enum {string}
*/
export enum IntegrationLogLogLevelEnum {
    Info = 'INFO',
    Warn = 'WARN',
    Error = 'ERROR'
}


