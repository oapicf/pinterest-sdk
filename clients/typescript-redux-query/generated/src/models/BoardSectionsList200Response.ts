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
    BoardSection,
    BoardSectionFromJSON,
    BoardSectionToJSON,
} from './';

/**
 * @type BoardSectionsList200Response
 * @export
 */
export interface BoardSectionsList200Response extends Paginated {
}

export function BoardSectionsList200ResponseFromJSON(json: any): BoardSectionsList200Response {
    return {
        ...PaginatedFromJSON(json),
    };
}

export function BoardSectionsList200ResponseToJSON(value?: BoardSectionsList200Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...PaginatedToJSON(value),
    };
}