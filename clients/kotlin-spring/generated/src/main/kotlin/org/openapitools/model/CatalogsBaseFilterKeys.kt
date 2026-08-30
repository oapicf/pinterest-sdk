package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AvailabilityFilter
import org.openapitools.model.BrandFilter
import org.openapitools.model.CatalogsProductGroupCurrencyCriteria
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria
import org.openapitools.model.CatalogsProductGroupMultipleGenderCriteria
import org.openapitools.model.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.model.CatalogsProductGroupPricingCriteria
import org.openapitools.model.CatalogsProductGroupUint32Criteria
import org.openapitools.model.ConditionFilter
import org.openapitools.model.CurrencyFilter
import org.openapitools.model.CustomLabel0Filter
import org.openapitools.model.CustomLabel1Filter
import org.openapitools.model.CustomLabel2Filter
import org.openapitools.model.CustomLabel3Filter
import org.openapitools.model.CustomLabel4Filter
import org.openapitools.model.CustomNumber0Filter
import org.openapitools.model.CustomNumber1Filter
import org.openapitools.model.CustomNumber2Filter
import org.openapitools.model.CustomNumber3Filter
import org.openapitools.model.CustomNumber4Filter
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
import org.openapitools.model.PinterestProductCategoriesFilter
import org.openapitools.model.ProductType0Filter
import org.openapitools.model.ProductType1Filter
import org.openapitools.model.ProductType2Filter
import org.openapitools.model.ProductType3Filter
import org.openapitools.model.ProductType4Filter
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
 * Base filter keys shared across catalog filtering
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
 * @param CUSTOM_NUMBER_0 
 * @param CUSTOM_NUMBER_1 
 * @param CUSTOM_NUMBER_2 
 * @param CUSTOM_NUMBER_3 
 * @param CUSTOM_NUMBER_4 
 * @param TITLE_KEYWORDS 
 * @param PINTEREST_PRODUCT_CATEGORIES 
 */
data class CatalogsBaseFilterKeys(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("MIN_PRICE")
    @get:JsonProperty("MIN_PRICE", required = true) val MIN_PRICE: CatalogsProductGroupPricingCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("MAX_PRICE")
    @get:JsonProperty("MAX_PRICE", required = true) val MAX_PRICE: CatalogsProductGroupPricingCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CURRENCY")
    @get:JsonProperty("CURRENCY", required = true) val CURRENCY: CatalogsProductGroupCurrencyCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("ITEM_ID")
    @get:JsonProperty("ITEM_ID", required = true) val ITEM_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("AVAILABILITY")
    @get:JsonProperty("AVAILABILITY", required = true) val AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("BRAND")
    @get:JsonProperty("BRAND", required = true) val BRAND: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CONDITION")
    @get:JsonProperty("CONDITION", required = true) val CONDITION: CatalogsProductGroupMultipleStringCriteria,

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
    @param:JsonProperty("ITEM_GROUP_ID")
    @get:JsonProperty("ITEM_GROUP_ID", required = true) val ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("GENDER")
    @get:JsonProperty("GENDER", required = true) val GENDER: CatalogsProductGroupMultipleGenderCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("MEDIA_TYPE")
    @get:JsonProperty("MEDIA_TYPE", required = true) val MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("PRODUCT_TYPE_4")
    @get:JsonProperty("PRODUCT_TYPE_4", required = true) val PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("PRODUCT_TYPE_3")
    @get:JsonProperty("PRODUCT_TYPE_3", required = true) val PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("PRODUCT_TYPE_2")
    @get:JsonProperty("PRODUCT_TYPE_2", required = true) val PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("PRODUCT_TYPE_1")
    @get:JsonProperty("PRODUCT_TYPE_1", required = true) val PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("PRODUCT_TYPE_0")
    @get:JsonProperty("PRODUCT_TYPE_0", required = true) val PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria,

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
    @param:JsonProperty("CUSTOM_NUMBER_0")
    @get:JsonProperty("CUSTOM_NUMBER_0", required = true) val CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_NUMBER_1")
    @get:JsonProperty("CUSTOM_NUMBER_1", required = true) val CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_NUMBER_2")
    @get:JsonProperty("CUSTOM_NUMBER_2", required = true) val CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_NUMBER_3")
    @get:JsonProperty("CUSTOM_NUMBER_3", required = true) val CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("CUSTOM_NUMBER_4")
    @get:JsonProperty("CUSTOM_NUMBER_4", required = true) val CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("TITLE_KEYWORDS")
    @get:JsonProperty("TITLE_KEYWORDS", required = true) val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
    @get:JsonProperty("PINTEREST_PRODUCT_CATEGORIES", required = true) val PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria
) {

}

