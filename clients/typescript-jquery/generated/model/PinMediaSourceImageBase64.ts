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

import * as models from './models';

/**
 * Base64-encoded image media source
 */
export interface PinMediaSourceImageBase64 {
    source_type: PinMediaSourceImageBase64.SourceTypeEnum;

    content_type: PinMediaSourceImageBase64.ContentTypeEnum;

    data: string;

}
export namespace PinMediaSourceImageBase64 {
    export enum SourceTypeEnum {
        ImageBase64 = <any> 'image_base64'
    }
    export enum ContentTypeEnum {
        Jpeg = <any> 'image/jpeg',
        Png = <any> 'image/png'
    }
}