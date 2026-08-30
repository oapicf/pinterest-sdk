@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelProductGroupFilterKeys(
    @field:JsonProperty("PRICE")
    val PRICE: PriceFilterPrice,

    @field:JsonProperty("HOTEL_ID")
    val HOTEL_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:JsonProperty("BRAND")
    val BRAND: CatalogsProductGroupMultipleStringCriteria,

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

    @field:JsonProperty("COUNTRY")
    val COUNTRY: CatalogsProductGroupMultipleCountriesCriteria,

    @field:JsonProperty("TITLE_KEYWORDS")
    val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,

)
