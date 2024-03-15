# SsioCreateInsertionOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **String** | Starting date of time period. Format: YYYY-MM-DD | 
**end_date** | Option<**String**> | End date of time period. Format: YYYY-MM-DD | [optional]
**po_number** | **String** | The po number | 
**budget_amount** | Option<**f64**> | If Budget order line, the budget amount. | [optional]
**billing_contact_firstname** | **String** | The billing contact first name | 
**billing_contact_lastname** | **String** | The billing contact last name | 
**billing_contact_email** | **String** | The billing contact email | 
**media_contact_firstname** | **String** | The media contact first name | 
**media_contact_lastname** | **String** | The media contact last name | 
**media_contact_email** | **String** | The media contact email | 
**agency_link** | Option<**String**> | URL link for agency | [optional]
**user_email** | Option<**String**> | The email of user submitting the insertion order | [optional]
**accepted_terms_time** | Option<**i32**> | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional]
**pmp_id** | **String** | The pmp id | 
**order_name** | **String** | The order name | 
**order_line_type** | **String** | Type can be Budget or Perpetual | 
**accepted_terms_id** | **String** | The SFDC id for the terms | 
**billto_company_id** | **String** | The bill-to company id | 
**billto_business_address_id** | **String** | The bill-to business address id | 
**billto_billing_address_id** | **String** | The bill-to billing address id | 
**estimated_monthly_spend** | Option<**f64**> | If Ongoing (perpetual) order line, the estimated monthly spend | [optional]
**currency_info** | [**models::Currency**](Currency.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


