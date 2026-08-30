package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailFilterValuesMap._

case class CatalogsRetailFilterValuesMap (
  adImageTags: Option[List[String]],
adVideoTags: Option[List[String]],
availability: Option[List[ProductAvailability]],
brand: Option[List[String]],
condition: Option[List[ProductCondition]],
customLabel0: Option[List[String]],
customLabel1: Option[List[String]],
customLabel2: Option[List[String]],
customLabel3: Option[List[String]],
customLabel4: Option[List[String]],
gender: Option[List[Gender]],
googleProductCategory0: Option[List[String]],
googleProductCategory1: Option[List[String]],
googleProductCategory2: Option[List[String]],
googleProductCategory3: Option[List[String]],
googleProductCategory4: Option[List[String]],
googleProductCategory5: Option[List[String]],
googleProductCategory6: Option[List[String]],
mediaType: Option[List[MediaType]],
productType0: Option[List[String]],
productType1: Option[List[String]],
productType2: Option[List[String]],
productType3: Option[List[String]],
productType4: Option[List[String]])

object CatalogsRetailFilterValuesMap {
  import DateTimeCodecs._

  implicit val CatalogsRetailFilterValuesMapCodecJson: CodecJson[CatalogsRetailFilterValuesMap] = CodecJson.derive[CatalogsRetailFilterValuesMap]
  implicit val CatalogsRetailFilterValuesMapDecoder: EntityDecoder[CatalogsRetailFilterValuesMap] = jsonOf[CatalogsRetailFilterValuesMap]
  implicit val CatalogsRetailFilterValuesMapEncoder: EntityEncoder[CatalogsRetailFilterValuesMap] = jsonEncoderOf[CatalogsRetailFilterValuesMap]
}
