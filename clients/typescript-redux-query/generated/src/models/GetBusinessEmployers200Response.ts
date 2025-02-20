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
    UserBusinessRoleBinding,
    UserBusinessRoleBindingFromJSON,
    UserBusinessRoleBindingToJSON,
} from './';

/**
 * @type GetBusinessEmployers200Response
 * @export
 */
export interface GetBusinessEmployers200Response extends Paginated {
}

export function GetBusinessEmployers200ResponseFromJSON(json: any): GetBusinessEmployers200Response {
    return {
        ...PaginatedFromJSON(json),
    };
}

export function GetBusinessEmployers200ResponseToJSON(value?: GetBusinessEmployers200Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...PaginatedToJSON(value),
    };
}
