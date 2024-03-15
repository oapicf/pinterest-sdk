# WWW::OpenAPIClient::Object::SSIOCreateInsertionOrderRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::SSIOCreateInsertionOrderRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**end_date** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**po_number** | **string** | The po number | 
**budget_amount** | **double** | If Budget order line, the budget amount. | [optional] 
**billing_contact_firstname** | **string** | The billing contact first name | 
**billing_contact_lastname** | **string** | The billing contact last name | 
**billing_contact_email** | **string** | The billing contact email | 
**media_contact_firstname** | **string** | The media contact first name | 
**media_contact_lastname** | **string** | The media contact last name | 
**media_contact_email** | **string** | The media contact email | 
**agency_link** | **string** | URL link for agency | [optional] 
**user_email** | **string** | The email of user submitting the insertion order | [optional] 
**accepted_terms_time** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**pmp_id** | **string** | The pmp id | 
**order_name** | **string** | The order name | 
**order_line_type** | **string** | Type can be Budget or Perpetual | 
**accepted_terms_id** | **string** | The SFDC id for the terms | 
**billto_company_id** | **string** | The bill-to company id | 
**billto_business_address_id** | **string** | The bill-to business address id | 
**billto_billing_address_id** | **string** | The bill-to billing address id | 
**estimated_monthly_spend** | **double** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**currency_info** | [**Currency**](Currency.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


