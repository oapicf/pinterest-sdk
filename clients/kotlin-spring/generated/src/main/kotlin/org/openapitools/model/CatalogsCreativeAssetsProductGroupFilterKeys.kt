package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria
import org.openapitools.model.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.model.CreativeAssetsIdFilter
import org.openapitools.model.CustomLabel0Filter
import org.openapitools.model.CustomLabel1Filter
import org.openapitools.model.CustomLabel2Filter
import org.openapitools.model.CustomLabel3Filter
import org.openapitools.model.CustomLabel4Filter
import org.openapitools.model.GoogleProductCategory0Filter
import org.openapitools.model.GoogleProductCategory1Filter
import org.openapitools.model.GoogleProductCategory2Filter
import org.openapitools.model.GoogleProductCategory3Filter
import org.openapitools.model.GoogleProductCategory4Filter
import org.openapitools.model.GoogleProductCategory5Filter
import org.openapitools.model.GoogleProductCategory6Filter
import org.openapitools.model.LinkFilter
import org.openapitools.model.MediaTypeFilter
import org.openapitools.model.TitleKeywordsFilter
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param CREATIVE_ASSETS_ID 
 * @param CUSTOM_LABEL_0 
 * @param CUSTOM_LABEL_1 
 * @param CUSTOM_LABEL_2 
 * @param CUSTOM_LABEL_3 
 * @param CUSTOM_LABEL_4 
 * @param GOOGLE_PRODUCT_CATEGORY_6 
 * @param GOOGLE_PRODUCT_CATEGORY_5 
 * @param GOOGLE_PRODUCT_CATEGORY_4 
 * @param GOOGLE_PRODUCT_CATEGORY_3 
 * @param GOOGLE_PRODUCT_CATEGORY_2 
 * @param GOOGLE_PRODUCT_CATEGORY_1 
 * @param GOOGLE_PRODUCT_CATEGORY_0 
 * @param MEDIA_TYPE 
 * @param TITLE_KEYWORDS 
 * @param LINK 
 */
data class CatalogsCreativeAssetsProductGroupFilterKeys(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CREATIVE_ASSETS_ID")
    @get:JsonProperty("CREATIVE_ASSETS_ID", required = true) val CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_LABEL_0")
    @get:JsonProperty("CUSTOM_LABEL_0", required = true) val CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_LABEL_1")
    @get:JsonProperty("CUSTOM_LABEL_1", required = true) val CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_LABEL_2")
    @get:JsonProperty("CUSTOM_LABEL_2", required = true) val CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_LABEL_3")
    @get:JsonProperty("CUSTOM_LABEL_3", required = true) val CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_LABEL_4")
    @get:JsonProperty("CUSTOM_LABEL_4", required = true) val CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_6", required = true) val GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_5", required = true) val GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_4", required = true) val GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_3", required = true) val GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_2", required = true) val GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_1", required = true) val GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_0", required = true) val GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("MEDIA_TYPE")
    @get:JsonProperty("MEDIA_TYPE", required = true) val MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("TITLE_KEYWORDS")
    @get:JsonProperty("TITLE_KEYWORDS", required = true) val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("LINK")
    @get:JsonProperty("LINK", required = true) val LINK: CatalogsProductGroupFilterOperatorTypeCriteria
) {

}

