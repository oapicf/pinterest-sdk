package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOAccountResponse._

case class SSIOAccountResponse (
  /* Advertiser eligible to create order lines */
  eligible: Option[Boolean],
/* Advertiser eligible to update order lines */
  canEdit: Option[Boolean],
/* An array of Salesforce account information that includes address, io terms, etc. */
  billtoInfos: Option[List[SSIOAccountItem]],
currency: Option[String],
pmpNames: Option[List[SSIOAccountPMPName]],
/* Error indicator from Salesforce which could be \"No Error\" */
  error: Option[String])

object SSIOAccountResponse {
  import DateTimeCodecs._

  implicit val SSIOAccountResponseCodecJson: CodecJson[SSIOAccountResponse] = CodecJson.derive[SSIOAccountResponse]
  implicit val SSIOAccountResponseDecoder: EntityDecoder[SSIOAccountResponse] = jsonOf[SSIOAccountResponse]
  implicit val SSIOAccountResponseEncoder: EntityEncoder[SSIOAccountResponse] = jsonEncoderOf[SSIOAccountResponse]
}
