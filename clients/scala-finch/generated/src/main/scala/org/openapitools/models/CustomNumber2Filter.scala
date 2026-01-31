package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupUint32Criteria

/**
 * 
 * @param CUSTOMUnderscoreNUMBERUnderscore2 
 */
case class CustomNumber2Filter(CUSTOMUnderscoreNUMBERUnderscore2: CatalogsProductGroupUint32Criteria
                )

object CustomNumber2Filter {
    /**
     * Creates the codec for converting CustomNumber2Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomNumber2Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomNumber2Filter] = deriveEncoder
}
