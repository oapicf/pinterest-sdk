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
 * Request body used to delete asset groups
 * @export
 * @interface DeleteAssetGroupBody
 */
export interface DeleteAssetGroupBody {
    /**
     * List of ids of asset groups to be deleted
     * @type {Array<string>}
     * @memberof DeleteAssetGroupBody
     */
    asset_groups_to_delete: Array<string>;
}
