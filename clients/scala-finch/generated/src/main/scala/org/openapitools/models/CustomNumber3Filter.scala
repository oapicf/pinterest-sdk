package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupUint32Criteria

/**
 * 
 * @param CUSTOMUnderscoreNUMBERUnderscore3 
 */
case class CustomNumber3Filter(CUSTOMUnderscoreNUMBERUnderscore3: CatalogsProductGroupUint32Criteria
                )

object CustomNumber3Filter {
    /**
     * Creates the codec for converting CustomNumber3Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomNumber3Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomNumber3Filter] = deriveEncoder
}
