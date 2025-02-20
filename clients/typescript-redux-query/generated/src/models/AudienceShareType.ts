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
 * 
 * @export
 * @enum {string}
 */
export enum AudienceShareType {
    Shared = 'SHARED',
    Received = 'RECEIVED'
}

export function AudienceShareTypeFromJSON(json: any): AudienceShareType {
    return json as AudienceShareType;
}

export function AudienceShareTypeToJSON(value?: AudienceShareType): any {
    return value as any;
}

