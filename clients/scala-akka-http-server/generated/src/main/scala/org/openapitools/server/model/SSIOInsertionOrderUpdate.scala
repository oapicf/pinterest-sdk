package org.openapitools.server.model


/**
 * Resource create or update operation model.
 *
 * @param adsManagerOrderLineId Ads manager OrderLineId for example: ''null''
 * @param agencyLink URL link for agency for example: ''null''
 * @param billingContactEmail The billing contact email for example: ''null''
 * @param billingContactFirstname The billing contact first name for example: ''null''
 * @param billingContactLastname The billing contact last name for example: ''null''
 * @param budgetAmount If Budget order line, the budget amount. for example: ''null''
 * @param endDate End date of time period. Format: YYYY-MM-DD for example: ''null''
 * @param mediaContactEmail The media contact email for example: ''null''
 * @param mediaContactFirstname The media contact first name for example: ''null''
 * @param mediaContactLastname The media contact last name for example: ''null''
 * @param oracleLineId LineId in the Oracle DB for example: ''null''
 * @param poNumber The po number for example: ''null''
 * @param salesforceOrderId OrderId in SFDC for example: ''null''
 * @param salesforceOrderLineId OrderLineId in SFDC for example: ''null''
 * @param startDate Starting date of time period. Format: YYYY-MM-DD for example: ''null''
 * @param userEmail The email of user submitting the insertion order for example: ''null''
*/
final case class SSIOInsertionOrderUpdate (
  adsManagerOrderLineId: Option[String] = None,
  agencyLink: Option[String] = None,
  billingContactEmail: Option[String] = None,
  billingContactFirstname: Option[String] = None,
  billingContactLastname: Option[String] = None,
  budgetAmount: Option[Double] = None,
  endDate: Option[String] = None,
  mediaContactEmail: Option[String] = None,
  mediaContactFirstname: Option[String] = None,
  mediaContactLastname: Option[String] = None,
  oracleLineId: Option[String] = None,
  poNumber: Option[String] = None,
  salesforceOrderId: Option[String] = None,
  salesforceOrderLineId: Option[String] = None,
  startDate: Option[String] = None,
  userEmail: Option[String] = None
)

