package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param ADULT_INVALID Item has an invalid adult value.
 * @param ADWORDS_FORMAT_INVALID Adword link contains too many characters.
 * @param AVAILABILITY_INVALID Item is missing availability value in its product metadata, this item will not be published.
 * @param BLOCKLISTED_IMAGE_SIGNATURE Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
 * @param DESCRIPTION_MISSING Item is missing description in its product metadata, this item will not be published.
 * @param DUPLICATE_PRODUCTS This product is duplicated. The duplicate entry will not be published.
 * @param IMAGE_LINK_INVALID Image link is invalid.
 * @param IMAGE_LINK_LENGTH_TOO_LONG Item has image_link URL that contains too many characters, so the item will not be published.
 * @param IMAGE_LINK_MISSING Item is missing an image link URL in its product metadata, this item will not be published.
 * @param INVALID_DOMAIN Product link value doesn't match the verified domain associated with this account.
 * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Main image can't be found.
 * @param ITEMID_MISSING Item is missing item id in its product metadata, this item will not be published.
 * @param LINK_FORMAT_INVALID Link is invalid.
 * @param LINK_LENGTH_TOO_LONG Product link contains too many characters, this item will not be published.
 * @param LIST_PRICE_INVALID Item has a list price formatting error, this item will not be published.
 * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Item exceed the maximum number of items per item group, this item will not be published.
 * @param PARSE_LINE_ERROR Item contains formating errors.
 * @param PINJOIN_CONTENT_UNSAFE Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
 * @param PRICE_CANNOT_BE_DETERMINED Item price cannot be determined because the price, list price, and sale price are all different.
 * @param PRICE_MISSING Product is missing a price, this item will not be published.
 * @param PRODUCT_LINK_MISSING Item is missing a link URL in its product metadata, this item will not be published.
 * @param PRODUCT_PRICE_INVALID Item has a price formatting error in its product metadata, this item will not be published.
 * @param TITLE_MISSING Item is missing title in its product metadata, this item will not be published.
 */
data class CatalogsItemValidationErrors(

    @field:Valid
    @Schema(description = "Item has an invalid adult value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ADULT_INVALID")
    @get:JsonProperty("ADULT_INVALID") val ADULT_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Adword link contains too many characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ADWORDS_FORMAT_INVALID")
    @get:JsonProperty("ADWORDS_FORMAT_INVALID") val ADWORDS_FORMAT_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item is missing availability value in its product metadata, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AVAILABILITY_INVALID")
    @get:JsonProperty("AVAILABILITY_INVALID") val AVAILABILITY_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
    @get:JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE") val BLOCKLISTED_IMAGE_SIGNATURE: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item is missing description in its product metadata, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("DESCRIPTION_MISSING")
    @get:JsonProperty("DESCRIPTION_MISSING") val DESCRIPTION_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "This product is duplicated. The duplicate entry will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("DUPLICATE_PRODUCTS")
    @get:JsonProperty("DUPLICATE_PRODUCTS") val DUPLICATE_PRODUCTS: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Image link is invalid.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IMAGE_LINK_INVALID")
    @get:JsonProperty("IMAGE_LINK_INVALID") val IMAGE_LINK_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item has image_link URL that contains too many characters, so the item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG") val IMAGE_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item is missing an image link URL in its product metadata, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IMAGE_LINK_MISSING")
    @get:JsonProperty("IMAGE_LINK_MISSING") val IMAGE_LINK_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Product link value doesn't match the verified domain associated with this account.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("INVALID_DOMAIN")
    @get:JsonProperty("INVALID_DOMAIN") val INVALID_DOMAIN: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Main image can't be found.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
    @get:JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE") val ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item is missing item id in its product metadata, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ITEMID_MISSING")
    @get:JsonProperty("ITEMID_MISSING") val ITEMID_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Link is invalid.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("LINK_FORMAT_INVALID")
    @get:JsonProperty("LINK_FORMAT_INVALID") val LINK_FORMAT_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Product link contains too many characters, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("LINK_LENGTH_TOO_LONG") val LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item has a list price formatting error, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("LIST_PRICE_INVALID")
    @get:JsonProperty("LIST_PRICE_INVALID") val LIST_PRICE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item exceed the maximum number of items per item group, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
    @get:JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED") val MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item contains formating errors.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PARSE_LINE_ERROR")
    @get:JsonProperty("PARSE_LINE_ERROR") val PARSE_LINE_ERROR: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PINJOIN_CONTENT_UNSAFE")
    @get:JsonProperty("PINJOIN_CONTENT_UNSAFE") val PINJOIN_CONTENT_UNSAFE: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item price cannot be determined because the price, list price, and sale price are all different.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRICE_CANNOT_BE_DETERMINED")
    @get:JsonProperty("PRICE_CANNOT_BE_DETERMINED") val PRICE_CANNOT_BE_DETERMINED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Product is missing a price, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRICE_MISSING")
    @get:JsonProperty("PRICE_MISSING") val PRICE_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item is missing a link URL in its product metadata, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRODUCT_LINK_MISSING")
    @get:JsonProperty("PRODUCT_LINK_MISSING") val PRODUCT_LINK_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item has a price formatting error in its product metadata, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRODUCT_PRICE_INVALID")
    @get:JsonProperty("PRODUCT_PRICE_INVALID") val PRODUCT_PRICE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(description = "Item is missing title in its product metadata, this item will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("TITLE_MISSING")
    @get:JsonProperty("TITLE_MISSING") val TITLE_MISSING: CatalogsItemValidationDetails? = null
) {

}

