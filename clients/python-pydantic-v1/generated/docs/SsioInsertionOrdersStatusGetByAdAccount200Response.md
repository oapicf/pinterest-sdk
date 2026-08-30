# SsioInsertionOrdersStatusGetByAdAccount200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[SSIOInsertionOrderStatus]**](SSIOInsertionOrderStatus.md) |  | 

## Example

```python
from openapi_client.models.ssio_insertion_orders_status_get_by_ad_account200_response import SsioInsertionOrdersStatusGetByAdAccount200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SsioInsertionOrdersStatusGetByAdAccount200Response from a JSON string
ssio_insertion_orders_status_get_by_ad_account200_response_instance = SsioInsertionOrdersStatusGetByAdAccount200Response.from_json(json)
# print the JSON string representation of the object
print SsioInsertionOrdersStatusGetByAdAccount200Response.to_json()

# convert the object into a dict
ssio_insertion_orders_status_get_by_ad_account200_response_dict = ssio_insertion_orders_status_get_by_ad_account200_response_instance.to_dict()
# create an instance of SsioInsertionOrdersStatusGetByAdAccount200Response from a dict
ssio_insertion_orders_status_get_by_ad_account200_response_from_dict = SsioInsertionOrdersStatusGetByAdAccount200Response.from_dict(ssio_insertion_orders_status_get_by_ad_account200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


