# ssio_create_insertion_order_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agency_link** | **char \*** | URL link for agency | [optional] 
**billing_contact_email** | **char \*** | The billing contact email | 
**billing_contact_firstname** | **char \*** | The billing contact first name | 
**billing_contact_lastname** | **char \*** | The billing contact last name | 
**budget_amount** | **double** | If Budget order line, the budget amount. | [optional] 
**end_date** | **char \*** | End date of time period. Format: YYYY-MM-DD | [optional] 
**media_contact_email** | **char \*** | The media contact email | 
**media_contact_firstname** | **char \*** | The media contact first name | 
**media_contact_lastname** | **char \*** | The media contact last name | 
**po_number** | **char \*** | The po number | 
**start_date** | **char \*** | Starting date of time period. Format: YYYY-MM-DD | 
**user_email** | **char \*** | The email of user submitting the insertion order | [optional] 
**accepted_terms_id** | **char \*** | The SFDC id for the terms | 
**accepted_terms_time** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**billto_billing_address_id** | **char \*** | The bill-to billing address id | 
**billto_business_address_id** | **char \*** | The bill-to business address id | 
**billto_company_id** | **char \*** | The bill-to company id | 
**currency_info** | **currency_t \*** |  | 
**estimated_monthly_spend** | **double** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**order_line_type** | **pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e** | Type can be Budget or Perpetual | 
**order_name** | **char \*** | The order name | 
**pmp_id** | **char \*** | The pmp id | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


