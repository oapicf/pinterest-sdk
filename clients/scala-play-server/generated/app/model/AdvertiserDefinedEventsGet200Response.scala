package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for advertiser_defined_events_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdvertiserDefinedEventsGet200Response(
  items: List[AdvertiserDefinedEvent]
)

object AdvertiserDefinedEventsGet200Response {
  implicit lazy val advertiserDefinedEventsGet200ResponseJsonFormat: Format[AdvertiserDefinedEventsGet200Response] = Json.format[AdvertiserDefinedEventsGet200Response]
}

