/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    CatalogsProductGroupMultipleStringCriteria,
    CatalogsProductGroupMultipleStringCriteriaFromJSON,
    CatalogsProductGroupMultipleStringCriteriaFromJSONTyped,
    CatalogsProductGroupMultipleStringCriteriaToJSON,
} from './CatalogsProductGroupMultipleStringCriteria';

/**
 * 
 * @export
 * @interface AvailabilityFilter
 */
export interface AvailabilityFilter {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof AvailabilityFilter
     */
    aVAILABILITY: CatalogsProductGroupMultipleStringCriteria;
}

export function AvailabilityFilterFromJSON(json: any): AvailabilityFilter {
    return AvailabilityFilterFromJSONTyped(json, false);
}

export function AvailabilityFilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): AvailabilityFilter {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'aVAILABILITY': json['AVAILABILITY'],
    };
}

export function AvailabilityFilterToJSON(value?: AvailabilityFilter | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'AVAILABILITY': value.aVAILABILITY,
    };
}
