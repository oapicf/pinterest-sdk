package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupUint32Criteria

/**
 * 
 * @param CUSTOMUnderscoreNUMBERUnderscore0 
 */
case class CustomNumber0Filter(CUSTOMUnderscoreNUMBERUnderscore0: CatalogsProductGroupUint32Criteria
                )

object CustomNumber0Filter {
    /**
     * Creates the codec for converting CustomNumber0Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomNumber0Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomNumber0Filter] = deriveEncoder
}
