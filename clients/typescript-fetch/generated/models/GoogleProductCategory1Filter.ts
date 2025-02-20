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

import { mapValues } from '../runtime';
import type { CatalogsProductGroupMultipleStringListCriteria } from './CatalogsProductGroupMultipleStringListCriteria';
import {
    CatalogsProductGroupMultipleStringListCriteriaFromJSON,
    CatalogsProductGroupMultipleStringListCriteriaFromJSONTyped,
    CatalogsProductGroupMultipleStringListCriteriaToJSON,
    CatalogsProductGroupMultipleStringListCriteriaToJSONTyped,
} from './CatalogsProductGroupMultipleStringListCriteria';

/**
 * 
 * @export
 * @interface GoogleProductCategory1Filter
 */
export interface GoogleProductCategory1Filter {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringListCriteria}
     * @memberof GoogleProductCategory1Filter
     */
    gOOGLEPRODUCTCATEGORY1: CatalogsProductGroupMultipleStringListCriteria;
}

/**
 * Check if a given object implements the GoogleProductCategory1Filter interface.
 */
export function instanceOfGoogleProductCategory1Filter(value: object): value is GoogleProductCategory1Filter {
    if (!('gOOGLEPRODUCTCATEGORY1' in value) || value['gOOGLEPRODUCTCATEGORY1'] === undefined) return false;
    return true;
}

export function GoogleProductCategory1FilterFromJSON(json: any): GoogleProductCategory1Filter {
    return GoogleProductCategory1FilterFromJSONTyped(json, false);
}

export function GoogleProductCategory1FilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): GoogleProductCategory1Filter {
    if (json == null) {
        return json;
    }
    return {
        
        'gOOGLEPRODUCTCATEGORY1': json['GOOGLE_PRODUCT_CATEGORY_1'],
    };
}

  export function GoogleProductCategory1FilterToJSON(json: any): GoogleProductCategory1Filter {
      return GoogleProductCategory1FilterToJSONTyped(json, false);
  }

  export function GoogleProductCategory1FilterToJSONTyped(value?: GoogleProductCategory1Filter | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'GOOGLE_PRODUCT_CATEGORY_1': value['gOOGLEPRODUCTCATEGORY1'],
    };
}

