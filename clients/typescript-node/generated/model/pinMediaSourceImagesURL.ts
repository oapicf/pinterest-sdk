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

import { RequestFile } from './models';
import { PinMediaSourceImagesURLItemsInner } from './pinMediaSourceImagesURLItemsInner';

/**
* Multiple images urls-based media source
*/
export class PinMediaSourceImagesURL {
    'sourceType'?: PinMediaSourceImagesURL.SourceTypeEnum;
    /**
    * Array with image objects.
    */
    'items': Array<PinMediaSourceImagesURLItemsInner>;
    'index'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "sourceType",
            "baseName": "source_type",
            "type": "PinMediaSourceImagesURL.SourceTypeEnum"
        },
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<PinMediaSourceImagesURLItemsInner>"
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return PinMediaSourceImagesURL.attributeTypeMap;
    }
}

export namespace PinMediaSourceImagesURL {
    export enum SourceTypeEnum {
        MultipleImageUrls = <any> 'multiple_image_urls'
    }
}
