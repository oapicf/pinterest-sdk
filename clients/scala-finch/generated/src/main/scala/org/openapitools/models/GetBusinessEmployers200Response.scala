package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserBusinessRoleBinding
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of employers.
 * @param bookmark 
 */
case class GetBusinessEmployers200Response(items: Seq[UserBusinessRoleBinding],
                bookmark: Option[String]
                )

object GetBusinessEmployers200Response {
    /**
     * Creates the codec for converting GetBusinessEmployers200Response from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessEmployers200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessEmployers200Response] = deriveEncoder
}
