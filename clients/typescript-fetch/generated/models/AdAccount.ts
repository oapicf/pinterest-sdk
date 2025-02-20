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
import type { BusinessAccessRole } from './BusinessAccessRole';
import {
    BusinessAccessRoleFromJSON,
    BusinessAccessRoleFromJSONTyped,
    BusinessAccessRoleToJSON,
    BusinessAccessRoleToJSONTyped,
} from './BusinessAccessRole';
import type { Currency } from './Currency';
import {
    CurrencyFromJSON,
    CurrencyFromJSONTyped,
    CurrencyToJSON,
    CurrencyToJSONTyped,
} from './Currency';
import type { Country } from './Country';
import {
    CountryFromJSON,
    CountryFromJSONTyped,
    CountryToJSON,
    CountryToJSONTyped,
} from './Country';
import type { AdAccountOwner } from './AdAccountOwner';
import {
    AdAccountOwnerFromJSON,
    AdAccountOwnerFromJSONTyped,
    AdAccountOwnerToJSON,
    AdAccountOwnerToJSONTyped,
} from './AdAccountOwner';

/**
 * 
 * @export
 * @interface AdAccount
 */
export interface AdAccount {
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
    createdTime?: number | null;
    /**
     * Last update time. Unix timestamp in seconds.
     * @type {number}
     * @memberof AdAccount
     */
    updatedTime?: number | null;
}



/**
 * Check if a given object implements the AdAccount interface.
 */
export function instanceOfAdAccount(value: object): value is AdAccount {
    return true;
}

export function AdAccountFromJSON(json: any): AdAccount {
    return AdAccountFromJSONTyped(json, false);
}

export function AdAccountFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdAccount {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'name': json['name'] == null ? undefined : json['name'],
        'owner': json['owner'] == null ? undefined : AdAccountOwnerFromJSON(json['owner']),
        'country': json['country'] == null ? undefined : CountryFromJSON(json['country']),
        'currency': json['currency'] == null ? undefined : CurrencyFromJSON(json['currency']),
        'permissions': json['permissions'] == null ? undefined : ((json['permissions'] as Array<any>).map(BusinessAccessRoleFromJSON)),
        'createdTime': json['created_time'] == null ? undefined : json['created_time'],
        'updatedTime': json['updated_time'] == null ? undefined : json['updated_time'],
    };
}

  export function AdAccountToJSON(json: any): AdAccount {
      return AdAccountToJSONTyped(json, false);
  }

  export function AdAccountToJSONTyped(value?: AdAccount | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'id': value['id'],
        'name': value['name'],
        'owner': AdAccountOwnerToJSON(value['owner']),
        'country': CountryToJSON(value['country']),
        'currency': CurrencyToJSON(value['currency']),
        'permissions': value['permissions'] == null ? undefined : ((value['permissions'] as Array<any>).map(BusinessAccessRoleToJSON)),
        'created_time': value['createdTime'],
        'updated_time': value['updatedTime'],
    };
}

