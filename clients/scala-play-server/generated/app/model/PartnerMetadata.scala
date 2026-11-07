package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PartnerMetadata.
  * @param subscriberKey Text field value that uniquely identifies a subscriber.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PartnerMetadata(
  subscriberKey: Option[String]
)

object PartnerMetadata {
  implicit lazy val partnerMetadataJsonFormat: Format[PartnerMetadata] = Json.format[PartnerMetadata]
}

