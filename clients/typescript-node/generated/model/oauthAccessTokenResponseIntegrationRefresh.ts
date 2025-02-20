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
* A successful OAuth access token response for the refresh token flow, with an added refresh token.
*/
export class OauthAccessTokenResponseIntegrationRefresh {
    'responseType'?: OauthAccessTokenResponseIntegrationRefresh.ResponseTypeEnum;
    'accessToken': string;
    'tokenType': string = 'bearer';
    'expiresIn': number;
    'scope': string;
    'refreshToken': string;
    'refreshTokenExpiresIn': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "responseType",
            "baseName": "response_type",
            "type": "OauthAccessTokenResponseIntegrationRefresh.ResponseTypeEnum"
        },
        {
            "name": "accessToken",
            "baseName": "access_token",
            "type": "string"
        },
        {
            "name": "tokenType",
            "baseName": "token_type",
            "type": "string"
        },
        {
            "name": "expiresIn",
            "baseName": "expires_in",
            "type": "number"
        },
        {
            "name": "scope",
            "baseName": "scope",
            "type": "string"
        },
        {
            "name": "refreshToken",
            "baseName": "refresh_token",
            "type": "string"
        },
        {
            "name": "refreshTokenExpiresIn",
            "baseName": "refresh_token_expires_in",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return OauthAccessTokenResponseIntegrationRefresh.attributeTypeMap;
    }
}

export namespace OauthAccessTokenResponseIntegrationRefresh {
    export enum ResponseTypeEnum {
        AuthorizationCode = <any> 'authorization_code',
        RefreshToken = <any> 'refresh_token',
        ClientCredentials = <any> 'client_credentials'
    }
}
