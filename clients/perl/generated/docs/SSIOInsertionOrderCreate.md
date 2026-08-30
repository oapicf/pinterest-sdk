# WWW::OpenAPIClient::Object::SSIOInsertionOrderCreate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::SSIOInsertionOrderCreate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_terms_id** | **string** | The SFDC id for the terms | 
**accepted_terms_time** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**agency_link** | **string** | URL link for agency | [optional] 
**billing_contact_email** | **string** | The billing contact email | 
**billing_contact_firstname** | **string** | The billing contact first name | 
**billing_contact_lastname** | **string** | The billing contact last name | 
**billto_billing_address_id** | **string** | The bill-to billing address id | 
**billto_business_address_id** | **string** | The bill-to business address id | 
**billto_company_id** | **string** | The bill-to company id | 
**budget_amount** | **double** | If Budget order line, the budget amount. | [optional] 
**currency_info** | [**Currency**](Currency.md) |  | 
**end_date** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**estimated_monthly_spend** | **double** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**media_contact_email** | **string** | The media contact email | 
**media_contact_firstname** | **string** | The media contact first name | 
**media_contact_lastname** | **string** | The media contact last name | 
**order_line_type** | [**SSIOOrderLineType**](SSIOOrderLineType.md) | Type can be Budget or Perpetual | 
**order_name** | **string** | The order name | 
**pmp_id** | **string** | The pmp id | 
**po_number** | **string** | The po number | 
**start_date** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**user_email** | **string** | The email of user submitting the insertion order | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


