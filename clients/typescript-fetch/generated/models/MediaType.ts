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
 * 
 * @export
 */
export const MediaType = {
    Image: 'IMAGE',
    Video: 'VIDEO'
} as const;
export type MediaType = typeof MediaType[keyof typeof MediaType];


export function instanceOfMediaType(value: any): boolean {
    for (const key in MediaType) {
        if (Object.prototype.hasOwnProperty.call(MediaType, key)) {
            if (MediaType[key as keyof typeof MediaType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function MediaTypeFromJSON(json: any): MediaType {
    return MediaTypeFromJSONTyped(json, false);
}

export function MediaTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): MediaType {
    return json as MediaType;
}

export function MediaTypeToJSON(value?: MediaType | null): any {
    return value as any;
}

export function MediaTypeToJSONTyped(value: any, ignoreDiscriminator: boolean): MediaType {
    return value as MediaType;
}

