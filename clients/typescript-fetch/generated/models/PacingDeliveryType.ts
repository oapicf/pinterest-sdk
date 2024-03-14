/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Ad group pacing delivery type
 * @export
 */
export const PacingDeliveryType = {
    Standard: 'STANDARD',
    Accelerated: 'ACCELERATED'
} as const;
export type PacingDeliveryType = typeof PacingDeliveryType[keyof typeof PacingDeliveryType];


export function PacingDeliveryTypeFromJSON(json: any): PacingDeliveryType {
    return PacingDeliveryTypeFromJSONTyped(json, false);
}

export function PacingDeliveryTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): PacingDeliveryType {
    return json as PacingDeliveryType;
}

export function PacingDeliveryTypeToJSON(value?: PacingDeliveryType | null): any {
    return value as any;
}
