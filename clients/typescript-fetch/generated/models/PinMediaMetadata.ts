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

import { mapValues } from '../runtime';
import type { ImageDetails } from './ImageDetails';
import {
    ImageDetailsFromJSON,
    ImageDetailsFromJSONTyped,
    ImageDetailsToJSON,
} from './ImageDetails';
import type { ImageMetadata } from './ImageMetadata';
import {
    ImageMetadataFromJSON,
    ImageMetadataFromJSONTyped,
    ImageMetadataToJSON,
} from './ImageMetadata';
import type { VideoMetadata } from './VideoMetadata';
import {
    VideoMetadataFromJSON,
    VideoMetadataFromJSONTyped,
    VideoMetadataToJSON,
} from './VideoMetadata';

/**
 * 
 * @export
 * @interface PinMediaMetadata
 */
export interface PinMediaMetadata {
    /**
     * 
     * @type {string}
     * @memberof PinMediaMetadata
     */
    itemType?: string;
    /**
     * 
     * @type {{ [key: string]: ImageDetails; }}
     * @memberof PinMediaMetadata
     */
    images?: { [key: string]: ImageDetails; };
    /**
     * 
     * @type {string}
     * @memberof PinMediaMetadata
     */
    coverImageUrl?: string;
    /**
     * Duration (in milliseconds)
     * @type {number}
     * @memberof PinMediaMetadata
     */
    duration?: number;
    /**
     * Height (in pixels)
     * @type {number}
     * @memberof PinMediaMetadata
     */
    height?: number;
    /**
     * Width (in pixels)
     * @type {number}
     * @memberof PinMediaMetadata
     */
    width?: number;
}

/**
 * Check if a given object implements the PinMediaMetadata interface.
 */
export function instanceOfPinMediaMetadata(value: object): boolean {
    return true;
}

export function PinMediaMetadataFromJSON(json: any): PinMediaMetadata {
    return PinMediaMetadataFromJSONTyped(json, false);
}

export function PinMediaMetadataFromJSONTyped(json: any, ignoreDiscriminator: boolean): PinMediaMetadata {
    if (json == null) {
        return json;
    }
    return {
        
        'itemType': json['item_type'] == null ? undefined : json['item_type'],
        'images': json['images'] == null ? undefined : (mapValues(json['images'], ImageDetailsFromJSON)),
        'coverImageUrl': json['cover_image_url'] == null ? undefined : json['cover_image_url'],
        'duration': json['duration'] == null ? undefined : json['duration'],
        'height': json['height'] == null ? undefined : json['height'],
        'width': json['width'] == null ? undefined : json['width'],
    };
}

export function PinMediaMetadataToJSON(value?: PinMediaMetadata | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'item_type': value['itemType'],
        'images': value['images'] == null ? undefined : (mapValues(value['images'], ImageDetailsToJSON)),
        'cover_image_url': value['coverImageUrl'],
        'duration': value['duration'],
        'height': value['height'],
        'width': value['width'],
    };
}
