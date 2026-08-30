package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import AgeBucketMultipliers._

case class AgeBucketMultipliers (
  /* Age bucket identifier. */
  AGE_BUCKET: Option[TargetingSpecAgeBucket])

object AgeBucketMultipliers {
  import DateTimeCodecs._

  implicit val AgeBucketMultipliersCodecJson: CodecJson[AgeBucketMultipliers] = CodecJson.derive[AgeBucketMultipliers]
  implicit val AgeBucketMultipliersDecoder: EntityDecoder[AgeBucketMultipliers] = jsonOf[AgeBucketMultipliers]
  implicit val AgeBucketMultipliersEncoder: EntityEncoder[AgeBucketMultipliers] = jsonEncoderOf[AgeBucketMultipliers]
}
