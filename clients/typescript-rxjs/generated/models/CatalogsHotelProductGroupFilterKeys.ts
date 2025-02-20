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

import type {
    BrandFilter,
    CatalogsProductGroupMultipleCountriesCriteria,
    CatalogsProductGroupMultipleStringCriteria,
    CatalogsProductGroupPricingCurrencyCriteria,
    CountryFilter,
    CustomLabel0Filter,
    CustomLabel1Filter,
    CustomLabel2Filter,
    CustomLabel3Filter,
    CustomLabel4Filter,
    HotelIdFilter,
    PriceFilter,
} from './';

/**
 * @export
 * @interface CatalogsHotelProductGroupFilterKeys
 */
export interface CatalogsHotelProductGroupFilterKeys {
    /**
     * @type {CatalogsProductGroupPricingCurrencyCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    PRICE: CatalogsProductGroupPricingCurrencyCriteria;
    /**
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    HOTEL_ID: CatalogsProductGroupMultipleStringCriteria;
    /**
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    BRAND: CatalogsProductGroupMultipleStringCriteria;
    /**
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria;
    /**
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria;
    /**
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria;
    /**
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria;
    /**
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria;
    /**
     * @type {CatalogsProductGroupMultipleCountriesCriteria}
     * @memberof CatalogsHotelProductGroupFilterKeys
     */
    COUNTRY: CatalogsProductGroupMultipleCountriesCriteria;
}
