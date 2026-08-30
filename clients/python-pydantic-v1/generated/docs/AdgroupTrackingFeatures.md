# AdgroupTrackingFeatures


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | [**List[AdgroupTrackingFeatureType]**](AdgroupTrackingFeatureType.md) | Tracking features. To clear this field, set to null. | [optional] 

## Example

```python
from openapi_client.models.adgroup_tracking_features import AdgroupTrackingFeatures

# TODO update the JSON string below
json = "{}"
# create an instance of AdgroupTrackingFeatures from a JSON string
adgroup_tracking_features_instance = AdgroupTrackingFeatures.from_json(json)
# print the JSON string representation of the object
print AdgroupTrackingFeatures.to_json()

# convert the object into a dict
adgroup_tracking_features_dict = adgroup_tracking_features_instance.to_dict()
# create an instance of AdgroupTrackingFeatures from a dict
adgroup_tracking_features_from_dict = AdgroupTrackingFeatures.from_dict(adgroup_tracking_features_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


