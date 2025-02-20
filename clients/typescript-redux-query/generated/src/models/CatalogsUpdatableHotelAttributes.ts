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
import {
    CatalogsHotelAddress,
    CatalogsHotelAddressFromJSON,
    CatalogsHotelAddressToJSON,
    CatalogsHotelGuestRatings,
    CatalogsHotelGuestRatingsFromJSON,
    CatalogsHotelGuestRatingsToJSON,
} from './';

/**
 * 
 * @export
 * @interface CatalogsUpdatableHotelAttributes
 */
export interface CatalogsUpdatableHotelAttributes  {
    /**
     * The hotel\'s name.
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    name?: string;
    /**
     * Link to the product page
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    link?: string;
    /**
     * Brief description of the hotel.
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    description?: string;
    /**
     * The brand to which this hotel belongs to.
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    brand?: string;
    /**
     * Latitude of the hotel.
     * @type {number}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    latitude?: number;
    /**
     * Longitude of the hotel.
     * @type {number}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    longitude?: number;
    /**
     * A list of neighborhoods where the hotel is located
     * @type {Array<string>}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    neighborhood?: Array<string>;
    /**
     * 
     * @type {CatalogsHotelAddress}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    address?: CatalogsHotelAddress;
    /**
     * Custom grouping of hotels
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    customLabel0?: string;
    /**
     * Custom grouping of hotels
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    customLabel1?: string;
    /**
     * Custom grouping of hotels
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    customLabel2?: string;
    /**
     * Custom grouping of hotels
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    customLabel3?: string;
    /**
     * Custom grouping of hotels
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    customLabel4?: string;
    /**
     * The type of property. The category can be any type of internal description desired.
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    category?: string;
    /**
     * Base price of the hotel room per night followed by the ISO currency code
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    basePrice?: string;
    /**
     * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
     * @type {string}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    salePrice?: string;
    /**
     * 
     * @type {CatalogsHotelGuestRatings}
     * @memberof CatalogsUpdatableHotelAttributes
     */
    guestRatings?: CatalogsHotelGuestRatings;
}

export function CatalogsUpdatableHotelAttributesFromJSON(json: any): CatalogsUpdatableHotelAttributes {
    return {
        'name': !exists(json, 'name') ? undefined : json['name'],
        'link': !exists(json, 'link') ? undefined : json['link'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'brand': !exists(json, 'brand') ? undefined : json['brand'],
        'latitude': !exists(json, 'latitude') ? undefined : json['latitude'],
        'longitude': !exists(json, 'longitude') ? undefined : json['longitude'],
        'neighborhood': !exists(json, 'neighborhood') ? undefined : json['neighborhood'],
        'address': !exists(json, 'address') ? undefined : CatalogsHotelAddressFromJSON(json['address']),
        'customLabel0': !exists(json, 'custom_label_0') ? undefined : json['custom_label_0'],
        'customLabel1': !exists(json, 'custom_label_1') ? undefined : json['custom_label_1'],
        'customLabel2': !exists(json, 'custom_label_2') ? undefined : json['custom_label_2'],
        'customLabel3': !exists(json, 'custom_label_3') ? undefined : json['custom_label_3'],
        'customLabel4': !exists(json, 'custom_label_4') ? undefined : json['custom_label_4'],
        'category': !exists(json, 'category') ? undefined : json['category'],
        'basePrice': !exists(json, 'base_price') ? undefined : json['base_price'],
        'salePrice': !exists(json, 'sale_price') ? undefined : json['sale_price'],
        'guestRatings': !exists(json, 'guest_ratings') ? undefined : CatalogsHotelGuestRatingsFromJSON(json['guest_ratings']),
    };
}

export function CatalogsUpdatableHotelAttributesToJSON(value?: CatalogsUpdatableHotelAttributes): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
        'link': value.link,
        'description': value.description,
        'brand': value.brand,
        'latitude': value.latitude,
        'longitude': value.longitude,
        'neighborhood': value.neighborhood,
        'address': CatalogsHotelAddressToJSON(value.address),
        'custom_label_0': value.customLabel0,
        'custom_label_1': value.customLabel1,
        'custom_label_2': value.customLabel2,
        'custom_label_3': value.customLabel3,
        'custom_label_4': value.customLabel4,
        'category': value.category,
        'base_price': value.basePrice,
        'sale_price': value.salePrice,
        'guest_ratings': CatalogsHotelGuestRatingsToJSON(value.guestRatings),
    };
}


