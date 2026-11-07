package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ssio_insertion_orders_status_get_by_ad_account_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SsioInsertionOrdersStatusGetByAdAccount200Response(
  bookmark: Option[String],
  items: List[SSIOInsertionOrderStatus]
)

object SsioInsertionOrdersStatusGetByAdAccount200Response {
  implicit lazy val ssioInsertionOrdersStatusGetByAdAccount200ResponseJsonFormat: Format[SsioInsertionOrdersStatusGetByAdAccount200Response] = Json.format[SsioInsertionOrdersStatusGetByAdAccount200Response]
}

