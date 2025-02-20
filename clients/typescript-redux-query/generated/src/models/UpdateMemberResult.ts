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
 * @interface UpdateMemberResult
 */
export interface UpdateMemberResult  {
    /**
     * The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
     * @type {string}
     * @memberof UpdateMemberResult
     */
    businessRole?: string;
    /**
     * Unique identifier of the business member.
     * @type {string}
     * @memberof UpdateMemberResult
     */
    memberId?: string;
}

export function UpdateMemberResultFromJSON(json: any): UpdateMemberResult {
    return {
        'businessRole': !exists(json, 'business_role') ? undefined : json['business_role'],
        'memberId': !exists(json, 'member_id') ? undefined : json['member_id'],
    };
}

export function UpdateMemberResultToJSON(value?: UpdateMemberResult): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'business_role': value.businessRole,
        'member_id': value.memberId,
    };
}


