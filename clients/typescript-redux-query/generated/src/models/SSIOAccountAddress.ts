// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface SSIOAccountAddress
 */
export interface SSIOAccountAddress  {
    /**
     * Address display
     * @type {string}
     * @memberof SSIOAccountAddress
     */
    display?: string;
    /**
     * Purpose for which the address is used, usually Billing or Businness
     * @type {string}
     * @memberof SSIOAccountAddress
     */
    purpose?: string;
    /**
     * Salesforce id for address
     * @type {string}
     * @memberof SSIOAccountAddress
     */
    addressId?: string;
    /**
     * Legal entity for this insertion order
     * @type {string}
     * @memberof SSIOAccountAddress
     */
    orderLegalEntity?: string;
}

export function SSIOAccountAddressFromJSON(json: any): SSIOAccountAddress {
    return {
        'display': !exists(json, 'display') ? undefined : json['display'],
        'purpose': !exists(json, 'purpose') ? undefined : json['purpose'],
        'addressId': !exists(json, 'address_id') ? undefined : json['address_id'],
        'orderLegalEntity': !exists(json, 'order_legal_entity') ? undefined : json['order_legal_entity'],
    };
}

export function SSIOAccountAddressToJSON(value?: SSIOAccountAddress): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'display': value.display,
        'purpose': value.purpose,
        'address_id': value.addressId,
        'order_legal_entity': value.orderLegalEntity,
    };
}


