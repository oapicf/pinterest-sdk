package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOAccount._

case class SSIOAccount (
  /* An array of Salesforce account information that includes address, io terms, etc. */
  billtoInfos: Option[List[SSIOAccountItem]],
/* Advertiser eligible to update order lines */
  canEdit: Option[Boolean],
currency: Option[String],
/* Advertiser eligible to create order lines */
  eligible: Option[Boolean],
/* Error indicator from Salesforce which could be \"No Error\" */
  error: Option[String],
pmpNames: Option[List[SSIOAccountPMPName]])

object SSIOAccount {
  import DateTimeCodecs._

  implicit val SSIOAccountCodecJson: CodecJson[SSIOAccount] = CodecJson.derive[SSIOAccount]
  implicit val SSIOAccountDecoder: EntityDecoder[SSIOAccount] = jsonOf[SSIOAccount]
  implicit val SSIOAccountEncoder: EntityEncoder[SSIOAccount] = jsonEncoderOf[SSIOAccount]
}
