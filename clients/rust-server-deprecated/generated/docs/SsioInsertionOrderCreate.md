# SsioInsertionOrderCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_terms_id** | **String** | The SFDC id for the terms | 
**accepted_terms_time** | **i32** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] [default to None]
**agency_link** | **String** | URL link for agency | [optional] [default to None]
**billing_contact_email** | **String** | The billing contact email | 
**billing_contact_firstname** | **String** | The billing contact first name | 
**billing_contact_lastname** | **String** | The billing contact last name | 
**billto_billing_address_id** | **String** | The bill-to billing address id | 
**billto_business_address_id** | **String** | The bill-to business address id | 
**billto_company_id** | **String** | The bill-to company id | 
**budget_amount** | **f64** | If Budget order line, the budget amount. | [optional] [default to None]
**currency_info** | [***models::Currency**](Currency.md) |  | 
**end_date** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] [default to None]
**estimated_monthly_spend** | **f64** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] [default to None]
**media_contact_email** | **String** | The media contact email | 
**media_contact_firstname** | **String** | The media contact first name | 
**media_contact_lastname** | **String** | The media contact last name | 
**order_line_type** | [***models::SsioOrderLineType**](SSIOOrderLineType.md) | Type can be Budget or Perpetual | 
**order_name** | **String** | The order name | 
**pmp_id** | **String** | The pmp id | 
**po_number** | **String** | The po number | 
**start_date** | **String** | Starting date of time period. Format: YYYY-MM-DD | 
**user_email** | **String** | The email of user submitting the insertion order | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


