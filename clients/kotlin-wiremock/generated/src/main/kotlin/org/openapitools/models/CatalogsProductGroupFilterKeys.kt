@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupFilterKeys(
    @field:JsonProperty("MIN_PRICE")
    val MIN_PRICE: CatalogsProductGroupPricingCriteria,

    @field:JsonProperty("MAX_PRICE")
    val MAX_PRICE: CatalogsProductGroupPricingCriteria,

    @field:JsonProperty("CURRENCY")
    val CURRENCY: CatalogsProductGroupCurrencyCriteria,

    @field:JsonProperty("ITEM_ID")
    val ITEM_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:JsonProperty("AVAILABILITY")
    val AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,

    @field:JsonProperty("BRAND")
    val BRAND: CatalogsProductGroupMultipleStringCriteria,

    @field:JsonProperty("CONDITION")
    val CONDITION: CatalogsProductGroupMultipleStringCriteria,

    @field:JsonProperty("CUSTOM_LABEL_0")
    val CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:JsonProperty("CUSTOM_LABEL_1")
    val CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:JsonProperty("CUSTOM_LABEL_2")
    val CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:JsonProperty("CUSTOM_LABEL_3")
    val CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:JsonProperty("CUSTOM_LABEL_4")
    val CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:JsonProperty("ITEM_GROUP_ID")
    val ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:JsonProperty("GENDER")
    val GENDER: CatalogsProductGroupMultipleGenderCriteria,

    @field:JsonProperty("MEDIA_TYPE")
    val MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,

    @field:JsonProperty("PRODUCT_TYPE_4")
    val PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("PRODUCT_TYPE_3")
    val PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("PRODUCT_TYPE_2")
    val PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("PRODUCT_TYPE_1")
    val PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("PRODUCT_TYPE_0")
    val PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
    val GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
    val GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
    val GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
    val GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
    val GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
    val GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
    val GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,

    @field:JsonProperty("CUSTOM_NUMBER_0")
    val CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria,

    @field:JsonProperty("CUSTOM_NUMBER_1")
    val CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria,

    @field:JsonProperty("CUSTOM_NUMBER_2")
    val CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria,

    @field:JsonProperty("CUSTOM_NUMBER_3")
    val CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria,

    @field:JsonProperty("CUSTOM_NUMBER_4")
    val CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria,

    @field:JsonProperty("TITLE_KEYWORDS")
    val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,

    @field:JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
    val PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria,

    @field:JsonProperty("PRODUCT_GROUP")
    val PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria,

)
