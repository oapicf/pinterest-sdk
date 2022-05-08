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
/**
 * 
 * @export
 * @interface CatalogsProductGroupMultipleStringCriteria
 */
export interface CatalogsProductGroupMultipleStringCriteria {
    /**
     * 
     * @type {Array<string>}
     * @memberof CatalogsProductGroupMultipleStringCriteria
     */
    values: Array<string>;
    /**
     * 
     * @type {boolean}
     * @memberof CatalogsProductGroupMultipleStringCriteria
     */
    negated: boolean;
}

export function CatalogsProductGroupMultipleStringCriteriaFromJSON(json: any): CatalogsProductGroupMultipleStringCriteria {
    return CatalogsProductGroupMultipleStringCriteriaFromJSONTyped(json, false);
}

export function CatalogsProductGroupMultipleStringCriteriaFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsProductGroupMultipleStringCriteria {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'values': json['values'],
        'negated': json['negated'],
    };
}

export function CatalogsProductGroupMultipleStringCriteriaToJSON(value?: CatalogsProductGroupMultipleStringCriteria | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'values': value.values,
        'negated': value.negated,
    };
}
