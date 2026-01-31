package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupUint32Criteria

/**
 * 
 * @param CUSTOMUnderscoreNUMBERUnderscore4 
 */
case class CustomNumber4Filter(CUSTOMUnderscoreNUMBERUnderscore4: CatalogsProductGroupUint32Criteria
                )

object CustomNumber4Filter {
    /**
     * Creates the codec for converting CustomNumber4Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomNumber4Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomNumber4Filter] = deriveEncoder
}
