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
import type { BusinessRoleForMembers } from './BusinessRoleForMembers';
import {
    BusinessRoleForMembersFromJSON,
    BusinessRoleForMembersFromJSONTyped,
    BusinessRoleForMembersToJSON,
    BusinessRoleForMembersToJSONTyped,
} from './BusinessRoleForMembers';

/**
 * Single instance of a business member to have its role updated
 * @export
 * @interface UpdateMemberBusinessRoleBody
 */
export interface UpdateMemberBusinessRoleBody {
    /**
     * 
     * @type {BusinessRoleForMembers}
     * @memberof UpdateMemberBusinessRoleBody
     */
    businessRole: BusinessRoleForMembers;
    /**
     * Unique identifier of the member
     * @type {string}
     * @memberof UpdateMemberBusinessRoleBody
     */
    memberId: string;
}



/**
 * Check if a given object implements the UpdateMemberBusinessRoleBody interface.
 */
export function instanceOfUpdateMemberBusinessRoleBody(value: object): value is UpdateMemberBusinessRoleBody {
    if (!('businessRole' in value) || value['businessRole'] === undefined) return false;
    if (!('memberId' in value) || value['memberId'] === undefined) return false;
    return true;
}

export function UpdateMemberBusinessRoleBodyFromJSON(json: any): UpdateMemberBusinessRoleBody {
    return UpdateMemberBusinessRoleBodyFromJSONTyped(json, false);
}

export function UpdateMemberBusinessRoleBodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateMemberBusinessRoleBody {
    if (json == null) {
        return json;
    }
    return {
        
        'businessRole': BusinessRoleForMembersFromJSON(json['business_role']),
        'memberId': json['member_id'],
    };
}

  export function UpdateMemberBusinessRoleBodyToJSON(json: any): UpdateMemberBusinessRoleBody {
      return UpdateMemberBusinessRoleBodyToJSONTyped(json, false);
  }

  export function UpdateMemberBusinessRoleBodyToJSONTyped(value?: UpdateMemberBusinessRoleBody | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'business_role': BusinessRoleForMembersToJSON(value['businessRole']),
        'member_id': value['memberId'],
    };
}

