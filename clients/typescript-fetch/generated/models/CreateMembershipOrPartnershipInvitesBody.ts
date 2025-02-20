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
import type { InviteType } from './InviteType';
import {
    InviteTypeFromJSON,
    InviteTypeFromJSONTyped,
    InviteTypeToJSON,
    InviteTypeToJSONTyped,
} from './InviteType';

/**
 * Body to be used on path to send Members or Partners Invite or Request
 * @export
 * @interface CreateMembershipOrPartnershipInvitesBody
 */
export interface CreateMembershipOrPartnershipInvitesBody {
    /**
     * The business access level to grant member/partner. Note, values are case-sensitive.
     * - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets.
     * - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
     * - PARTNER: Can only view and access assets you assign them to/or they assign to you.
     * @type {string}
     * @memberof CreateMembershipOrPartnershipInvitesBody
     */
    businessRole: CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum;
    /**
     * 
     * @type {InviteType}
     * @memberof CreateMembershipOrPartnershipInvitesBody
     */
    inviteType: InviteType;
    /**
     * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
     * @type {Array<string>}
     * @memberof CreateMembershipOrPartnershipInvitesBody
     */
    members?: Array<string>;
    /**
     * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
     * @type {Array<string>}
     * @memberof CreateMembershipOrPartnershipInvitesBody
     */
    partners?: Array<string>;
}


/**
 * @export
 */
export const CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum = {
    Employee: 'EMPLOYEE',
    BizAdmin: 'BIZ_ADMIN',
    Partner: 'PARTNER'
} as const;
export type CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum = typeof CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum[keyof typeof CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum];


/**
 * Check if a given object implements the CreateMembershipOrPartnershipInvitesBody interface.
 */
export function instanceOfCreateMembershipOrPartnershipInvitesBody(value: object): value is CreateMembershipOrPartnershipInvitesBody {
    if (!('businessRole' in value) || value['businessRole'] === undefined) return false;
    if (!('inviteType' in value) || value['inviteType'] === undefined) return false;
    return true;
}

export function CreateMembershipOrPartnershipInvitesBodyFromJSON(json: any): CreateMembershipOrPartnershipInvitesBody {
    return CreateMembershipOrPartnershipInvitesBodyFromJSONTyped(json, false);
}

export function CreateMembershipOrPartnershipInvitesBodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateMembershipOrPartnershipInvitesBody {
    if (json == null) {
        return json;
    }
    return {
        
        'businessRole': json['business_role'],
        'inviteType': InviteTypeFromJSON(json['invite_type']),
        'members': json['members'] == null ? undefined : json['members'],
        'partners': json['partners'] == null ? undefined : json['partners'],
    };
}

  export function CreateMembershipOrPartnershipInvitesBodyToJSON(json: any): CreateMembershipOrPartnershipInvitesBody {
      return CreateMembershipOrPartnershipInvitesBodyToJSONTyped(json, false);
  }

  export function CreateMembershipOrPartnershipInvitesBodyToJSONTyped(value?: CreateMembershipOrPartnershipInvitesBody | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'business_role': value['businessRole'],
        'invite_type': InviteTypeToJSON(value['inviteType']),
        'members': value['members'],
        'partners': value['partners'],
    };
}

