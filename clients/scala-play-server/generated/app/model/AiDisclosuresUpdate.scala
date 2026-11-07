package model

import play.api.libs.json._

/**
  * AI disclosure declarations the creator has made about the Pin.
  * @param values List of AI disclosure declarations the creator has made about this Pin.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AiDisclosuresUpdate(
  values: Option[List[AiDisclosureItem]]
)

object AiDisclosuresUpdate {
  implicit lazy val aiDisclosuresUpdateJsonFormat: Format[AiDisclosuresUpdate] = Json.format[AiDisclosuresUpdate]
}

