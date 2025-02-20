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
import type { IntegrationRecord } from './IntegrationRecord';
import {
    IntegrationRecordFromJSON,
    IntegrationRecordFromJSONTyped,
    IntegrationRecordToJSON,
    IntegrationRecordToJSONTyped,
} from './IntegrationRecord';

/**
 * 
 * @export
 * @interface IntegrationsGetList200Response
 */
export interface IntegrationsGetList200Response {
    /**
     * 
     * @type {Array<IntegrationRecord>}
     * @memberof IntegrationsGetList200Response
     */
    items: Array<IntegrationRecord>;
    /**
     * 
     * @type {string}
     * @memberof IntegrationsGetList200Response
     */
    bookmark?: string | null;
}

/**
 * Check if a given object implements the IntegrationsGetList200Response interface.
 */
export function instanceOfIntegrationsGetList200Response(value: object): value is IntegrationsGetList200Response {
    if (!('items' in value) || value['items'] === undefined) return false;
    return true;
}

export function IntegrationsGetList200ResponseFromJSON(json: any): IntegrationsGetList200Response {
    return IntegrationsGetList200ResponseFromJSONTyped(json, false);
}

export function IntegrationsGetList200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): IntegrationsGetList200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'items': ((json['items'] as Array<any>).map(IntegrationRecordFromJSON)),
        'bookmark': json['bookmark'] == null ? undefined : json['bookmark'],
    };
}

  export function IntegrationsGetList200ResponseToJSON(json: any): IntegrationsGetList200Response {
      return IntegrationsGetList200ResponseToJSONTyped(json, false);
  }

  export function IntegrationsGetList200ResponseToJSONTyped(value?: IntegrationsGetList200Response | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'items': ((value['items'] as Array<any>).map(IntegrationRecordToJSON)),
        'bookmark': value['bookmark'],
    };
}

