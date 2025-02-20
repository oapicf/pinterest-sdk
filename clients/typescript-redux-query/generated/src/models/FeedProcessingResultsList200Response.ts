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
    CatalogsFeedProcessingResult,
    CatalogsFeedProcessingResultFromJSON,
    CatalogsFeedProcessingResultToJSON,
} from './';

/**
 * @type FeedProcessingResultsList200Response
 * @export
 */
export interface FeedProcessingResultsList200Response extends Paginated {
}

export function FeedProcessingResultsList200ResponseFromJSON(json: any): FeedProcessingResultsList200Response {
    return {
        ...PaginatedFromJSON(json),
    };
}

export function FeedProcessingResultsList200ResponseToJSON(value?: FeedProcessingResultsList200Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...PaginatedToJSON(value),
    };
}
