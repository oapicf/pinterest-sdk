# AdGroupCreateRequestAllOf1


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;. | [optional] 
**bid_multiplier** | **float** | &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. | [optional] 
**budget_type** | [**BudgetType**](BudgetType.md) |  | [optional] 
**pacing_delivery_type** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] 

## Example

```python
from openapi_client.models.ad_group_create_request_all_of1 import AdGroupCreateRequestAllOf1

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupCreateRequestAllOf1 from a JSON string
ad_group_create_request_all_of1_instance = AdGroupCreateRequestAllOf1.from_json(json)
# print the JSON string representation of the object
print AdGroupCreateRequestAllOf1.to_json()

# convert the object into a dict
ad_group_create_request_all_of1_dict = ad_group_create_request_all_of1_instance.to_dict()
# create an instance of AdGroupCreateRequestAllOf1 from a dict
ad_group_create_request_all_of1_from_dict = AdGroupCreateRequestAllOf1.from_dict(ad_group_create_request_all_of1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


