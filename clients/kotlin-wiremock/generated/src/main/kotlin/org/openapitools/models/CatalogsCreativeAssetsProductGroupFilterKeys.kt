@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsProductGroupFilterKeys(
    @field:JsonProperty("CREATIVE_ASSETS_ID")
    val CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria,

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

    @field:JsonProperty("MEDIA_TYPE")
    val MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,

    @field:JsonProperty("TITLE_KEYWORDS")
    val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,

    @field:JsonProperty("LINK")
    val LINK: CatalogsProductGroupFilterOperatorTypeCriteria,

)
