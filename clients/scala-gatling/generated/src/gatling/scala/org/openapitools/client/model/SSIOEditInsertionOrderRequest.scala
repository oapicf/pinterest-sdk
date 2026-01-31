
package org.openapitools.client.model


case class SSIOEditInsertionOrderRequest (
    /* URL link for agency */
    _agencyLink: Option[String],
    /* The billing contact email */
    _billingContactEmail: Option[String],
    /* The billing contact first name */
    _billingContactFirstname: Option[String],
    /* The billing contact last name */
    _billingContactLastname: Option[String],
    /* If Budget order line, the budget amount. */
    _budgetAmount: Option[Number],
    /* End date of time period. Format: YYYY-MM-DD */
    _endDate: Option[String],
    /* The media contact email */
    _mediaContactEmail: Option[String],
    /* The media contact first name */
    _mediaContactFirstname: Option[String],
    /* The media contact last name */
    _mediaContactLastname: Option[String],
    /* The po number */
    _poNumber: Option[String],
    /* Starting date of time period. Format: YYYY-MM-DD */
    _startDate: Option[String],
    /* The email of user submitting the insertion order */
    _userEmail: Option[String],
    /* Ads manager OrderLineId */
    _adsManagerOrderLineId: Option[String],
    /* LineId in the Oracle DB */
    _oracleLineId: Option[String],
    /* OrderId in SFDC */
    _salesforceOrderId: Option[String],
    /* OrderLineId in SFDC */
    _salesforceOrderLineId: Option[String]
)
object SSIOEditInsertionOrderRequest {
    def toStringBody(var_agencyLink: Object, var_billingContactEmail: Object, var_billingContactFirstname: Object, var_billingContactLastname: Object, var_budgetAmount: Object, var_endDate: Object, var_mediaContactEmail: Object, var_mediaContactFirstname: Object, var_mediaContactLastname: Object, var_poNumber: Object, var_startDate: Object, var_userEmail: Object, var_adsManagerOrderLineId: Object, var_oracleLineId: Object, var_salesforceOrderId: Object, var_salesforceOrderLineId: Object) =
        s"""
        | {
        | "agencyLink":$var_agencyLink,"billingContactEmail":$var_billingContactEmail,"billingContactFirstname":$var_billingContactFirstname,"billingContactLastname":$var_billingContactLastname,"budgetAmount":$var_budgetAmount,"endDate":$var_endDate,"mediaContactEmail":$var_mediaContactEmail,"mediaContactFirstname":$var_mediaContactFirstname,"mediaContactLastname":$var_mediaContactLastname,"poNumber":$var_poNumber,"startDate":$var_startDate,"userEmail":$var_userEmail,"adsManagerOrderLineId":$var_adsManagerOrderLineId,"oracleLineId":$var_oracleLineId,"salesforceOrderId":$var_salesforceOrderId,"salesforceOrderLineId":$var_salesforceOrderLineId
        | }
        """.stripMargin
}
