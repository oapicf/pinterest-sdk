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
 * @interface Paginated
 */
export interface Paginated {
    /**
     * 
     * @type {Array<object>}
     * @memberof Paginated
     */
    items: Array<object>;
    /**
     * 
     * @type {string}
     * @memberof Paginated
     */
    bookmark?: string | null;
}

/**
 * Check if a given object implements the Paginated interface.
 */
export function instanceOfPaginated(value: object): value is Paginated {
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function PaginatedFromJSON(json: any): Paginated {
    return PaginatedFromJSONTyped(json, false);
}

export function PaginatedFromJSONTyped(json: any, ignoreDiscriminator: boolean): Paginated {
    if (json == null) {
        return json;
    }
    return {
        
        'items': json['items'],
        'bookmark': json['bookmark'] == null ? undefined : json['bookmark'],
    };
}

  export function PaginatedToJSON(json: any): Paginated {
      return PaginatedToJSONTyped(json, false);
  }

  export function PaginatedToJSONTyped(value?: Paginated | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'items': value['items'],
        'bookmark': value['bookmark'],
    };
}

