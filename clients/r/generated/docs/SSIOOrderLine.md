# openapi::SSIOOrderLine


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**salesforce_order_line_id** | **character** | OrderLineId in SFDC | [optional] 
**ads_manager_order_line_id** | **character** | Ads manager OrderLineId | [optional] 
**pin_order_id** | **character** | The pin order id associated with the order line in SFDC | [optional] 
**last_modified_date_time** | **character** | Last modified date. | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$] 
**start_date** | **character** | Start date of the order line. | [optional] 
**end_date** | **character** | End date of the order line. | [optional] 
**bill_to_company_name** | **character** | Bill To Company name | [optional] 
**billing_contact_firstname** | **character** | Billing contact first name | [optional] 
**billing_contact_lastname** | **character** | Billing contact last name | [optional] 
**billing_contact_email** | **character** | Billing contact email | [optional] 
**media_contact_email** | **character** | Billing media email | [optional] 
**media_contact_firstname** | **character** | Billing contact first name | [optional] 
**media_contact_lastname** | **character** | Billing contact first name | [optional] 
**currency_info** | [**Currency**](Currency.md) |  | [optional] [Enum: ] 
**agency_link** | **character** | Agency link | [optional] 
**po_number** | **character** | The po number | [optional] 
**order_name** | **character** | The order name | [optional] 
**pmp_name** | **character** | The Pinterest marketing partner name | [optional] 
**accepted_terms_id** | **character** | The SFDC id for the terms | [optional] 
**accepted_terms_time** | **character** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$] 
**budget_amount** | **numeric** | If Budget order line, the budget amount. | [optional] 
**estimated_monthly_spend** | **numeric** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 


