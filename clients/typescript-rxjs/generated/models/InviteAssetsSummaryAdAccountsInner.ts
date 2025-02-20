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
 * @interface InviteAssetsSummaryAdAccountsInner
 */
export interface InviteAssetsSummaryAdAccountsInner {
    /**
     * Unique identifier of a business ad account.
     * @type {string}
     * @memberof InviteAssetsSummaryAdAccountsInner
     */
    id?: string;
    /**
     * Permission levels member or partner has on an asset.
     * @type {Array<string>}
     * @memberof InviteAssetsSummaryAdAccountsInner
     */
    permissions?: Array<string>;
}
