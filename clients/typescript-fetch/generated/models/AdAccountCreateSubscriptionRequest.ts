/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { AdAccountCreateSubscriptionRequestPartnerMetadata } from './AdAccountCreateSubscriptionRequestPartnerMetadata';
import {
    AdAccountCreateSubscriptionRequestPartnerMetadataFromJSON,
    AdAccountCreateSubscriptionRequestPartnerMetadataFromJSONTyped,
    AdAccountCreateSubscriptionRequestPartnerMetadataToJSON,
    AdAccountCreateSubscriptionRequestPartnerMetadataToJSONTyped,
} from './AdAccountCreateSubscriptionRequestPartnerMetadata';

/**
 * 
 * @export
 * @interface AdAccountCreateSubscriptionRequest
 */
export interface AdAccountCreateSubscriptionRequest {
    /**
     * Standard HTTPS webhook URL.
     * @type {string}
     * @memberof AdAccountCreateSubscriptionRequest
     */
    webhookUrl: string;
    /**
     * Lead form ID.
     * @type {string}
     * @memberof AdAccountCreateSubscriptionRequest
     */
    leadFormId?: string;
    /**
     * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
     * @type {string}
     * @memberof AdAccountCreateSubscriptionRequest
     */
    partnerAccessToken?: string;
    /**
     * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
     * @type {string}
     * @memberof AdAccountCreateSubscriptionRequest
     */
    partnerRefreshToken?: string;
    /**
     * 
     * @type {AdAccountCreateSubscriptionRequestPartnerMetadata}
     * @memberof AdAccountCreateSubscriptionRequest
     */
    partnerMetadata?: AdAccountCreateSubscriptionRequestPartnerMetadata;
}

/**
 * Check if a given object implements the AdAccountCreateSubscriptionRequest interface.
 */
export function instanceOfAdAccountCreateSubscriptionRequest(value: object): value is AdAccountCreateSubscriptionRequest {
    if (!('webhookUrl' in value) || value['webhookUrl'] === undefined) return false;
    return true;
}

export function AdAccountCreateSubscriptionRequestFromJSON(json: any): AdAccountCreateSubscriptionRequest {
    return AdAccountCreateSubscriptionRequestFromJSONTyped(json, false);
}

export function AdAccountCreateSubscriptionRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdAccountCreateSubscriptionRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'webhookUrl': json['webhook_url'],
        'leadFormId': json['lead_form_id'] == null ? undefined : json['lead_form_id'],
        'partnerAccessToken': json['partner_access_token'] == null ? undefined : json['partner_access_token'],
        'partnerRefreshToken': json['partner_refresh_token'] == null ? undefined : json['partner_refresh_token'],
        'partnerMetadata': json['partner_metadata'] == null ? undefined : AdAccountCreateSubscriptionRequestPartnerMetadataFromJSON(json['partner_metadata']),
    };
}

  export function AdAccountCreateSubscriptionRequestToJSON(json: any): AdAccountCreateSubscriptionRequest {
      return AdAccountCreateSubscriptionRequestToJSONTyped(json, false);
  }

  export function AdAccountCreateSubscriptionRequestToJSONTyped(value?: AdAccountCreateSubscriptionRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'webhook_url': value['webhookUrl'],
        'lead_form_id': value['leadFormId'],
        'partner_access_token': value['partnerAccessToken'],
        'partner_refresh_token': value['partnerRefreshToken'],
        'partner_metadata': AdAccountCreateSubscriptionRequestPartnerMetadataToJSON(value['partnerMetadata']),
    };
}

