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
import type { ItemCreateBatchRecord } from './ItemCreateBatchRecord';
import {
    ItemCreateBatchRecordFromJSON,
    ItemCreateBatchRecordFromJSONTyped,
    ItemCreateBatchRecordToJSON,
} from './ItemCreateBatchRecord';
import type { Language } from './Language';
import {
    LanguageFromJSON,
    LanguageFromJSONTyped,
    LanguageToJSON,
} from './Language';

/**
 * Request object to create catalogs items
 * @export
 * @interface CatalogsItemsCreateBatchRequest
 */
export interface CatalogsItemsCreateBatchRequest {
    /**
     * 
     * @type {Country}
     * @memberof CatalogsItemsCreateBatchRequest
     */
    country: Country;
    /**
     * 
     * @type {Language}
     * @memberof CatalogsItemsCreateBatchRequest
     */
    language: Language;
    /**
     * 
     * @type {BatchOperation}
     * @memberof CatalogsItemsCreateBatchRequest
     */
    operation: BatchOperation;
    /**
     * Array with catalogs items
     * @type {Array<ItemCreateBatchRecord>}
     * @memberof CatalogsItemsCreateBatchRequest
     */
    items: Array<ItemCreateBatchRecord>;
}

/**
 * Check if a given object implements the CatalogsItemsCreateBatchRequest interface.
 */
export function instanceOfCatalogsItemsCreateBatchRequest(value: object): boolean {
    if (!('country' in value)) return false;
    if (!('language' in value)) return false;
    if (!('operation' in value)) return false;
    if (!('items' in value)) return false;
    return true;
}

export function CatalogsItemsCreateBatchRequestFromJSON(json: any): CatalogsItemsCreateBatchRequest {
    return CatalogsItemsCreateBatchRequestFromJSONTyped(json, false);
}

export function CatalogsItemsCreateBatchRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsItemsCreateBatchRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'country': CountryFromJSON(json['country']),
        'language': LanguageFromJSON(json['language']),
        'operation': BatchOperationFromJSON(json['operation']),
        'items': ((json['items'] as Array<any>).map(ItemCreateBatchRecordFromJSON)),
    };
}

export function CatalogsItemsCreateBatchRequestToJSON(value?: CatalogsItemsCreateBatchRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'country': CountryToJSON(value['country']),
        'language': LanguageToJSON(value['language']),
        'operation': BatchOperationToJSON(value['operation']),
        'items': ((value['items'] as Array<any>).map(ItemCreateBatchRecordToJSON)),
    };
}
