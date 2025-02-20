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

/**
 * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 * @export
 * @interface OauthAccessTokenResponseEverlastingRefresh
 */
export interface OauthAccessTokenResponseEverlastingRefresh {
    /**
     * @type {string}
     * @memberof OauthAccessTokenResponseEverlastingRefresh
     */
    response_type?: OauthAccessTokenResponseEverlastingRefreshResponseTypeEnum;
    /**
     * @type {string}
     * @memberof OauthAccessTokenResponseEverlastingRefresh
     */
    access_token: string;
    /**
     * @type {string}
     * @memberof OauthAccessTokenResponseEverlastingRefresh
     */
    token_type: string;
    /**
     * @type {number}
     * @memberof OauthAccessTokenResponseEverlastingRefresh
     */
    expires_in: number;
    /**
     * @type {string}
     * @memberof OauthAccessTokenResponseEverlastingRefresh
     */
    scope: string;
    /**
     * @type {string}
     * @memberof OauthAccessTokenResponseEverlastingRefresh
     */
    refresh_token: string;
    /**
     * @type {number}
     * @memberof OauthAccessTokenResponseEverlastingRefresh
     */
    refresh_token_expires_in: number;
    /**
     * @type {number}
     * @memberof OauthAccessTokenResponseEverlastingRefresh
     */
    refresh_token_expires_at: number;
}

/**
 * @export
 * @enum {string}
 */
export enum OauthAccessTokenResponseEverlastingRefreshResponseTypeEnum {
    AuthorizationCode = 'authorization_code',
    RefreshToken = 'refresh_token',
    ClientCredentials = 'client_credentials'
}

