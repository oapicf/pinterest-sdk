package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidOptionsAgeBucketMultipliers._

case class BidOptionsAgeBucketMultipliers (
  `18_24`: Option[BigDecimal],
`25_34`: Option[BigDecimal],
`35_44`: Option[BigDecimal],
`45_49`: Option[BigDecimal],
`50_54`: Option[BigDecimal],
`55_64`: Option[BigDecimal],
`65`: Option[BigDecimal])

object BidOptionsAgeBucketMultipliers {
  import DateTimeCodecs._

  implicit val BidOptionsAgeBucketMultipliersCodecJson: CodecJson[BidOptionsAgeBucketMultipliers] = CodecJson.derive[BidOptionsAgeBucketMultipliers]
  implicit val BidOptionsAgeBucketMultipliersDecoder: EntityDecoder[BidOptionsAgeBucketMultipliers] = jsonOf[BidOptionsAgeBucketMultipliers]
  implicit val BidOptionsAgeBucketMultipliersEncoder: EntityEncoder[BidOptionsAgeBucketMultipliers] = jsonEncoderOf[BidOptionsAgeBucketMultipliers]
}
