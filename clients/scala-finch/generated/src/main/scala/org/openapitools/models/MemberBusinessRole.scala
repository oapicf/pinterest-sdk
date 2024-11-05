package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. <br> - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
 */
case class MemberBusinessRole()

object MemberBusinessRole {
    /**
     * Creates the codec for converting MemberBusinessRole from and to JSON.
     */
    implicit val decoder: Decoder[MemberBusinessRole] = deriveDecoder
    implicit val encoder: ObjectEncoder[MemberBusinessRole] = deriveEncoder
}
