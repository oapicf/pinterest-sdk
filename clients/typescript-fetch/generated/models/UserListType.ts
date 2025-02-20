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
 * User list type
 * @export
 */
export const UserListType = {
    Email: 'EMAIL',
    Idfa: 'IDFA',
    Maid: 'MAID',
    LrId: 'LR_ID',
    DlxId: 'DLX_ID',
    HashedPinnerId: 'HASHED_PINNER_ID'
} as const;
export type UserListType = typeof UserListType[keyof typeof UserListType];


export function instanceOfUserListType(value: any): boolean {
    for (const key in UserListType) {
        if (Object.prototype.hasOwnProperty.call(UserListType, key)) {
            if (UserListType[key as keyof typeof UserListType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function UserListTypeFromJSON(json: any): UserListType {
    return UserListTypeFromJSONTyped(json, false);
}

export function UserListTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): UserListType {
    return json as UserListType;
}

export function UserListTypeToJSON(value?: UserListType | null): any {
    return value as any;
}

export function UserListTypeToJSONTyped(value: any, ignoreDiscriminator: boolean): UserListType {
    return value as UserListType;
}

