
# Table `SSIOCreateInsertionOrderRequest`
(mapped from: SSIOCreateInsertionOrderRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**billingContactEmail** | billing_contact_email | text NOT NULL |  | **kotlin.String** | The billing contact email | 
**billingContactFirstname** | billing_contact_firstname | text NOT NULL |  | **kotlin.String** | The billing contact first name | 
**billingContactLastname** | billing_contact_lastname | text NOT NULL |  | **kotlin.String** | The billing contact last name | 
**mediaContactEmail** | media_contact_email | text NOT NULL |  | **kotlin.String** | The media contact email | 
**mediaContactFirstname** | media_contact_firstname | text NOT NULL |  | **kotlin.String** | The media contact first name | 
**mediaContactLastname** | media_contact_lastname | text NOT NULL |  | **kotlin.String** | The media contact last name | 
**poNumber** | po_number | text NOT NULL |  | **kotlin.String** | The po number | 
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Starting date of time period. Format: YYYY-MM-DD | 
**acceptedTermsId** | accepted_terms_id | text NOT NULL |  | **kotlin.String** | The SFDC id for the terms | 
**billtoBillingAddressId** | billto_billing_address_id | text NOT NULL |  | **kotlin.String** | The bill-to billing address id | 
**billtoBusinessAddressId** | billto_business_address_id | text NOT NULL |  | **kotlin.String** | The bill-to business address id | 
**billtoCompanyId** | billto_company_id | text NOT NULL |  | **kotlin.String** | The bill-to company id | 
**currencyInfo** | currency_info | long NOT NULL |  | [**Currency**](Currency.md) |  |  [foreignkey]
**orderLineType** | order_line_type | text NOT NULL |  | [**order_line_type**](#OrderLineType) | Type can be Budget or Perpetual | 
**orderName** | order_name | text NOT NULL |  | **kotlin.String** | The order name | 
**pmpId** | pmp_id | text NOT NULL |  | **kotlin.String** | The pmp id | 
**agencyLink** | agency_link | text |  | **kotlin.String** | URL link for agency |  [optional]
**budgetAmount** | budget_amount | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | If Budget order line, the budget amount. |  [optional]
**endDate** | end_date | text |  | **kotlin.String** | End date of time period. Format: YYYY-MM-DD |  [optional]
**userEmail** | user_email | text |  | **kotlin.String** | The email of user submitting the insertion order |  [optional]
**acceptedTermsTime** | accepted_terms_time | int |  | **kotlin.Int** | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional]
**estimatedMonthlySpend** | estimated_monthly_spend | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional]
























