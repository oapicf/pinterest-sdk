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
* Image URL-based media source
*/
export class PinMediaSourceImageURL {
    'sourceType': PinMediaSourceImageURL.SourceTypeEnum;
    'url': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "sourceType",
            "baseName": "source_type",
            "type": "PinMediaSourceImageURL.SourceTypeEnum"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return PinMediaSourceImageURL.attributeTypeMap;
    }
}

export namespace PinMediaSourceImageURL {
    export enum SourceTypeEnum {
        ImageUrl = <any> 'image_url'
    }
}