/* tslint:disable */
/* eslint-disable */
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

import type { CatalogsItemsBatchRequest } from './CatalogsItemsBatchRequest';
import {
    instanceOfCatalogsItemsBatchRequest,
    CatalogsItemsBatchRequestFromJSON,
    CatalogsItemsBatchRequestFromJSONTyped,
    CatalogsItemsBatchRequestToJSON,
} from './CatalogsItemsBatchRequest';
import type { CatalogsVerticalBatchRequest } from './CatalogsVerticalBatchRequest';
import {
    instanceOfCatalogsVerticalBatchRequest,
    CatalogsVerticalBatchRequestFromJSON,
    CatalogsVerticalBatchRequestFromJSONTyped,
    CatalogsVerticalBatchRequestToJSON,
} from './CatalogsVerticalBatchRequest';

/**
 * @type ItemsBatchPostRequest
 * 
 * @export
 */
export type ItemsBatchPostRequest = CatalogsItemsBatchRequest | CatalogsVerticalBatchRequest;

export function ItemsBatchPostRequestFromJSON(json: any): ItemsBatchPostRequest {
    return ItemsBatchPostRequestFromJSONTyped(json, false);
}

export function ItemsBatchPostRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ItemsBatchPostRequest {
    if (json == null) {
        return json;
    }
    if (instanceOfCatalogsItemsBatchRequest(json)) {
        return CatalogsItemsBatchRequestFromJSONTyped(json, true);
    }
    if (instanceOfCatalogsVerticalBatchRequest(json)) {
        return CatalogsVerticalBatchRequestFromJSONTyped(json, true);
    }

    return {} as any;
}

export function ItemsBatchPostRequestToJSON(value?: ItemsBatchPostRequest | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfCatalogsItemsBatchRequest(value)) {
        return CatalogsItemsBatchRequestToJSON(value as CatalogsItemsBatchRequest);
    }
    if (instanceOfCatalogsVerticalBatchRequest(value)) {
        return CatalogsVerticalBatchRequestToJSON(value as CatalogsVerticalBatchRequest);
    }

    return {};
}

