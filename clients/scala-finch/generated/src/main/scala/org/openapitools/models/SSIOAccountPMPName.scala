package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id Salesforce id for PMP
 * @param name Display name
 */
case class SSIOAccountPMPName(id: Option[String],
                name: Option[String]
                )

object SSIOAccountPMPName {
    /**
     * Creates the codec for converting SSIOAccountPMPName from and to JSON.
     */
    implicit val decoder: Decoder[SSIOAccountPMPName] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOAccountPMPName] = deriveEncoder
}
