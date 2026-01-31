package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdAccountOwner
import org.openapitools.models.BusinessAccessRole
import org.openapitools.models.Country
import org.openapitools.models.Currency
import scala.collection.immutable.Seq

/**
 * 
 * @param country 
 * @param createdUnderscoretime  Creation time. Unix timestamp in seconds.
 * @param currency 
 * @param id 
 * @param name Ad account name.
 * @param owner Ad account owner
 * @param permissions 
 * @param updatedUnderscoretime 
 */
case class AdAccount(country: Option[Country],
                createdUnderscoretime: Option[Int],
                currency: Option[Currency],
                id: String,
                name: Option[String],
                owner: Option[AdAccountOwner],
                permissions: Option[Seq[BusinessAccessRole]],
                updatedUnderscoretime: Option[Int]
                )

object AdAccount {
    /**
     * Creates the codec for converting AdAccount from and to JSON.
     */
    implicit val decoder: Decoder[AdAccount] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccount] = deriveEncoder
}
