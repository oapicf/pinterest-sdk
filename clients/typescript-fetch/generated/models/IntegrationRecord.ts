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
/**
 * Integration record
 * @export
 * @interface IntegrationRecord
 */
export interface IntegrationRecord {
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    externalBusinessId?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    connectedMerchantId?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    readonly connectedUserId?: string;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    readonly connectedAdvertiserId?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    connectedLbaId?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    connectedTagId?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    partnerAccessToken?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    partnerRefreshToken?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    partnerPrimaryEmail?: string | null;
    /**
     * 
     * @type {number}
     * @memberof IntegrationRecord
     */
    partnerAccessTokenExpiry?: number | null;
    /**
     * 
     * @type {number}
     * @memberof IntegrationRecord
     */
    partnerRefreshTokenExpiry?: number | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    scopes?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    partnerMetadata?: string | null;
    /**
     * 
     * @type {string}
     * @memberof IntegrationRecord
     */
    additionalId1?: string | null;
    /**
     * 
     * @type {number}
     * @memberof IntegrationRecord
     */
    createdTime?: number;
    /**
     * 
     * @type {number}
     * @memberof IntegrationRecord
     */
    updatedTime?: number;
}

/**
 * Check if a given object implements the IntegrationRecord interface.
 */
export function instanceOfIntegrationRecord(value: object): value is IntegrationRecord {
    return true;
}

export function IntegrationRecordFromJSON(json: any): IntegrationRecord {
    return IntegrationRecordFromJSONTyped(json, false);
}

export function IntegrationRecordFromJSONTyped(json: any, ignoreDiscriminator: boolean): IntegrationRecord {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'externalBusinessId': json['external_business_id'] == null ? undefined : json['external_business_id'],
        'connectedMerchantId': json['connected_merchant_id'] == null ? undefined : json['connected_merchant_id'],
        'connectedUserId': json['connected_user_id'] == null ? undefined : json['connected_user_id'],
        'connectedAdvertiserId': json['connected_advertiser_id'] == null ? undefined : json['connected_advertiser_id'],
        'connectedLbaId': json['connected_lba_id'] == null ? undefined : json['connected_lba_id'],
        'connectedTagId': json['connected_tag_id'] == null ? undefined : json['connected_tag_id'],
        'partnerAccessToken': json['partner_access_token'] == null ? undefined : json['partner_access_token'],
        'partnerRefreshToken': json['partner_refresh_token'] == null ? undefined : json['partner_refresh_token'],
        'partnerPrimaryEmail': json['partner_primary_email'] == null ? undefined : json['partner_primary_email'],
        'partnerAccessTokenExpiry': json['partner_access_token_expiry'] == null ? undefined : json['partner_access_token_expiry'],
        'partnerRefreshTokenExpiry': json['partner_refresh_token_expiry'] == null ? undefined : json['partner_refresh_token_expiry'],
        'scopes': json['scopes'] == null ? undefined : json['scopes'],
        'partnerMetadata': json['partner_metadata'] == null ? undefined : json['partner_metadata'],
        'additionalId1': json['additional_id_1'] == null ? undefined : json['additional_id_1'],
        'createdTime': json['created_time'] == null ? undefined : json['created_time'],
        'updatedTime': json['updated_time'] == null ? undefined : json['updated_time'],
    };
}

  export function IntegrationRecordToJSON(json: any): IntegrationRecord {
      return IntegrationRecordToJSONTyped(json, false);
  }

  export function IntegrationRecordToJSONTyped(value?: Omit<IntegrationRecord, 'connected_user_id'|'connected_advertiser_id'> | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'id': value['id'],
        'external_business_id': value['externalBusinessId'],
        'connected_merchant_id': value['connectedMerchantId'],
        'connected_lba_id': value['connectedLbaId'],
        'connected_tag_id': value['connectedTagId'],
        'partner_access_token': value['partnerAccessToken'],
        'partner_refresh_token': value['partnerRefreshToken'],
        'partner_primary_email': value['partnerPrimaryEmail'],
        'partner_access_token_expiry': value['partnerAccessTokenExpiry'],
        'partner_refresh_token_expiry': value['partnerRefreshTokenExpiry'],
        'scopes': value['scopes'],
        'partner_metadata': value['partnerMetadata'],
        'additional_id_1': value['additionalId1'],
        'created_time': value['createdTime'],
        'updated_time': value['updatedTime'],
    };
}

