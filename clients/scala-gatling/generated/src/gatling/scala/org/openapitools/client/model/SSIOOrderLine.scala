
package org.openapitools.client.model

import java.time.LocalDate

case class SSIOOrderLine (
    /* The SFDC id for the terms */
    _acceptedTermsId: Option[String],
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    _acceptedTermsTime: Option[String],
    /* Ads manager OrderLineId */
    _adsManagerOrderLineId: Option[String],
    /* Agency link */
    _agencyLink: Option[String],
    /* Bill To Company name */
    _billToCompanyName: Option[String],
    /* Billing contact email */
    _billingContactEmail: Option[String],
    /* Billing contact first name */
    _billingContactFirstname: Option[String],
    /* Billing contact last name */
    _billingContactLastname: Option[String],
    /* If Budget order line, the budget amount. */
    _budgetAmount: Option[Number],
    _currencyInfo: Option[Currency],
    /* End date of the order line. */
    _endDate: Option[LocalDate],
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    _estimatedMonthlySpend: Option[Number],
    /* Last modified date. */
    _lastModifiedDateTime: Option[String],
    /* Billing media email */
    _mediaContactEmail: Option[String],
    /* Billing contact first name */
    _mediaContactFirstname: Option[String],
    /* Billing contact first name */
    _mediaContactLastname: Option[String],
    /* The order name */
    _orderName: Option[String],
    /* The pin order id associated with the order line in SFDC */
    _pinOrderId: Option[String],
    /* The Pinterest marketing partner name */
    _pmpName: Option[String],
    /* The po number */
    _poNumber: Option[String],
    /* OrderLineId in SFDC */
    _salesforceOrderLineId: Option[String],
    /* Start date of the order line. */
    _startDate: Option[LocalDate]
)
object SSIOOrderLine {
    def toStringBody(var_acceptedTermsId: Object, var_acceptedTermsTime: Object, var_adsManagerOrderLineId: Object, var_agencyLink: Object, var_billToCompanyName: Object, var_billingContactEmail: Object, var_billingContactFirstname: Object, var_billingContactLastname: Object, var_budgetAmount: Object, var_currencyInfo: Object, var_endDate: Object, var_estimatedMonthlySpend: Object, var_lastModifiedDateTime: Object, var_mediaContactEmail: Object, var_mediaContactFirstname: Object, var_mediaContactLastname: Object, var_orderName: Object, var_pinOrderId: Object, var_pmpName: Object, var_poNumber: Object, var_salesforceOrderLineId: Object, var_startDate: Object) =
        s"""
        | {
        | "acceptedTermsId":$var_acceptedTermsId,"acceptedTermsTime":$var_acceptedTermsTime,"adsManagerOrderLineId":$var_adsManagerOrderLineId,"agencyLink":$var_agencyLink,"billToCompanyName":$var_billToCompanyName,"billingContactEmail":$var_billingContactEmail,"billingContactFirstname":$var_billingContactFirstname,"billingContactLastname":$var_billingContactLastname,"budgetAmount":$var_budgetAmount,"currencyInfo":$var_currencyInfo,"endDate":$var_endDate,"estimatedMonthlySpend":$var_estimatedMonthlySpend,"lastModifiedDateTime":$var_lastModifiedDateTime,"mediaContactEmail":$var_mediaContactEmail,"mediaContactFirstname":$var_mediaContactFirstname,"mediaContactLastname":$var_mediaContactLastname,"orderName":$var_orderName,"pinOrderId":$var_pinOrderId,"pmpName":$var_pmpName,"poNumber":$var_poNumber,"salesforceOrderLineId":$var_salesforceOrderLineId,"startDate":$var_startDate
        | }
        """.stripMargin
}
