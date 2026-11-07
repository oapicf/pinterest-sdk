package model

import play.api.libs.json._

/**
  * Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdvertiserDefinedEventMappingType(
)

object AdvertiserDefinedEventMappingType {
  implicit lazy val advertiserDefinedEventMappingTypeJsonFormat: Format[AdvertiserDefinedEventMappingType] = Json.format[AdvertiserDefinedEventMappingType]
}

