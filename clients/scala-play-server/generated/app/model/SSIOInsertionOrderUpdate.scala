package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  * @param adsManagerOrderLineId Ads manager OrderLineId
  * @param agencyLink URL link for agency
  * @param billingContactEmail The billing contact email
  * @param billingContactFirstname The billing contact first name
  * @param billingContactLastname The billing contact last name
  * @param budgetAmount If Budget order line, the budget amount.
  * @param endDate End date of time period. Format: YYYY-MM-DD
  * @param mediaContactEmail The media contact email
  * @param mediaContactFirstname The media contact first name
  * @param mediaContactLastname The media contact last name
  * @param oracleLineId LineId in the Oracle DB
  * @param poNumber The po number
  * @param salesforceOrderId OrderId in SFDC
  * @param salesforceOrderLineId OrderLineId in SFDC
  * @param startDate Starting date of time period. Format: YYYY-MM-DD
  * @param userEmail The email of user submitting the insertion order
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SSIOInsertionOrderUpdate(
  adsManagerOrderLineId: Option[String],
  agencyLink: Option[String],
  billingContactEmail: Option[String],
  billingContactFirstname: Option[String],
  billingContactLastname: Option[String],
  budgetAmount: Option[Double],
  endDate: Option[String],
  mediaContactEmail: Option[String],
  mediaContactFirstname: Option[String],
  mediaContactLastname: Option[String],
  oracleLineId: Option[String],
  poNumber: Option[String],
  salesforceOrderId: Option[String],
  salesforceOrderLineId: Option[String],
  startDate: Option[String],
  userEmail: Option[String]
)

object SSIOInsertionOrderUpdate {
  implicit lazy val sSIOInsertionOrderUpdateJsonFormat: Format[SSIOInsertionOrderUpdate] = Json.format[SSIOInsertionOrderUpdate]
}

