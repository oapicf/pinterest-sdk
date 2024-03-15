# SSIO_CREATE_INSERTION_ORDER_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | [**STRING_32**](STRING_32.md) | Starting date of time period. Format: YYYY-MM-DD | [default to null]
**end_date** | [**STRING_32**](STRING_32.md) | End date of time period. Format: YYYY-MM-DD | [optional] [default to null]
**po_number** | [**STRING_32**](STRING_32.md) | The po number | [default to null]
**budget_amount** | **REAL_32** | If Budget order line, the budget amount. | [optional] [default to null]
**billing_contact_firstname** | [**STRING_32**](STRING_32.md) | The billing contact first name | [default to null]
**billing_contact_lastname** | [**STRING_32**](STRING_32.md) | The billing contact last name | [default to null]
**billing_contact_email** | [**STRING_32**](STRING_32.md) | The billing contact email | [default to null]
**media_contact_firstname** | [**STRING_32**](STRING_32.md) | The media contact first name | [default to null]
**media_contact_lastname** | [**STRING_32**](STRING_32.md) | The media contact last name | [default to null]
**media_contact_email** | [**STRING_32**](STRING_32.md) | The media contact email | [default to null]
**agency_link** | [**STRING_32**](STRING_32.md) | URL link for agency | [optional] [default to null]
**user_email** | [**STRING_32**](STRING_32.md) | The email of user submitting the insertion order | [optional] [default to null]
**accepted_terms_time** | **INTEGER_32** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] [default to null]
**pmp_id** | [**STRING_32**](STRING_32.md) | The pmp id | [default to null]
**order_name** | [**STRING_32**](STRING_32.md) | The order name | [default to null]
**order_line_type** | [**STRING_32**](STRING_32.md) | Type can be Budget or Perpetual | [default to null]
**accepted_terms_id** | [**STRING_32**](STRING_32.md) | The SFDC id for the terms | [default to null]
**billto_company_id** | [**STRING_32**](STRING_32.md) | The bill-to company id | [default to null]
**billto_business_address_id** | [**STRING_32**](STRING_32.md) | The bill-to business address id | [default to null]
**billto_billing_address_id** | [**STRING_32**](STRING_32.md) | The bill-to billing address id | [default to null]
**estimated_monthly_spend** | **REAL_32** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] [default to null]
**currency_info** | [**CURRENCY**](Currency.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


