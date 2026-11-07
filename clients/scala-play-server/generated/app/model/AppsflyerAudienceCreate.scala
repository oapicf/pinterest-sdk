package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param name The name of the audience
  * @param platform The platform of the audience
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AppsflyerAudienceCreate(
  name: String,
  platform: AppsflyerPlatform
)

object AppsflyerAudienceCreate {
  implicit lazy val appsflyerAudienceCreateJsonFormat: Format[AppsflyerAudienceCreate] = Json.format[AppsflyerAudienceCreate]
}

