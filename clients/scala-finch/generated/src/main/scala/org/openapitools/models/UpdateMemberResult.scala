package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param businessUnderscorerole The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 * @param memberUnderscoreid Unique identifier of the business member.
 */
case class UpdateMemberResult(businessUnderscorerole: Option[String],
                memberUnderscoreid: Option[String]
                )

object UpdateMemberResult {
    /**
     * Creates the codec for converting UpdateMemberResult from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMemberResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMemberResult] = deriveEncoder
}
