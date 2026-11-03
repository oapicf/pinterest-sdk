package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ssio_order_lines_get_by_ad_account_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SsioOrderLinesGetByAdAccount200Response(
  bookmark: Option[String],
  items: List[SSIOOrderLine]
)

object SsioOrderLinesGetByAdAccount200Response {
  implicit lazy val ssioOrderLinesGetByAdAccount200ResponseJsonFormat: Format[SsioOrderLinesGetByAdAccount200Response] = Json.format[SsioOrderLinesGetByAdAccount200Response]
}

