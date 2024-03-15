# ssio_create_insertion_order_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **char \*** | Starting date of time period. Format: YYYY-MM-DD | 
**end_date** | **char \*** | End date of time period. Format: YYYY-MM-DD | [optional] 
**po_number** | **char \*** | The po number | 
**budget_amount** | **double** | If Budget order line, the budget amount. | [optional] 
**billing_contact_firstname** | **char \*** | The billing contact first name | 
**billing_contact_lastname** | **char \*** | The billing contact last name | 
**billing_contact_email** | **char \*** | The billing contact email | 
**media_contact_firstname** | **char \*** | The media contact first name | 
**media_contact_lastname** | **char \*** | The media contact last name | 
**media_contact_email** | **char \*** | The media contact email | 
**agency_link** | **char \*** | URL link for agency | [optional] 
**user_email** | **char \*** | The email of user submitting the insertion order | [optional] 
**accepted_terms_time** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**pmp_id** | **char \*** | The pmp id | 
**order_name** | **char \*** | The order name | 
**order_line_type** | **pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e** | Type can be Budget or Perpetual | 
**accepted_terms_id** | **char \*** | The SFDC id for the terms | 
**billto_company_id** | **char \*** | The bill-to company id | 
**billto_business_address_id** | **char \*** | The bill-to business address id | 
**billto_billing_address_id** | **char \*** | The bill-to billing address id | 
**estimated_monthly_spend** | **double** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**currency_info** | **currency_t \*** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


