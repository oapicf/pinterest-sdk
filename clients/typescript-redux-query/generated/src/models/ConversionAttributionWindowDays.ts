// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * 
 * @export
 * @enum {string}
 */
export enum ConversionAttributionWindowDays {
    NUMBER_0 = 0,
    NUMBER_1 = 1,
    NUMBER_7 = 7,
    NUMBER_14 = 14,
    NUMBER_30 = 30,
    NUMBER_60 = 60
}

export function ConversionAttributionWindowDaysFromJSON(json: any): ConversionAttributionWindowDays {
    return json as ConversionAttributionWindowDays;
}

export function ConversionAttributionWindowDaysToJSON(value?: ConversionAttributionWindowDays): any {
    return value as any;
}
