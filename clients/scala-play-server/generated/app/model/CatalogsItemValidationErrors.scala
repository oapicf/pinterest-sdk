package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationErrors.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsItemValidationErrors(
  ADULT_INVALID: Option[CatalogsItemValidationDetails],
  ADWORDS_FORMAT_INVALID: Option[CatalogsItemValidationDetails],
  AVAILABILITY_INVALID: Option[CatalogsItemValidationDetails],
  BLOCKLISTED_IMAGE_SIGNATURE: Option[CatalogsItemValidationDetails],
  DESCRIPTION_MISSING: Option[CatalogsItemValidationDetails],
  DUPLICATE_PRODUCTS: Option[CatalogsItemValidationDetails],
  IMAGE_LINK_INVALID: Option[CatalogsItemValidationDetails],
  IMAGE_LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
  IMAGE_LINK_MISSING: Option[CatalogsItemValidationDetails],
  INVALID_DOMAIN: Option[CatalogsItemValidationDetails],
  ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[CatalogsItemValidationDetails],
  ITEMID_MISSING: Option[CatalogsItemValidationDetails],
  LINK_FORMAT_INVALID: Option[CatalogsItemValidationDetails],
  LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
  LIST_PRICE_INVALID: Option[CatalogsItemValidationDetails],
  MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[CatalogsItemValidationDetails],
  PARSE_LINE_ERROR: Option[CatalogsItemValidationDetails],
  PINJOIN_CONTENT_UNSAFE: Option[CatalogsItemValidationDetails],
  PRICE_CANNOT_BE_DETERMINED: Option[CatalogsItemValidationDetails],
  PRICE_MISSING: Option[CatalogsItemValidationDetails],
  PRODUCT_LINK_MISSING: Option[CatalogsItemValidationDetails],
  PRODUCT_PRICE_INVALID: Option[CatalogsItemValidationDetails],
  TITLE_MISSING: Option[CatalogsItemValidationDetails]
)

object CatalogsItemValidationErrors {
  implicit lazy val catalogsItemValidationErrorsJsonFormat: Format[CatalogsItemValidationErrors] = Json.format[CatalogsItemValidationErrors]
}

