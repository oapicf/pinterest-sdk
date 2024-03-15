# openapi::SSIOCreateInsertionOrderRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **character** | Starting date of time period. Format: YYYY-MM-DD | [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**end_date** | **character** | End date of time period. Format: YYYY-MM-DD | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**po_number** | **character** | The po number | 
**budget_amount** | **numeric** | If Budget order line, the budget amount. | [optional] 
**billing_contact_firstname** | **character** | The billing contact first name | 
**billing_contact_lastname** | **character** | The billing contact last name | 
**billing_contact_email** | **character** | The billing contact email | 
**media_contact_firstname** | **character** | The media contact first name | 
**media_contact_lastname** | **character** | The media contact last name | 
**media_contact_email** | **character** | The media contact email | 
**agency_link** | **character** | URL link for agency | [optional] 
**user_email** | **character** | The email of user submitting the insertion order | [optional] 
**accepted_terms_time** | **integer** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**pmp_id** | **character** | The pmp id | 
**order_name** | **character** | The order name | 
**order_line_type** | **character** | Type can be Budget or Perpetual | [Enum: [BUDGET, PERPETUALS]] 
**accepted_terms_id** | **character** | The SFDC id for the terms | 
**billto_company_id** | **character** | The bill-to company id | 
**billto_business_address_id** | **character** | The bill-to business address id | 
**billto_billing_address_id** | **character** | The bill-to billing address id | 
**estimated_monthly_spend** | **numeric** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**currency_info** | [**Currency**](Currency.md) |  | [Enum: ] 


