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

import { RequestFile } from './models';
import { ImageMetadataImages } from './imageMetadataImages';

export class ImageMetadata {
    'itemType'?: string;
    'title'?: string | null;
    'description'?: string | null;
    'link'?: string | null;
    'images'?: ImageMetadataImages;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "itemType",
            "baseName": "item_type",
            "type": "string"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "link",
            "baseName": "link",
            "type": "string"
        },
        {
            "name": "images",
            "baseName": "images",
            "type": "ImageMetadataImages"
        }    ];

    static getAttributeTypeMap() {
        return ImageMetadata.attributeTypeMap;
    }
}
