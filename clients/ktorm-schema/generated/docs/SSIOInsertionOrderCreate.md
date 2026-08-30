
# Table `SSIOInsertionOrderCreate`
(mapped from: SSIOInsertionOrderCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**acceptedTermsId** | accepted_terms_id | text NOT NULL |  | **kotlin.String** | The SFDC id for the terms | 
**billingContactEmail** | billing_contact_email | text NOT NULL |  | **kotlin.String** | The billing contact email | 
**billingContactFirstname** | billing_contact_firstname | text NOT NULL |  | **kotlin.String** | The billing contact first name | 
**billingContactLastname** | billing_contact_lastname | text NOT NULL |  | **kotlin.String** | The billing contact last name | 
**billtoBillingAddressId** | billto_billing_address_id | text NOT NULL |  | **kotlin.String** | The bill-to billing address id | 
**billtoBusinessAddressId** | billto_business_address_id | text NOT NULL |  | **kotlin.String** | The bill-to business address id | 
**billtoCompanyId** | billto_company_id | text NOT NULL |  | **kotlin.String** | The bill-to company id | 
**currencyInfo** | currency_info | long NOT NULL |  | [**Currency**](Currency.md) |  |  [foreignkey]
**mediaContactEmail** | media_contact_email | text NOT NULL |  | **kotlin.String** | The media contact email | 
**mediaContactFirstname** | media_contact_firstname | text NOT NULL |  | **kotlin.String** | The media contact first name | 
**mediaContactLastname** | media_contact_lastname | text NOT NULL |  | **kotlin.String** | The media contact last name | 
**orderLineType** | order_line_type | long NOT NULL |  | [**SSIOOrderLineType**](SSIOOrderLineType.md) | Type can be Budget or Perpetual |  [foreignkey]
**orderName** | order_name | text NOT NULL |  | **kotlin.String** | The order name | 
**pmpId** | pmp_id | text NOT NULL |  | **kotlin.String** | The pmp id | 
**poNumber** | po_number | text NOT NULL |  | **kotlin.String** | The po number | 
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Starting date of time period. Format: YYYY-MM-DD | 
**acceptedTermsTime** | accepted_terms_time | int |  | **kotlin.Int** | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional]
**agencyLink** | agency_link | text |  | **kotlin.String** | URL link for agency |  [optional]
**budgetAmount** | budget_amount | double |  | **kotlin.Double** | If Budget order line, the budget amount. |  [optional]
**endDate** | end_date | text |  | **kotlin.String** | End date of time period. Format: YYYY-MM-DD |  [optional]
**estimatedMonthlySpend** | estimated_monthly_spend | double |  | **kotlin.Double** | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional]
**userEmail** | user_email | text |  | **kotlin.String** | The email of user submitting the insertion order |  [optional]
























