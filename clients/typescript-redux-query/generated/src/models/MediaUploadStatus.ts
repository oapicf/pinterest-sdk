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

/**
 * Media upload status
 * @export
 * @enum {string}
 */
export enum MediaUploadStatus {
    Registered = 'registered',
    Processing = 'processing',
    Succeeded = 'succeeded',
    Failed = 'failed'
}

export function MediaUploadStatusFromJSON(json: any): MediaUploadStatus {
    return json as MediaUploadStatus;
}

export function MediaUploadStatusToJSON(value?: MediaUploadStatus): any {
    return value as any;
}

