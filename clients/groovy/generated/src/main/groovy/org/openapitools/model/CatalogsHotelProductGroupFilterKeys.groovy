package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BrandFilter;
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleCountriesCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.model.CountryFilter;
import org.openapitools.model.CustomLabel0Filter;
import org.openapitools.model.CustomLabel1Filter;
import org.openapitools.model.CustomLabel2Filter;
import org.openapitools.model.CustomLabel3Filter;
import org.openapitools.model.CustomLabel4Filter;
import org.openapitools.model.HotelIdFilter;
import org.openapitools.model.PriceFilter;
import org.openapitools.model.PriceFilterPrice;
import org.openapitools.model.TitleKeywordsFilter;

@Canonical
class CatalogsHotelProductGroupFilterKeys {
    
    PriceFilterPrice PRICE
    
    CatalogsProductGroupMultipleStringCriteria HOTEL_ID
    
    CatalogsProductGroupMultipleStringCriteria BRAND
    
    CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0
    
    CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1
    
    CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2
    
    CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3
    
    CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4
    
    CatalogsProductGroupMultipleCountriesCriteria COUNTRY
    
    CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS
}
