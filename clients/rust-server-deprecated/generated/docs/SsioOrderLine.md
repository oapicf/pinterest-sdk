# SsioOrderLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_terms_id** | **swagger::Nullable<String>** | The SFDC id for the terms | [optional] [default to None]
**accepted_terms_time** | **swagger::Nullable<String>** | The UTC timestamp (to the nearest second) when terms were accepted. | [optional] [default to None]
**ads_manager_order_line_id** | **swagger::Nullable<String>** | Ads manager order line id | [optional] [default to None]
**agency_link** | **swagger::Nullable<String>** | Agency link | [optional] [default to None]
**bill_to_company_name** | **swagger::Nullable<String>** | Bill-to company name | [optional] [default to None]
**billing_contact_email** | **swagger::Nullable<String>** | Billing contact email | [optional] [default to None]
**billing_contact_firstname** | **swagger::Nullable<String>** | Billing contact first name | [optional] [default to None]
**billing_contact_lastname** | **swagger::Nullable<String>** | Billing contact last name | [optional] [default to None]
**budget_amount** | **swagger::Nullable<f64>** | If budget order line, the budget amount. | [optional] [default to None]
**currency_info** | [***models::Currency**](Currency.md) |  | [optional] [default to None]
**end_date** | [***swagger::Nullable<chrono::naive::NaiveDate>**](date.md) | End date of the order line. | [optional] [default to None]
**estimated_monthly_spend** | **swagger::Nullable<f64>** | If ongoing (perpetual) order line, the estimated monthly spend. | [optional] [default to None]
**last_modified_date_time** | **swagger::Nullable<String>** | Last modified date. | [optional] [default to None]
**media_contact_email** | **swagger::Nullable<String>** | Billing media email | [optional] [default to None]
**media_contact_firstname** | **swagger::Nullable<String>** | Billing media contact first name | [optional] [default to None]
**media_contact_lastname** | **swagger::Nullable<String>** | Billing media contact last name | [optional] [default to None]
**order_name** | **swagger::Nullable<String>** | The order name | [optional] [default to None]
**pin_order_id** | **swagger::Nullable<String>** | The pin order id associated with the order line in SFDC | [optional] [default to None]
**pmp_name** | **swagger::Nullable<String>** | The Pinterest marketing partner name | [optional] [default to None]
**po_number** | **swagger::Nullable<String>** | The PO number | [optional] [default to None]
**salesforce_order_line_id** | **swagger::Nullable<String>** | Order line id in SFDC | [optional] [default to None]
**start_date** | [***swagger::Nullable<chrono::naive::NaiveDate>**](date.md) | Start date of the order line. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


