package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountCreateRequest.
  * @param name Ad Account name.
  * @param ownerUserId Advertiser's owning user ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdAccountCreateRequest(
  country: Option[Country],
  name: Option[String],
  ownerUserId: Option[String]
)

object AdAccountCreateRequest {
  implicit lazy val adAccountCreateRequestJsonFormat: Format[AdAccountCreateRequest] = Json.format[AdAccountCreateRequest]
}

