package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOAccountItem._

case class SSIOAccountItem (
  /* Salesforce id for billto_info */
  id: Option[String],
/* Salesforce id for IO Terms and Conditions */
  ioTermsId: Option[String],
/* Salesforce text for IO Terms and Conditions */
  ioTerms: Option[String],
/* Salesforce id for US Terms and Conditions */
  usTermsId: Option[String],
/* Salesforce text for US Terms and Conditions */
  usTerms: Option[String],
/* Salesforce id for Rest of the World Terms and Conditions */
  rowTermsId: Option[String],
/* Salesforce text for Rest of the World Terms and Conditions */
  rowTerms: Option[String],
/* Insertion Order Type - Pinterest Paper or Agency Paper */
  ioType: Option[String],
/* Address information that is associated with this account. */
  addresses: Option[List[SSIOAccountAddress]])

object SSIOAccountItem {
  import DateTimeCodecs._

  implicit val SSIOAccountItemCodecJson: CodecJson[SSIOAccountItem] = CodecJson.derive[SSIOAccountItem]
  implicit val SSIOAccountItemDecoder: EntityDecoder[SSIOAccountItem] = jsonOf[SSIOAccountItem]
  implicit val SSIOAccountItemEncoder: EntityEncoder[SSIOAccountItem] = jsonEncoderOf[SSIOAccountItem]
}
