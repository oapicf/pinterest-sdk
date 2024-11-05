package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountCreateRequest.
  * @param name Ad Account name.
  * @param ownerUserId Advertiser's owning user ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountCreateRequest(
  country: Option[Country],
  name: Option[String],
  ownerUserId: Option[String]
)

object AdAccountCreateRequest {
  implicit lazy val adAccountCreateRequestJsonFormat: Format[AdAccountCreateRequest] = Json.format[AdAccountCreateRequest]
}

