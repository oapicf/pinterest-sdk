package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormPolicyLink._

case class LeadFormPolicyLink (
  /* Policy label for an additional policy link. */
  label: Option[String],
/* Policy link for an additional policy link. */
  link: Option[String])

object LeadFormPolicyLink {
  import DateTimeCodecs._

  implicit val LeadFormPolicyLinkCodecJson: CodecJson[LeadFormPolicyLink] = CodecJson.derive[LeadFormPolicyLink]
  implicit val LeadFormPolicyLinkDecoder: EntityDecoder[LeadFormPolicyLink] = jsonOf[LeadFormPolicyLink]
  implicit val LeadFormPolicyLinkEncoder: EntityEncoder[LeadFormPolicyLink] = jsonEncoderOf[LeadFormPolicyLink]
}
