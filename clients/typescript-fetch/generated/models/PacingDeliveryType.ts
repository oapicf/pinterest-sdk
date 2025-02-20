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
 * Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
 * @export
 */
export const PacingDeliveryType = {
    Standard: 'STANDARD',
    Accelerated: 'ACCELERATED'
} as const;
export type PacingDeliveryType = typeof PacingDeliveryType[keyof typeof PacingDeliveryType];


export function instanceOfPacingDeliveryType(value: any): boolean {
    for (const key in PacingDeliveryType) {
        if (Object.prototype.hasOwnProperty.call(PacingDeliveryType, key)) {
            if (PacingDeliveryType[key as keyof typeof PacingDeliveryType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function PacingDeliveryTypeFromJSON(json: any): PacingDeliveryType {
    return PacingDeliveryTypeFromJSONTyped(json, false);
}

export function PacingDeliveryTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): PacingDeliveryType {
    return json as PacingDeliveryType;
}

export function PacingDeliveryTypeToJSON(value?: PacingDeliveryType | null): any {
    return value as any;
}

export function PacingDeliveryTypeToJSONTyped(value: any, ignoreDiscriminator: boolean): PacingDeliveryType {
    return value as PacingDeliveryType;
}

