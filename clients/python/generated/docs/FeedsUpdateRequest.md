# FeedsUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**name** | **str** | A human-friendly name associated to a given feed. | [optional] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.feeds_update_request import FeedsUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of FeedsUpdateRequest from a JSON string
feeds_update_request_instance = FeedsUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(FeedsUpdateRequest.to_json())

# convert the object into a dict
feeds_update_request_dict = feeds_update_request_instance.to_dict()
# create an instance of FeedsUpdateRequest from a dict
feeds_update_request_from_dict = FeedsUpdateRequest.from_dict(feeds_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


