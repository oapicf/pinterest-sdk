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

import {
    OauthAccessTokenResponse,
    OauthAccessTokenResponseFromJSON,
    OauthAccessTokenResponseToJSON,
} from './';

/**
 * @type OauthAccessTokenResponseIntegrationRefresh
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 * @export
 */
export interface OauthAccessTokenResponseIntegrationRefresh extends OauthAccessTokenResponse {
}

export function OauthAccessTokenResponseIntegrationRefreshFromJSON(json: any): OauthAccessTokenResponseIntegrationRefresh {
    return {
        ...OauthAccessTokenResponseFromJSON(json),
    };
}

export function OauthAccessTokenResponseIntegrationRefreshToJSON(value?: OauthAccessTokenResponseIntegrationRefresh): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...OauthAccessTokenResponseToJSON(value),
    };
}