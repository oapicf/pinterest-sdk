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

/**
* Integration record
*/
export class IntegrationRecord {
    'id'?: string;
    'externalBusinessId'?: string | null;
    'connectedMerchantId'?: string | null;
    'connectedUserId'?: string;
    'connectedAdvertiserId'?: string | null;
    'connectedLbaId'?: string | null;
    'connectedTagId'?: string | null;
    'partnerAccessToken'?: string | null;
    'partnerRefreshToken'?: string | null;
    'partnerPrimaryEmail'?: string | null;
    'partnerAccessTokenExpiry'?: number | null;
    'partnerRefreshTokenExpiry'?: number | null;
    'scopes'?: string | null;
    'partnerMetadata'?: string | null;
    'additionalId1'?: string | null;
    'createdTime'?: number;
    'updatedTime'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "externalBusinessId",
            "baseName": "external_business_id",
            "type": "string"
        },
        {
            "name": "connectedMerchantId",
            "baseName": "connected_merchant_id",
            "type": "string"
        },
        {
            "name": "connectedUserId",
            "baseName": "connected_user_id",
            "type": "string"
        },
        {
            "name": "connectedAdvertiserId",
            "baseName": "connected_advertiser_id",
            "type": "string"
        },
        {
            "name": "connectedLbaId",
            "baseName": "connected_lba_id",
            "type": "string"
        },
        {
            "name": "connectedTagId",
            "baseName": "connected_tag_id",
            "type": "string"
        },
        {
            "name": "partnerAccessToken",
            "baseName": "partner_access_token",
            "type": "string"
        },
        {
            "name": "partnerRefreshToken",
            "baseName": "partner_refresh_token",
            "type": "string"
        },
        {
            "name": "partnerPrimaryEmail",
            "baseName": "partner_primary_email",
            "type": "string"
        },
        {
            "name": "partnerAccessTokenExpiry",
            "baseName": "partner_access_token_expiry",
            "type": "number"
        },
        {
            "name": "partnerRefreshTokenExpiry",
            "baseName": "partner_refresh_token_expiry",
            "type": "number"
        },
        {
            "name": "scopes",
            "baseName": "scopes",
            "type": "string"
        },
        {
            "name": "partnerMetadata",
            "baseName": "partner_metadata",
            "type": "string"
        },
        {
            "name": "additionalId1",
            "baseName": "additional_id_1",
            "type": "string"
        },
        {
            "name": "createdTime",
            "baseName": "created_time",
            "type": "number"
        },
        {
            "name": "updatedTime",
            "baseName": "updated_time",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return IntegrationRecord.attributeTypeMap;
    }
}

