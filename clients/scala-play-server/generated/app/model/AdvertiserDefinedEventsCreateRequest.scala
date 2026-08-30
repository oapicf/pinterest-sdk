package model

import play.api.libs.json._

/**
  * Request body for creating or updating advertiser defined events
  * @param items List of advertiser defined events to create or update
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvertiserDefinedEventsCreateRequest(
  items: List[AdvertiserDefinedEventInput]
)

object AdvertiserDefinedEventsCreateRequest {
  implicit lazy val advertiserDefinedEventsCreateRequestJsonFormat: Format[AdvertiserDefinedEventsCreateRequest] = Json.format[AdvertiserDefinedEventsCreateRequest]
}

