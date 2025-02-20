/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { PinMedia } from './pinMedia';
import { ImageMetadata } from './imageMetadata';


/**
 * Pin with multiple images.
 */
export interface PinMediaWithImages extends PinMedia { 
    items?: Array<ImageMetadata>;
}

