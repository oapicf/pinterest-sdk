
package org.openapitools.client.model


case class SSIOInsertionOrderCreate (
    /* The SFDC id for the terms */
    _acceptedTermsId: String,
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    _acceptedTermsTime: Option[Integer],
    /* URL link for agency */
    _agencyLink: Option[String],
    /* The billing contact email */
    _billingContactEmail: String,
    /* The billing contact first name */
    _billingContactFirstname: String,
    /* The billing contact last name */
    _billingContactLastname: String,
    /* The bill-to billing address id */
    _billtoBillingAddressId: String,
    /* The bill-to business address id */
    _billtoBusinessAddressId: String,
    /* The bill-to company id */
    _billtoCompanyId: String,
    /* If Budget order line, the budget amount. */
    _budgetAmount: Option[Double],
    _currencyInfo: Currency,
    /* End date of time period. Format: YYYY-MM-DD */
    _endDate: Option[String],
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    _estimatedMonthlySpend: Option[Double],
    /* The media contact email */
    _mediaContactEmail: String,
    /* The media contact first name */
    _mediaContactFirstname: String,
    /* The media contact last name */
    _mediaContactLastname: String,
    /* Type can be Budget or Perpetual */
    _orderLineType: SSIOOrderLineType,
    /* The order name */
    _orderName: String,
    /* The pmp id */
    _pmpId: String,
    /* The po number */
    _poNumber: String,
    /* Starting date of time period. Format: YYYY-MM-DD */
    _startDate: String,
    /* The email of user submitting the insertion order */
    _userEmail: Option[String]
)
object SSIOInsertionOrderCreate {
    def toStringBody(var_acceptedTermsId: Object, var_acceptedTermsTime: Object, var_agencyLink: Object, var_billingContactEmail: Object, var_billingContactFirstname: Object, var_billingContactLastname: Object, var_billtoBillingAddressId: Object, var_billtoBusinessAddressId: Object, var_billtoCompanyId: Object, var_budgetAmount: Object, var_currencyInfo: Object, var_endDate: Object, var_estimatedMonthlySpend: Object, var_mediaContactEmail: Object, var_mediaContactFirstname: Object, var_mediaContactLastname: Object, var_orderLineType: Object, var_orderName: Object, var_pmpId: Object, var_poNumber: Object, var_startDate: Object, var_userEmail: Object) =
        s"""
        | {
        | "acceptedTermsId":$var_acceptedTermsId,"acceptedTermsTime":$var_acceptedTermsTime,"agencyLink":$var_agencyLink,"billingContactEmail":$var_billingContactEmail,"billingContactFirstname":$var_billingContactFirstname,"billingContactLastname":$var_billingContactLastname,"billtoBillingAddressId":$var_billtoBillingAddressId,"billtoBusinessAddressId":$var_billtoBusinessAddressId,"billtoCompanyId":$var_billtoCompanyId,"budgetAmount":$var_budgetAmount,"currencyInfo":$var_currencyInfo,"endDate":$var_endDate,"estimatedMonthlySpend":$var_estimatedMonthlySpend,"mediaContactEmail":$var_mediaContactEmail,"mediaContactFirstname":$var_mediaContactFirstname,"mediaContactLastname":$var_mediaContactLastname,"orderLineType":$var_orderLineType,"orderName":$var_orderName,"pmpId":$var_pmpId,"poNumber":$var_poNumber,"startDate":$var_startDate,"userEmail":$var_userEmail
        | }
        """.stripMargin
}
