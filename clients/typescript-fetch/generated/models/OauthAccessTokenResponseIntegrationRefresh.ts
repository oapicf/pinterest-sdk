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
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 * @export
 * @interface OauthAccessTokenResponseIntegrationRefresh
 */
export interface OauthAccessTokenResponseIntegrationRefresh {
    /**
     * 
     * @type {string}
     * @memberof OauthAccessTokenResponseIntegrationRefresh
     */
    responseType?: OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum;
    /**
     * 
     * @type {string}
     * @memberof OauthAccessTokenResponseIntegrationRefresh
     */
    accessToken: string;
    /**
     * 
     * @type {string}
     * @memberof OauthAccessTokenResponseIntegrationRefresh
     */
    tokenType: string;
    /**
     * 
     * @type {number}
     * @memberof OauthAccessTokenResponseIntegrationRefresh
     */
    expiresIn: number;
    /**
     * 
     * @type {string}
     * @memberof OauthAccessTokenResponseIntegrationRefresh
     */
    scope: string;
    /**
     * 
     * @type {string}
     * @memberof OauthAccessTokenResponseIntegrationRefresh
     */
    refreshToken: string;
    /**
     * 
     * @type {number}
     * @memberof OauthAccessTokenResponseIntegrationRefresh
     */
    refreshTokenExpiresIn: number;
}


/**
 * @export
 */
export const OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum = {
    AuthorizationCode: 'authorization_code',
    RefreshToken: 'refresh_token',
    ClientCredentials: 'client_credentials'
} as const;
export type OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum = typeof OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum[keyof typeof OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum];


/**
 * Check if a given object implements the OauthAccessTokenResponseIntegrationRefresh interface.
 */
export function instanceOfOauthAccessTokenResponseIntegrationRefresh(value: object): value is OauthAccessTokenResponseIntegrationRefresh {
    if (!('accessToken' in value) || value['accessToken'] === undefined) return false;
    if (!('tokenType' in value) || value['tokenType'] === undefined) return false;
    if (!('expiresIn' in value) || value['expiresIn'] === undefined) return false;
    if (!('scope' in value) || value['scope'] === undefined) return false;
    if (!('refreshToken' in value) || value['refreshToken'] === undefined) return false;
    if (!('refreshTokenExpiresIn' in value) || value['refreshTokenExpiresIn'] === undefined) return false;
    return true;
}

export function OauthAccessTokenResponseIntegrationRefreshFromJSON(json: any): OauthAccessTokenResponseIntegrationRefresh {
    return OauthAccessTokenResponseIntegrationRefreshFromJSONTyped(json, false);
}

export function OauthAccessTokenResponseIntegrationRefreshFromJSONTyped(json: any, ignoreDiscriminator: boolean): OauthAccessTokenResponseIntegrationRefresh {
    if (json == null) {
        return json;
    }
    return {
        
        'responseType': json['response_type'] == null ? undefined : json['response_type'],
        'accessToken': json['access_token'],
        'tokenType': json['token_type'],
        'expiresIn': json['expires_in'],
        'scope': json['scope'],
        'refreshToken': json['refresh_token'],
        'refreshTokenExpiresIn': json['refresh_token_expires_in'],
    };
}

  export function OauthAccessTokenResponseIntegrationRefreshToJSON(json: any): OauthAccessTokenResponseIntegrationRefresh {
      return OauthAccessTokenResponseIntegrationRefreshToJSONTyped(json, false);
  }

  export function OauthAccessTokenResponseIntegrationRefreshToJSONTyped(value?: OauthAccessTokenResponseIntegrationRefresh | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'response_type': value['responseType'],
        'access_token': value['accessToken'],
        'token_type': value['tokenType'],
        'expires_in': value['expiresIn'],
        'scope': value['scope'],
        'refresh_token': value['refreshToken'],
        'refresh_token_expires_in': value['refreshTokenExpiresIn'],
    };
}

