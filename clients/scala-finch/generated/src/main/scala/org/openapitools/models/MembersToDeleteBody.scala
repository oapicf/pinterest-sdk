package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MembersToDeleteBodyMembersInner
import scala.collection.immutable.Seq

/**
 * 
 * @param members 
 */
case class MembersToDeleteBody(members: Seq[MembersToDeleteBodyMembersInner]
                )

object MembersToDeleteBody {
    /**
     * Creates the codec for converting MembersToDeleteBody from and to JSON.
     */
    implicit val decoder: Decoder[MembersToDeleteBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[MembersToDeleteBody] = deriveEncoder
}
