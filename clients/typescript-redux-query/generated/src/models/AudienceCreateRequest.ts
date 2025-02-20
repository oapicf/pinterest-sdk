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
    AudienceCreateRequest1AudienceType,
    AudienceCreateRequest1AudienceTypeFromJSON,
    AudienceCreateRequest1AudienceTypeToJSON,
    AudienceRule,
    AudienceRuleFromJSON,
    AudienceRuleToJSON,
} from './';

/**
 * @type AudienceCreateRequest
 * @export
 */
export interface AudienceCreateRequest extends AudienceCommon {
}

export function AudienceCreateRequestFromJSON(json: any): AudienceCreateRequest {
    return {
        ...AudienceCommonFromJSON(json),
    };
}

export function AudienceCreateRequestToJSON(value?: AudienceCreateRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...AudienceCommonToJSON(value),
    };
}
