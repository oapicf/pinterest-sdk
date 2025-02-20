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
import {
    AdAccountOwner,
    AdAccountOwnerFromJSON,
    AdAccountOwnerToJSON,
    BusinessAccessRole,
    BusinessAccessRoleFromJSON,
    BusinessAccessRoleToJSON,
    Country,
    CountryFromJSON,
    CountryToJSON,
    Currency,
    CurrencyFromJSON,
    CurrencyToJSON,
} from './';

/**
 * 
 * @export
 * @interface AdAccount
 */
export interface AdAccount  {
    /**
     * 
     * @type {string}
     * @memberof AdAccount
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof AdAccount
     */
    name?: string;
    /**
     * 
     * @type {AdAccountOwner}
     * @memberof AdAccount
     */
    owner?: AdAccountOwner;
    /**
     * 
     * @type {Country}
     * @memberof AdAccount
     */
    country?: Country;
    /**
     * 
     * @type {Currency}
     * @memberof AdAccount
     */
    currency?: Currency;
    /**
     * 
     * @type {Array<BusinessAccessRole>}
     * @memberof AdAccount
     */
    permissions?: Array<BusinessAccessRole>;
    /**
     * Creation time. Unix timestamp in seconds.
     * @type {number}
     * @memberof AdAccount
     */
    createdTime?: number;
    /**
     * Last update time. Unix timestamp in seconds.
     * @type {number}
     * @memberof AdAccount
     */
    updatedTime?: number;
}

export function AdAccountFromJSON(json: any): AdAccount {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'owner': !exists(json, 'owner') ? undefined : AdAccountOwnerFromJSON(json['owner']),
        'country': !exists(json, 'country') ? undefined : CountryFromJSON(json['country']),
        'currency': !exists(json, 'currency') ? undefined : CurrencyFromJSON(json['currency']),
        'permissions': !exists(json, 'permissions') ? undefined : (json['permissions'] as Array<any>).map(BusinessAccessRoleFromJSON),
        'createdTime': !exists(json, 'created_time') ? undefined : json['created_time'],
        'updatedTime': !exists(json, 'updated_time') ? undefined : json['updated_time'],
    };
}

export function AdAccountToJSON(value?: AdAccount): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'name': value.name,
        'owner': AdAccountOwnerToJSON(value.owner),
        'country': CountryToJSON(value.country),
        'currency': CurrencyToJSON(value.currency),
        'permissions': value.permissions === undefined ? undefined : (value.permissions as Array<any>).map(BusinessAccessRoleToJSON),
        'created_time': value.createdTime,
        'updated_time': value.updatedTime,
    };
}



