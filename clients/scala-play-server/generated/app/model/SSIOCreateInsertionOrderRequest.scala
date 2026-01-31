package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOCreateInsertionOrderRequest.
  * @param agencyLink URL link for agency
  * @param billingContactEmail The billing contact email
  * @param billingContactFirstname The billing contact first name
  * @param billingContactLastname The billing contact last name
  * @param budgetAmount If Budget order line, the budget amount.
  * @param endDate End date of time period. Format: YYYY-MM-DD
  * @param mediaContactEmail The media contact email
  * @param mediaContactFirstname The media contact first name
  * @param mediaContactLastname The media contact last name
  * @param poNumber The po number
  * @param startDate Starting date of time period. Format: YYYY-MM-DD
  * @param userEmail The email of user submitting the insertion order
  * @param acceptedTermsId The SFDC id for the terms
  * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
  * @param billtoBillingAddressId The bill-to billing address id
  * @param billtoBusinessAddressId The bill-to business address id
  * @param billtoCompanyId The bill-to company id
  * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
  * @param orderLineType Type can be Budget or Perpetual
  * @param orderName The order name
  * @param pmpId The pmp id
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOCreateInsertionOrderRequest(
  agencyLink: Option[String],
  billingContactEmail: String,
  billingContactFirstname: String,
  billingContactLastname: String,
  budgetAmount: Option[BigDecimal],
  endDate: Option[String],
  mediaContactEmail: String,
  mediaContactFirstname: String,
  mediaContactLastname: String,
  poNumber: String,
  startDate: String,
  userEmail: Option[String],
  acceptedTermsId: String,
  acceptedTermsTime: Option[Int],
  billtoBillingAddressId: String,
  billtoBusinessAddressId: String,
  billtoCompanyId: String,
  currencyInfo: Currency,
  estimatedMonthlySpend: Option[BigDecimal],
  orderLineType: SSIOCreateInsertionOrderRequest.OrderLineType.Value,
  orderName: String,
  pmpId: String
  additionalProperties: 
)

object SSIOCreateInsertionOrderRequest {
  implicit lazy val sSIOCreateInsertionOrderRequestJsonFormat: Format[SSIOCreateInsertionOrderRequest] = {
    val realJsonFormat = Json.format[SSIOCreateInsertionOrderRequest]
    val declaredPropNames = Set("agencyLink", "billingContactEmail", "billingContactFirstname", "billingContactLastname", "budgetAmount", "endDate", "mediaContactEmail", "mediaContactFirstname", "mediaContactLastname", "poNumber", "startDate", "userEmail", "acceptedTermsId", "acceptedTermsTime", "billtoBillingAddressId", "billtoBusinessAddressId", "billtoCompanyId", "currencyInfo", "estimatedMonthlySpend", "orderLineType", "orderName", "pmpId")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { sSIOCreateInsertionOrderRequest =>
        val jsObj = realJsonFormat.writes(sSIOCreateInsertionOrderRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object OrderLineType extends Enumeration {
    val BUDGET = Value("BUDGET")
    val PERPETUALS = Value("PERPETUALS")

    type OrderLineType = Value
    implicit lazy val OrderLineTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

