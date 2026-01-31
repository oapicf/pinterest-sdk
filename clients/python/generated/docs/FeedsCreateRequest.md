# FeedsCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_country** | [**Country**](Country.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **str** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to 'ACTIVE']

## Example

```python
from pinterestsdk.models.feeds_create_request import FeedsCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of FeedsCreateRequest from a JSON string
feeds_create_request_instance = FeedsCreateRequest.from_json(json)
# print the JSON string representation of the object
print(FeedsCreateRequest.to_json())

# convert the object into a dict
feeds_create_request_dict = feeds_create_request_instance.to_dict()
# create an instance of FeedsCreateRequest from a dict
feeds_create_request_from_dict = FeedsCreateRequest.from_dict(feeds_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


