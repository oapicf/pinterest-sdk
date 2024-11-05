package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessRoleForMembers

/**
 * Single instance of a business member to have its role updated
 * @param businessUnderscorerole 
 * @param memberUnderscoreid Unique identifier of the member
 */
case class UpdateMemberBusinessRoleBody(businessUnderscorerole: BusinessRoleForMembers,
                memberUnderscoreid: String
                )

object UpdateMemberBusinessRoleBody {
    /**
     * Creates the codec for converting UpdateMemberBusinessRoleBody from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMemberBusinessRoleBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMemberBusinessRoleBody] = deriveEncoder
}
