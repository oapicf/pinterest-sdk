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
import { OauthAccessTokenResponse } from './oauthAccessTokenResponse';


/**
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 */
export interface OauthAccessTokenResponseIntegrationRefresh extends OauthAccessTokenResponse { 
    refresh_token: string;
    refresh_token_expires_in: number;
}
export namespace OauthAccessTokenResponseIntegrationRefresh {
}