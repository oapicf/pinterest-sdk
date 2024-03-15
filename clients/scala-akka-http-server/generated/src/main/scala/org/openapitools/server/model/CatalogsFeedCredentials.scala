package org.openapitools.server.model


/**
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 *
 * @param password The required password for downloading a feed. for example: ''null''
 * @param username The required username for downloading a feed. for example: ''null''
*/
final case class CatalogsFeedCredentials (
  password: String,
  username: String
)

