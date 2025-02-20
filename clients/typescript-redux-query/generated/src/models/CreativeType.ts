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
 * Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @export
 * @enum {string}
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

export function CreativeTypeFromJSON(json: any): CreativeType {
    return json as CreativeType;
}

export function CreativeTypeToJSON(value?: CreativeType): any {
    return value as any;
}

