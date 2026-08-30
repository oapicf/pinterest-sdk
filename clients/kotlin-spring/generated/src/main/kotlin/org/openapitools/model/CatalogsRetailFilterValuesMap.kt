package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.Gender
import org.openapitools.model.MediaType
import org.openapitools.model.ProductAvailability
import org.openapitools.model.ProductCondition
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
 * A map of filter attributes to their available values.
 * @param adImageTags 
 * @param adVideoTags 
 * @param availability 
 * @param brand 
 * @param condition 
 * @param customLabel0 
 * @param customLabel1 
 * @param customLabel2 
 * @param customLabel3 
 * @param customLabel4 
 * @param gender 
 * @param googleProductCategory0 
 * @param googleProductCategory1 
 * @param googleProductCategory2 
 * @param googleProductCategory3 
 * @param googleProductCategory4 
 * @param googleProductCategory5 
 * @param googleProductCategory6 
 * @param mediaType 
 * @param productType0 
 * @param productType1 
 * @param productType2 
 * @param productType3 
 * @param productType4 
 */
data class CatalogsRetailFilterValuesMap(

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_image_tags")
    @get:JsonProperty("ad_image_tags") val adImageTags: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_video_tags")
    @get:JsonProperty("ad_video_tags") val adVideoTags: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("availability")
    @get:JsonProperty("availability") val availability: kotlin.collections.List<ProductAvailability>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("brand")
    @get:JsonProperty("brand") val brand: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("condition")
    @get:JsonProperty("condition") val condition: kotlin.collections.List<ProductCondition>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_label_0")
    @get:JsonProperty("custom_label_0") val customLabel0: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_label_1")
    @get:JsonProperty("custom_label_1") val customLabel1: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_label_2")
    @get:JsonProperty("custom_label_2") val customLabel2: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_label_3")
    @get:JsonProperty("custom_label_3") val customLabel3: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_label_4")
    @get:JsonProperty("custom_label_4") val customLabel4: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("gender")
    @get:JsonProperty("gender") val gender: kotlin.collections.List<Gender>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("google_product_category_0")
    @get:JsonProperty("google_product_category_0") val googleProductCategory0: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("google_product_category_1")
    @get:JsonProperty("google_product_category_1") val googleProductCategory1: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("google_product_category_2")
    @get:JsonProperty("google_product_category_2") val googleProductCategory2: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("google_product_category_3")
    @get:JsonProperty("google_product_category_3") val googleProductCategory3: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("google_product_category_4")
    @get:JsonProperty("google_product_category_4") val googleProductCategory4: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("google_product_category_5")
    @get:JsonProperty("google_product_category_5") val googleProductCategory5: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("google_product_category_6")
    @get:JsonProperty("google_product_category_6") val googleProductCategory6: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("media_type")
    @get:JsonProperty("media_type") val mediaType: kotlin.collections.List<MediaType>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_type_0")
    @get:JsonProperty("product_type_0") val productType0: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_type_1")
    @get:JsonProperty("product_type_1") val productType1: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_type_2")
    @get:JsonProperty("product_type_2") val productType2: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_type_3")
    @get:JsonProperty("product_type_3") val productType3: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_type_4")
    @get:JsonProperty("product_type_4") val productType4: kotlin.collections.List<kotlin.String>? = null
) {

}

