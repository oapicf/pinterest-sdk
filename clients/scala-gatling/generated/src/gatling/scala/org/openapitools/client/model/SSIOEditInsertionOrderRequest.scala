
package org.openapitools.client.model


case class SSIOEditInsertionOrderRequest (
    /* Starting date of time period. Format: YYYY-MM-DD */
    _startDate: Option[String],
    /* End date of time period. Format: YYYY-MM-DD */
    _endDate: Option[String],
    /* The po number */
    _poNumber: Option[String],
    /* If Budget order line, the budget amount. */
    _budgetAmount: Option[Number],
    /* The billing contact first name */
    _billingContactFirstname: Option[String],
    /* The billing contact last name */
    _billingContactLastname: Option[String],
    /* The billing contact email */
    _billingContactEmail: Option[String],
    /* The media contact first name */
    _mediaContactFirstname: Option[String],
    /* The media contact last name */
    _mediaContactLastname: Option[String],
    /* The media contact email */
    _mediaContactEmail: Option[String],
    /* URL link for agency */
    _agencyLink: Option[String],
    /* The email of user submitting the insertion order */
    _userEmail: Option[String],
    /* LineId in the Oracle DB */
    _oracleLineId: Option[String],
    /* OrderId in SFDC */
    _salesforceOrderId: Option[String],
    /* OrderLineId in SFDC */
    _salesforceOrderLineId: Option[String],
    /* Ads manager OrderLineId */
    _adsManagerOrderLineId: Option[String]
)
object SSIOEditInsertionOrderRequest {
    def toStringBody(var_startDate: Object, var_endDate: Object, var_poNumber: Object, var_budgetAmount: Object, var_billingContactFirstname: Object, var_billingContactLastname: Object, var_billingContactEmail: Object, var_mediaContactFirstname: Object, var_mediaContactLastname: Object, var_mediaContactEmail: Object, var_agencyLink: Object, var_userEmail: Object, var_oracleLineId: Object, var_salesforceOrderId: Object, var_salesforceOrderLineId: Object, var_adsManagerOrderLineId: Object) =
        s"""
        | {
        | "startDate":$var_startDate,"endDate":$var_endDate,"poNumber":$var_poNumber,"budgetAmount":$var_budgetAmount,"billingContactFirstname":$var_billingContactFirstname,"billingContactLastname":$var_billingContactLastname,"billingContactEmail":$var_billingContactEmail,"mediaContactFirstname":$var_mediaContactFirstname,"mediaContactLastname":$var_mediaContactLastname,"mediaContactEmail":$var_mediaContactEmail,"agencyLink":$var_agencyLink,"userEmail":$var_userEmail,"oracleLineId":$var_oracleLineId,"salesforceOrderId":$var_salesforceOrderId,"salesforceOrderLineId":$var_salesforceOrderLineId,"adsManagerOrderLineId":$var_adsManagerOrderLineId
        | }
        """.stripMargin
}
