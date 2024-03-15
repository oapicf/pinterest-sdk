# SsioOrderLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**salesforce_order_line_id** | **String** | OrderLineId in SFDC | [optional] [default to None]
**ads_manager_order_line_id** | **String** | Ads manager OrderLineId | [optional] [default to None]
**pin_order_id** | **String** | The pin order id associated with the order line in SFDC | [optional] [default to None]
**last_modified_date_time** | **String** | Last modified date. | [optional] [default to None]
**start_date** | [***chrono::naive::NaiveDate**](date.md) | Start date of the order line. | [optional] [default to None]
**end_date** | [***chrono::naive::NaiveDate**](date.md) | End date of the order line. | [optional] [default to None]
**bill_to_company_name** | **String** | Bill To Company name | [optional] [default to None]
**billing_contact_firstname** | **String** | Billing contact first name | [optional] [default to None]
**billing_contact_lastname** | **String** | Billing contact last name | [optional] [default to None]
**billing_contact_email** | **String** | Billing contact email | [optional] [default to None]
**media_contact_email** | **String** | Billing media email | [optional] [default to None]
**media_contact_firstname** | **String** | Billing contact first name | [optional] [default to None]
**media_contact_lastname** | **String** | Billing contact first name | [optional] [default to None]
**currency_info** | [***models::Currency**](Currency.md) |  | [optional] [default to None]
**agency_link** | **String** | Agency link | [optional] [default to None]
**po_number** | **String** | The po number | [optional] [default to None]
**order_name** | **String** | The order name | [optional] [default to None]
**pmp_name** | **String** | The Pinterest marketing partner name | [optional] [default to None]
**accepted_terms_id** | **String** | The SFDC id for the terms | [optional] [default to None]
**accepted_terms_time** | **String** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] [default to None]
**budget_amount** | **f64** | If Budget order line, the budget amount. | [optional] [default to None]
**estimated_monthly_spend** | **f64** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


