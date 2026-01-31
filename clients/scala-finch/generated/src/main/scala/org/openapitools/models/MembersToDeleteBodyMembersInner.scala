package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessRoleForMembers

/**
 * 
 * @param businessUnderscorerole 
 * @param memberUnderscoreid Unique identifier of the member
 */
case class MembersToDeleteBodyMembersInner(businessUnderscorerole: BusinessRoleForMembers,
                memberUnderscoreid: String
                )

object MembersToDeleteBodyMembersInner {
    /**
     * Creates the codec for converting MembersToDeleteBodyMembersInner from and to JSON.
     */
    implicit val decoder: Decoder[MembersToDeleteBodyMembersInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MembersToDeleteBodyMembersInner] = deriveEncoder
}
