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
import type { NonNullableCatalogsCurrency } from './NonNullableCatalogsCurrency';
import {
    NonNullableCatalogsCurrencyFromJSON,
    NonNullableCatalogsCurrencyFromJSONTyped,
    NonNullableCatalogsCurrencyToJSON,
    NonNullableCatalogsCurrencyToJSONTyped,
} from './NonNullableCatalogsCurrency';
import type { NonNullableProductAvailabilityType } from './NonNullableProductAvailabilityType';
import {
    NonNullableProductAvailabilityTypeFromJSON,
    NonNullableProductAvailabilityTypeFromJSONTyped,
    NonNullableProductAvailabilityTypeToJSON,
    NonNullableProductAvailabilityTypeToJSONTyped,
} from './NonNullableProductAvailabilityType';

/**
 * Retail product metadata entity
 * @export
 * @interface CatalogsRetailProductMetadata
 */
export interface CatalogsRetailProductMetadata {
    /**
     * The user-created unique ID that represents the product.
     * @type {string}
     * @memberof CatalogsRetailProductMetadata
     */
    itemId: string;
    /**
     * The parent ID of the product.
     * @type {string}
     * @memberof CatalogsRetailProductMetadata
     */
    itemGroupId: string | null;
    /**
     * 
     * @type {NonNullableProductAvailabilityType}
     * @memberof CatalogsRetailProductMetadata
     */
    availability: NonNullableProductAvailabilityType;
    /**
     * The price of the product.
     * @type {number}
     * @memberof CatalogsRetailProductMetadata
     */
    price: number;
    /**
     * The discounted price of the product.
     * @type {number}
     * @memberof CatalogsRetailProductMetadata
     */
    salePrice: number | null;
    /**
     * 
     * @type {NonNullableCatalogsCurrency}
     * @memberof CatalogsRetailProductMetadata
     */
    currency: NonNullableCatalogsCurrency;
}



/**
 * Check if a given object implements the CatalogsRetailProductMetadata interface.
 */
export function instanceOfCatalogsRetailProductMetadata(value: object): value is CatalogsRetailProductMetadata {
    if (!('itemId' in value) || value['itemId'] === undefined) return false;
    if (!('itemGroupId' in value) || value['itemGroupId'] === undefined) return false;
    if (!('availability' in value) || value['availability'] === undefined) return false;
    if (!('price' in value) || value['price'] === undefined) return false;
    if (!('salePrice' in value) || value['salePrice'] === undefined) return false;
    if (!('currency' in value) || value['currency'] === undefined) return false;
    return true;
}

export function CatalogsRetailProductMetadataFromJSON(json: any): CatalogsRetailProductMetadata {
    return CatalogsRetailProductMetadataFromJSONTyped(json, false);
}

export function CatalogsRetailProductMetadataFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsRetailProductMetadata {
    if (json == null) {
        return json;
    }
    return {
        
        'itemId': json['item_id'],
        'itemGroupId': json['item_group_id'],
        'availability': NonNullableProductAvailabilityTypeFromJSON(json['availability']),
        'price': json['price'],
        'salePrice': json['sale_price'],
        'currency': NonNullableCatalogsCurrencyFromJSON(json['currency']),
    };
}

  export function CatalogsRetailProductMetadataToJSON(json: any): CatalogsRetailProductMetadata {
      return CatalogsRetailProductMetadataToJSONTyped(json, false);
  }

  export function CatalogsRetailProductMetadataToJSONTyped(value?: CatalogsRetailProductMetadata | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'item_id': value['itemId'],
        'item_group_id': value['itemGroupId'],
        'availability': NonNullableProductAvailabilityTypeToJSON(value['availability']),
        'price': value['price'],
        'sale_price': value['salePrice'],
        'currency': NonNullableCatalogsCurrencyToJSON(value['currency']),
    };
}

