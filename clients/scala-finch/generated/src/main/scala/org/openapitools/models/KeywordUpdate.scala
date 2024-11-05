package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id Keyword ID.
 * @param archived Is keyword archived?
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 */
case class KeywordUpdate(id: String,
                archived: Option[Boolean],
                bid: Option[Int]
                )

object KeywordUpdate {
    /**
     * Creates the codec for converting KeywordUpdate from and to JSON.
     */
    implicit val decoder: Decoder[KeywordUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordUpdate] = deriveEncoder
}
