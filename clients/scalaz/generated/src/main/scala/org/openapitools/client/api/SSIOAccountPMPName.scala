package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOAccountPMPName._

case class SSIOAccountPMPName (
  /* Display name */
  name: Option[String],
/* Salesforce id for PMP */
  id: Option[String])

object SSIOAccountPMPName {
  import DateTimeCodecs._

  implicit val SSIOAccountPMPNameCodecJson: CodecJson[SSIOAccountPMPName] = CodecJson.derive[SSIOAccountPMPName]
  implicit val SSIOAccountPMPNameDecoder: EntityDecoder[SSIOAccountPMPName] = jsonOf[SSIOAccountPMPName]
  implicit val SSIOAccountPMPNameEncoder: EntityEncoder[SSIOAccountPMPName] = jsonEncoderOf[SSIOAccountPMPName]
}
