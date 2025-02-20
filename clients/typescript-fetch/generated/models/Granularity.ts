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
 * Granularity
 * @export
 */
export const Granularity = {
    Total: 'TOTAL',
    Day: 'DAY',
    Hour: 'HOUR',
    Week: 'WEEK',
    Month: 'MONTH'
} as const;
export type Granularity = typeof Granularity[keyof typeof Granularity];


export function instanceOfGranularity(value: any): boolean {
    for (const key in Granularity) {
        if (Object.prototype.hasOwnProperty.call(Granularity, key)) {
            if (Granularity[key as keyof typeof Granularity] === value) {
                return true;
            }
        }
    }
    return false;
}

export function GranularityFromJSON(json: any): Granularity {
    return GranularityFromJSONTyped(json, false);
}

export function GranularityFromJSONTyped(json: any, ignoreDiscriminator: boolean): Granularity {
    return json as Granularity;
}

export function GranularityToJSON(value?: Granularity | null): any {
    return value as any;
}

export function GranularityToJSONTyped(value: any, ignoreDiscriminator: boolean): Granularity {
    return value as Granularity;
}

