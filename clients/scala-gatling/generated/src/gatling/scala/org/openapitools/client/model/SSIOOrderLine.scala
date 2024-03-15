
package org.openapitools.client.model

import java.time.LocalDate

case class SSIOOrderLine (
    /* OrderLineId in SFDC */
    _salesforceOrderLineId: Option[String],
    /* Ads manager OrderLineId */
    _adsManagerOrderLineId: Option[String],
    /* The pin order id associated with the order line in SFDC */
    _pinOrderId: Option[String],
    /* Last modified date. */
    _lastModifiedDateTime: Option[String],
    /* Start date of the order line. */
    _startDate: Option[LocalDate],
    /* End date of the order line. */
    _endDate: Option[LocalDate],
    /* Bill To Company name */
    _billToCompanyName: Option[String],
    /* Billing contact first name */
    _billingContactFirstname: Option[String],
    /* Billing contact last name */
    _billingContactLastname: Option[String],
    /* Billing contact email */
    _billingContactEmail: Option[String],
    /* Billing media email */
    _mediaContactEmail: Option[String],
    /* Billing contact first name */
    _mediaContactFirstname: Option[String],
    /* Billing contact first name */
    _mediaContactLastname: Option[String],
    _currencyInfo: Option[Currency],
    /* Agency link */
    _agencyLink: Option[String],
    /* The po number */
    _poNumber: Option[String],
    /* The order name */
    _orderName: Option[String],
    /* The Pinterest marketing partner name */
    _pmpName: Option[String],
    /* The SFDC id for the terms */
    _acceptedTermsId: Option[String],
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    _acceptedTermsTime: Option[String],
    /* If Budget order line, the budget amount. */
    _budgetAmount: Option[Number],
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    _estimatedMonthlySpend: Option[Number]
)
object SSIOOrderLine {
    def toStringBody(var_salesforceOrderLineId: Object, var_adsManagerOrderLineId: Object, var_pinOrderId: Object, var_lastModifiedDateTime: Object, var_startDate: Object, var_endDate: Object, var_billToCompanyName: Object, var_billingContactFirstname: Object, var_billingContactLastname: Object, var_billingContactEmail: Object, var_mediaContactEmail: Object, var_mediaContactFirstname: Object, var_mediaContactLastname: Object, var_currencyInfo: Object, var_agencyLink: Object, var_poNumber: Object, var_orderName: Object, var_pmpName: Object, var_acceptedTermsId: Object, var_acceptedTermsTime: Object, var_budgetAmount: Object, var_estimatedMonthlySpend: Object) =
        s"""
        | {
        | "salesforceOrderLineId":$var_salesforceOrderLineId,"adsManagerOrderLineId":$var_adsManagerOrderLineId,"pinOrderId":$var_pinOrderId,"lastModifiedDateTime":$var_lastModifiedDateTime,"startDate":$var_startDate,"endDate":$var_endDate,"billToCompanyName":$var_billToCompanyName,"billingContactFirstname":$var_billingContactFirstname,"billingContactLastname":$var_billingContactLastname,"billingContactEmail":$var_billingContactEmail,"mediaContactEmail":$var_mediaContactEmail,"mediaContactFirstname":$var_mediaContactFirstname,"mediaContactLastname":$var_mediaContactLastname,"currencyInfo":$var_currencyInfo,"agencyLink":$var_agencyLink,"poNumber":$var_poNumber,"orderName":$var_orderName,"pmpName":$var_pmpName,"acceptedTermsId":$var_acceptedTermsId,"acceptedTermsTime":$var_acceptedTermsTime,"budgetAmount":$var_budgetAmount,"estimatedMonthlySpend":$var_estimatedMonthlySpend
        | }
        """.stripMargin
}
