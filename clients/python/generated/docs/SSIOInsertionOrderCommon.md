# SSIOInsertionOrderCommon


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

## Example

```python
from pinterestsdk.models.ssio_insertion_order_common import SSIOInsertionOrderCommon

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOInsertionOrderCommon from a JSON string
ssio_insertion_order_common_instance = SSIOInsertionOrderCommon.from_json(json)
# print the JSON string representation of the object
print(SSIOInsertionOrderCommon.to_json())

# convert the object into a dict
ssio_insertion_order_common_dict = ssio_insertion_order_common_instance.to_dict()
# create an instance of SSIOInsertionOrderCommon from a dict
ssio_insertion_order_common_from_dict = SSIOInsertionOrderCommon.from_dict(ssio_insertion_order_common_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


