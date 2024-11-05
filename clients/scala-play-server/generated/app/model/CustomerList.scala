package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerList.
  * @param adAccountId Associated ad account ID.
  * @param createdTime Creation time. Unix timestamp in seconds.
  * @param id Customer list ID.
  * @param name Customer list name.
  * @param numBatches Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
  * @param numRemovedUserRecords Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
  * @param numUploadedUserRecords Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
  * @param status Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
  * @param `type` Always \"customerlist\".
  * @param updatedTime Last update time. Unix timestamp in seconds.
  * @param exceptions Customer list errors
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CustomerList(
  adAccountId: Option[String],
  createdTime: Option[BigDecimal],
  id: Option[String],
  name: Option[String],
  numBatches: Option[BigDecimal],
  numRemovedUserRecords: Option[BigDecimal],
  numUploadedUserRecords: Option[BigDecimal],
  status: Option[CustomerList.Status.Value],
  `type`: Option[String],
  updatedTime: Option[BigDecimal],
  exceptions: Option[JsObject]
)

object CustomerList {
  implicit lazy val customerListJsonFormat: Format[CustomerList] = Json.format[CustomerList]

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val PROCESSING = Value("PROCESSING")
    val READY = Value("READY")
    val TOOSMALL = Value("TOO_SMALL")
    val UPLOADING = Value("UPLOADING")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

