package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BrandFilter;
import org.openapitools.model.CatalogsProductGroupMultipleCountriesCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.model.CatalogsProductGroupPricingCurrencyCriteria;
import org.openapitools.model.CountryFilter;
import org.openapitools.model.CustomLabel0Filter;
import org.openapitools.model.CustomLabel1Filter;
import org.openapitools.model.CustomLabel2Filter;
import org.openapitools.model.CustomLabel3Filter;
import org.openapitools.model.CustomLabel4Filter;
import org.openapitools.model.HotelIdFilter;
import org.openapitools.model.PriceFilter;

@Canonical
class CatalogsHotelProductGroupFilterKeys {
    
    CatalogsProductGroupPricingCurrencyCriteria PRICE
    
    CatalogsProductGroupMultipleStringCriteria HOTEL_ID
    
    CatalogsProductGroupMultipleStringCriteria BRAND
    
    CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0
    
    CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1
    
    CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2
    
    CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3
    
    CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4
    
    CatalogsProductGroupMultipleCountriesCriteria COUNTRY
}
