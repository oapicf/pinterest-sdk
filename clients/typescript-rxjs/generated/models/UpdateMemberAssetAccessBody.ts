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

import type {
    UpdateMemberAssetAccessBodyAccessesInner,
} from './';

/**
 * An object with a list of all the new accesses.
 * @export
 * @interface UpdateMemberAssetAccessBody
 */
export interface UpdateMemberAssetAccessBody {
    /**
     * @type {Array<UpdateMemberAssetAccessBodyAccessesInner>}
     * @memberof UpdateMemberAssetAccessBody
     */
    accesses: Array<UpdateMemberAssetAccessBodyAccessesInner>;
}
