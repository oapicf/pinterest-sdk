package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Use this if your feed file requires username and password.
 * @param password The required password for downloading a feed.
 * @param username The required username for downloading a feed.
 */
case class CatalogsFeedCredentials(password: String,
                username: String
                )

object CatalogsFeedCredentials {
    /**
     * Creates the codec for converting CatalogsFeedCredentials from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedCredentials] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedCredentials] = deriveEncoder
}
