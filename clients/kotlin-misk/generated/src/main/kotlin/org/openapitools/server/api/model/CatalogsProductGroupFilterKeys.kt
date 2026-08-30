package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsBaseFilterKeys
import org.openapitools.server.api.model.CatalogsProductGroupCurrencyCriteria
import org.openapitools.server.api.model.CatalogsProductGroupFilterOperatorTypeCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleGenderCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.server.api.model.CatalogsProductGroupPricingCriteria
import org.openapitools.server.api.model.CatalogsProductGroupUint32Criteria
import org.openapitools.server.api.model.ProductGroupReferenceFilter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupFilterKeys(
    val MIN_PRICE: CatalogsProductGroupPricingCriteria,
    val MAX_PRICE: CatalogsProductGroupPricingCriteria,
    val CURRENCY: CatalogsProductGroupCurrencyCriteria,
    val ITEM_ID: CatalogsProductGroupMultipleStringCriteria,
    val AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,
    val BRAND: CatalogsProductGroupMultipleStringCriteria,
    val CONDITION: CatalogsProductGroupMultipleStringCriteria,
    val CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,
    val ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria,
    val GENDER: CatalogsProductGroupMultipleGenderCriteria,
    val MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,
    val PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria,
    val PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria,
    val PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria,
    val PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria,
    val PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,
    val CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria,
    val CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria,
    val CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria,
    val CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria,
    val CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria,
    val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,
    val PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria,
    val PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria
)
