package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteBusinessRoleBinding._

case class InviteBusinessRoleBinding (
  /* Unique identifier for the business that created the invite/request. */
  createdByBusinessId: Option[String],
/* Unique identifier for the user that created the invite/request. */
  createdByUserId: Option[String],
/* Metadata for the user that updated the invite/request. */
  user: Option[BusinessAccessUserSummary],
/* Unique identifier of the invite/request. */
  id: Option[String],
inviteData: Option[BaseInviteDataResponseInviteData],
/* Indicates whether the invite/request was received. */
  isReceivedInvite: Option[Boolean])

object InviteBusinessRoleBinding {
  import DateTimeCodecs._

  implicit val InviteBusinessRoleBindingCodecJson: CodecJson[InviteBusinessRoleBinding] = CodecJson.derive[InviteBusinessRoleBinding]
  implicit val InviteBusinessRoleBindingDecoder: EntityDecoder[InviteBusinessRoleBinding] = jsonOf[InviteBusinessRoleBinding]
  implicit val InviteBusinessRoleBindingEncoder: EntityEncoder[InviteBusinessRoleBinding] = jsonEncoderOf[InviteBusinessRoleBinding]
}
