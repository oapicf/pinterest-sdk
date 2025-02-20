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
 * Base64-encoded image media source
 */
export interface PinMediaSourceImageBase64 { 
    source_type: PinMediaSourceImageBase64.SourceTypeEnum;
    content_type: PinMediaSourceImageBase64.ContentTypeEnum;
    data: string;
    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     */
    is_standard?: boolean;
}
export namespace PinMediaSourceImageBase64 {
    export type SourceTypeEnum = 'image_base64';
    export const SourceTypeEnum = {
        ImageBase64: 'image_base64' as SourceTypeEnum
    };
    export type ContentTypeEnum = 'image/jpeg' | 'image/png';
    export const ContentTypeEnum = {
        Jpeg: 'image/jpeg' as ContentTypeEnum,
        Png: 'image/png' as ContentTypeEnum
    };
}


