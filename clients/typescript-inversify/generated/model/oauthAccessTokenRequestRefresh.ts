/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { OauthAccessTokenRequest } from './oauthAccessTokenRequest';
import { OauthAccessTokenRequestRefreshAllOf } from './oauthAccessTokenRequestRefreshAllOf';


/**
 * A request to exchange a refresh token for a new access token.
 */
export interface OauthAccessTokenRequestRefresh extends OauthAccessTokenRequest { 
    refresh_token: string;
    scope?: string;
}
export namespace OauthAccessTokenRequestRefresh {
}