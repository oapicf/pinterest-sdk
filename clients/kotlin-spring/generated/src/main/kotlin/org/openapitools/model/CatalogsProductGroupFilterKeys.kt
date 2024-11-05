package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AvailabilityFilter
import org.openapitools.model.BrandFilter
import org.openapitools.model.CatalogsProductGroupCurrencyCriteria
import org.openapitools.model.CatalogsProductGroupMultipleGenderCriteria
import org.openapitools.model.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.model.CatalogsProductGroupPricingCriteria
import org.openapitools.model.ConditionFilter
import org.openapitools.model.CurrencyFilter
import org.openapitools.model.CustomLabel0Filter
import org.openapitools.model.CustomLabel1Filter
import org.openapitools.model.CustomLabel2Filter
import org.openapitools.model.CustomLabel3Filter
import org.openapitools.model.CustomLabel4Filter
import org.openapitools.model.GenderFilter
import org.openapitools.model.GoogleProductCategory0Filter
import org.openapitools.model.GoogleProductCategory1Filter
import org.openapitools.model.GoogleProductCategory2Filter
import org.openapitools.model.GoogleProductCategory3Filter
import org.openapitools.model.GoogleProductCategory4Filter
import org.openapitools.model.GoogleProductCategory5Filter
import org.openapitools.model.GoogleProductCategory6Filter
import org.openapitools.model.ItemGroupIdFilter
import org.openapitools.model.ItemIdFilter
import org.openapitools.model.MaxPriceFilter
import org.openapitools.model.MediaTypeFilter
import org.openapitools.model.MinPriceFilter
import org.openapitools.model.ProductGroupReferenceFilter
import org.openapitools.model.ProductType0Filter
import org.openapitools.model.ProductType1Filter
import org.openapitools.model.ProductType2Filter
import org.openapitools.model.ProductType3Filter
import org.openapitools.model.ProductType4Filter
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
data class CatalogsProductGroupFilterKeys(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("MIN_PRICE", required = true) val MIN_PRICE: CatalogsProductGroupPricingCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("MAX_PRICE", required = true) val MAX_PRICE: CatalogsProductGroupPricingCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CURRENCY", required = true) val CURRENCY: CatalogsProductGroupCurrencyCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ITEM_ID", required = true) val ITEM_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("AVAILABILITY", required = true) val AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("BRAND", required = true) val BRAND: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CONDITION", required = true) val CONDITION: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_0", required = true) val CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_1", required = true) val CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_2", required = true) val CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_3", required = true) val CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_4", required = true) val CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ITEM_GROUP_ID", required = true) val ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("GENDER", required = true) val GENDER: CatalogsProductGroupMultipleGenderCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("MEDIA_TYPE", required = true) val MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PRODUCT_TYPE_4", required = true) val PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PRODUCT_TYPE_3", required = true) val PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PRODUCT_TYPE_2", required = true) val PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PRODUCT_TYPE_1", required = true) val PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PRODUCT_TYPE_0", required = true) val PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_6", required = true) val GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_5", required = true) val GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_4", required = true) val GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_3", required = true) val GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_2", required = true) val GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_1", required = true) val GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("GOOGLE_PRODUCT_CATEGORY_0", required = true) val GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PRODUCT_GROUP", required = true) val PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria
    ) {

}

