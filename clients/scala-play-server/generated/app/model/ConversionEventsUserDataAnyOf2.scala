package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionEventsUserData_anyOf_2.
  * @param em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  * @param hashedMaids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  * @param clientIpAddress The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
  * @param clientUserAgent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ConversionEventsUserDataAnyOf2(
  em: Option[List[String]],
  hashedMaids: Option[List[String]],
  clientIpAddress: String,
  clientUserAgent: String
)

object ConversionEventsUserDataAnyOf2 {
  implicit lazy val conversionEventsUserDataAnyOf2JsonFormat: Format[ConversionEventsUserDataAnyOf2] = Json.format[ConversionEventsUserDataAnyOf2]
}

