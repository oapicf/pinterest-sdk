package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsItemValidationDetails
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
 * @param ADULT_INVALID 
 * @param ADWORDS_FORMAT_INVALID 
 * @param AVAILABILITY_INVALID 
 * @param BLOCKLISTED_IMAGE_SIGNATURE 
 * @param DESCRIPTION_MISSING 
 * @param DUPLICATE_PRODUCTS 
 * @param IMAGE_LINK_INVALID 
 * @param IMAGE_LINK_LENGTH_TOO_LONG 
 * @param IMAGE_LINK_MISSING 
 * @param INVALID_DOMAIN 
 * @param ITEMID_MISSING 
 * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE 
 * @param LINK_FORMAT_INVALID 
 * @param LINK_LENGTH_TOO_LONG 
 * @param LIST_PRICE_INVALID 
 * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED 
 * @param PARSE_LINE_ERROR 
 * @param PINJOIN_CONTENT_UNSAFE 
 * @param PRICE_CANNOT_BE_DETERMINED 
 * @param PRICE_MISSING 
 * @param PRODUCT_LINK_MISSING 
 * @param PRODUCT_PRICE_INVALID 
 * @param TITLE_MISSING 
 */
data class CatalogsItemValidationErrors(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ADULT_INVALID") val ADULT_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ADWORDS_FORMAT_INVALID") val ADWORDS_FORMAT_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AVAILABILITY_INVALID") val AVAILABILITY_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE") val BLOCKLISTED_IMAGE_SIGNATURE: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DESCRIPTION_MISSING") val DESCRIPTION_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DUPLICATE_PRODUCTS") val DUPLICATE_PRODUCTS: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IMAGE_LINK_INVALID") val IMAGE_LINK_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG") val IMAGE_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IMAGE_LINK_MISSING") val IMAGE_LINK_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("INVALID_DOMAIN") val INVALID_DOMAIN: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ITEMID_MISSING") val ITEMID_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE") val ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LINK_FORMAT_INVALID") val LINK_FORMAT_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LINK_LENGTH_TOO_LONG") val LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LIST_PRICE_INVALID") val LIST_PRICE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED") val MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PARSE_LINE_ERROR") val PARSE_LINE_ERROR: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PINJOIN_CONTENT_UNSAFE") val PINJOIN_CONTENT_UNSAFE: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PRICE_CANNOT_BE_DETERMINED") val PRICE_CANNOT_BE_DETERMINED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PRICE_MISSING") val PRICE_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PRODUCT_LINK_MISSING") val PRODUCT_LINK_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PRODUCT_PRICE_INVALID") val PRODUCT_PRICE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("TITLE_MISSING") val TITLE_MISSING: CatalogsItemValidationDetails? = null
) {

}

