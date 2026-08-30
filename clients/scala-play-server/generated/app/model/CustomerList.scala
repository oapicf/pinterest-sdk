package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerList.
  * @param adAccountId Associated ad account ID.
  * @param createdTime Creation time. Unix timestamp in seconds.
  * @param exceptions Customer list errors.
  * @param id Customer list ID.
  * @param isNca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
  * @param name Customer list name.
  * @param numBatches Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
  * @param numRemovedUserRecords Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
  * @param numUploadedUserRecords Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
  * @param status Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  * @param `type` Always `customerlist`.
  * @param updatedTime Last update time. Unix timestamp in seconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerList(
  adAccountId: Option[String],
  createdTime: Option[BigDecimal],
  exceptions: Option[JsObject],
  id: String,
  isNca: Option[Boolean],
  name: String,
  numBatches: Option[BigDecimal],
  numRemovedUserRecords: Option[BigDecimal],
  numUploadedUserRecords: Option[BigDecimal],
  status: Option[CustomerListStatus],
  `type`: Option[String],
  updatedTime: Option[BigDecimal]
)

object CustomerList {
  implicit lazy val customerListJsonFormat: Format[CustomerList] = Json.format[CustomerList]
}

