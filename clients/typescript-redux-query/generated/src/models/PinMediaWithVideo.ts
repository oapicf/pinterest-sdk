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

import {
    PinMedia,
    PinMediaFromJSON,
    PinMediaToJSON,
    PinMediaWithImageAllOfImages,
    PinMediaWithImageAllOfImagesFromJSON,
    PinMediaWithImageAllOfImagesToJSON,
} from './';

/**
 * @type PinMediaWithVideo
 * Pin with video.
 * @export
 */
export interface PinMediaWithVideo extends PinMedia {
}

export function PinMediaWithVideoFromJSON(json: any): PinMediaWithVideo {
    return {
        ...PinMediaFromJSON(json),
    };
}

export function PinMediaWithVideoToJSON(value?: PinMediaWithVideo): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...PinMediaToJSON(value),
    };
}
