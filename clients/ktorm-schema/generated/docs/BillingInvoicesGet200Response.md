
# Table `billing_invoices_get_200_response`
(mapped from: BillingInvoicesGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BillingInvoice&gt;**](BillingInvoice.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BillingInvoicesGet200ResponseBillingInvoice`**
(mapped from: BillingInvoicesGet200ResponseBillingInvoice)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
billingInvoicesGet200Response | billingInvoicesGet200Response | long | | kotlin.Long | Primary Key | *one*
billingInvoice | billingInvoice | long | | kotlin.Long | Foreign Key | *many*




