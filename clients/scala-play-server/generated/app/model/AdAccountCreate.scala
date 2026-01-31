package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param name Ad account name.
  * @param ownerUserId Advertiser's owning user ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdAccountCreate(
  country: Option[Country],
  currency: Option[Currency],
  name: Option[String],
  ownerUserId: Option[String]
)

object AdAccountCreate {
  implicit lazy val adAccountCreateJsonFormat: Format[AdAccountCreate] = Json.format[AdAccountCreate]
}

