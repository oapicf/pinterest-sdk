package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] in BETA. For update, only draft campaigns may update objective type.
 */
case class ObjectiveType()

object ObjectiveType {
    /**
     * Creates the codec for converting ObjectiveType from and to JSON.
     */
    implicit val decoder: Decoder[ObjectiveType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ObjectiveType] = deriveEncoder
}
