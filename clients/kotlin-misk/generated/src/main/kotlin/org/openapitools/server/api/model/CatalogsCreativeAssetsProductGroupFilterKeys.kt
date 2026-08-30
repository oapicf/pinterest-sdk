package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFilterOperatorTypeCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.server.api.model.CreativeAssetsIdFilter
import org.openapitools.server.api.model.CustomLabel0Filter
import org.openapitools.server.api.model.CustomLabel1Filter
import org.openapitools.server.api.model.CustomLabel2Filter
import org.openapitools.server.api.model.CustomLabel3Filter
import org.openapitools.server.api.model.CustomLabel4Filter
import org.openapitools.server.api.model.GoogleProductCategory0Filter
import org.openapitools.server.api.model.GoogleProductCategory1Filter
import org.openapitools.server.api.model.GoogleProductCategory2Filter
import org.openapitools.server.api.model.GoogleProductCategory3Filter
import org.openapitools.server.api.model.GoogleProductCategory4Filter
import org.openapitools.server.api.model.GoogleProductCategory5Filter
import org.openapitools.server.api.model.GoogleProductCategory6Filter
import org.openapitools.server.api.model.LinkFilter
import org.openapitools.server.api.model.MediaTypeFilter
import org.openapitools.server.api.model.TitleKeywordsFilter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsProductGroupFilterKeys(
    val CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria,
    val CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,
    val CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,
    val GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,
    val MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,
    val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,
    val LINK: CatalogsProductGroupFilterOperatorTypeCriteria
)
