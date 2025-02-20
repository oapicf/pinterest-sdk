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
import { CatalogsProductGroupPricingCriteria } from './catalogsProductGroupPricingCriteria';
import { GoogleProductCategory3Filter } from './googleProductCategory3Filter';
import { MaxPriceFilter } from './maxPriceFilter';
import { BrandFilter } from './brandFilter';
import { CatalogsProductGroupCurrencyCriteria } from './catalogsProductGroupCurrencyCriteria';
import { ProductType3Filter } from './productType3Filter';
import { CustomLabel3Filter } from './customLabel3Filter';
import { MinPriceFilter } from './minPriceFilter';
import { CustomLabel0Filter } from './customLabel0Filter';
import { CustomLabel2Filter } from './customLabel2Filter';
import { MediaTypeFilter } from './mediaTypeFilter';
import { GoogleProductCategory1Filter } from './googleProductCategory1Filter';
import { GoogleProductCategory6Filter } from './googleProductCategory6Filter';
import { CurrencyFilter } from './currencyFilter';
import { CustomLabel4Filter } from './customLabel4Filter';
import { GoogleProductCategory4Filter } from './googleProductCategory4Filter';
import { ProductType2Filter } from './productType2Filter';
import { ProductGroupReferenceFilter } from './productGroupReferenceFilter';
import { ProductType0Filter } from './productType0Filter';
import { AvailabilityFilter } from './availabilityFilter';
import { ItemGroupIdFilter } from './itemGroupIdFilter';
import { GenderFilter } from './genderFilter';
import { CatalogsProductGroupMultipleGenderCriteria } from './catalogsProductGroupMultipleGenderCriteria';
import { CatalogsProductGroupMultipleStringListCriteria } from './catalogsProductGroupMultipleStringListCriteria';
import { CustomLabel1Filter } from './customLabel1Filter';
import { ProductType4Filter } from './productType4Filter';
import { CatalogsProductGroupMultipleStringCriteria } from './catalogsProductGroupMultipleStringCriteria';
import { GoogleProductCategory0Filter } from './googleProductCategory0Filter';
import { GoogleProductCategory2Filter } from './googleProductCategory2Filter';
import { GoogleProductCategory5Filter } from './googleProductCategory5Filter';
import { CatalogsProductGroupMultipleMediaTypesCriteria } from './catalogsProductGroupMultipleMediaTypesCriteria';
import { ItemIdFilter } from './itemIdFilter';
import { ConditionFilter } from './conditionFilter';
import { ProductType1Filter } from './productType1Filter';


export interface CatalogsProductGroupFilterKeys { 
    MIN_PRICE: CatalogsProductGroupPricingCriteria;
    MAX_PRICE: CatalogsProductGroupPricingCriteria;
    CURRENCY: CatalogsProductGroupCurrencyCriteria;
    ITEM_ID: CatalogsProductGroupMultipleStringCriteria;
    AVAILABILITY: CatalogsProductGroupMultipleStringCriteria;
    BRAND: CatalogsProductGroupMultipleStringCriteria;
    CONDITION: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria;
    CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria;
    ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria;
    GENDER: CatalogsProductGroupMultipleGenderCriteria;
    MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria;
    PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria;
    PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria;
    PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria;
    PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria;
    PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria;
    GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria;
    GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria;
    GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria;
    GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria;
    GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria;
    GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria;
    GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria;
    PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria;
}

