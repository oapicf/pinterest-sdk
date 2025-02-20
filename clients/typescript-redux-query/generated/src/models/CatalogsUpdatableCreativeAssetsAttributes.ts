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
 * @interface CatalogsUpdatableCreativeAssetsAttributes
 */
export interface CatalogsUpdatableCreativeAssetsAttributes  {
    /**
     * The name of the creative assets.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    title?: string;
    /**
     * Brief description of the creative assets.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    description?: string;
    /**
     * Link to the creative assets page.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    link?: string;
    /**
     * IOS deep link to the creative assets page.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    iosDeepLink?: string;
    /**
     * Link to the creative assets page.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    androidDeepLink?: string;
    /**
     * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    googleProductCategory?: string;
    /**
     * Custom grouping of creative assets.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    customLabel0?: string;
    /**
     * Custom grouping of creative assets.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    customLabel1?: string;
    /**
     * Custom grouping of creative assets.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    customLabel2?: string;
    /**
     * Custom grouping of creative assets.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    customLabel3?: string;
    /**
     * Custom grouping of creative assets.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    customLabel4?: string;
    /**
     * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
     * @type {string}
     * @memberof CatalogsUpdatableCreativeAssetsAttributes
     */
    visibility?: string;
}

export function CatalogsUpdatableCreativeAssetsAttributesFromJSON(json: any): CatalogsUpdatableCreativeAssetsAttributes {
    return {
        'title': !exists(json, 'title') ? undefined : json['title'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'link': !exists(json, 'link') ? undefined : json['link'],
        'iosDeepLink': !exists(json, 'ios_deep_link') ? undefined : json['ios_deep_link'],
        'androidDeepLink': !exists(json, 'android_deep_link') ? undefined : json['android_deep_link'],
        'googleProductCategory': !exists(json, 'google_product_category') ? undefined : json['google_product_category'],
        'customLabel0': !exists(json, 'custom_label_0') ? undefined : json['custom_label_0'],
        'customLabel1': !exists(json, 'custom_label_1') ? undefined : json['custom_label_1'],
        'customLabel2': !exists(json, 'custom_label_2') ? undefined : json['custom_label_2'],
        'customLabel3': !exists(json, 'custom_label_3') ? undefined : json['custom_label_3'],
        'customLabel4': !exists(json, 'custom_label_4') ? undefined : json['custom_label_4'],
        'visibility': !exists(json, 'visibility') ? undefined : json['visibility'],
    };
}

export function CatalogsUpdatableCreativeAssetsAttributesToJSON(value?: CatalogsUpdatableCreativeAssetsAttributes): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'title': value.title,
        'description': value.description,
        'link': value.link,
        'ios_deep_link': value.iosDeepLink,
        'android_deep_link': value.androidDeepLink,
        'google_product_category': value.googleProductCategory,
        'custom_label_0': value.customLabel0,
        'custom_label_1': value.customLabel1,
        'custom_label_2': value.customLabel2,
        'custom_label_3': value.customLabel3,
        'custom_label_4': value.customLabel4,
        'visibility': value.visibility,
    };
}


