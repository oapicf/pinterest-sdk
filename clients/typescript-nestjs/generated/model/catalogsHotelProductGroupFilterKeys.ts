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
import { CustomLabel1Filter } from './customLabel1Filter';
import { CountryFilter } from './countryFilter';
import { CustomLabel4Filter } from './customLabel4Filter';
import { CustomLabel0Filter } from './customLabel0Filter';
import { PriceFilter } from './priceFilter';
import { CatalogsProductGroupMultipleStringCriteria } from './catalogsProductGroupMultipleStringCriteria';
import { BrandFilter } from './brandFilter';
import { CatalogsProductGroupMultipleCountriesCriteria } from './catalogsProductGroupMultipleCountriesCriteria';
import { CatalogsProductGroupPricingCurrencyCriteria } from './catalogsProductGroupPricingCurrencyCriteria';
import { CustomLabel2Filter } from './customLabel2Filter';
import { HotelIdFilter } from './hotelIdFilter';
import { CustomLabel3Filter } from './customLabel3Filter';


export interface CatalogsHotelProductGroupFilterKeys { 
    PRICE: CatalogsProductGroupPricingCurrencyCriteria;
    HOTEL_ID: CatalogsProductGroupMultipleStringCriteria;
    BRAND: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria;
    COUNTRY: CatalogsProductGroupMultipleCountriesCriteria;
}

