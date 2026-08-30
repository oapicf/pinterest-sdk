# AdPreviewURLResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19 | [optional] 

## Example

```python
from openapi_client.models.ad_preview_url_response import AdPreviewURLResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdPreviewURLResponse from a JSON string
ad_preview_url_response_instance = AdPreviewURLResponse.from_json(json)
# print the JSON string representation of the object
print AdPreviewURLResponse.to_json()

# convert the object into a dict
ad_preview_url_response_dict = ad_preview_url_response_instance.to_dict()
# create an instance of AdPreviewURLResponse from a dict
ad_preview_url_response_from_dict = AdPreviewURLResponse.from_dict(ad_preview_url_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


