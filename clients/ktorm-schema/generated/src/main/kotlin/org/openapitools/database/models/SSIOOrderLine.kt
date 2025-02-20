/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param salesforceOrderLineId OrderLineId in SFDC
 * @param adsManagerOrderLineId Ads manager OrderLineId
 * @param pinOrderId The pin order id associated with the order line in SFDC
 * @param lastModifiedDateTime Last modified date.
 * @param startDate Start date of the order line.
 * @param endDate End date of the order line.
 * @param billToCompanyName Bill To Company name
 * @param billingContactFirstname Billing contact first name
 * @param billingContactLastname Billing contact last name
 * @param billingContactEmail Billing contact email
 * @param mediaContactEmail Billing media email
 * @param mediaContactFirstname Billing contact first name
 * @param mediaContactLastname Billing contact first name
 * @param currencyInfo 
 * @param agencyLink Agency link
 * @param poNumber The po number
 * @param orderName The order name
 * @param pmpName The Pinterest marketing partner name
 * @param acceptedTermsId The SFDC id for the terms
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
 * @param budgetAmount If Budget order line, the budget amount.
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
 */
object SSIOOrderLines : BaseTable<SSIOOrderLine>("SSIOOrderLine") {
    val salesforceOrderLineId = text("salesforce_order_line_id") /* null */ /* OrderLineId in SFDC */
    val adsManagerOrderLineId = text("ads_manager_order_line_id") /* null */ /* Ads manager OrderLineId */
    val pinOrderId = text("pin_order_id") /* null */ /* The pin order id associated with the order line in SFDC */
    val lastModifiedDateTime = text("last_modified_date_time") /* null */ /* Last modified date. */
    val startDate = date("start_date") /* null */ /* Start date of the order line. */
    val endDate = date("end_date") /* null */ /* End date of the order line. */
    val billToCompanyName = text("bill_to_company_name") /* null */ /* Bill To Company name */
    val billingContactFirstname = text("billing_contact_firstname") /* null */ /* Billing contact first name */
    val billingContactLastname = text("billing_contact_lastname") /* null */ /* Billing contact last name */
    val billingContactEmail = text("billing_contact_email") /* null */ /* Billing contact email */
    val mediaContactEmail = text("media_contact_email") /* null */ /* Billing media email */
    val mediaContactFirstname = text("media_contact_firstname") /* null */ /* Billing contact first name */
    val mediaContactLastname = text("media_contact_lastname") /* null */ /* Billing contact first name */
    val currencyInfo = long("currency_info") /* null */
    val agencyLink = text("agency_link") /* null */ /* Agency link */
    val poNumber = text("po_number") /* null */ /* The po number */
    val orderName = text("order_name") /* null */ /* The order name */
    val pmpName = text("pmp_name") /* null */ /* The Pinterest marketing partner name */
    val acceptedTermsId = text("accepted_terms_id") /* null */ /* The SFDC id for the terms */
    val acceptedTermsTime = text("accepted_terms_time") /* null */ /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    val budgetAmount = decimal("budget_amount") /* null */ /* If Budget order line, the budget amount. */
    val estimatedMonthlySpend = decimal("estimated_monthly_spend") /* null */ /* If Ongoing (perpetual) order line, the estimated monthly spend */

    /**
     * Create an entity of type SSIOOrderLine from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = SSIOOrderLine(
        salesforceOrderLineId = row[salesforceOrderLineId]  /* kotlin.String? */ /* OrderLineId in SFDC */,
        adsManagerOrderLineId = row[adsManagerOrderLineId]  /* kotlin.String? */ /* Ads manager OrderLineId */,
        pinOrderId = row[pinOrderId]  /* kotlin.String? */ /* The pin order id associated with the order line in SFDC */,
        lastModifiedDateTime = row[lastModifiedDateTime]  /* kotlin.String? */ /* Last modified date. */,
        startDate = row[startDate]  /* java.time.LocalDate? */ /* Start date of the order line. */,
        endDate = row[endDate]  /* java.time.LocalDate? */ /* End date of the order line. */,
        billToCompanyName = row[billToCompanyName]  /* kotlin.String? */ /* Bill To Company name */,
        billingContactFirstname = row[billingContactFirstname]  /* kotlin.String? */ /* Billing contact first name */,
        billingContactLastname = row[billingContactLastname]  /* kotlin.String? */ /* Billing contact last name */,
        billingContactEmail = row[billingContactEmail]  /* kotlin.String? */ /* Billing contact email */,
        mediaContactEmail = row[mediaContactEmail]  /* kotlin.String? */ /* Billing media email */,
        mediaContactFirstname = row[mediaContactFirstname]  /* kotlin.String? */ /* Billing contact first name */,
        mediaContactLastname = row[mediaContactLastname]  /* kotlin.String? */ /* Billing contact first name */,
        currencyInfo = Currencys.createEntity(row, withReferences) /* Currency? */,
        agencyLink = row[agencyLink]  /* kotlin.String? */ /* Agency link */,
        poNumber = row[poNumber]  /* kotlin.String? */ /* The po number */,
        orderName = row[orderName]  /* kotlin.String? */ /* The order name */,
        pmpName = row[pmpName]  /* kotlin.String? */ /* The Pinterest marketing partner name */,
        acceptedTermsId = row[acceptedTermsId]  /* kotlin.String? */ /* The SFDC id for the terms */,
        acceptedTermsTime = row[acceptedTermsTime]  /* kotlin.String? */ /* The UTC timestamp (to the nearest sec) of when terms were accepted */,
        budgetAmount = row[budgetAmount]  /* java.math.BigDecimal? */ /* If Budget order line, the budget amount. */,
        estimatedMonthlySpend = row[estimatedMonthlySpend]  /* java.math.BigDecimal? */ /* If Ongoing (perpetual) order line, the estimated monthly spend */
    )

    /**
    * Assign all the columns from the entity of type SSIOOrderLine to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = SSIOOrderLine()
    * database.update(SSIOOrderLines, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: SSIOOrderLine) {
        this.apply {
            set(SSIOOrderLines.salesforceOrderLineId, entity.salesforceOrderLineId)
            set(SSIOOrderLines.adsManagerOrderLineId, entity.adsManagerOrderLineId)
            set(SSIOOrderLines.pinOrderId, entity.pinOrderId)
            set(SSIOOrderLines.lastModifiedDateTime, entity.lastModifiedDateTime)
            set(SSIOOrderLines.startDate, entity.startDate)
            set(SSIOOrderLines.endDate, entity.endDate)
            set(SSIOOrderLines.billToCompanyName, entity.billToCompanyName)
            set(SSIOOrderLines.billingContactFirstname, entity.billingContactFirstname)
            set(SSIOOrderLines.billingContactLastname, entity.billingContactLastname)
            set(SSIOOrderLines.billingContactEmail, entity.billingContactEmail)
            set(SSIOOrderLines.mediaContactEmail, entity.mediaContactEmail)
            set(SSIOOrderLines.mediaContactFirstname, entity.mediaContactFirstname)
            set(SSIOOrderLines.mediaContactLastname, entity.mediaContactLastname)
            set(SSIOOrderLines.currencyInfo, entity.currencyInfo)
            set(SSIOOrderLines.agencyLink, entity.agencyLink)
            set(SSIOOrderLines.poNumber, entity.poNumber)
            set(SSIOOrderLines.orderName, entity.orderName)
            set(SSIOOrderLines.pmpName, entity.pmpName)
            set(SSIOOrderLines.acceptedTermsId, entity.acceptedTermsId)
            set(SSIOOrderLines.acceptedTermsTime, entity.acceptedTermsTime)
            set(SSIOOrderLines.budgetAmount, entity.budgetAmount)
            set(SSIOOrderLines.estimatedMonthlySpend, entity.estimatedMonthlySpend)
        }
    }

}


