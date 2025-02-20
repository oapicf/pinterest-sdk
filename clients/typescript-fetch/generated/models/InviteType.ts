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


/**
 * The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
 * @export
 */
export const InviteType = {
    MemberInvite: 'MEMBER_INVITE',
    PartnerInvite: 'PARTNER_INVITE',
    PartnerRequest: 'PARTNER_REQUEST'
} as const;
export type InviteType = typeof InviteType[keyof typeof InviteType];


export function instanceOfInviteType(value: any): boolean {
    for (const key in InviteType) {
        if (Object.prototype.hasOwnProperty.call(InviteType, key)) {
            if (InviteType[key as keyof typeof InviteType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function InviteTypeFromJSON(json: any): InviteType {
    return InviteTypeFromJSONTyped(json, false);
}

export function InviteTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): InviteType {
    return json as InviteType;
}

export function InviteTypeToJSON(value?: InviteType | null): any {
    return value as any;
}

export function InviteTypeToJSONTyped(value: any, ignoreDiscriminator: boolean): InviteType {
    return value as InviteType;
}

