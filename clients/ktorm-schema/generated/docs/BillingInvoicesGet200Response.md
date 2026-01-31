
# Table `billing_invoices_get_200_response`
(mapped from: BillingInvoicesGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BillingInvoiceResponse&gt;**](BillingInvoiceResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BillingInvoicesGet200ResponseBillingInvoiceResponse`**
(mapped from: BillingInvoicesGet200ResponseBillingInvoiceResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
billingInvoicesGet200Response | billingInvoicesGet200Response | long | | kotlin.Long | Primary Key | *one*
billingInvoiceResponse | billingInvoiceResponse | long | | kotlin.Long | Foreign Key | *many*




