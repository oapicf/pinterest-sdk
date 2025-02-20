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
    AudienceRule,
    AudienceRuleFromJSON,
    AudienceRuleToJSON,
    AudienceUpdateOperationType,
    AudienceUpdateOperationTypeFromJSON,
    AudienceUpdateOperationTypeToJSON,
} from './';

/**
 * @type AudienceUpdateRequest
 * @export
 */
export interface AudienceUpdateRequest extends AudienceCommon {
}

export function AudienceUpdateRequestFromJSON(json: any): AudienceUpdateRequest {
    return {
        ...AudienceCommonFromJSON(json),
    };
}

export function AudienceUpdateRequestToJSON(value?: AudienceUpdateRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...AudienceCommonToJSON(value),
    };
}
