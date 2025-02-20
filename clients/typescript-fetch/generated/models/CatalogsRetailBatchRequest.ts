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
import type { CatalogsRetailBatchRequestItemsInner } from './CatalogsRetailBatchRequestItemsInner';
import {
    CatalogsRetailBatchRequestItemsInnerFromJSON,
    CatalogsRetailBatchRequestItemsInnerFromJSONTyped,
    CatalogsRetailBatchRequestItemsInnerToJSON,
    CatalogsRetailBatchRequestItemsInnerToJSONTyped,
} from './CatalogsRetailBatchRequestItemsInner';
import type { Country } from './Country';
import {
    CountryFromJSON,
    CountryFromJSONTyped,
    CountryToJSON,
    CountryToJSONTyped,
} from './Country';
import type { CatalogsItemsRequestLanguage } from './CatalogsItemsRequestLanguage';
import {
    CatalogsItemsRequestLanguageFromJSON,
    CatalogsItemsRequestLanguageFromJSONTyped,
    CatalogsItemsRequestLanguageToJSON,
    CatalogsItemsRequestLanguageToJSONTyped,
} from './CatalogsItemsRequestLanguage';

/**
 * A request object that can have multiple operations on a single retail batch
 * @export
 * @interface CatalogsRetailBatchRequest
 */
export interface CatalogsRetailBatchRequest {
    /**
     * 
     * @type {string}
     * @memberof CatalogsRetailBatchRequest
     */
    catalogType: CatalogsRetailBatchRequestCatalogTypeEnum;
    /**
     * 
     * @type {Country}
     * @memberof CatalogsRetailBatchRequest
     */
    country: Country;
    /**
     * 
     * @type {CatalogsItemsRequestLanguage}
     * @memberof CatalogsRetailBatchRequest
     */
    language: CatalogsItemsRequestLanguage;
    /**
     * Array with catalogs item operations
     * @type {Array<CatalogsRetailBatchRequestItemsInner>}
     * @memberof CatalogsRetailBatchRequest
     */
    items: Array<CatalogsRetailBatchRequestItemsInner>;
}


/**
 * @export
 */
export const CatalogsRetailBatchRequestCatalogTypeEnum = {
    Retail: 'RETAIL'
} as const;
export type CatalogsRetailBatchRequestCatalogTypeEnum = typeof CatalogsRetailBatchRequestCatalogTypeEnum[keyof typeof CatalogsRetailBatchRequestCatalogTypeEnum];


/**
 * Check if a given object implements the CatalogsRetailBatchRequest interface.
 */
export function instanceOfCatalogsRetailBatchRequest(value: object): value is CatalogsRetailBatchRequest {
    if (!('catalogType' in value) || value['catalogType'] === undefined) return false;
    if (!('country' in value) || value['country'] === undefined) return false;
    if (!('language' in value) || value['language'] === undefined) return false;
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function CatalogsRetailBatchRequestFromJSON(json: any): CatalogsRetailBatchRequest {
    return CatalogsRetailBatchRequestFromJSONTyped(json, false);
}

export function CatalogsRetailBatchRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsRetailBatchRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'catalogType': json['catalog_type'],
        'country': CountryFromJSON(json['country']),
        'language': CatalogsItemsRequestLanguageFromJSON(json['language']),
        'items': ((json['items'] as Array<any>).map(CatalogsRetailBatchRequestItemsInnerFromJSON)),
    };
}

  export function CatalogsRetailBatchRequestToJSON(json: any): CatalogsRetailBatchRequest {
      return CatalogsRetailBatchRequestToJSONTyped(json, false);
  }

  export function CatalogsRetailBatchRequestToJSONTyped(value?: CatalogsRetailBatchRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'catalog_type': value['catalogType'],
        'country': CountryToJSON(value['country']),
        'language': CatalogsItemsRequestLanguageToJSON(value['language']),
        'items': ((value['items'] as Array<any>).map(CatalogsRetailBatchRequestItemsInnerToJSON)),
    };
}

