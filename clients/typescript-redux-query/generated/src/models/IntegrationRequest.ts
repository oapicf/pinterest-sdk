// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Schema used for creating the integration metadata.
 * @export
 * @interface IntegrationRequest
 */
export interface IntegrationRequest  {
    /**
     * External business ID for the integration.
     * @type {string}
     * @memberof IntegrationRequest
     */
    externalBusinessId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    connectedMerchantId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    connectedAdvertiserId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    connectedLbaId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    connectedTagId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    partnerAccessToken?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    partnerRefreshToken?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    partnerPrimaryEmail?: string;
    /**
     * 
     * @type {number}
     * @memberof IntegrationRequest
     */
    partnerAccessTokenExpiry?: number;
    /**
     * 
     * @type {number}
     * @memberof IntegrationRequest
     */
    partnerRefreshTokenExpiry?: number;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    scopes?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    additionalId1?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRequest
     */
    partnerMetadata?: string;
}

export function IntegrationRequestFromJSON(json: any): IntegrationRequest {
    return {
        'externalBusinessId': !exists(json, 'external_business_id') ? undefined : json['external_business_id'],
        'connectedMerchantId': !exists(json, 'connected_merchant_id') ? undefined : json['connected_merchant_id'],
        'connectedAdvertiserId': !exists(json, 'connected_advertiser_id') ? undefined : json['connected_advertiser_id'],
        'connectedLbaId': !exists(json, 'connected_lba_id') ? undefined : json['connected_lba_id'],
        'connectedTagId': !exists(json, 'connected_tag_id') ? undefined : json['connected_tag_id'],
        'partnerAccessToken': !exists(json, 'partner_access_token') ? undefined : json['partner_access_token'],
        'partnerRefreshToken': !exists(json, 'partner_refresh_token') ? undefined : json['partner_refresh_token'],
        'partnerPrimaryEmail': !exists(json, 'partner_primary_email') ? undefined : json['partner_primary_email'],
        'partnerAccessTokenExpiry': !exists(json, 'partner_access_token_expiry') ? undefined : json['partner_access_token_expiry'],
        'partnerRefreshTokenExpiry': !exists(json, 'partner_refresh_token_expiry') ? undefined : json['partner_refresh_token_expiry'],
        'scopes': !exists(json, 'scopes') ? undefined : json['scopes'],
        'additionalId1': !exists(json, 'additional_id_1') ? undefined : json['additional_id_1'],
        'partnerMetadata': !exists(json, 'partner_metadata') ? undefined : json['partner_metadata'],
    };
}

export function IntegrationRequestToJSON(value?: IntegrationRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'external_business_id': value.externalBusinessId,
        'connected_merchant_id': value.connectedMerchantId,
        'connected_advertiser_id': value.connectedAdvertiserId,
        'connected_lba_id': value.connectedLbaId,
        'connected_tag_id': value.connectedTagId,
        'partner_access_token': value.partnerAccessToken,
        'partner_refresh_token': value.partnerRefreshToken,
        'partner_primary_email': value.partnerPrimaryEmail,
        'partner_access_token_expiry': value.partnerAccessTokenExpiry,
        'partner_refresh_token_expiry': value.partnerRefreshTokenExpiry,
        'scopes': value.scopes,
        'additional_id_1': value.additionalId1,
        'partner_metadata': value.partnerMetadata,
    };
}

