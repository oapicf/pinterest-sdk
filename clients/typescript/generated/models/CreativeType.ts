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

import { HttpFile } from '../http/http';

/**
* Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
*/
export enum CreativeType {
    Regular = 'REGULAR',
    Video = 'VIDEO',
    Shopping = 'SHOPPING',
    Carousel = 'CAROUSEL',
    MaxVideo = 'MAX_VIDEO',
    ShopThePin = 'SHOP_THE_PIN',
    Collection = 'COLLECTION',
    Idea = 'IDEA',
    Showcase = 'SHOWCASE',
    Quiz = 'QUIZ'
}
