
# Table `BillingInvoice`
(mapped from: BillingInvoice)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The ID of the ad account this invoice belongs to |  [optional]
**adAccountName** | ad_account_name | text |  | **kotlin.String** | The name of the ad account this invoice belongs to |  [optional]
**amountBilledMicroCurrency** | amount_billed_micro_currency | int |  | **kotlin.Int** | The amount billed in this invoice. Denoted in micro currency |  [optional]
**amountDiscountMicroCurrency** | amount_discount_micro_currency | int |  | **kotlin.Int** | The discount in this invoice. Denoted in micro currency |  [optional]
**amountNetMicroCurrency** | amount_net_micro_currency | int |  | **kotlin.Int** | The net amount in this invoice. Denoted in micro currency |  [optional]
**amountTaxMicroCurrency** | amount_tax_micro_currency | int |  | **kotlin.Int** | The tax in this invoice. Denoted in micro currency |  [optional]
**billToCountry** | bill_to_country | text |  | **kotlin.String** | The country of the bill to address |  [optional]
**billingPeriodEndDate** | billing_period_end_date | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | The end date of the billing period. Format: YYYY-MM-DD |  [optional]
**billingPeriodStartDate** | billing_period_start_date | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | The start date of the billing period. Format: YYYY-MM-DD |  [optional]
**currency** | currency | long |  | [**Currency**](Currency.md) |  |  [optional] [foreignkey]
**documentType** | document_type | long |  | [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document |  [optional] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier for the billing invoice |  [optional]
**invoiceDueDate** | invoice_due_date | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | The date the invoice is due. Format: YYYY-MM-DD |  [optional]
**paymentTerms** | payment_terms | text |  | **kotlin.String** | The payment terms of the invoice |  [optional]
**status** | status | long |  | [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice |  [optional] [foreignkey]

















