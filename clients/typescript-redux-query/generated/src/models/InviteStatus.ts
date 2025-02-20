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

/**
 * The current status of the invite.
 * @export
 * @enum {string}
 */
export enum InviteStatus {
    Pending = 'PENDING',
    Accepted = 'ACCEPTED',
    Declined = 'DECLINED',
    Cancelled = 'CANCELLED',
    Expired = 'EXPIRED'
}

export function InviteStatusFromJSON(json: any): InviteStatus {
    return json as InviteStatus;
}

export function InviteStatusToJSON(value?: InviteStatus): any {
    return value as any;
}

