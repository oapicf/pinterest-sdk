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
import type { CatalogsLocale } from './CatalogsLocale';
import {
    CatalogsLocaleFromJSON,
    CatalogsLocaleFromJSONTyped,
    CatalogsLocaleToJSON,
    CatalogsLocaleToJSONTyped,
} from './CatalogsLocale';
import type { Language } from './Language';
import {
    LanguageFromJSON,
    LanguageFromJSONTyped,
    LanguageToJSON,
    LanguageToJSONTyped,
} from './Language';

/**
 * We recommend using the CatalogsLocale values.
 * @export
 * @interface CatalogsItemsRequestLanguage
 */
export interface CatalogsItemsRequestLanguage {
}

/**
 * Check if a given object implements the CatalogsItemsRequestLanguage interface.
 */
export function instanceOfCatalogsItemsRequestLanguage(value: object): value is CatalogsItemsRequestLanguage {
    return true;
}

export function CatalogsItemsRequestLanguageFromJSON(json: any): CatalogsItemsRequestLanguage {
    return CatalogsItemsRequestLanguageFromJSONTyped(json, false);
}

export function CatalogsItemsRequestLanguageFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsItemsRequestLanguage {
    return json;
}

  export function CatalogsItemsRequestLanguageToJSON(json: any): CatalogsItemsRequestLanguage {
      return CatalogsItemsRequestLanguageToJSONTyped(json, false);
  }

  export function CatalogsItemsRequestLanguageToJSONTyped(value?: CatalogsItemsRequestLanguage | null, ignoreDiscriminator: boolean = false): any {
    return value;
}

