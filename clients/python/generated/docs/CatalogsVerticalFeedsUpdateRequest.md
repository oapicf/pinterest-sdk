# CatalogsVerticalFeedsUpdateRequest

Request object for updating a feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
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
from pinterestsdk.models.catalogs_vertical_feeds_update_request import CatalogsVerticalFeedsUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsVerticalFeedsUpdateRequest from a JSON string
catalogs_vertical_feeds_update_request_instance = CatalogsVerticalFeedsUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsVerticalFeedsUpdateRequest.to_json())

# convert the object into a dict
catalogs_vertical_feeds_update_request_dict = catalogs_vertical_feeds_update_request_instance.to_dict()
# create an instance of CatalogsVerticalFeedsUpdateRequest from a dict
catalogs_vertical_feeds_update_request_from_dict = CatalogsVerticalFeedsUpdateRequest.from_dict(catalogs_vertical_feeds_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


