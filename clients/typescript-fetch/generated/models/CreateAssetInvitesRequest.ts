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
import type { CreateAssetInvitesRequestItem } from './CreateAssetInvitesRequestItem';
import {
    CreateAssetInvitesRequestItemFromJSON,
    CreateAssetInvitesRequestItemFromJSONTyped,
    CreateAssetInvitesRequestItemToJSON,
    CreateAssetInvitesRequestItemToJSONTyped,
} from './CreateAssetInvitesRequestItem';

/**
 * Request body for updating asset roles for existing invites.
 * @export
 * @interface CreateAssetInvitesRequest
 */
export interface CreateAssetInvitesRequest {
    /**
     * 
     * @type {Array<CreateAssetInvitesRequestItem>}
     * @memberof CreateAssetInvitesRequest
     */
    invites: Array<CreateAssetInvitesRequestItem>;
}

/**
 * Check if a given object implements the CreateAssetInvitesRequest interface.
 */
export function instanceOfCreateAssetInvitesRequest(value: object): value is CreateAssetInvitesRequest {
    if (!('invites' in value) || value['invites'] === undefined) return false;
    return true;
}

export function CreateAssetInvitesRequestFromJSON(json: any): CreateAssetInvitesRequest {
    return CreateAssetInvitesRequestFromJSONTyped(json, false);
}

export function CreateAssetInvitesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateAssetInvitesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'invites': ((json['invites'] as Array<any>).map(CreateAssetInvitesRequestItemFromJSON)),
    };
}

  export function CreateAssetInvitesRequestToJSON(json: any): CreateAssetInvitesRequest {
      return CreateAssetInvitesRequestToJSONTyped(json, false);
  }

  export function CreateAssetInvitesRequestToJSONTyped(value?: CreateAssetInvitesRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'invites': ((value['invites'] as Array<any>).map(CreateAssetInvitesRequestItemToJSON)),
    };
}

