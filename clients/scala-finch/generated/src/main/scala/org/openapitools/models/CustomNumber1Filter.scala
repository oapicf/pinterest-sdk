package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupUint32Criteria

/**
 * 
 * @param CUSTOMUnderscoreNUMBERUnderscore1 
 */
case class CustomNumber1Filter(CUSTOMUnderscoreNUMBERUnderscore1: CatalogsProductGroupUint32Criteria
                )

object CustomNumber1Filter {
    /**
     * Creates the codec for converting CustomNumber1Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomNumber1Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomNumber1Filter] = deriveEncoder
}
