/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model

import org.openapitools.server.api.model.AvailabilityFilter
import org.openapitools.server.api.model.BrandFilter
import org.openapitools.server.api.model.CatalogsProductGroupCurrencyCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleGenderCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.server.api.model.CatalogsProductGroupPricingCriteria
import org.openapitools.server.api.model.ConditionFilter
import org.openapitools.server.api.model.CurrencyFilter
import org.openapitools.server.api.model.CustomLabel0Filter
import org.openapitools.server.api.model.CustomLabel1Filter
import org.openapitools.server.api.model.CustomLabel2Filter
import org.openapitools.server.api.model.CustomLabel3Filter
import org.openapitools.server.api.model.CustomLabel4Filter
import org.openapitools.server.api.model.GenderFilter
import org.openapitools.server.api.model.GoogleProductCategory0Filter
import org.openapitools.server.api.model.GoogleProductCategory1Filter
import org.openapitools.server.api.model.GoogleProductCategory2Filter
import org.openapitools.server.api.model.GoogleProductCategory3Filter
import org.openapitools.server.api.model.GoogleProductCategory4Filter
import org.openapitools.server.api.model.GoogleProductCategory5Filter
import org.openapitools.server.api.model.GoogleProductCategory6Filter
import org.openapitools.server.api.model.ItemGroupIdFilter
import org.openapitools.server.api.model.ItemIdFilter
import org.openapitools.server.api.model.MaxPriceFilter
import org.openapitools.server.api.model.MediaTypeFilter
import org.openapitools.server.api.model.MinPriceFilter
import org.openapitools.server.api.model.ProductGroupReferenceFilter
import org.openapitools.server.api.model.ProductType0Filter
import org.openapitools.server.api.model.ProductType1Filter
import org.openapitools.server.api.model.ProductType2Filter
import org.openapitools.server.api.model.ProductType3Filter
import org.openapitools.server.api.model.ProductType4Filter

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param MIN_PRICE 
 * @param MAX_PRICE 
 * @param CURRENCY 
 * @param ITEM_ID 
 * @param AVAILABILITY 
 * @param BRAND 
 * @param CONDITION 
 * @param CUSTOM_LABEL_0 
 * @param CUSTOM_LABEL_1 
 * @param CUSTOM_LABEL_2 
 * @param CUSTOM_LABEL_3 
 * @param CUSTOM_LABEL_4 
 * @param ITEM_GROUP_ID 
 * @param GENDER 
 * @param MEDIA_TYPE 
 * @param PRODUCT_TYPE_4 
 * @param PRODUCT_TYPE_3 
 * @param PRODUCT_TYPE_2 
 * @param PRODUCT_TYPE_1 
 * @param PRODUCT_TYPE_0 
 * @param GOOGLE_PRODUCT_CATEGORY_6 
 * @param GOOGLE_PRODUCT_CATEGORY_5 
 * @param GOOGLE_PRODUCT_CATEGORY_4 
 * @param GOOGLE_PRODUCT_CATEGORY_3 
 * @param GOOGLE_PRODUCT_CATEGORY_2 
 * @param GOOGLE_PRODUCT_CATEGORY_1 
 * @param GOOGLE_PRODUCT_CATEGORY_0 
 * @param PRODUCT_GROUP 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsProductGroupFilterKeys (
    @SerializedName("MIN_PRICE") private val _MIN_PRICE: CatalogsProductGroupPricingCriteria?,
    @SerializedName("MAX_PRICE") private val _MAX_PRICE: CatalogsProductGroupPricingCriteria?,
    @SerializedName("CURRENCY") private val _CURRENCY: CatalogsProductGroupCurrencyCriteria?,
    @SerializedName("ITEM_ID") private val _ITEM_ID: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("AVAILABILITY") private val _AVAILABILITY: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("BRAND") private val _BRAND: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("CONDITION") private val _CONDITION: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("CUSTOM_LABEL_0") private val _CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("CUSTOM_LABEL_1") private val _CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("CUSTOM_LABEL_2") private val _CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("CUSTOM_LABEL_3") private val _CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("CUSTOM_LABEL_4") private val _CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("ITEM_GROUP_ID") private val _ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria?,
    @SerializedName("GENDER") private val _GENDER: CatalogsProductGroupMultipleGenderCriteria?,
    @SerializedName("MEDIA_TYPE") private val _MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria?,
    @SerializedName("PRODUCT_TYPE_4") private val _PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("PRODUCT_TYPE_3") private val _PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("PRODUCT_TYPE_2") private val _PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("PRODUCT_TYPE_1") private val _PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("PRODUCT_TYPE_0") private val _PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("GOOGLE_PRODUCT_CATEGORY_6") private val _GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("GOOGLE_PRODUCT_CATEGORY_5") private val _GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("GOOGLE_PRODUCT_CATEGORY_4") private val _GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("GOOGLE_PRODUCT_CATEGORY_3") private val _GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("GOOGLE_PRODUCT_CATEGORY_2") private val _GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("GOOGLE_PRODUCT_CATEGORY_1") private val _GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("GOOGLE_PRODUCT_CATEGORY_0") private val _GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria?,
    @SerializedName("PRODUCT_GROUP") private val _PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria?
) {

        val MIN_PRICE get() = _MIN_PRICE ?: throw IllegalArgumentException("MIN_PRICE is required")
                    
        val MAX_PRICE get() = _MAX_PRICE ?: throw IllegalArgumentException("MAX_PRICE is required")
                    
        val CURRENCY get() = _CURRENCY ?: throw IllegalArgumentException("CURRENCY is required")
                    
        val ITEM_ID get() = _ITEM_ID ?: throw IllegalArgumentException("ITEM_ID is required")
                    
        val AVAILABILITY get() = _AVAILABILITY ?: throw IllegalArgumentException("AVAILABILITY is required")
                    
        val BRAND get() = _BRAND ?: throw IllegalArgumentException("BRAND is required")
                    
        val CONDITION get() = _CONDITION ?: throw IllegalArgumentException("CONDITION is required")
                    
        val CUSTOM_LABEL_0 get() = _CUSTOM_LABEL_0 ?: throw IllegalArgumentException("CUSTOM_LABEL_0 is required")
                    
        val CUSTOM_LABEL_1 get() = _CUSTOM_LABEL_1 ?: throw IllegalArgumentException("CUSTOM_LABEL_1 is required")
                    
        val CUSTOM_LABEL_2 get() = _CUSTOM_LABEL_2 ?: throw IllegalArgumentException("CUSTOM_LABEL_2 is required")
                    
        val CUSTOM_LABEL_3 get() = _CUSTOM_LABEL_3 ?: throw IllegalArgumentException("CUSTOM_LABEL_3 is required")
                    
        val CUSTOM_LABEL_4 get() = _CUSTOM_LABEL_4 ?: throw IllegalArgumentException("CUSTOM_LABEL_4 is required")
                    
        val ITEM_GROUP_ID get() = _ITEM_GROUP_ID ?: throw IllegalArgumentException("ITEM_GROUP_ID is required")
                    
        val GENDER get() = _GENDER ?: throw IllegalArgumentException("GENDER is required")
                    
        val MEDIA_TYPE get() = _MEDIA_TYPE ?: throw IllegalArgumentException("MEDIA_TYPE is required")
                    
        val PRODUCT_TYPE_4 get() = _PRODUCT_TYPE_4 ?: throw IllegalArgumentException("PRODUCT_TYPE_4 is required")
                    
        val PRODUCT_TYPE_3 get() = _PRODUCT_TYPE_3 ?: throw IllegalArgumentException("PRODUCT_TYPE_3 is required")
                    
        val PRODUCT_TYPE_2 get() = _PRODUCT_TYPE_2 ?: throw IllegalArgumentException("PRODUCT_TYPE_2 is required")
                    
        val PRODUCT_TYPE_1 get() = _PRODUCT_TYPE_1 ?: throw IllegalArgumentException("PRODUCT_TYPE_1 is required")
                    
        val PRODUCT_TYPE_0 get() = _PRODUCT_TYPE_0 ?: throw IllegalArgumentException("PRODUCT_TYPE_0 is required")
                    
        val GOOGLE_PRODUCT_CATEGORY_6 get() = _GOOGLE_PRODUCT_CATEGORY_6 ?: throw IllegalArgumentException("GOOGLE_PRODUCT_CATEGORY_6 is required")
                    
        val GOOGLE_PRODUCT_CATEGORY_5 get() = _GOOGLE_PRODUCT_CATEGORY_5 ?: throw IllegalArgumentException("GOOGLE_PRODUCT_CATEGORY_5 is required")
                    
        val GOOGLE_PRODUCT_CATEGORY_4 get() = _GOOGLE_PRODUCT_CATEGORY_4 ?: throw IllegalArgumentException("GOOGLE_PRODUCT_CATEGORY_4 is required")
                    
        val GOOGLE_PRODUCT_CATEGORY_3 get() = _GOOGLE_PRODUCT_CATEGORY_3 ?: throw IllegalArgumentException("GOOGLE_PRODUCT_CATEGORY_3 is required")
                    
        val GOOGLE_PRODUCT_CATEGORY_2 get() = _GOOGLE_PRODUCT_CATEGORY_2 ?: throw IllegalArgumentException("GOOGLE_PRODUCT_CATEGORY_2 is required")
                    
        val GOOGLE_PRODUCT_CATEGORY_1 get() = _GOOGLE_PRODUCT_CATEGORY_1 ?: throw IllegalArgumentException("GOOGLE_PRODUCT_CATEGORY_1 is required")
                    
        val GOOGLE_PRODUCT_CATEGORY_0 get() = _GOOGLE_PRODUCT_CATEGORY_0 ?: throw IllegalArgumentException("GOOGLE_PRODUCT_CATEGORY_0 is required")
                    
        val PRODUCT_GROUP get() = _PRODUCT_GROUP ?: throw IllegalArgumentException("PRODUCT_GROUP is required")
                    
}

