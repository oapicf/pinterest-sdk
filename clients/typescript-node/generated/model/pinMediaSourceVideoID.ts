/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

/**
* Video ID-based media source
*/
export class PinMediaSourceVideoID {
    'sourceType': PinMediaSourceVideoID.SourceTypeEnum;
    'coverImageUrl': string;
    'mediaId': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "sourceType",
            "baseName": "source_type",
            "type": "PinMediaSourceVideoID.SourceTypeEnum"
        },
        {
            "name": "coverImageUrl",
            "baseName": "cover_image_url",
            "type": "string"
        },
        {
            "name": "mediaId",
            "baseName": "media_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return PinMediaSourceVideoID.attributeTypeMap;
    }
}

export namespace PinMediaSourceVideoID {
    export enum SourceTypeEnum {
        VideoId = <any> 'video_id'
    }
}