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
    Board,
    BoardFromJSON,
    BoardToJSON,
} from './';

/**
 * @type SearchUserBoardsGet200Response
 * @export
 */
export interface SearchUserBoardsGet200Response extends Paginated {
}

export function SearchUserBoardsGet200ResponseFromJSON(json: any): SearchUserBoardsGet200Response {
    return {
        ...PaginatedFromJSON(json),
    };
}

export function SearchUserBoardsGet200ResponseToJSON(value?: SearchUserBoardsGet200Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...PaginatedToJSON(value),
    };
}
