
package org.openapitools.client.model


case class SSIOCreateInsertionOrderRequest (
    /* Starting date of time period. Format: YYYY-MM-DD */
    _startDate: String,
    /* End date of time period. Format: YYYY-MM-DD */
    _endDate: Option[String],
    /* The po number */
    _poNumber: String,
    /* If Budget order line, the budget amount. */
    _budgetAmount: Option[Number],
    /* The billing contact first name */
    _billingContactFirstname: String,
    /* The billing contact last name */
    _billingContactLastname: String,
    /* The billing contact email */
    _billingContactEmail: String,
    /* The media contact first name */
    _mediaContactFirstname: String,
    /* The media contact last name */
    _mediaContactLastname: String,
    /* The media contact email */
    _mediaContactEmail: String,
    /* URL link for agency */
    _agencyLink: Option[String],
    /* The email of user submitting the insertion order */
    _userEmail: Option[String],
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    _acceptedTermsTime: Option[Integer],
    /* The pmp id */
    _pmpId: String,
    /* The order name */
    _orderName: String,
    /* Type can be Budget or Perpetual */
    _orderLineType: String,
    /* The SFDC id for the terms */
    _acceptedTermsId: String,
    /* The bill-to company id */
    _billtoCompanyId: String,
    /* The bill-to business address id */
    _billtoBusinessAddressId: String,
    /* The bill-to billing address id */
    _billtoBillingAddressId: String,
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    _estimatedMonthlySpend: Option[Number],
    _currencyInfo: Currency
)
object SSIOCreateInsertionOrderRequest {
    def toStringBody(var_startDate: Object, var_endDate: Object, var_poNumber: Object, var_budgetAmount: Object, var_billingContactFirstname: Object, var_billingContactLastname: Object, var_billingContactEmail: Object, var_mediaContactFirstname: Object, var_mediaContactLastname: Object, var_mediaContactEmail: Object, var_agencyLink: Object, var_userEmail: Object, var_acceptedTermsTime: Object, var_pmpId: Object, var_orderName: Object, var_orderLineType: Object, var_acceptedTermsId: Object, var_billtoCompanyId: Object, var_billtoBusinessAddressId: Object, var_billtoBillingAddressId: Object, var_estimatedMonthlySpend: Object, var_currencyInfo: Object) =
        s"""
        | {
        | "startDate":$var_startDate,"endDate":$var_endDate,"poNumber":$var_poNumber,"budgetAmount":$var_budgetAmount,"billingContactFirstname":$var_billingContactFirstname,"billingContactLastname":$var_billingContactLastname,"billingContactEmail":$var_billingContactEmail,"mediaContactFirstname":$var_mediaContactFirstname,"mediaContactLastname":$var_mediaContactLastname,"mediaContactEmail":$var_mediaContactEmail,"agencyLink":$var_agencyLink,"userEmail":$var_userEmail,"acceptedTermsTime":$var_acceptedTermsTime,"pmpId":$var_pmpId,"orderName":$var_orderName,"orderLineType":$var_orderLineType,"acceptedTermsId":$var_acceptedTermsId,"billtoCompanyId":$var_billtoCompanyId,"billtoBusinessAddressId":$var_billtoBusinessAddressId,"billtoBillingAddressId":$var_billtoBillingAddressId,"estimatedMonthlySpend":$var_estimatedMonthlySpend,"currencyInfo":$var_currencyInfo
        | }
        """.stripMargin
}
