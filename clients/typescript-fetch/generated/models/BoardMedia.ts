/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * Board media.
 * @export
 * @interface BoardMedia
 */
export interface BoardMedia {
    /**
     * Board cover image.
     * @type {string}
     * @memberof BoardMedia
     */
    imageCoverUrl?: string;
    /**
     * Board pin thumbnail urls.
     * @type {Array<string>}
     * @memberof BoardMedia
     */
    pinThumbnailUrls?: Array<string>;
}

/**
 * Check if a given object implements the BoardMedia interface.
 */
export function instanceOfBoardMedia(value: object): boolean {
    return true;
}

export function BoardMediaFromJSON(json: any): BoardMedia {
    return BoardMediaFromJSONTyped(json, false);
}

export function BoardMediaFromJSONTyped(json: any, ignoreDiscriminator: boolean): BoardMedia {
    if (json == null) {
        return json;
    }
    return {
        
        'imageCoverUrl': json['image_cover_url'] == null ? undefined : json['image_cover_url'],
        'pinThumbnailUrls': json['pin_thumbnail_urls'] == null ? undefined : json['pin_thumbnail_urls'],
    };
}

export function BoardMediaToJSON(value?: BoardMedia | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'image_cover_url': value['imageCoverUrl'],
        'pin_thumbnail_urls': value['pinThumbnailUrls'],
    };
}
