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

import { exists, mapValues } from '../runtime';
/**
 * Video ID-based media source
 * @export
 * @interface PinMediaSourceVideoID
 */
export interface PinMediaSourceVideoID  {
    /**
     * 
     * @type {string}
     * @memberof PinMediaSourceVideoID
     */
    sourceType: PinMediaSourceVideoIDSourceTypeEnum;
    /**
     * Cover image url.
     * @type {string}
     * @memberof PinMediaSourceVideoID
     */
    coverImageUrl?: string;
    /**
     * Content type for cover image Base64.
     * @type {string}
     * @memberof PinMediaSourceVideoID
     */
    coverImageContentType?: PinMediaSourceVideoIDCoverImageContentTypeEnum;
    /**
     * Cover image Base64.
     * @type {string}
     * @memberof PinMediaSourceVideoID
     */
    coverImageData?: string;
    /**
     * 
     * @type {string}
     * @memberof PinMediaSourceVideoID
     */
    mediaId: string;
    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @type {boolean}
     * @memberof PinMediaSourceVideoID
     */
    isStandard?: boolean;
}

export function PinMediaSourceVideoIDFromJSON(json: any): PinMediaSourceVideoID {
    return {
        'sourceType': json['source_type'],
        'coverImageUrl': !exists(json, 'cover_image_url') ? undefined : json['cover_image_url'],
        'coverImageContentType': !exists(json, 'cover_image_content_type') ? undefined : json['cover_image_content_type'],
        'coverImageData': !exists(json, 'cover_image_data') ? undefined : json['cover_image_data'],
        'mediaId': json['media_id'],
        'isStandard': !exists(json, 'is_standard') ? undefined : json['is_standard'],
    };
}

export function PinMediaSourceVideoIDToJSON(value?: PinMediaSourceVideoID): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'source_type': value.sourceType,
        'cover_image_url': value.coverImageUrl,
        'cover_image_content_type': value.coverImageContentType,
        'cover_image_data': value.coverImageData,
        'media_id': value.mediaId,
        'is_standard': value.isStandard,
    };
}

/**
* @export
* @enum {string}
*/
export enum PinMediaSourceVideoIDSourceTypeEnum {
    VideoId = 'video_id'
}
/**
* @export
* @enum {string}
*/
export enum PinMediaSourceVideoIDCoverImageContentTypeEnum {
    Jpeg = 'image/jpeg',
    Png = 'image/png'
}


