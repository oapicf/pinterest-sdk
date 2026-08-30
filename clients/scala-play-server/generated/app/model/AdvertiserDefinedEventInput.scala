package model

import play.api.libs.json._

/**
  * Advertiser defined event input for create/update operations
  * @param mappedConversionType Pinterest standard event type to map this custom event to for campaign optimization and reporting
  * @param name Raw string name of the event
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvertiserDefinedEventInput(
  mappedConversionType: AdvertiserDefinedEventMappingType,
  name: String
)

object AdvertiserDefinedEventInput {
  implicit lazy val advertiserDefinedEventInputJsonFormat: Format[AdvertiserDefinedEventInput] = Json.format[AdvertiserDefinedEventInput]
}

