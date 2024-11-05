package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. <br> - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 */
case class BusinessRole()

object BusinessRole {
    /**
     * Creates the codec for converting BusinessRole from and to JSON.
     */
    implicit val decoder: Decoder[BusinessRole] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessRole] = deriveEncoder
}
