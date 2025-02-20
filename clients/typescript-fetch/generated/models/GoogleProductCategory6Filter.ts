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
 * @interface GoogleProductCategory6Filter
 */
export interface GoogleProductCategory6Filter {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringListCriteria}
     * @memberof GoogleProductCategory6Filter
     */
    gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria;
}

/**
 * Check if a given object implements the GoogleProductCategory6Filter interface.
 */
export function instanceOfGoogleProductCategory6Filter(value: object): value is GoogleProductCategory6Filter {
    if (!('gOOGLEPRODUCTCATEGORY6' in value) || value['gOOGLEPRODUCTCATEGORY6'] === undefined) return false;
    return true;
}

export function GoogleProductCategory6FilterFromJSON(json: any): GoogleProductCategory6Filter {
    return GoogleProductCategory6FilterFromJSONTyped(json, false);
}

export function GoogleProductCategory6FilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): GoogleProductCategory6Filter {
    if (json == null) {
        return json;
    }
    return {
        
        'gOOGLEPRODUCTCATEGORY6': json['GOOGLE_PRODUCT_CATEGORY_6'],
    };
}

  export function GoogleProductCategory6FilterToJSON(json: any): GoogleProductCategory6Filter {
      return GoogleProductCategory6FilterToJSONTyped(json, false);
  }

  export function GoogleProductCategory6FilterToJSONTyped(value?: GoogleProductCategory6Filter | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'GOOGLE_PRODUCT_CATEGORY_6': value['gOOGLEPRODUCTCATEGORY6'],
    };
}

