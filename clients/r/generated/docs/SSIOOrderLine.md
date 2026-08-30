# openapi::SSIOOrderLine

A Salesforce SSIO order line.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_terms_id** | **character** | The SFDC id for the terms | [optional] 
**accepted_terms_time** | **character** | The UTC timestamp (to the nearest second) when terms were accepted. | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})\\.(\\d{3})Z$] 
**ads_manager_order_line_id** | **character** | Ads manager order line id | [optional] 
**agency_link** | **character** | Agency link | [optional] 
**bill_to_company_name** | **character** | Bill-to company name | [optional] 
**billing_contact_email** | **character** | Billing contact email | [optional] 
**billing_contact_firstname** | **character** | Billing contact first name | [optional] 
**billing_contact_lastname** | **character** | Billing contact last name | [optional] 
**budget_amount** | **numeric** | If budget order line, the budget amount. | [optional] 
**currency_info** | [**Currency**](Currency.md) |  | [optional] [Enum: ] 
**end_date** | **character** | End date of the order line. | [optional] 
**estimated_monthly_spend** | **numeric** | If ongoing (perpetual) order line, the estimated monthly spend. | [optional] 
**last_modified_date_time** | **character** | Last modified date. | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})\\.(\\d{3})Z$] 
**media_contact_email** | **character** | Billing media email | [optional] 
**media_contact_firstname** | **character** | Billing media contact first name | [optional] 
**media_contact_lastname** | **character** | Billing media contact last name | [optional] 
**order_name** | **character** | The order name | [optional] 
**pin_order_id** | **character** | The pin order id associated with the order line in SFDC | [optional] 
**pmp_name** | **character** | The Pinterest marketing partner name | [optional] 
**po_number** | **character** | The PO number | [optional] 
**salesforce_order_line_id** | **character** | Order line id in SFDC | [optional] 
**start_date** | **character** | Start date of the order line. | [optional] 


