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
import type { ItemUpdateBatchRecord } from './ItemUpdateBatchRecord';
import {
    ItemUpdateBatchRecordFromJSON,
    ItemUpdateBatchRecordFromJSONTyped,
    ItemUpdateBatchRecordToJSON,
    ItemUpdateBatchRecordToJSONTyped,
} from './ItemUpdateBatchRecord';
import type { Country } from './Country';
import {
    CountryFromJSON,
    CountryFromJSONTyped,
    CountryToJSON,
    CountryToJSONTyped,
} from './Country';
import type { BatchOperation } from './BatchOperation';
import {
    BatchOperationFromJSON,
    BatchOperationFromJSONTyped,
    BatchOperationToJSON,
    BatchOperationToJSONTyped,
} from './BatchOperation';
import type { CatalogsItemsRequestLanguage } from './CatalogsItemsRequestLanguage';
import {
    CatalogsItemsRequestLanguageFromJSON,
    CatalogsItemsRequestLanguageFromJSONTyped,
    CatalogsItemsRequestLanguageToJSON,
    CatalogsItemsRequestLanguageToJSONTyped,
} from './CatalogsItemsRequestLanguage';

/**
 * Request object to update catalogs items
 * @export
 * @interface CatalogsItemsUpdateBatchRequest
 */
export interface CatalogsItemsUpdateBatchRequest {
    /**
     * 
     * @type {Country}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    country: Country;
    /**
     * 
     * @type {CatalogsItemsRequestLanguage}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    language: CatalogsItemsRequestLanguage;
    /**
     * 
     * @type {BatchOperation}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    operation: BatchOperation;
    /**
     * Array with catalogs items
     * @type {Array<ItemUpdateBatchRecord>}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    items: Array<ItemUpdateBatchRecord>;
}



/**
 * Check if a given object implements the CatalogsItemsUpdateBatchRequest interface.
 */
export function instanceOfCatalogsItemsUpdateBatchRequest(value: object): value is CatalogsItemsUpdateBatchRequest {
    if (!('country' in value) || value['country'] === undefined) return false;
    if (!('language' in value) || value['language'] === undefined) return false;
    if (!('operation' in value) || value['operation'] === undefined) return false;
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function CatalogsItemsUpdateBatchRequestFromJSON(json: any): CatalogsItemsUpdateBatchRequest {
    return CatalogsItemsUpdateBatchRequestFromJSONTyped(json, false);
}

export function CatalogsItemsUpdateBatchRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsItemsUpdateBatchRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'country': CountryFromJSON(json['country']),
        'language': CatalogsItemsRequestLanguageFromJSON(json['language']),
        'operation': BatchOperationFromJSON(json['operation']),
        'items': ((json['items'] as Array<any>).map(ItemUpdateBatchRecordFromJSON)),
    };
}

  export function CatalogsItemsUpdateBatchRequestToJSON(json: any): CatalogsItemsUpdateBatchRequest {
      return CatalogsItemsUpdateBatchRequestToJSONTyped(json, false);
  }

  export function CatalogsItemsUpdateBatchRequestToJSONTyped(value?: CatalogsItemsUpdateBatchRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'country': CountryToJSON(value['country']),
        'language': CatalogsItemsRequestLanguageToJSON(value['language']),
        'operation': BatchOperationToJSON(value['operation']),
        'items': ((value['items'] as Array<any>).map(ItemUpdateBatchRecordToJSON)),
    };
}

