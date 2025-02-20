/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { PinMediaSourceImagesBase64ItemsInner } from '../models/PinMediaSourceImagesBase64ItemsInner';
import { HttpFile } from '../http/http';

/**
* Multiple Base64-encoded images media source
*/
export class PinMediaSourceImagesBase64 {
    'sourceType'?: PinMediaSourceImagesBase64SourceTypeEnum;
    /**
    * Array with image objects.
    */
    'items': Array<PinMediaSourceImagesBase64ItemsInner>;
    'index'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "sourceType",
            "baseName": "source_type",
            "type": "PinMediaSourceImagesBase64SourceTypeEnum",
            "format": ""
        },
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<PinMediaSourceImagesBase64ItemsInner>",
            "format": ""
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PinMediaSourceImagesBase64.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum PinMediaSourceImagesBase64SourceTypeEnum {
    MultipleImageBase64 = 'multiple_image_base64'
}

