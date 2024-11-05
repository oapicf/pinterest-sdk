package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationErrors.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
  ITEMID_MISSING: Option[CatalogsItemValidationDetails],
  ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[CatalogsItemValidationDetails],
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

