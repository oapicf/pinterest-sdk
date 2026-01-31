# SsioOrderLinesGetByAdAccount200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[SSIOOrderLine]**](SSIOOrderLine.md) | SSIO order lines by ad acount id | 

## Example

```python
from pinterestsdk.models.ssio_order_lines_get_by_ad_account200_response import SsioOrderLinesGetByAdAccount200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SsioOrderLinesGetByAdAccount200Response from a JSON string
ssio_order_lines_get_by_ad_account200_response_instance = SsioOrderLinesGetByAdAccount200Response.from_json(json)
# print the JSON string representation of the object
print(SsioOrderLinesGetByAdAccount200Response.to_json())

# convert the object into a dict
ssio_order_lines_get_by_ad_account200_response_dict = ssio_order_lines_get_by_ad_account200_response_instance.to_dict()
# create an instance of SsioOrderLinesGetByAdAccount200Response from a dict
ssio_order_lines_get_by_ad_account200_response_from_dict = SsioOrderLinesGetByAdAccount200Response.from_dict(ssio_order_lines_get_by_ad_account200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


