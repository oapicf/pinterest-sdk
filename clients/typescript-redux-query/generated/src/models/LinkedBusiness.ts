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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface LinkedBusiness
 */
export interface LinkedBusiness  {
    /**
     * Username
     * @type {string}
     * @memberof LinkedBusiness
     */
    username?: string;
    /**
     * image_small_url
     * @type {string}
     * @memberof LinkedBusiness
     */
    imageSmallUrl?: string;
    /**
     * image_medium_url
     * @type {string}
     * @memberof LinkedBusiness
     */
    imageMediumUrl?: string;
    /**
     * image_large_url
     * @type {string}
     * @memberof LinkedBusiness
     */
    imageLargeUrl?: string;
    /**
     * image_xlarge_url
     * @type {string}
     * @memberof LinkedBusiness
     */
    imageXlargeUrl?: string;
}

export function LinkedBusinessFromJSON(json: any): LinkedBusiness {
    return {
        'username': !exists(json, 'username') ? undefined : json['username'],
        'imageSmallUrl': !exists(json, 'image_small_url') ? undefined : json['image_small_url'],
        'imageMediumUrl': !exists(json, 'image_medium_url') ? undefined : json['image_medium_url'],
        'imageLargeUrl': !exists(json, 'image_large_url') ? undefined : json['image_large_url'],
        'imageXlargeUrl': !exists(json, 'image_xlarge_url') ? undefined : json['image_xlarge_url'],
    };
}

export function LinkedBusinessToJSON(value?: LinkedBusiness): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'username': value.username,
        'image_small_url': value.imageSmallUrl,
        'image_medium_url': value.imageMediumUrl,
        'image_large_url': value.imageLargeUrl,
        'image_xlarge_url': value.imageXlargeUrl,
    };
}


