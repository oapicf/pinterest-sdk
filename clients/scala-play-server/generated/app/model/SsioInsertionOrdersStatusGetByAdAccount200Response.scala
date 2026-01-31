package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ssio_insertion_orders_status_get_by_ad_account_200_response.
  * @param items Insertion orders status by ad acount id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SsioInsertionOrdersStatusGetByAdAccount200Response(
  items: List[SSIOInsertionOrderStatus],
  bookmark: Option[String]
)

object SsioInsertionOrdersStatusGetByAdAccount200Response {
  implicit lazy val ssioInsertionOrdersStatusGetByAdAccount200ResponseJsonFormat: Format[SsioInsertionOrdersStatusGetByAdAccount200Response] = Json.format[SsioInsertionOrdersStatusGetByAdAccount200Response]
}

