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
    Keyword,
    KeywordFromJSON,
    KeywordToJSON,
} from './';

/**
 * @type KeywordsGet200Response
 * @export
 */
export interface KeywordsGet200Response extends Paginated {
}

export function KeywordsGet200ResponseFromJSON(json: any): KeywordsGet200Response {
    return {
        ...PaginatedFromJSON(json),
    };
}

export function KeywordsGet200ResponseToJSON(value?: KeywordsGet200Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...PaginatedToJSON(value),
    };
}