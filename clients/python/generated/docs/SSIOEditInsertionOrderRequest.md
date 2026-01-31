# SSIOEditInsertionOrderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agency_link** | **str** | URL link for agency | [optional] 
**billing_contact_email** | **str** | The billing contact email | [optional] 
**billing_contact_firstname** | **str** | The billing contact first name | [optional] 
**billing_contact_lastname** | **str** | The billing contact last name | [optional] 
**budget_amount** | **float** | If Budget order line, the budget amount. | [optional] 
**end_date** | **str** | End date of time period. Format: YYYY-MM-DD | [optional] 
**media_contact_email** | **str** | The media contact email | [optional] 
**media_contact_firstname** | **str** | The media contact first name | [optional] 
**media_contact_lastname** | **str** | The media contact last name | [optional] 
**po_number** | **str** | The po number | [optional] 
**start_date** | **str** | Starting date of time period. Format: YYYY-MM-DD | [optional] 
**user_email** | **str** | The email of user submitting the insertion order | [optional] 
**ads_manager_order_line_id** | **str** | Ads manager OrderLineId | [optional] 
**oracle_line_id** | **str** | LineId in the Oracle DB | [optional] 
**salesforce_order_id** | **str** | OrderId in SFDC | [optional] 
**salesforce_order_line_id** | **str** | OrderLineId in SFDC | [optional] 

## Example

```python
from pinterestsdk.models.ssio_edit_insertion_order_request import SSIOEditInsertionOrderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOEditInsertionOrderRequest from a JSON string
ssio_edit_insertion_order_request_instance = SSIOEditInsertionOrderRequest.from_json(json)
# print the JSON string representation of the object
print(SSIOEditInsertionOrderRequest.to_json())

# convert the object into a dict
ssio_edit_insertion_order_request_dict = ssio_edit_insertion_order_request_instance.to_dict()
# create an instance of SSIOEditInsertionOrderRequest from a dict
ssio_edit_insertion_order_request_from_dict = SSIOEditInsertionOrderRequest.from_dict(ssio_edit_insertion_order_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


