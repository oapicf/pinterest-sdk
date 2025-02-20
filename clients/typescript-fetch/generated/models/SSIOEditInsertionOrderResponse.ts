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
/**
 * 
 * @export
 * @interface SSIOEditInsertionOrderResponse
 */
export interface SSIOEditInsertionOrderResponse {
    /**
     * Salesforce order id
     * @type {string}
     * @memberof SSIOEditInsertionOrderResponse
     */
    pinOrderId?: string;
}

/**
 * Check if a given object implements the SSIOEditInsertionOrderResponse interface.
 */
export function instanceOfSSIOEditInsertionOrderResponse(value: object): value is SSIOEditInsertionOrderResponse {
    return true;
}

export function SSIOEditInsertionOrderResponseFromJSON(json: any): SSIOEditInsertionOrderResponse {
    return SSIOEditInsertionOrderResponseFromJSONTyped(json, false);
}

export function SSIOEditInsertionOrderResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): SSIOEditInsertionOrderResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'pinOrderId': json['pin_order_id'] == null ? undefined : json['pin_order_id'],
    };
}

  export function SSIOEditInsertionOrderResponseToJSON(json: any): SSIOEditInsertionOrderResponse {
      return SSIOEditInsertionOrderResponseToJSONTyped(json, false);
  }

  export function SSIOEditInsertionOrderResponseToJSONTyped(value?: SSIOEditInsertionOrderResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'pin_order_id': value['pinOrderId'],
    };
}

