package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ssio_order_lines_get_by_ad_account_200_response.
  * @param items SSIO order lines by ad acount id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class SsioOrderLinesGetByAdAccount200Response(
  items: List[SSIOOrderLine],
  bookmark: Option[String]
)

object SsioOrderLinesGetByAdAccount200Response {
  implicit lazy val ssioOrderLinesGetByAdAccount200ResponseJsonFormat: Format[SsioOrderLinesGetByAdAccount200Response] = Json.format[SsioOrderLinesGetByAdAccount200Response]
}

