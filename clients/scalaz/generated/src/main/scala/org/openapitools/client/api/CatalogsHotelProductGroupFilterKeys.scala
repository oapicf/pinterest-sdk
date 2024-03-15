package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroupFilterKeys._

case class CatalogsHotelProductGroupFilterKeys (
  PRICE: CatalogsProductGroupPricingCurrencyCriteria,
HOTEL_ID: CatalogsProductGroupMultipleStringCriteria,
BRAND: CatalogsProductGroupMultipleStringCriteria,
CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
COUNTRY: CatalogsProductGroupMultipleCountriesCriteria)

object CatalogsHotelProductGroupFilterKeys {
  import DateTimeCodecs._

  implicit val CatalogsHotelProductGroupFilterKeysCodecJson: CodecJson[CatalogsHotelProductGroupFilterKeys] = CodecJson.derive[CatalogsHotelProductGroupFilterKeys]
  implicit val CatalogsHotelProductGroupFilterKeysDecoder: EntityDecoder[CatalogsHotelProductGroupFilterKeys] = jsonOf[CatalogsHotelProductGroupFilterKeys]
  implicit val CatalogsHotelProductGroupFilterKeysEncoder: EntityEncoder[CatalogsHotelProductGroupFilterKeys] = jsonEncoderOf[CatalogsHotelProductGroupFilterKeys]
}
