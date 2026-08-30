@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsItemValidationErrors(
    @field:JsonProperty("ADULT_INVALID")
    val ADULT_INVALID: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("ADWORDS_FORMAT_INVALID")
    val ADWORDS_FORMAT_INVALID: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("AVAILABILITY_INVALID")
    val AVAILABILITY_INVALID: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
    val BLOCKLISTED_IMAGE_SIGNATURE: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("DESCRIPTION_MISSING")
    val DESCRIPTION_MISSING: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("DUPLICATE_PRODUCTS")
    val DUPLICATE_PRODUCTS: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("IMAGE_LINK_INVALID")
    val IMAGE_LINK_INVALID: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
    val IMAGE_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("IMAGE_LINK_MISSING")
    val IMAGE_LINK_MISSING: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("INVALID_DOMAIN")
    val INVALID_DOMAIN: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
    val ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("ITEMID_MISSING")
    val ITEMID_MISSING: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("LINK_FORMAT_INVALID")
    val LINK_FORMAT_INVALID: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("LINK_LENGTH_TOO_LONG")
    val LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("LIST_PRICE_INVALID")
    val LIST_PRICE_INVALID: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
    val MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("PARSE_LINE_ERROR")
    val PARSE_LINE_ERROR: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("PINJOIN_CONTENT_UNSAFE")
    val PINJOIN_CONTENT_UNSAFE: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("PRICE_CANNOT_BE_DETERMINED")
    val PRICE_CANNOT_BE_DETERMINED: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("PRICE_MISSING")
    val PRICE_MISSING: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("PRODUCT_LINK_MISSING")
    val PRODUCT_LINK_MISSING: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("PRODUCT_PRICE_INVALID")
    val PRODUCT_PRICE_INVALID: CatalogsItemValidationDetails? = null,

    @field:JsonProperty("TITLE_MISSING")
    val TITLE_MISSING: CatalogsItemValidationDetails? = null,

)
