package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOEditInsertionOrderRequest.
  * @param startDate Starting date of time period. Format: YYYY-MM-DD
  * @param endDate End date of time period. Format: YYYY-MM-DD
  * @param poNumber The po number
  * @param budgetAmount If Budget order line, the budget amount.
  * @param billingContactFirstname The billing contact first name
  * @param billingContactLastname The billing contact last name
  * @param billingContactEmail The billing contact email
  * @param mediaContactFirstname The media contact first name
  * @param mediaContactLastname The media contact last name
  * @param mediaContactEmail The media contact email
  * @param agencyLink URL link for agency
  * @param userEmail The email of user submitting the insertion order
  * @param oracleLineId LineId in the Oracle DB
  * @param salesforceOrderId OrderId in SFDC
  * @param salesforceOrderLineId OrderLineId in SFDC
  * @param adsManagerOrderLineId Ads manager OrderLineId
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class SSIOEditInsertionOrderRequest(
  startDate: Option[String],
  endDate: Option[String],
  poNumber: Option[String],
  budgetAmount: Option[BigDecimal],
  billingContactFirstname: Option[String],
  billingContactLastname: Option[String],
  billingContactEmail: Option[String],
  mediaContactFirstname: Option[String],
  mediaContactLastname: Option[String],
  mediaContactEmail: Option[String],
  agencyLink: Option[String],
  userEmail: Option[String],
  oracleLineId: Option[String],
  salesforceOrderId: Option[String],
  salesforceOrderLineId: Option[String],
  adsManagerOrderLineId: Option[String]
)

object SSIOEditInsertionOrderRequest {
  implicit lazy val sSIOEditInsertionOrderRequestJsonFormat: Format[SSIOEditInsertionOrderRequest] = Json.format[SSIOEditInsertionOrderRequest]
}

