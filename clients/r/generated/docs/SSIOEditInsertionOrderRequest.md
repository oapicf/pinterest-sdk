# openapi::SSIOEditInsertionOrderRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **character** | Starting date of time period. Format: YYYY-MM-DD | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**end_date** | **character** | End date of time period. Format: YYYY-MM-DD | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**po_number** | **character** | The po number | [optional] 
**budget_amount** | **numeric** | If Budget order line, the budget amount. | [optional] 
**billing_contact_firstname** | **character** | The billing contact first name | [optional] 
**billing_contact_lastname** | **character** | The billing contact last name | [optional] 
**billing_contact_email** | **character** | The billing contact email | [optional] 
**media_contact_firstname** | **character** | The media contact first name | [optional] 
**media_contact_lastname** | **character** | The media contact last name | [optional] 
**media_contact_email** | **character** | The media contact email | [optional] 
**agency_link** | **character** | URL link for agency | [optional] 
**user_email** | **character** | The email of user submitting the insertion order | [optional] 
**oracle_line_id** | **character** | LineId in the Oracle DB | [optional] 
**salesforce_order_id** | **character** | OrderId in SFDC | [optional] 
**salesforce_order_line_id** | **character** | OrderLineId in SFDC | [optional] 
**ads_manager_order_line_id** | **character** | Ads manager OrderLineId | [optional] 


