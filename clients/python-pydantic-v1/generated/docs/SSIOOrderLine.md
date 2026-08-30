# SSIOOrderLine

A Salesforce SSIO order line.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_terms_id** | **str** | The SFDC id for the terms | [optional] 
**accepted_terms_time** | **str** | The UTC timestamp (to the nearest second) when terms were accepted. | [optional] 
**ads_manager_order_line_id** | **str** | Ads manager order line id | [optional] 
**agency_link** | **str** | Agency link | [optional] 
**bill_to_company_name** | **str** | Bill-to company name | [optional] 
**billing_contact_email** | **str** | Billing contact email | [optional] 
**billing_contact_firstname** | **str** | Billing contact first name | [optional] 
**billing_contact_lastname** | **str** | Billing contact last name | [optional] 
**budget_amount** | **float** | If budget order line, the budget amount. | [optional] 
**currency_info** | [**Currency**](Currency.md) |  | [optional] 
**end_date** | **date** | End date of the order line. | [optional] 
**estimated_monthly_spend** | **float** | If ongoing (perpetual) order line, the estimated monthly spend. | [optional] 
**last_modified_date_time** | **str** | Last modified date. | [optional] 
**media_contact_email** | **str** | Billing media email | [optional] 
**media_contact_firstname** | **str** | Billing media contact first name | [optional] 
**media_contact_lastname** | **str** | Billing media contact last name | [optional] 
**order_name** | **str** | The order name | [optional] 
**pin_order_id** | **str** | The pin order id associated with the order line in SFDC | [optional] 
**pmp_name** | **str** | The Pinterest marketing partner name | [optional] 
**po_number** | **str** | The PO number | [optional] 
**salesforce_order_line_id** | **str** | Order line id in SFDC | [optional] 
**start_date** | **date** | Start date of the order line. | [optional] 

## Example

```python
from openapi_client.models.ssio_order_line import SSIOOrderLine

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOOrderLine from a JSON string
ssio_order_line_instance = SSIOOrderLine.from_json(json)
# print the JSON string representation of the object
print SSIOOrderLine.to_json()

# convert the object into a dict
ssio_order_line_dict = ssio_order_line_instance.to_dict()
# create an instance of SSIOOrderLine from a dict
ssio_order_line_from_dict = SSIOOrderLine.from_dict(ssio_order_line_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


