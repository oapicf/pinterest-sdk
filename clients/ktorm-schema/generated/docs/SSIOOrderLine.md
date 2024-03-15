
# Table `SSIOOrderLine`
(mapped from: SSIOOrderLine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**salesforceOrderLineId** | salesforce_order_line_id | text |  | **kotlin.String** | OrderLineId in SFDC |  [optional]
**adsManagerOrderLineId** | ads_manager_order_line_id | text |  | **kotlin.String** | Ads manager OrderLineId |  [optional]
**pinOrderId** | pin_order_id | text |  | **kotlin.String** | The pin order id associated with the order line in SFDC |  [optional]
**lastModifiedDateTime** | last_modified_date_time | text |  | **kotlin.String** | Last modified date. |  [optional]
**startDate** | start_date | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Start date of the order line. |  [optional]
**endDate** | end_date | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | End date of the order line. |  [optional]
**billToCompanyName** | bill_to_company_name | text |  | **kotlin.String** | Bill To Company name |  [optional]
**billingContactFirstname** | billing_contact_firstname | text |  | **kotlin.String** | Billing contact first name |  [optional]
**billingContactLastname** | billing_contact_lastname | text |  | **kotlin.String** | Billing contact last name |  [optional]
**billingContactEmail** | billing_contact_email | text |  | **kotlin.String** | Billing contact email |  [optional]
**mediaContactEmail** | media_contact_email | text |  | **kotlin.String** | Billing media email |  [optional]
**mediaContactFirstname** | media_contact_firstname | text |  | **kotlin.String** | Billing contact first name |  [optional]
**mediaContactLastname** | media_contact_lastname | text |  | **kotlin.String** | Billing contact first name |  [optional]
**currencyInfo** | currency_info | long |  | [**Currency**](Currency.md) |  |  [optional] [foreignkey]
**agencyLink** | agency_link | text |  | **kotlin.String** | Agency link |  [optional]
**poNumber** | po_number | text |  | **kotlin.String** | The po number |  [optional]
**orderName** | order_name | text |  | **kotlin.String** | The order name |  [optional]
**pmpName** | pmp_name | text |  | **kotlin.String** | The Pinterest marketing partner name |  [optional]
**acceptedTermsId** | accepted_terms_id | text |  | **kotlin.String** | The SFDC id for the terms |  [optional]
**acceptedTermsTime** | accepted_terms_time | text |  | **kotlin.String** | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional]
**budgetAmount** | budget_amount | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | If Budget order line, the budget amount. |  [optional]
**estimatedMonthlySpend** | estimated_monthly_spend | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional]
























