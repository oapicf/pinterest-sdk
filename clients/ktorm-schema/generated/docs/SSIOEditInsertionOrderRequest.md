
# Table `SSIOEditInsertionOrderRequest`
(mapped from: SSIOEditInsertionOrderRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**startDate** | start_date | text |  | **kotlin.String** | Starting date of time period. Format: YYYY-MM-DD |  [optional]
**endDate** | end_date | text |  | **kotlin.String** | End date of time period. Format: YYYY-MM-DD |  [optional]
**poNumber** | po_number | text |  | **kotlin.String** | The po number |  [optional]
**budgetAmount** | budget_amount | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | If Budget order line, the budget amount. |  [optional]
**billingContactFirstname** | billing_contact_firstname | text |  | **kotlin.String** | The billing contact first name |  [optional]
**billingContactLastname** | billing_contact_lastname | text |  | **kotlin.String** | The billing contact last name |  [optional]
**billingContactEmail** | billing_contact_email | text |  | **kotlin.String** | The billing contact email |  [optional]
**mediaContactFirstname** | media_contact_firstname | text |  | **kotlin.String** | The media contact first name |  [optional]
**mediaContactLastname** | media_contact_lastname | text |  | **kotlin.String** | The media contact last name |  [optional]
**mediaContactEmail** | media_contact_email | text |  | **kotlin.String** | The media contact email |  [optional]
**agencyLink** | agency_link | text |  | **kotlin.String** | URL link for agency |  [optional]
**userEmail** | user_email | text |  | **kotlin.String** | The email of user submitting the insertion order |  [optional]
**oracleLineId** | oracle_line_id | text |  | **kotlin.String** | LineId in the Oracle DB |  [optional]
**salesforceOrderId** | salesforce_order_id | text |  | **kotlin.String** | OrderId in SFDC |  [optional]
**salesforceOrderLineId** | salesforce_order_line_id | text |  | **kotlin.String** | OrderLineId in SFDC |  [optional]
**adsManagerOrderLineId** | ads_manager_order_line_id | text |  | **kotlin.String** | Ads manager OrderLineId |  [optional]


















