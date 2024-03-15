# WWW::OpenAPIClient::Object::SSIOOrderLine

## Load the model package
```perl
use WWW::OpenAPIClient::Object::SSIOOrderLine;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**salesforce_order_line_id** | **string** | OrderLineId in SFDC | [optional] 
**ads_manager_order_line_id** | **string** | Ads manager OrderLineId | [optional] 
**pin_order_id** | **string** | The pin order id associated with the order line in SFDC | [optional] 
**last_modified_date_time** | **string** | Last modified date. | [optional] 
**start_date** | **DATE** | Start date of the order line. | [optional] 
**end_date** | **DATE** | End date of the order line. | [optional] 
**bill_to_company_name** | **string** | Bill To Company name | [optional] 
**billing_contact_firstname** | **string** | Billing contact first name | [optional] 
**billing_contact_lastname** | **string** | Billing contact last name | [optional] 
**billing_contact_email** | **string** | Billing contact email | [optional] 
**media_contact_email** | **string** | Billing media email | [optional] 
**media_contact_firstname** | **string** | Billing contact first name | [optional] 
**media_contact_lastname** | **string** | Billing contact first name | [optional] 
**currency_info** | [**Currency**](Currency.md) |  | [optional] 
**agency_link** | **string** | Agency link | [optional] 
**po_number** | **string** | The po number | [optional] 
**order_name** | **string** | The order name | [optional] 
**pmp_name** | **string** | The Pinterest marketing partner name | [optional] 
**accepted_terms_id** | **string** | The SFDC id for the terms | [optional] 
**accepted_terms_time** | **string** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**budget_amount** | **double** | If Budget order line, the budget amount. | [optional] 
**estimated_monthly_spend** | **double** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


