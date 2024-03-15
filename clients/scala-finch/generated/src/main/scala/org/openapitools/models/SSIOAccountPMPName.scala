package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name Display name
 * @param id Salesforce id for PMP
 */
case class SSIOAccountPMPName(name: Option[String],
                id: Option[String]
                )

object SSIOAccountPMPName {
    /**
     * Creates the codec for converting SSIOAccountPMPName from and to JSON.
     */
    implicit val decoder: Decoder[SSIOAccountPMPName] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOAccountPMPName] = deriveEncoder
}
