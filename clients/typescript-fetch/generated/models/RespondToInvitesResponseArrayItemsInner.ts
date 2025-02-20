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
import type { InviteExceptionResponse } from './InviteExceptionResponse';
import {
    InviteExceptionResponseFromJSON,
    InviteExceptionResponseFromJSONTyped,
    InviteExceptionResponseToJSON,
    InviteExceptionResponseToJSONTyped,
} from './InviteExceptionResponse';
import type { BaseInviteDataResponse } from './BaseInviteDataResponse';
import {
    BaseInviteDataResponseFromJSON,
    BaseInviteDataResponseFromJSONTyped,
    BaseInviteDataResponseToJSON,
    BaseInviteDataResponseToJSONTyped,
} from './BaseInviteDataResponse';

/**
 * 
 * @export
 * @interface RespondToInvitesResponseArrayItemsInner
 */
export interface RespondToInvitesResponseArrayItemsInner {
    /**
     * 
     * @type {InviteExceptionResponse}
     * @memberof RespondToInvitesResponseArrayItemsInner
     */
    exception?: InviteExceptionResponse | null;
    /**
     * 
     * @type {BaseInviteDataResponse}
     * @memberof RespondToInvitesResponseArrayItemsInner
     */
    invite?: BaseInviteDataResponse | null;
}

/**
 * Check if a given object implements the RespondToInvitesResponseArrayItemsInner interface.
 */
export function instanceOfRespondToInvitesResponseArrayItemsInner(value: object): value is RespondToInvitesResponseArrayItemsInner {
    return true;
}

export function RespondToInvitesResponseArrayItemsInnerFromJSON(json: any): RespondToInvitesResponseArrayItemsInner {
    return RespondToInvitesResponseArrayItemsInnerFromJSONTyped(json, false);
}

export function RespondToInvitesResponseArrayItemsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): RespondToInvitesResponseArrayItemsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'exception': json['exception'] == null ? undefined : InviteExceptionResponseFromJSON(json['exception']),
        'invite': json['invite'] == null ? undefined : BaseInviteDataResponseFromJSON(json['invite']),
    };
}

  export function RespondToInvitesResponseArrayItemsInnerToJSON(json: any): RespondToInvitesResponseArrayItemsInner {
      return RespondToInvitesResponseArrayItemsInnerToJSONTyped(json, false);
  }

  export function RespondToInvitesResponseArrayItemsInnerToJSONTyped(value?: RespondToInvitesResponseArrayItemsInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'exception': InviteExceptionResponseToJSON(value['exception']),
        'invite': BaseInviteDataResponseToJSON(value['invite']),
    };
}

