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
availability: Option[List[Availability]],
brand: Option[List[String]],
condition: Option[List[Condition]],
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
  sealed trait List[Availability]

  object List[Availability] {
    def toList[Availability](s: String): Option[List[Availability]] = s match {
      case _ => None
    }

    def fromList[Availability](x: List[Availability]): String = x match {
    }
  }

  implicit val List[Availability]EnumEncoder: EncodeJson[List[Availability]] =
    EncodeJson[List[Availability]](is => StringEncodeJson(List[Availability].fromList[Availability](is)))

  implicit val List[Availability]EnumDecoder: DecodeJson[List[Availability]] =
    DecodeJson.optionDecoder[List[Availability]](n => n.string.flatMap(jStr => List[Availability].toList[Availability](jStr)), "List[Availability] failed to de-serialize")
  sealed trait List[Condition]

  object List[Condition] {
    def toList[Condition](s: String): Option[List[Condition]] = s match {
      case _ => None
    }

    def fromList[Condition](x: List[Condition]): String = x match {
    }
  }

  implicit val List[Condition]EnumEncoder: EncodeJson[List[Condition]] =
    EncodeJson[List[Condition]](is => StringEncodeJson(List[Condition].fromList[Condition](is)))

  implicit val List[Condition]EnumDecoder: DecodeJson[List[Condition]] =
    DecodeJson.optionDecoder[List[Condition]](n => n.string.flatMap(jStr => List[Condition].toList[Condition](jStr)), "List[Condition] failed to de-serialize")
  sealed trait List[Gender]

  object List[Gender] {
    def toList[Gender](s: String): Option[List[Gender]] = s match {
      case _ => None
    }

    def fromList[Gender](x: List[Gender]): String = x match {
    }
  }

  implicit val List[Gender]EnumEncoder: EncodeJson[List[Gender]] =
    EncodeJson[List[Gender]](is => StringEncodeJson(List[Gender].fromList[Gender](is)))

  implicit val List[Gender]EnumDecoder: DecodeJson[List[Gender]] =
    DecodeJson.optionDecoder[List[Gender]](n => n.string.flatMap(jStr => List[Gender].toList[Gender](jStr)), "List[Gender] failed to de-serialize")
  sealed trait List[MediaType]

  object List[MediaType] {
    def toList[MediaType](s: String): Option[List[MediaType]] = s match {
      case _ => None
    }

    def fromList[MediaType](x: List[MediaType]): String = x match {
    }
  }

  implicit val List[MediaType]EnumEncoder: EncodeJson[List[MediaType]] =
    EncodeJson[List[MediaType]](is => StringEncodeJson(List[MediaType].fromList[MediaType](is)))

  implicit val List[MediaType]EnumDecoder: DecodeJson[List[MediaType]] =
    DecodeJson.optionDecoder[List[MediaType]](n => n.string.flatMap(jStr => List[MediaType].toList[MediaType](jStr)), "List[MediaType] failed to de-serialize")

  implicit val CatalogsRetailFilterValuesMapCodecJson: CodecJson[CatalogsRetailFilterValuesMap] = CodecJson.derive[CatalogsRetailFilterValuesMap]
  implicit val CatalogsRetailFilterValuesMapDecoder: EntityDecoder[CatalogsRetailFilterValuesMap] = jsonOf[CatalogsRetailFilterValuesMap]
  implicit val CatalogsRetailFilterValuesMapEncoder: EntityEncoder[CatalogsRetailFilterValuesMap] = jsonEncoderOf[CatalogsRetailFilterValuesMap]
}
