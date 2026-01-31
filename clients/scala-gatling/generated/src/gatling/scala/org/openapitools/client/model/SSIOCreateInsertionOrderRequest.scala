
package org.openapitools.client.model


case class SSIOCreateInsertionOrderRequest (
    /* URL link for agency */
    _agencyLink: Option[String],
    /* The billing contact email */
    _billingContactEmail: String,
    /* The billing contact first name */
    _billingContactFirstname: String,
    /* The billing contact last name */
    _billingContactLastname: String,
    /* If Budget order line, the budget amount. */
    _budgetAmount: Option[Number],
    /* End date of time period. Format: YYYY-MM-DD */
    _endDate: Option[String],
    /* The media contact email */
    _mediaContactEmail: String,
    /* The media contact first name */
    _mediaContactFirstname: String,
    /* The media contact last name */
    _mediaContactLastname: String,
    /* The po number */
    _poNumber: String,
    /* Starting date of time period. Format: YYYY-MM-DD */
    _startDate: String,
    /* The email of user submitting the insertion order */
    _userEmail: Option[String],
    /* The SFDC id for the terms */
    _acceptedTermsId: String,
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    _acceptedTermsTime: Option[Integer],
    /* The bill-to billing address id */
    _billtoBillingAddressId: String,
    /* The bill-to business address id */
    _billtoBusinessAddressId: String,
    /* The bill-to company id */
    _billtoCompanyId: String,
    _currencyInfo: Currency,
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    _estimatedMonthlySpend: Option[Number],
    /* Type can be Budget or Perpetual */
    _orderLineType: String,
    /* The order name */
    _orderName: String,
    /* The pmp id */
    _pmpId: String
)
object SSIOCreateInsertionOrderRequest {
    def toStringBody(var_agencyLink: Object, var_billingContactEmail: Object, var_billingContactFirstname: Object, var_billingContactLastname: Object, var_budgetAmount: Object, var_endDate: Object, var_mediaContactEmail: Object, var_mediaContactFirstname: Object, var_mediaContactLastname: Object, var_poNumber: Object, var_startDate: Object, var_userEmail: Object, var_acceptedTermsId: Object, var_acceptedTermsTime: Object, var_billtoBillingAddressId: Object, var_billtoBusinessAddressId: Object, var_billtoCompanyId: Object, var_currencyInfo: Object, var_estimatedMonthlySpend: Object, var_orderLineType: Object, var_orderName: Object, var_pmpId: Object) =
        s"""
        | {
        | "agencyLink":$var_agencyLink,"billingContactEmail":$var_billingContactEmail,"billingContactFirstname":$var_billingContactFirstname,"billingContactLastname":$var_billingContactLastname,"budgetAmount":$var_budgetAmount,"endDate":$var_endDate,"mediaContactEmail":$var_mediaContactEmail,"mediaContactFirstname":$var_mediaContactFirstname,"mediaContactLastname":$var_mediaContactLastname,"poNumber":$var_poNumber,"startDate":$var_startDate,"userEmail":$var_userEmail,"acceptedTermsId":$var_acceptedTermsId,"acceptedTermsTime":$var_acceptedTermsTime,"billtoBillingAddressId":$var_billtoBillingAddressId,"billtoBusinessAddressId":$var_billtoBusinessAddressId,"billtoCompanyId":$var_billtoCompanyId,"currencyInfo":$var_currencyInfo,"estimatedMonthlySpend":$var_estimatedMonthlySpend,"orderLineType":$var_orderLineType,"orderName":$var_orderName,"pmpId":$var_pmpId
        | }
        """.stripMargin
}
