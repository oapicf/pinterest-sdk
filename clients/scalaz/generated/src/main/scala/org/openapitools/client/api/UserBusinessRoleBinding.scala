package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserBusinessRoleBinding._

case class UserBusinessRoleBinding (
  assetsSummary: Option[BusinessMemberAssetsSummary],
/* The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. */
  businessRoles: Option[List[String]],
/* Metadata for the business that created the business relationship. */
  createdByBusiness: Option[BusinessAccessUserSummary],
/* Metadata for the user that created the business relationship. */
  createdByUser: Option[BusinessAccessUserSummary],
/* The time the business relationship was created. Returned in milliseconds. */
  createdTime: Option[Integer],
/* Unique identifier of the business member/business partner/employer. */
  id: Option[String],
/* This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to. */
  isSharedPartner: Option[Boolean],
/* Metadata for the business member/business partner/employer. */
  user: Option[BusinessAccessUserSummary])

object UserBusinessRoleBinding {
  import DateTimeCodecs._

  implicit val UserBusinessRoleBindingCodecJson: CodecJson[UserBusinessRoleBinding] = CodecJson.derive[UserBusinessRoleBinding]
  implicit val UserBusinessRoleBindingDecoder: EntityDecoder[UserBusinessRoleBinding] = jsonOf[UserBusinessRoleBinding]
  implicit val UserBusinessRoleBindingEncoder: EntityEncoder[UserBusinessRoleBinding] = jsonEncoderOf[UserBusinessRoleBinding]
}
