package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.KeywordUpdate
import scala.collection.immutable.Seq

/**
 * 
 * @param keywords Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]
 */
case class KeywordUpdateBody(keywords: Seq[KeywordUpdate]
                )

object KeywordUpdateBody {
    /**
     * Creates the codec for converting KeywordUpdateBody from and to JSON.
     */
    implicit val decoder: Decoder[KeywordUpdateBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordUpdateBody] = deriveEncoder
}
