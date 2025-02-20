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

import {
    AssetIdPermissions,
    AssetIdPermissionsFromJSON,
    AssetIdPermissionsToJSON,
} from './';

/**
 * @type BusinessMemberAssetsGet200Response
 * @export
 */
export interface BusinessMemberAssetsGet200Response extends Paginated {
}

export function BusinessMemberAssetsGet200ResponseFromJSON(json: any): BusinessMemberAssetsGet200Response {
    return {
        ...PaginatedFromJSON(json),
    };
}

export function BusinessMemberAssetsGet200ResponseToJSON(value?: BusinessMemberAssetsGet200Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...PaginatedToJSON(value),
    };
}
