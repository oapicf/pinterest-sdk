# AdGroupTrackingURLs

  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_verification** | **List[str]** |  | [optional] 
**buyable_button** | **List[str]** |  | [optional] 
**click** | **List[str]** |  | [optional] 
**engagement** | **List[str]** |  | [optional] 
**impression** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.ad_group_tracking_urls import AdGroupTrackingURLs

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupTrackingURLs from a JSON string
ad_group_tracking_urls_instance = AdGroupTrackingURLs.from_json(json)
# print the JSON string representation of the object
print AdGroupTrackingURLs.to_json()

# convert the object into a dict
ad_group_tracking_urls_dict = ad_group_tracking_urls_instance.to_dict()
# create an instance of AdGroupTrackingURLs from a dict
ad_group_tracking_urls_from_dict = AdGroupTrackingURLs.from_dict(ad_group_tracking_urls_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


