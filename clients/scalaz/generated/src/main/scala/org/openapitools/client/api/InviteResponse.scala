package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteResponse._

case class InviteResponse (
  assetsSummary: Option[InviteAssetsSummary],
/* The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. */
  businessRoles: Option[List[String]],
/* Metadata for the business that created the invite/request. */
  createdByBusiness: Option[BusinessAccessUserSummary],
/* Metadata for the user that created the invite/request. */
  createdByUser: Option[BusinessAccessUserSummary],
/* The time the invite/request was created. Returned in milliseconds. */
  createdTime: Option[Integer],
/* Unique identifier of the invite/request. */
  id: Option[String],
inviteData: Option[BaseInviteDataResponseInviteData],
/* Indicates whether the invite/request was received. */
  isReceivedInvite: Option[Boolean],
/* Metadata for the member/partner that was sent the invite/request. */
  user: Option[BusinessAccessUserSummary])

object InviteResponse {
  import DateTimeCodecs._

  implicit val InviteResponseCodecJson: CodecJson[InviteResponse] = CodecJson.derive[InviteResponse]
  implicit val InviteResponseDecoder: EntityDecoder[InviteResponse] = jsonOf[InviteResponse]
  implicit val InviteResponseEncoder: EntityEncoder[InviteResponse] = jsonEncoderOf[InviteResponse]
}
