package model

import play.api.libs.json._

/**
  * Advertiser defined event
  * @param mappedConversionType Standard type mapped to ADE for optimization
  * @param name Raw string name of the event, usually logged as raw_event_name in our dataset
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvertiserDefinedEvent(
  mappedConversionType: Option[ConversionTagTypeOptimal],
  name: Option[String]
)

object AdvertiserDefinedEvent {
  implicit lazy val advertiserDefinedEventJsonFormat: Format[AdvertiserDefinedEvent] = Json.format[AdvertiserDefinedEvent]
}

