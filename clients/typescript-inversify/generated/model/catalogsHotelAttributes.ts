/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CatalogsHotelAddress } from './catalogsHotelAddress';
import { CatalogsHotelAttributesAllOfMainImage } from './catalogsHotelAttributesAllOfMainImage';
import { CatalogsHotelGuestRatings } from './catalogsHotelGuestRatings';


export interface CatalogsHotelAttributes { 
    /**
     * The hotel\'s name.
     */
    name?: string | null;
    /**
     * Link to the product page
     */
    link?: string | null;
    /**
     * Brief description of the hotel.
     */
    description?: string | null;
    /**
     * The brand to which this hotel belongs to.
     */
    brand?: string | null;
    /**
     * Latitude of the hotel.
     */
    latitude?: number;
    /**
     * Longitude of the hotel.
     */
    longitude?: number | null;
    /**
     * A list of neighborhoods where the hotel is located
     */
    neighborhood?: Array<string> | null;
    address?: CatalogsHotelAddress;
    /**
     * Custom grouping of hotels
     */
    custom_label_0?: string | null;
    /**
     * Custom grouping of hotels
     */
    custom_label_1?: string | null;
    /**
     * Custom grouping of hotels
     */
    custom_label_2?: string | null;
    /**
     * Custom grouping of hotels
     */
    custom_label_3?: string | null;
    /**
     * Custom grouping of hotels
     */
    custom_label_4?: string | null;
    /**
     * The type of property. The category can be any type of internal description desired.
     */
    category?: string | null;
    /**
     * Base price of the hotel room per night followed by the ISO currency code
     */
    base_price?: string | null;
    /**
     * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
     */
    sale_price?: string | null;
    guest_ratings?: CatalogsHotelGuestRatings;
    main_image?: CatalogsHotelAttributesAllOfMainImage;
    /**
     * <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
     */
    additional_image_link?: Array<string> | null;
}