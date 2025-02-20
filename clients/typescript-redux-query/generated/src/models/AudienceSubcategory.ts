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
 * @interface AudienceSubcategory
 */
export interface AudienceSubcategory  {
    /**
     * Interest unique key (same as ID).
     * @type {string}
     * @memberof AudienceSubcategory
     */
    key?: string;
    /**
     * Subinterest name.
     * @type {string}
     * @memberof AudienceSubcategory
     */
    name?: string;
    /**
     * Subinterest\'s percent of category\'s total audience.
     * @type {number}
     * @memberof AudienceSubcategory
     */
    ratio?: number;
    /**
     * Subinterest affinity index.
     * @type {number}
     * @memberof AudienceSubcategory
     */
    index?: number;
    /**
     * Subinterest ID.
     * @type {string}
     * @memberof AudienceSubcategory
     */
    id?: string;
}

export function AudienceSubcategoryFromJSON(json: any): AudienceSubcategory {
    return {
        'key': !exists(json, 'key') ? undefined : json['key'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'ratio': !exists(json, 'ratio') ? undefined : json['ratio'],
        'index': !exists(json, 'index') ? undefined : json['index'],
        'id': !exists(json, 'id') ? undefined : json['id'],
    };
}

export function AudienceSubcategoryToJSON(value?: AudienceSubcategory): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'key': value.key,
        'name': value.name,
        'ratio': value.ratio,
        'index': value.index,
        'id': value.id,
    };
}


