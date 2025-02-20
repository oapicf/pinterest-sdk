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
 * @export
 * @interface TermsOfService
 */
export interface TermsOfService {
    /**
     * The ID of the terms of service
     * @type {string}
     * @memberof TermsOfService
     */
    id?: string;
    /**
     * The terms of service content
     * @type {string}
     * @memberof TermsOfService
     */
    html?: string | null;
    /**
     * Whether the ad account has accepted terms of service.
     * @type {boolean}
     * @memberof TermsOfService
     */
    has_accepted?: boolean;
    /**
     * The ID of the ad account.
     * @type {string}
     * @memberof TermsOfService
     */
    ad_account_id?: string;
}
