package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormCommonPolicyLinksInner._

case class LeadFormCommonPolicyLinksInner (
  /* Policy label for an additional policy link. */
  label: Option[String],
/* Policy link for an additional policy link. */
  link: Option[String])

object LeadFormCommonPolicyLinksInner {
  import DateTimeCodecs._

  implicit val LeadFormCommonPolicyLinksInnerCodecJson: CodecJson[LeadFormCommonPolicyLinksInner] = CodecJson.derive[LeadFormCommonPolicyLinksInner]
  implicit val LeadFormCommonPolicyLinksInnerDecoder: EntityDecoder[LeadFormCommonPolicyLinksInner] = jsonOf[LeadFormCommonPolicyLinksInner]
  implicit val LeadFormCommonPolicyLinksInnerEncoder: EntityEncoder[LeadFormCommonPolicyLinksInner] = jsonEncoderOf[LeadFormCommonPolicyLinksInner]
}
