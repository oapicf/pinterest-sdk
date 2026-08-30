package org.openapitools.server.model


/**
 * Processing record for an advertiser defined event operation
 *
 * @param exceptions List of exception messages if the operation failed for example: ''null''
 * @param name Name of the advertiser defined event for example: ''newsletter_signup''
 * @param status Processing status (success or failure) for example: ''success''
*/
final case class AdvertiserDefinedEventProcessingRecord (
  exceptions: Option[Seq[String]] = None,
  name: String,
  status: String
)

