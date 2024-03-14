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
import type { BatchOperation } from './BatchOperation';
import {
    BatchOperationFromJSON,
    BatchOperationFromJSONTyped,
    BatchOperationToJSON,
} from './BatchOperation';
import type { Country } from './Country';
import {
    CountryFromJSON,
    CountryFromJSONTyped,
    CountryToJSON,
} from './Country';
import type { ItemUpdateBatchRecord } from './ItemUpdateBatchRecord';
import {
    ItemUpdateBatchRecordFromJSON,
    ItemUpdateBatchRecordFromJSONTyped,
    ItemUpdateBatchRecordToJSON,
} from './ItemUpdateBatchRecord';
import type { Language } from './Language';
import {
    LanguageFromJSON,
    LanguageFromJSONTyped,
    LanguageToJSON,
} from './Language';

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
     * @type {Language}
     * @memberof CatalogsItemsUpdateBatchRequest
     */
    language: Language;
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
export function instanceOfCatalogsItemsUpdateBatchRequest(value: object): boolean {
    if (!('country' in value)) return false;
    if (!('language' in value)) return false;
    if (!('operation' in value)) return false;
    if (!('items' in value)) return false;
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
        'language': LanguageFromJSON(json['language']),
        'operation': BatchOperationFromJSON(json['operation']),
        'items': ((json['items'] as Array<any>).map(ItemUpdateBatchRecordFromJSON)),
    };
}

export function CatalogsItemsUpdateBatchRequestToJSON(value?: CatalogsItemsUpdateBatchRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'country': CountryToJSON(value['country']),
        'language': LanguageToJSON(value['language']),
        'operation': BatchOperationToJSON(value['operation']),
        'items': ((value['items'] as Array<any>).map(ItemUpdateBatchRecordToJSON)),
    };
}
