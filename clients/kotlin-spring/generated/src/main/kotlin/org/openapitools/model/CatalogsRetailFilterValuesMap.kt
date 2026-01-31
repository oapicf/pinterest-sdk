package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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

    @Schema(example = "null", description = "")
    @get:JsonProperty("ad_image_tags") val adImageTags: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ad_video_tags") val adVideoTags: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availability") val availability: kotlin.collections.List<CatalogsRetailFilterValuesMap.Availability>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("brand") val brand: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("condition") val condition: kotlin.collections.List<CatalogsRetailFilterValuesMap.Condition>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_0") val customLabel0: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_1") val customLabel1: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_2") val customLabel2: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_3") val customLabel3: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_4") val customLabel4: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: kotlin.collections.List<CatalogsRetailFilterValuesMap.Gender>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("google_product_category_0") val googleProductCategory0: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("google_product_category_1") val googleProductCategory1: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("google_product_category_2") val googleProductCategory2: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("google_product_category_3") val googleProductCategory3: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("google_product_category_4") val googleProductCategory4: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("google_product_category_5") val googleProductCategory5: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("google_product_category_6") val googleProductCategory6: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("media_type") val mediaType: kotlin.collections.List<CatalogsRetailFilterValuesMap.MediaType>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("product_type_0") val productType0: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("product_type_1") val productType1: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("product_type_2") val productType2: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("product_type_3") val productType3: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("product_type_4") val productType4: kotlin.collections.List<kotlin.String>? = null
) {

    /**
    * 
    * Values: IN_STOCK,OUT_OF_STOCK,PREORDER,UNAVAILABLE
    */
    enum class Availability(@get:JsonValue val value: kotlin.String) {

        IN_STOCK("IN_STOCK"),
        OUT_OF_STOCK("OUT_OF_STOCK"),
        PREORDER("PREORDER"),
        UNAVAILABLE("UNAVAILABLE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Availability {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsRetailFilterValuesMap'")
            }
        }
    }

    /**
    * 
    * Values: NEW,USED,REFURBISHED
    */
    enum class Condition(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        USED("USED"),
        REFURBISHED("REFURBISHED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Condition {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsRetailFilterValuesMap'")
            }
        }
    }

    /**
    * 
    * Values: FEMALE,MALE,UNISEX
    */
    enum class Gender(@get:JsonValue val value: kotlin.String) {

        FEMALE("FEMALE"),
        MALE("MALE"),
        UNISEX("UNISEX");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Gender {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsRetailFilterValuesMap'")
            }
        }
    }

    /**
    * 
    * Values: IMAGE,VIDEO
    */
    enum class MediaType(@get:JsonValue val value: kotlin.String) {

        IMAGE("IMAGE"),
        VIDEO("VIDEO");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): MediaType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsRetailFilterValuesMap'")
            }
        }
    }

}

