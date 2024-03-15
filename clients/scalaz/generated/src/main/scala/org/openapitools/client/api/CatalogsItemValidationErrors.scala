package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemValidationErrors._

case class CatalogsItemValidationErrors (
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
TITLE_MISSING: Option[CatalogsItemValidationDetails])

object CatalogsItemValidationErrors {
  import DateTimeCodecs._

  implicit val CatalogsItemValidationErrorsCodecJson: CodecJson[CatalogsItemValidationErrors] = CodecJson.derive[CatalogsItemValidationErrors]
  implicit val CatalogsItemValidationErrorsDecoder: EntityDecoder[CatalogsItemValidationErrors] = jsonOf[CatalogsItemValidationErrors]
  implicit val CatalogsItemValidationErrorsEncoder: EntityEncoder[CatalogsItemValidationErrors] = jsonEncoderOf[CatalogsItemValidationErrors]
}
