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

import * as models from './models';

/**
 * A successful OAuth access token response for the authorization code flow.
 */
export interface OauthAccessTokenResponseCode {
    response_type?: OauthAccessTokenResponseCode.ResponseTypeEnum;

    access_token: string;

    token_type: string;

    expires_in: number;

    scope: string;

    refresh_token: string;

    refresh_token_expires_in: number;

}
export namespace OauthAccessTokenResponseCode {
    export enum ResponseTypeEnum {
        AuthorizationCode = <any> 'authorization_code',
        RefreshToken = <any> 'refresh_token',
        ClientCredentials = <any> 'client_credentials'
    }
}
