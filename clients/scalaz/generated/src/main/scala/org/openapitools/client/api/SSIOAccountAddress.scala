package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOAccountAddress._

case class SSIOAccountAddress (
  /* Address display */
  display: Option[String],
/* Purpose for which the address is used, usually Billing or Businness */
  purpose: Option[String],
/* Salesforce id for address */
  addressId: Option[String],
/* Legal entity for this insertion order */
  orderLegalEntity: Option[String])

object SSIOAccountAddress {
  import DateTimeCodecs._

  implicit val SSIOAccountAddressCodecJson: CodecJson[SSIOAccountAddress] = CodecJson.derive[SSIOAccountAddress]
  implicit val SSIOAccountAddressDecoder: EntityDecoder[SSIOAccountAddress] = jsonOf[SSIOAccountAddress]
  implicit val SSIOAccountAddressEncoder: EntityEncoder[SSIOAccountAddress] = jsonEncoderOf[SSIOAccountAddress]
}
