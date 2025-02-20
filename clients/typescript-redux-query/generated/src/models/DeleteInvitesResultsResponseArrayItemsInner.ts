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
    BaseInviteDataResponse,
    BaseInviteDataResponseFromJSON,
    BaseInviteDataResponseToJSON,
    DeleteInvitesResultsResponseArrayItemsInnerException,
    DeleteInvitesResultsResponseArrayItemsInnerExceptionFromJSON,
    DeleteInvitesResultsResponseArrayItemsInnerExceptionToJSON,
} from './';

/**
 * 
 * @export
 * @interface DeleteInvitesResultsResponseArrayItemsInner
 */
export interface DeleteInvitesResultsResponseArrayItemsInner  {
    /**
     * 
     * @type {DeleteInvitesResultsResponseArrayItemsInnerException}
     * @memberof DeleteInvitesResultsResponseArrayItemsInner
     */
    exception?: DeleteInvitesResultsResponseArrayItemsInnerException;
    /**
     * 
     * @type {BaseInviteDataResponse}
     * @memberof DeleteInvitesResultsResponseArrayItemsInner
     */
    invite?: BaseInviteDataResponse;
}

export function DeleteInvitesResultsResponseArrayItemsInnerFromJSON(json: any): DeleteInvitesResultsResponseArrayItemsInner {
    return {
        'exception': !exists(json, 'exception') ? undefined : DeleteInvitesResultsResponseArrayItemsInnerExceptionFromJSON(json['exception']),
        'invite': !exists(json, 'invite') ? undefined : BaseInviteDataResponseFromJSON(json['invite']),
    };
}

export function DeleteInvitesResultsResponseArrayItemsInnerToJSON(value?: DeleteInvitesResultsResponseArrayItemsInner): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'exception': DeleteInvitesResultsResponseArrayItemsInnerExceptionToJSON(value.exception),
        'invite': BaseInviteDataResponseToJSON(value.invite),
    };
}


