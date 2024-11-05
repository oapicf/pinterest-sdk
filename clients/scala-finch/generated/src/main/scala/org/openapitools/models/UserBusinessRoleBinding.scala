package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessAccessUserSummary
import org.openapitools.models.BusinessMemberAssetsSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param assetsUnderscoresummary 
 * @param businessUnderscoreroles The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
 * @param createdUnderscorebyUnderscorebusiness Metadata for the business that created the business relationship.
 * @param createdUnderscorebyUnderscoreuser Metadata for the user that created the business relationship.
 * @param createdUnderscoretime The time the business relationship was created. Returned in milliseconds.
 * @param id Unique identifier of the business member/business partner/employer.
 * @param isUnderscoresharedUnderscorepartner This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
 * @param user Metadata for the business member/business partner/employer.
 */
case class UserBusinessRoleBinding(assetsUnderscoresummary: Option[BusinessMemberAssetsSummary],
                businessUnderscoreroles: Option[Seq[String]],
                createdUnderscorebyUnderscorebusiness: Option[BusinessAccessUserSummary],
                createdUnderscorebyUnderscoreuser: Option[BusinessAccessUserSummary],
                createdUnderscoretime: Option[Int],
                id: Option[String],
                isUnderscoresharedUnderscorepartner: Option[Boolean],
                user: Option[BusinessAccessUserSummary]
                )

object UserBusinessRoleBinding {
    /**
     * Creates the codec for converting UserBusinessRoleBinding from and to JSON.
     */
    implicit val decoder: Decoder[UserBusinessRoleBinding] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserBusinessRoleBinding] = deriveEncoder
}
