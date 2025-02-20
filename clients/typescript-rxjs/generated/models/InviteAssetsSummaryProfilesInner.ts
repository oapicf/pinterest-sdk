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
 * @interface InviteAssetsSummaryProfilesInner
 */
export interface InviteAssetsSummaryProfilesInner {
    /**
     * Unique identifier of a business profile.
     * @type {string}
     * @memberof InviteAssetsSummaryProfilesInner
     */
    id?: string;
    /**
     * Permission levels member or partner has on an asset.
     * @type {Array<string>}
     * @memberof InviteAssetsSummaryProfilesInner
     */
    permissions?: Array<string>;
}
