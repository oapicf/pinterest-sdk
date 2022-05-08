/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
import {
    OauthAccessTokenResponse,
    OauthAccessTokenResponseFromJSON,
    OauthAccessTokenResponseFromJSONTyped,
    OauthAccessTokenResponseToJSON,
} from './OauthAccessTokenResponse';

/**
 * A successful OAuth access token response for the refresh token flow.
 * @export
 * @interface OauthAccessTokenResponseRefresh
 */
export interface OauthAccessTokenResponseRefresh extends OauthAccessTokenResponse {
}



export function OauthAccessTokenResponseRefreshFromJSON(json: any): OauthAccessTokenResponseRefresh {
    return OauthAccessTokenResponseRefreshFromJSONTyped(json, false);
}

export function OauthAccessTokenResponseRefreshFromJSONTyped(json: any, ignoreDiscriminator: boolean): OauthAccessTokenResponseRefresh {
    return json;
}

export function OauthAccessTokenResponseRefreshToJSON(value?: OauthAccessTokenResponseRefresh | null): any {
    return value;
}
