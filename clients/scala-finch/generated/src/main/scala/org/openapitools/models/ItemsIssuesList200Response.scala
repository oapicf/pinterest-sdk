package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsItemValidationIssues
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class ItemsIssuesList200Response(items: Seq[CatalogsItemValidationIssues],
                bookmark: Option[String]
                )

object ItemsIssuesList200Response {
    /**
     * Creates the codec for converting ItemsIssuesList200Response from and to JSON.
     */
    implicit val decoder: Decoder[ItemsIssuesList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemsIssuesList200Response] = deriveEncoder
}
