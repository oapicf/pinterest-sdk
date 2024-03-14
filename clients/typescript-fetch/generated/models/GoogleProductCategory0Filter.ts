/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { CatalogsProductGroupMultipleStringListCriteria } from './CatalogsProductGroupMultipleStringListCriteria';
import {
    CatalogsProductGroupMultipleStringListCriteriaFromJSON,
    CatalogsProductGroupMultipleStringListCriteriaFromJSONTyped,
    CatalogsProductGroupMultipleStringListCriteriaToJSON,
} from './CatalogsProductGroupMultipleStringListCriteria';

/**
 * 
 * @export
 * @interface GoogleProductCategory0Filter
 */
export interface GoogleProductCategory0Filter {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringListCriteria}
     * @memberof GoogleProductCategory0Filter
     */
    gOOGLEPRODUCTCATEGORY0: CatalogsProductGroupMultipleStringListCriteria;
}

/**
 * Check if a given object implements the GoogleProductCategory0Filter interface.
 */
export function instanceOfGoogleProductCategory0Filter(value: object): boolean {
    if (!('gOOGLEPRODUCTCATEGORY0' in value)) return false;
    return true;
}

export function GoogleProductCategory0FilterFromJSON(json: any): GoogleProductCategory0Filter {
    return GoogleProductCategory0FilterFromJSONTyped(json, false);
}

export function GoogleProductCategory0FilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): GoogleProductCategory0Filter {
    if (json == null) {
        return json;
    }
    return {
        
        'gOOGLEPRODUCTCATEGORY0': json['GOOGLE_PRODUCT_CATEGORY_0'],
    };
}

export function GoogleProductCategory0FilterToJSON(value?: GoogleProductCategory0Filter | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'GOOGLE_PRODUCT_CATEGORY_0': value['gOOGLEPRODUCTCATEGORY0'],
    };
}
