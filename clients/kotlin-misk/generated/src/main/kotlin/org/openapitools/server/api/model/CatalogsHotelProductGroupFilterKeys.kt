package org.openapitools.server.api.model

import org.openapitools.server.api.model.BrandFilter
import org.openapitools.server.api.model.CatalogsProductGroupFilterOperatorTypeCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleCountriesCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.server.api.model.CountryFilter
import org.openapitools.server.api.model.CustomLabel0Filter
import org.openapitools.server.api.model.CustomLabel1Filter
import org.openapitools.server.api.model.CustomLabel2Filter
import org.openapitools.server.api.model.CustomLabel3Filter
import org.openapitools.server.api.model.CustomLabel4Filter
import org.openapitools.server.api.model.HotelIdFilter
import org.openapitools.server.api.model.PriceFilter
import org.openapitools.server.api.model.PriceFilterPrice
import org.openapitools.server.api.model.TitleKeywordsFilter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProductGroupFilterKeys(
    val PRICE: PriceFilterPrice,
    val HOTEL_ID: CatalogsProductGroupMultipleStringCriteria,
    val BRAND: CatalogsProductGroupMultipleStringCriteria,
    val CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,
    val COUNTRY: CatalogsProductGroupMultipleCountriesCriteria,
    val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria
)
