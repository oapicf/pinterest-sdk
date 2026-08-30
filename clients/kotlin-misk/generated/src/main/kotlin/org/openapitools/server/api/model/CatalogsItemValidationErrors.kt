package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsItemValidationDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemValidationErrors(
    /** Item has an invalid adult value. */
    val ADULT_INVALID: CatalogsItemValidationDetails? = null,
    /** Adword link contains too many characters. */
    val ADWORDS_FORMAT_INVALID: CatalogsItemValidationDetails? = null,
    /** Item is missing availability value in its product metadata, this item will not be published. */
    val AVAILABILITY_INVALID: CatalogsItemValidationDetails? = null,
    /** Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. */
    val BLOCKLISTED_IMAGE_SIGNATURE: CatalogsItemValidationDetails? = null,
    /** Item is missing description in its product metadata, this item will not be published. */
    val DESCRIPTION_MISSING: CatalogsItemValidationDetails? = null,
    /** This product is duplicated. The duplicate entry will not be published. */
    val DUPLICATE_PRODUCTS: CatalogsItemValidationDetails? = null,
    /** Image link is invalid. */
    val IMAGE_LINK_INVALID: CatalogsItemValidationDetails? = null,
    /** Item has image_link URL that contains too many characters, so the item will not be published. */
    val IMAGE_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,
    /** Item is missing an image link URL in its product metadata, this item will not be published. */
    val IMAGE_LINK_MISSING: CatalogsItemValidationDetails? = null,
    /** Product link value doesn&#39;t match the verified domain associated with this account. */
    val INVALID_DOMAIN: CatalogsItemValidationDetails? = null,
    /** Main image can&#39;t be found. */
    val ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: CatalogsItemValidationDetails? = null,
    /** Item is missing item id in its product metadata, this item will not be published. */
    val ITEMID_MISSING: CatalogsItemValidationDetails? = null,
    /** Link is invalid. */
    val LINK_FORMAT_INVALID: CatalogsItemValidationDetails? = null,
    /** Product link contains too many characters, this item will not be published. */
    val LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,
    /** Item has a list price formatting error, this item will not be published. */
    val LIST_PRICE_INVALID: CatalogsItemValidationDetails? = null,
    /** Item exceed the maximum number of items per item group, this item will not be published. */
    val MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: CatalogsItemValidationDetails? = null,
    /** Item contains formating errors. */
    val PARSE_LINE_ERROR: CatalogsItemValidationDetails? = null,
    /** Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. */
    val PINJOIN_CONTENT_UNSAFE: CatalogsItemValidationDetails? = null,
    /** Item price cannot be determined because the price, list price, and sale price are all different. */
    val PRICE_CANNOT_BE_DETERMINED: CatalogsItemValidationDetails? = null,
    /** Product is missing a price, this item will not be published. */
    val PRICE_MISSING: CatalogsItemValidationDetails? = null,
    /** Item is missing a link URL in its product metadata, this item will not be published. */
    val PRODUCT_LINK_MISSING: CatalogsItemValidationDetails? = null,
    /** Item has a price formatting error in its product metadata, this item will not be published. */
    val PRODUCT_PRICE_INVALID: CatalogsItemValidationDetails? = null,
    /** Item is missing title in its product metadata, this item will not be published. */
    val TITLE_MISSING: CatalogsItemValidationDetails? = null
)
